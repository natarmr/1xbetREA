package com.huawei.agconnect.config.impl;

import a.hny;
import a.jf4;
import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Keys {
    public static SecretKeySpec a(AesParam aesParam) throws InvalidKeySpecException {
        String str = aesParam.e;
        int i = aesParam.g;
        String str2 = aesParam.d;
        String str3 = aesParam.f45679a;
        String str4 = aesParam.b;
        String str5 = aesParam.c;
        int i2 = aesParam.f;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str2) || str3.length() != str4.length() || str4.length() != str5.length() || str5.length() != i * 2 || i2 < 0 || TextUtils.isEmpty(str)) {
            jf4.o("invalid data for generating the key.");
            return null;
        }
        Log.d("AGC_Keys", "build aes key, iterationCount:" + i2);
        byte[] bArrA = Hex.a(str3);
        byte[] bArrA2 = Hex.a(str4);
        byte[] bArrA3 = Hex.a(str5);
        b(bArrA, -4);
        byte[] bArrD = d(bArrA, bArrA2);
        b(bArrD, 6);
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance(str).generateSecret(new PBEKeySpec(Hex.b(d(bArrD, bArrA3)).toCharArray(), Hex.a(str2), i2, i * 8));
        Log.d("AGC_Keys", "build aes key end");
        return new SecretKeySpec(secretKeyGenerateSecret.getEncoded(), "AES");
    }

    public static void b(byte[] bArr, int i) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i < 0) {
                bArr[i2] = (byte) (bArr[i2] << (-i));
            } else {
                bArr[i2] = (byte) (bArr[i2] >> i);
            }
        }
    }

    public static byte[] c(SecretKeySpec secretKeySpec, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (secretKeySpec == null) {
            hny.u("key or cipherText must not be null.");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArrCopyOfRange));
        return cipher.doFinal(bArr, bArrCopyOfRange.length + 1, (bArr.length - bArrCopyOfRange.length) - 1);
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            jf4.o("left and right must be the same length.");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }
}
