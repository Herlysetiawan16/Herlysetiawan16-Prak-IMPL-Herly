private void CheckCustomerIDValid(CustomerInquiryRequest request, int customerIDFieldLength)
{
    // Check if CustomerID is null or empty
    if (string.IsNullOrEmpty(request.Customer.CustomerID))
    {
        // Check CustomerID length
        if (request.Customer.CustomerID.Length > customerIDFieldLength)
        {
            throw new BusinessException(HandledErrors.CustomerInvalidLengthMessage);
        }

        // Pad the left side of CustomerID with zeros
        request.Customer.CustomerID = request.Customer.CustomerID.PadLeft(
            customerIDFieldLength, Convert.ToChar("0", CultureInfo.CurrentCulture));
    }
}
