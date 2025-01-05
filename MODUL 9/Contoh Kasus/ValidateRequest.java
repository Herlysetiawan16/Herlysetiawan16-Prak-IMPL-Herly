private void ValidateRequest(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength)
{
    // 1. Check if the request is not null or empty
    CheckCustomerInquiryNotNullOrEmpty(request);

    // 2. Check if the request fields are not null or empty
    CheckCustomerInquiryNullOrEmpty(request);

    // 3. Validate CustomerID: Check field length and pad the parameter
    CheckCustomerIDValid(request, customerFieldLength);

    // 4. Validate ProductNumber: Check field length and pad the parameter
    CheckProductNumberValid(request, productFieldLength);
}
