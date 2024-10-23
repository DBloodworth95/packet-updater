package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

public class DSAValidationParameters {
   byte[] seed;
   int usageIndex;
   int counter;

   public boolean equals(Object var1) {
      if (!(var1 instanceof DSAValidationParameters)) {
         return false;
      } else {
         DSAValidationParameters var2 = (DSAValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public DSAValidationParameters(byte[] var1, int var2, int var3) {
      this.seed = var1;
      this.counter = var2;
      this.usageIndex = var3;
   }

   public int getCounter() {
      return this.counter;
   }

   public int aml() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public int getUsageIndex() {
      return this.usageIndex;
   }

   public int hashCode() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public byte[] getSeed() {
      return this.seed;
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof DSAValidationParameters)) {
         return false;
      } else {
         DSAValidationParameters var2 = (DSAValidationParameters)var1;
         return var2.counter != this.counter ? false : Arrays.areEqual(this.seed, var2.seed);
      }
   }

   public int ams() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public DSAValidationParameters(byte[] var1, int var2) {
      this(var1, var2, -1);
   }

   public int amb() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public int amg() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }

   public int amf() {
      return this.counter ^ Arrays.hashCode(this.seed);
   }
}
