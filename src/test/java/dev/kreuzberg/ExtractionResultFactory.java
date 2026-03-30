package dev.kreuzberg;

/**
 * Test factory that can access the package-private ExtractionResult constructor
 * and ResultParser.fromJson method.
 */
public final class ExtractionResultFactory {

  private ExtractionResultFactory() {}

  public static ExtractionResult fromJson(String json) throws KreuzbergException {
    return ResultParser.fromJson(json);
  }
}
