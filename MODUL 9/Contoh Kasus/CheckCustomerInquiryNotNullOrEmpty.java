private void CheckCustomerInquiryNotNullOrEmpty(CustomerInquiryRequest request)
{
    // Check if both parameters are not null or empty
    if (!string.IsNullOrEmpty(request.CustomerProduct.ProductNumber) &&
        !string.IsNullOrEmpty(request.Customer.CustomerID))
    {
        // Both were populated, throw an exception
        throw new BusinessException(HandledErrors.InvalidBothParameterMessage);
    }
}
