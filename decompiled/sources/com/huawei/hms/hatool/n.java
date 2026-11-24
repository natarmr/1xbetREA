package com.huawei.hms.hatool;

import a.afn0;
import a.jwn;
import a.obc;
import a.rq8;
import android.util.Pair;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f45875a = Charset.forName("UTF-8");

    public static String a(byte[] bArr, String str) {
        byte[] bArrDoFinal;
        if (bArr == null || bArr.length == 0 || str == null) {
            v.b("AesCipher", "cbc encrypt(byte) param is not right");
            return "";
        }
        byte[] bArrR = obc.R(str);
        if (bArrR.length < 16) {
            v.b("AesCipher", "key length is not right");
            return "";
        }
        byte[] bArrB = jwn.b(12);
        if (bArr.length == 0) {
            afn0.j("GCM", "encrypt 6 content length is 0");
            bArrDoFinal = new byte[0];
        } else if (bArrR.length < 16) {
            afn0.j("GCM", "encrypt 6 key error: 6 key length less than 16 bytes.");
            bArrDoFinal = new byte[0];
        } else if (bArrB.length < 12) {
            afn0.j("GCM", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArrDoFinal = new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrR, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArrB));
                bArrDoFinal = cipher.doFinal(bArr);
            } catch (NullPointerException e) {
                afn0.j("GCM", "GCM encrypt data error" + e.getMessage());
                bArrDoFinal = new byte[0];
            } catch (GeneralSecurityException e2) {
                afn0.j("GCM", "GCM encrypt data error" + e2.getMessage());
                bArrDoFinal = new byte[0];
            }
        }
        byte[] bArr2 = new byte[bArrB.length + bArrDoFinal.length];
        System.arraycopy(bArrB, 0, bArr2, 0, bArrB.length);
        System.arraycopy(bArrDoFinal, 0, bArr2, bArrB.length, bArrDoFinal.length);
        return obc.M(bArr2);
    }

    public static String b(String str, String str2) {
        byte[] bArr;
        byte[] bytes = str.getBytes(f45875a);
        byte[] bArrR = obc.R(str2);
        byte[] bArrB = jwn.b(16);
        byte[] bArrO = rq8.O(bytes, bArrR, bArrB);
        if (Arrays.equals(bArrO, new byte[0])) {
            afn0.j("CBC", "encrypt encryptContent is null");
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[bArrB.length + bArrO.length];
            System.arraycopy(bArrB, 0, bArr2, 0, bArrB.length);
            System.arraycopy(bArrO, 0, bArr2, bArrB.length, bArrO.length);
            bArr = bArr2;
        }
        return obc.M(bArr);
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> pairA = a(str, 32);
        return new String(rq8.J(obc.R((String) pairA.second), obc.R(str2), (byte[]) pairA.first), f45875a);
    }

    public static Pair<byte[], String> a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String strSubstring = str.substring(0, i);
        return new Pair<>(obc.R(strSubstring), str.substring(i));
    }
}
