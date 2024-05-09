package com.exelient.dotcapital.Erpapi.account.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.exelient.dotcapital.Erpapi.account.data.AccountRequestData;
import com.exelient.dotcapital.Erpapi.account.domain.Account;
import com.exelient.dotcapital.Erpapi.account.repository.AccountRepository;
import com.exelient.dotcapital.Erpapi.account.service.AccountService;
import com.exelient.dotcapital.Erpapi.account.service.AccountServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {AccountApiResource.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class AccountApiResourceDiffblueTest {
    @Autowired
    private AccountApiResource accountApiResource;

    @MockBean
    private AccountService accountService;

    /**
     * Method under test: {@link AccountApiResource#getAllAccounts(Pageable)}
     */
    @Test
    void testGetAllAccounts() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        AccountRepository accountRepository = mock(AccountRepository.class);
        when(accountRepository.findAll(Mockito.<Pageable>any())).thenReturn(new PageImpl<>(new ArrayList<>()));

        // Act
        ResponseEntity<?> actualAllAccounts = (new AccountApiResource(new AccountServiceImpl(accountRepository)))
                .getAllAccounts(null);

        // Assert
        verify(accountRepository).findAll((Pageable) isNull());
        assertEquals(200, actualAllAccounts.getStatusCodeValue());
        assertTrue(((PageImpl<Object>) actualAllAccounts.getBody()).toList().isEmpty());
        assertTrue(actualAllAccounts.hasBody());
        assertTrue(actualAllAccounts.getHeaders().isEmpty());
    }

    /**
     * Method under test:
     * {@link AccountApiResource#CreateAccount(AccountRequestData)}
     */
    @Test
    void testCreateAccount() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        Account account = new Account();
        account.setAccGroupCode("Acc Group Code");
        account.setAccountCode(3);
        account.setAccountName("Dr Jane Doe");
        account.setAuthCode("Auth Code");
        account.setCcFlag("Cc Flag");
        account.setCompCode("Comp Code");
        account.setCurrencyCode(1);
        account.setDefaultComp("Default Comp");
        account.setField1("Field1");
        account.setField1Date(LocalDate.of(1970, 1, 1));
        account.setField1Num(new BigDecimal("2.3"));
        account.setField2("Field2");
        account.setField2Date(LocalDate.of(1970, 1, 1));
        account.setField2Num(new BigDecimal("2.3"));
        account.setField3("Field3");
        account.setField4("Field4");
        account.setHold("Hold");
        account.setModDate(LocalDate.of(1970, 1, 1));
        account.setReserved("Reserved");
        account.setStatFlag("Stat Flag");
        account.setStatUpFlag("Stat Up Flag");
        account.setTaxCode("Tax Code");
        account.setTaxLimit(new BigDecimal("2.3"));
        Optional<Account> ofResult = Optional.of(account);
        AccountRepository accountRepository = mock(AccountRepository.class);
        when(accountRepository.existsByVcCustomerId(Mockito.<String>any())).thenReturn(ofResult);
        AccountApiResource accountApiResource = new AccountApiResource(new AccountServiceImpl(accountRepository));

        // Act
        ResponseEntity<?> actualCreateAccountResult = accountApiResource.CreateAccount(new AccountRequestData());

        // Assert
        verify(accountRepository).existsByVcCustomerId(isNull());
        assertEquals("1970-01-01", ((AccountRequestData) actualCreateAccountResult.getBody()).getField1Date().toString());
        assertEquals("1970-01-01", ((AccountRequestData) actualCreateAccountResult.getBody()).getField2Date().toString());
        assertEquals("1970-01-01", ((AccountRequestData) actualCreateAccountResult.getBody()).getModDate().toString());
        assertEquals("Acc Group Code", ((AccountRequestData) actualCreateAccountResult.getBody()).getAccGroupCode());
        assertEquals("Auth Code", ((AccountRequestData) actualCreateAccountResult.getBody()).getAuthCode());
        assertEquals("Cc Flag", ((AccountRequestData) actualCreateAccountResult.getBody()).getCcFlag());
        assertEquals("Comp Code", ((AccountRequestData) actualCreateAccountResult.getBody()).getCompCode());
        assertEquals("Default Comp", ((AccountRequestData) actualCreateAccountResult.getBody()).getDefaultComp());
        assertEquals("Dr Jane Doe", ((AccountRequestData) actualCreateAccountResult.getBody()).getAccountName());
        assertEquals("Field1", ((AccountRequestData) actualCreateAccountResult.getBody()).getField1());
        assertEquals("Field2", ((AccountRequestData) actualCreateAccountResult.getBody()).getField2());
        assertEquals("Field3", ((AccountRequestData) actualCreateAccountResult.getBody()).getField3());
        assertEquals("Field4", ((AccountRequestData) actualCreateAccountResult.getBody()).getField4());
        assertEquals("Hold", ((AccountRequestData) actualCreateAccountResult.getBody()).getHold());
        assertEquals("Reserved", ((AccountRequestData) actualCreateAccountResult.getBody()).getReserved());
        assertEquals("Stat Flag", ((AccountRequestData) actualCreateAccountResult.getBody()).getStatFlag());
        assertEquals("Stat Up Flag", ((AccountRequestData) actualCreateAccountResult.getBody()).getStatUpFlag());
        assertEquals("Tax Code", ((AccountRequestData) actualCreateAccountResult.getBody()).getTaxCode());
        assertEquals(1, ((AccountRequestData) actualCreateAccountResult.getBody()).getCurrencyCode());
        assertEquals(200, actualCreateAccountResult.getStatusCodeValue());
        assertEquals(3, ((AccountRequestData) actualCreateAccountResult.getBody()).getAccountCode().intValue());
        assertTrue(actualCreateAccountResult.hasBody());
        assertTrue(actualCreateAccountResult.getHeaders().isEmpty());
        BigDecimal expectedField1Num = new BigDecimal("2.3");
        assertEquals(expectedField1Num, ((AccountRequestData) actualCreateAccountResult.getBody()).getField1Num());
        BigDecimal expectedField2Num = new BigDecimal("2.3");
        assertEquals(expectedField2Num, ((AccountRequestData) actualCreateAccountResult.getBody()).getField2Num());
        BigDecimal expectedTaxLimit = new BigDecimal("2.3");
        assertEquals(expectedTaxLimit, ((AccountRequestData) actualCreateAccountResult.getBody()).getTaxLimit());
    }

    /**
     * Method under test: {@link AccountApiResource#printTime()}
     */
    @Test
    void testPrintTime() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     AccountApiResource.accountService

        // Arrange and Act
        accountApiResource.printTime();
    }

    /**
     * Method under test:
     * {@link AccountApiResource#CreateAccount(AccountRequestData)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateAccount2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Java 8 date/time type `java.time.LocalDate` not supported by default: add Module "com.fasterxml.jackson.datatype:jackson-datatype-jsr310" to enable handling (through reference chain: com.exelient.dotcapital.Erpapi.account.data.AccountRequestData["modDate"])
        //       at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:77)
        //       at com.fasterxml.jackson.databind.SerializerProvider.reportBadDefinition(SerializerProvider.java:1308)
        //       at com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer.serialize(UnsupportedTypeSerializer.java:35)
        //       at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:732)
        //       at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:772)
        //       at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178)
        //       at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize(DefaultSerializerProvider.java:479)
        //       at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:318)
        //       at com.fasterxml.jackson.databind.ObjectMapper._writeValueAndClose(ObjectMapper.java:4719)
        //       at com.fasterxml.jackson.databind.ObjectMapper.writeValueAsString(ObjectMapper.java:3964)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        AccountRequestData accountRequestData = new AccountRequestData();
        accountRequestData.setAccGroupCode("Acc Group Code");
        accountRequestData.setAccountCode(3);
        accountRequestData.setAccountName("Dr Jane Doe");
        accountRequestData.setAuthCode("Auth Code");
        accountRequestData.setCcFlag("Cc Flag");
        accountRequestData.setCompCode("Comp Code");
        accountRequestData.setCurrencyCode(1);
        accountRequestData.setDefaultComp("Default Comp");
        accountRequestData.setField1("Field1");
        accountRequestData.setField1Date(LocalDate.of(1970, 1, 1));
        accountRequestData.setField1Num(new BigDecimal("2.3"));
        accountRequestData.setField2("Field2");
        accountRequestData.setField2Date(LocalDate.of(1970, 1, 1));
        accountRequestData.setField2Num(new BigDecimal("2.3"));
        accountRequestData.setField3("Field3");
        accountRequestData.setField4("Field4");
        accountRequestData.setHold("Hold");
        accountRequestData.setModDate(LocalDate.of(1970, 1, 1));
        accountRequestData.setReserved("Reserved");
        accountRequestData.setStatFlag("Stat Flag");
        accountRequestData.setStatUpFlag("Stat Up Flag");
        accountRequestData.setTaxCode("Tax Code");
        accountRequestData.setTaxLimit(new BigDecimal("2.3"));
        String content = (new ObjectMapper()).writeValueAsString(accountRequestData);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/v1/account/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act
        MockMvcBuilders.standaloneSetup(accountApiResource).build().perform(requestBuilder);
    }
}
