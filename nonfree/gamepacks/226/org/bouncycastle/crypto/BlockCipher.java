package org.bouncycastle.crypto;

public interface BlockCipher {
   int getBlockSize();

   String getAlgorithmName();

   void init(boolean var1, CipherParameters var2) throws IllegalArgumentException;

   int processBlock(byte[] var1, int var2, byte[] var3, int var4) throws DataLengthException, IllegalStateException;

   void reset();
}
