package com.exelient.dotcapital.Erpapi.Customer.service;

import com.exelient.dotcapital.Erpapi.Customer.data.CustomerResponse;
import com.exelient.dotcapital.Erpapi.Customer.domain.Customer;
import com.exelient.dotcapital.Erpapi.Customer.exception.CustomerAlreadyExistException;
import com.exelient.dotcapital.Erpapi.Customer.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CustomerPlatformServiceImpl implements CustomerPlatformService {
    private final CustomerRepository customerRepository;

    @Override
    public Page<CustomerResponse> getAllCustomers(Pageable pageable) {
        Page<Customer> customersPage = customerRepository.findAll(pageable);
        return customersPage.map(this::mapToCustomerResponse);
    }

    private CustomerResponse mapToCustomerResponse(Customer customer) {
        CustomerResponse response = new CustomerResponse();
        response.setVcCompCode(customer.getVcCompCode());
        response.setNuCustomerCode(customer.getNuCustomerCode());
        response.setVcCustomerName(customer.getVcCustomerName());
        response.setVcBillAddress1(customer.getVcBillAddress1());
        response.setVcBillAddress2(customer.getVcBillAddress2());
        response.setVcBillAddress3(customer.getVcBillAddress3());
        response.setVcBillCity(customer.getVcBillCity());
        response.setVcBillState(customer.getVcBillState());
        response.setVcBillCountry(customer.getVcBillCountry());
        response.setVcBillPinCode(customer.getVcBillPinCode());
        response.setVcTelephone(customer.getVcTelephone());
        response.setVcEmail(customer.getVcEmail());
        response.setVcFaxNo(customer.getVcFaxNo());
        response.setVcBankName(customer.getVcBankName());
        response.setVcBankBranchName(customer.getVcBankBranchName());
        response.setVcBankAddress1(customer.getVcBankAddress1());
        response.setVcBankAddress2(customer.getVcBankAddress2());
        response.setVcBankAddress3(customer.getVcBankAddress3());
        response.setVcBankCity(customer.getVcBankCity());
        response.setVcBankState(customer.getVcBankState());
        response.setVcBankCountry(customer.getVcBankCountry());
        response.setVcBankPinCode(customer.getVcBankPinCode());
        response.setVcContactPerson(customer.getVcContactPerson());
        response.setVcContactPersonPhone(customer.getVcContactPersonPhone());
        response.setVcShipAddress1(customer.getVcShipAddress1());
        response.setVcShipAddress2(customer.getVcShipAddress2());
        response.setVcShipAddress3(customer.getVcShipAddress3());
        response.setVcShipCity(customer.getVcShipCity());
        response.setVcShipState(customer.getVcShipState());
        response.setVcShipCountry(customer.getVcShipCountry());
        response.setVcShipPinCode(customer.getVcShipPinCode());
        // response.setVcLincenseNo(customer.getVcLincenseNo());
        response.setVcCstNo(customer.getVcCstNo());
        response.setVcLstNo(customer.getVcLstNo());
        response.setNuMaxCreditDay(customer.getNuMaxCreditDay());
        response.setVcCategoryCode(customer.getVcCategoryCode());
        response.setVcDivisionNo(customer.getVcDivisionNo());
        response.setVcRange(customer.getVcRange());
        response.setVcCollectorate(customer.getVcCollectorate());
        response.setVcRcNo(customer.getVcRcNo());
        response.setVcPitaxGirNo(customer.getVcPitaxGirNo());
        response.setNuAccountCode(customer.getNuAccountCode());
        response.setNuCurrencyCode(customer.getNuCurrencyCode());
        response.setVcVendorCode(customer.getVcVendorCode());
        response.setVcEccNo(customer.getVcEccNo());
        response.setVcLicenseNo(customer.getVcLicenseNo());
        response.setDtCstDate(customer.getDtCstDate());
        response.setDtLstDate(customer.getDtLstDate());
        response.setNuCreditLimit(customer.getNuCreditLimit());
        response.setChStatFlag(customer.getChStatFlag());
        response.setChStatUpFlag(customer.getChStatUpFlag());
        response.setDtModDate(customer.getDtModDate());
        response.setVcDefaultComp(customer.getVcDefaultComp());
        response.setVcAuthCode(customer.getVcAuthCode());
        response.setVcField1(customer.getVcField1());
        response.setVcField2(customer.getVcField2());
        response.setVcField3(customer.getVcField3());
        response.setVcField4(customer.getVcField4());
        response.setNuField1(customer.getNuField1());
        response.setNuField2(customer.getNuField2());
        response.setDtField1(customer.getDtField1());
        response.setDtField2(customer.getDtField2());
        response.setVcBankAcc(customer.getVcBankAcc());
        response.setVcMobile(customer.getVcMobile());
        response.setVcPinNo(customer.getVcPinNo());
        response.setVcVatNo(customer.getVcVatNo());
        response.setChCash(customer.getChCash());
        response.setChExempted(customer.getChExempted());
        response.setNuChequeLimit(customer.getNuChequeLimit());
        response.setVcCorresAdd1(customer.getVcCorresAdd1());
        response.setVcCorrAdd2(customer.getVcCorrAdd2());
        response.setVcCorrAdd3(customer.getVcCorrAdd3());
        response.setVcCorrAdd4(customer.getVcCorrAdd4());
        response.setVcCorrAdd5(customer.getVcCorrAdd5());
        response.setVcCorrAdd6(customer.getVcCorrAdd6());
        response.setVcSegmentCode(customer.getVcSegmentCode());
        response.setVcBankCode(customer.getVcBankCode());
        response.setVcBranchCode(customer.getVcBranchCode());
        response.setVcBussType(customer.getVcBussType());
        response.setVcDiscCatg1(customer.getVcDiscCatg1());
        response.setVcDiscCatg2(customer.getVcDiscCatg2());
        response.setVcSalesExec(customer.getVcSalesExec());
        response.setChStopLimit(customer.getChStopLimit());
        response.setChStopDays(customer.getChStopDays());
        response.setVcDiscCatg3(customer.getVcDiscCatg3());
        response.setVcDiscCatg4(customer.getVcDiscCatg4());
        response.setVcCustomerId(customer.getVcCustomerId());
        response.setDtRegDate(customer.getDtRegDate());
        response.setIdNo(customer.getIdNo());
        //response.setDtIdDate(customer.getDtIdDate());
        // response.setVcIdPlace(customer.getVcIdPlace());
        //  response.setBlSignature(customer.getBlSignature());
        //   response.setBlLogo(customer.getBlLogo());

        return response;
    }

    @Override
    public CustomerResponse createCustomer(CustomerResponse request) throws CustomerAlreadyExistException {
        try {
            // Check if a customer with the same email already exists
            boolean customerExists = customerRepository.existsByVcCustomerId(request.getVcCustomerId());
            if (customerExists) {
                return new CustomerResponse("Customer already exists.");
            } else {
                // Generate unique identifier
                String uniqueId = UUID.randomUUID().toString();

                // Concatenate "VC" with the unique identifier
                //String vcCompCode = "VC" + uniqueId;

                // Truncate the generated code to a maximum length of 5 characters
                //vcCompCode = vcCompCode.substring(0, Math.min(vcCompCode.length(), 5));

                // Proceed with creating the new customer
                int nextCustomerCode = customerRepository.getNextCustomerCode() != null ? customerRepository.getNextCustomerCode() + 1 : 1;
                request.setNuCustomerCode(nextCustomerCode);
                //request.setVcCompCode(vcCompCode);

                Customer customer = mapToMstCustomerResponse(request);
                Customer savedCustomer = customerRepository.saveAndFlush(customer);
                return mapToCustomerResponse(savedCustomer);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

        private Customer mapToMstCustomerResponse (CustomerResponse request){
            Customer customer = new Customer();
            customer.setVcCompCode("01");
            customer.setNuCustomerCode(request.getNuCustomerCode());
            customer.setVcCustomerName(request.getVcCustomerName());
            customer.setVcBillAddress1(request.getVcBillAddress1());
            customer.setVcBillAddress2(request.getVcBillAddress2());
            customer.setVcBillAddress3(request.getVcBillAddress3());
            customer.setVcBillCity("M1");
            customer.setVcBillState("01");
            customer.setVcBillCountry(String.valueOf(1));
            customer.setVcBillPinCode(request.getVcBillPinCode());
            customer.setVcTelephone(request.getVcTelephone());
            customer.setVcEmail(request.getVcEmail());
            customer.setVcFaxNo(request.getVcFaxNo());
            customer.setVcBankName(request.getVcBankName());
            customer.setVcBankBranchName(request.getVcBankBranchName());
            customer.setVcBankAddress1(request.getVcBankAddress1());
            customer.setVcBankAddress2(request.getVcBankAddress2());
            customer.setVcBankAddress3(request.getVcBankAddress3());
            customer.setVcBankCity(request.getVcBankCity());
            customer.setVcBankState(request.getVcBankState());
            customer.setVcBankCountry(request.getVcBankCountry());
            customer.setVcBankPinCode(request.getVcBankPinCode());
            customer.setVcContactPerson(request.getVcContactPerson());
            customer.setVcContactPersonPhone(request.getVcContactPersonPhone());
            customer.setVcShipAddress1(request.getVcShipAddress1());
            customer.setVcShipAddress2(request.getVcShipAddress2());
            customer.setVcShipAddress3(request.getVcShipAddress3());
            customer.setVcShipCity(request.getVcShipCity());
            customer.setVcShipState(request.getVcShipState());
            customer.setVcShipCountry(request.getVcShipCountry());
            customer.setVcShipPinCode(request.getVcShipPinCode());
//        customer.setVcLincenseNo(request.getVcLincenseNo());
            customer.setVcCstNo(request.getVcCstNo());
            customer.setVcLstNo(request.getVcLstNo());
            customer.setNuMaxCreditDay(request.getNuMaxCreditDay());
            customer.setVcCategoryCode("T002");
            customer.setVcDivisionNo(request.getVcDivisionNo());
            customer.setVcRange(request.getVcRange());
            customer.setVcCollectorate(request.getVcCollectorate());
            customer.setVcRcNo(request.getVcRcNo());
            customer.setVcPitaxGirNo(request.getVcPitaxGirNo());
            customer.setNuAccountCode(request.getNuAccountCode());
            customer.setNuCurrencyCode(1);
            customer.setVcVendorCode(request.getVcVendorCode());
            customer.setVcEccNo(request.getVcEccNo());
            customer.setVcLicenseNo(request.getVcLicenseNo());
            customer.setDtCstDate(request.getDtCstDate());
            customer.setDtLstDate(request.getDtLstDate());
            customer.setNuCreditLimit(request.getNuCreditLimit());
            customer.setChStatFlag(request.getChStatFlag());
            customer.setChStatUpFlag(request.getChStatUpFlag());
            customer.setDtModDate(request.getDtModDate());
            customer.setVcDefaultComp("01");
            customer.setVcAuthCode("01");
            customer.setVcField1("A");
            customer.setVcField2(request.getVcField2());
            customer.setVcField3(request.getVcField3());
            customer.setVcField4("A");
            customer.setNuField1(request.getNuField1());
            customer.setNuField2(request.getNuField2());
            customer.setDtField1(request.getDtField1());
            customer.setDtField2(request.getDtField2());
            customer.setVcBankAcc(request.getVcBankAcc());
            customer.setVcMobile(request.getVcMobile());
            customer.setVcPinNo(request.getVcPinNo());
            customer.setVcVatNo(request.getVcVatNo());
            customer.setChCash(request.getChCash());
            customer.setChExempted(request.getChExempted());
            customer.setNuChequeLimit(request.getNuChequeLimit());
            customer.setVcCorresAdd1(request.getVcCorresAdd1());
            customer.setVcCorrAdd2(request.getVcCorrAdd2());
            customer.setVcCorrAdd3(request.getVcCorrAdd3());
            customer.setVcCorrAdd4(request.getVcCorrAdd4());
            customer.setVcCorrAdd5(request.getVcCorrAdd5());
            customer.setVcCorrAdd6(request.getVcCorrAdd6());
            customer.setVcSegmentCode(request.getVcSegmentCode());
            customer.setVcBankCode(request.getVcBankCode());
            customer.setVcBranchCode(request.getVcBranchCode());
            customer.setVcBussType(request.getVcBussType());
            customer.setVcDiscCatg1(request.getVcDiscCatg1());
            customer.setVcDiscCatg2(request.getVcDiscCatg2());
            customer.setVcSalesExec(request.getVcSalesExec());
            customer.setChStopLimit("N");
            customer.setChStopDays("N");
            customer.setVcDiscCatg3(request.getVcDiscCatg3());
            customer.setVcDiscCatg4(request.getVcDiscCatg4());
            customer.setVcCustomerId(request.getVcCustomerId());
            customer.setDtRegDate(request.getDtRegDate());
            customer.setIdNo(request.getIdNo());
            // customer.setDtIdDate(request.getDtIdDate());
            //customer.setVcIdPlace(request.getVcIdPlace());
            // customer.setBlSignature(request.getBlSignature());
            //  customer.setBlLogo(request.getBlLogo());
            return customer;
        }

        private CustomerResponse mapToCustomer (Customer customer){
            CustomerResponse response = new CustomerResponse();
            response.setVcCompCode(customer.getVcCompCode());
            response.setNuCustomerCode(customer.getNuCustomerCode());
            response.setVcCustomerName(customer.getVcCustomerName());
            response.setVcBillAddress1(customer.getVcBillAddress1());
            response.setVcBillAddress2(customer.getVcBillAddress2());
            response.setVcBillAddress3(customer.getVcBillAddress3());
            response.setVcBillCity(customer.getVcBillCity());
            response.setVcBillState(customer.getVcBillState());
            response.setVcBillCountry(customer.getVcBillCountry());
            response.setVcBillPinCode(customer.getVcBillPinCode());
            response.setVcTelephone(customer.getVcTelephone());
            response.setVcEmail(customer.getVcEmail());
            response.setVcFaxNo(customer.getVcFaxNo());
            response.setVcBankName(customer.getVcBankName());
            response.setVcBankBranchName(customer.getVcBankBranchName());
            response.setVcBankAddress1(customer.getVcBankAddress1());
            response.setVcBankAddress2(customer.getVcBankAddress2());
            response.setVcBankAddress3(customer.getVcBankAddress3());
            response.setVcBankCity(customer.getVcBankCity());
            response.setVcBankState(customer.getVcBankState());
            response.setVcBankCountry(customer.getVcBankCountry());
            response.setVcBankPinCode(customer.getVcBankPinCode());
            response.setVcContactPerson(customer.getVcContactPerson());
            response.setVcContactPersonPhone(customer.getVcContactPersonPhone());
            response.setVcShipAddress1(customer.getVcShipAddress1());
            response.setVcShipAddress2(customer.getVcShipAddress2());
            response.setVcShipAddress3(customer.getVcShipAddress3());
            response.setVcShipCity(customer.getVcShipCity());
            response.setVcShipState(customer.getVcShipState());
            response.setVcShipCountry(customer.getVcShipCountry());
            response.setVcShipPinCode(customer.getVcShipPinCode());
//        response.setVcLincenseNo(customer.getVcLincenseNo());
            response.setVcCstNo(customer.getVcCstNo());
            response.setVcLstNo(customer.getVcLstNo());
            response.setNuMaxCreditDay(customer.getNuMaxCreditDay());
            response.setVcCategoryCode(customer.getVcCategoryCode());
            response.setVcDivisionNo(customer.getVcDivisionNo());
            response.setVcRange(customer.getVcRange());
            response.setVcCollectorate(customer.getVcCollectorate());
            response.setVcRcNo(customer.getVcRcNo());
            response.setVcPitaxGirNo(customer.getVcPitaxGirNo());
            response.setNuAccountCode(customer.getNuAccountCode());
            response.setNuCurrencyCode(customer.getNuCurrencyCode());
            response.setVcVendorCode(customer.getVcVendorCode());
            response.setVcEccNo(customer.getVcEccNo());
            response.setVcLicenseNo(customer.getVcLicenseNo());
            response.setDtCstDate(customer.getDtCstDate());
            response.setDtLstDate(customer.getDtLstDate());
            response.setNuCreditLimit(customer.getNuCreditLimit());
            response.setChStatFlag(customer.getChStatFlag());
            response.setChStatUpFlag(customer.getChStatUpFlag());
            response.setDtModDate(customer.getDtModDate());
            response.setVcDefaultComp(customer.getVcDefaultComp());
            response.setVcAuthCode(customer.getVcAuthCode());
            response.setVcField1(customer.getVcField1());
            response.setVcField2(customer.getVcField2());
            response.setVcField3(customer.getVcField3());
            response.setVcField4(customer.getVcField4());
            response.setNuField1(customer.getNuField1());
            response.setNuField2(customer.getNuField2());
            response.setDtField1(customer.getDtField1());
            response.setDtField2(customer.getDtField2());
            response.setVcBankAcc(customer.getVcBankAcc());
            response.setVcMobile(customer.getVcMobile());
            response.setVcPinNo(customer.getVcPinNo());
            response.setVcVatNo(customer.getVcVatNo());
            response.setChCash(customer.getChCash());
            response.setChExempted(customer.getChExempted());
            response.setNuChequeLimit(customer.getNuChequeLimit());
            response.setVcCorresAdd1(customer.getVcCorresAdd1());
            response.setVcCorrAdd2(customer.getVcCorrAdd2());
            response.setVcCorrAdd3(customer.getVcCorrAdd3());
            response.setVcCorrAdd4(customer.getVcCorrAdd4());
            response.setVcCorrAdd5(customer.getVcCorrAdd5());
            response.setVcCorrAdd6(customer.getVcCorrAdd6());
            response.setVcSegmentCode(customer.getVcSegmentCode());
            response.setVcBankCode(customer.getVcBankCode());
            response.setVcBranchCode(customer.getVcBranchCode());
            response.setVcBussType(customer.getVcBussType());
            response.setVcDiscCatg1(customer.getVcDiscCatg1());
            response.setVcDiscCatg2(customer.getVcDiscCatg2());
            response.setVcSalesExec(customer.getVcSalesExec());
            response.setChStopLimit(customer.getChStopLimit());
            response.setChStopDays(customer.getChStopDays());
            response.setVcDiscCatg3(customer.getVcDiscCatg3());
            response.setVcDiscCatg4(customer.getVcDiscCatg4());
            response.setVcCustomerId(customer.getVcCustomerId());
            response.setDtRegDate(customer.getDtRegDate());
            response.setIdNo(customer.getIdNo());
//        response.setDtIdDate(customer.getDtIdDate());
//        response.setVcIdPlace(customer.getVcIdPlace());
//        response.setBlSignature(customer.getBlSignature());
//        response.setBlLogo(customer.getBlLogo());
            return response;
        }

    }

