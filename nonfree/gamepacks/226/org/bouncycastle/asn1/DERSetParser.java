package org.bouncycastle.asn1;

import java.io.IOException;

public class DERSetParser implements ASN1SetParser {
   ASN1StreamParser _parser;

   public ASN1Primitive getLoadedObject() throws IOException {
      return new DERSet(this._parser.readVector(), false);
   }

   public ASN1Encodable readObject() throws IOException {
      return this._parser.readObject();
   }

   public ASN1Primitive toASN1Primitive() {
      try {
         return this.getLoadedObject();
      } catch (IOException var2) {
         throw new ASN1ParsingException(var2.getMessage(), var2);
      }
   }

   DERSetParser(ASN1StreamParser var1) {
      this._parser = var1;
   }
}
