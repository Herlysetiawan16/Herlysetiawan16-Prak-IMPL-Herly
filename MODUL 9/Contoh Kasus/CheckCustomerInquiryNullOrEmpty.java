private void CheckCustomerInquiryNullOrEmpty(CustomerInquiryRequest request)
{
    // Check if both CustomerID and ProductNumber are null or empty
    if (string.IsNullOrEmpty(request.Customer.CustomerID) &&
        string.IsNullOrEmpty(request.CustomerProduct.ProductNumber))
    {
        // Both are null or empty, throw an exception
        throw new BusinessException(HandledErrors.CustomerEmptyMessage);
    }
}
