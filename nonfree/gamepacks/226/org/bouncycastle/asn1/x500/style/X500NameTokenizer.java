package org.bouncycastle.asn1.x500.style;

public class X500NameTokenizer {
   StringBuffer buf;
   int index;
   String value;
   char separator;

   public boolean hasMoreTokens() {
      return this.index != this.value.length();
   }

   public X500NameTokenizer(String var1, char var2) {
      this.buf = new StringBuffer();
      this.value = var1;
      this.index = -1;
      this.separator = var2;
   }

   public X500NameTokenizer(String var1) {
      this(var1, ',');
   }

   public String nextToken() {
      if (this.index == this.value.length()) {
         return null;
      } else {
         int var1 = this.index + 1;
         boolean var2 = false;
         boolean var3 = false;
         this.buf.setLength(0);

         for(; var1 != this.value.length(); ++var1) {
            char var4 = this.value.charAt(var1);
            if (var4 == '"') {
               if (!var3) {
                  var2 = !var2;
               }

               this.buf.append(var4);
               var3 = false;
            } else if (!var3 && !var2) {
               if (var4 == '\\') {
                  this.buf.append(var4);
                  var3 = true;
               } else {
                  if (var4 == this.separator) {
                     break;
                  }

                  this.buf.append(var4);
               }
            } else {
               this.buf.append(var4);
               var3 = false;
            }
         }

         this.index = var1;
         return this.buf.toString();
      }
   }
}
