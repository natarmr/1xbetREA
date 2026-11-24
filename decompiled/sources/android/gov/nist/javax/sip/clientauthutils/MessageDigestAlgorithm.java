package android.gov.nist.javax.sip.clientauthutils;

import a.b1j;
import a.brm0;
import a.e9d0;
import a.f140;
import a.hne;
import a.hny;
import a.kng0;
import a.w6x;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class MessageDigestAlgorithm {
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static String H(String str) {
        try {
            return toHexString(MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e9d0.m("Failed to instantiate an MD5 algorithm", e);
            return null;
        }
    }

    private static String KD(String str, String str2) {
        return H(w6x.q(str, Separators.COLON, str2));
    }

    public static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, StackLogger stackLogger) {
        String strK;
        String strL;
        if (stackLogger.isLoggingEnabled(32)) {
            StringBuilder sbN = b1j.n("trying to authenticate using : ", str, ", ", str2, ", ");
            sbN.append(str3);
            sbN.append(", ");
            f140.s(", ", str5, ", ", sbN, str4 != null && str4.trim().length() > 0);
            f140.v(sbN, str6, ", ", str7, ", ");
            f140.v(sbN, str8, ", ", str9, ", ");
            sbN.append(str10);
            sbN.append(", ");
            sbN.append(str11);
            stackLogger.logDebug(sbN.toString());
        }
        if (str2 == null || str3 == null || str4 == null || str8 == null || str9 == null || str5 == null) {
            hny.u("Null parameter to MessageDigestAlgorithm.calculateResponse()");
            return null;
        }
        if (str == null || str.trim().length() == 0 || str.trim().equalsIgnoreCase(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM)) {
            strK = b1j.k(str2, Separators.COLON, str3, Separators.COLON, str4);
        } else {
            if (str7 == null || str7.length() == 0) {
                hny.u("cnonce_value may not be absent for MD5-Sess algorithm.");
                return null;
            }
            StringBuilder sb = new StringBuilder();
            f140.v(sb, H(b1j.k(str2, Separators.COLON, str3, Separators.COLON, str4)), Separators.COLON, str5, Separators.COLON);
            sb.append(str7);
            strK = sb.toString();
        }
        if (str11 == null || str11.trim().length() == 0 || str11.trim().equalsIgnoreCase("auth")) {
            strL = kng0.l(str8, Separators.COLON, str9);
        } else {
            if (str10 == null) {
                str10 = "";
            }
            strL = str8 + Separators.COLON + str9 + Separators.COLON + H(str10);
        }
        if (str7 == null || str11 == null || str6 == null || !(str11.equalsIgnoreCase("auth") || str11.equalsIgnoreCase("auth-int"))) {
            String strH = H(strK);
            StringBuilder sbT = brm0.t(str5, Separators.COLON);
            sbT.append(H(strL));
            return KD(strH, sbT.toString());
        }
        String strH2 = H(strK);
        StringBuilder sbN2 = b1j.n(str5, Separators.COLON, str6, Separators.COLON, str7);
        hne.B(sbN2, Separators.COLON, str11, Separators.COLON);
        sbN2.append(H(strL));
        return KD(strH2, sbN2.toString());
    }

    private static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = toHex;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, StackLogger stackLogger) {
        String strL;
        if (stackLogger.isLoggingEnabled(32)) {
            StringBuilder sbN = b1j.n("trying to authenticate using : ", str, ", ", str2, ", ");
            f140.v(sbN, str3, ", ", str4, ", ");
            f140.v(sbN, str5, ", ", str6, ", ");
            f140.v(sbN, str7, ", ", str8, ", ");
            sbN.append(str9);
            stackLogger.logDebug(sbN.toString());
        }
        if (str2 != null && str6 != null && str7 != null && str3 != null) {
            if (str5 != null && str5.length() != 0) {
                if (str9 != null && str9.trim().length() != 0 && !str9.trim().equalsIgnoreCase("auth")) {
                    if (str8 == null) {
                        str8 = "";
                    }
                    strL = str6 + Separators.COLON + str7 + Separators.COLON + H(str8);
                } else {
                    strL = kng0.l(str6, Separators.COLON, str7);
                }
                if (str9 != null && str4 != null && (str9.equalsIgnoreCase("auth") || str9.equalsIgnoreCase("auth-int"))) {
                    StringBuilder sbN2 = b1j.n(str3, Separators.COLON, str4, Separators.COLON, str5);
                    hne.B(sbN2, Separators.COLON, str9, Separators.COLON);
                    sbN2.append(H(strL));
                    return KD(str2, sbN2.toString());
                }
                StringBuilder sbT = brm0.t(str3, Separators.COLON);
                sbT.append(H(strL));
                return KD(str2, sbT.toString());
            }
            hny.u("cnonce_value may not be absent for MD5-Sess algorithm.");
            return null;
        }
        hny.u("Null parameter to MessageDigestAlgorithm.calculateResponse()");
        return null;
    }
}
