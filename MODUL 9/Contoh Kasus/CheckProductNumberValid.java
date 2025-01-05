private void CheckProductNumberValid(CustomerInquiryRequest request, int productFieldLength)
{
    // Check if ProductNumber is null or empty
    if (string.IsNullOrEmpty(request.CustomerProduct.ProductNumber))
    {
        // Check ProductNumber length
        if (request.CustomerProduct.ProductNumber.Length > productFieldLength)
        {
            throw new BusinessException(HandledErrors.ProductInvalidLengthMessage);
        }

        // Pad the left side of ProductNumber with zeros
        request.CustomerProduct.ProductNumber = request.CustomerProduct.ProductNumber.PadLeft(
            productFieldLength, Convert.ToChar("0", CultureInfo.CurrentCulture));
    }
}
