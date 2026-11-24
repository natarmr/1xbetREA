package a;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c5x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rcf0 f3794a = b4x.w("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(cdw0 cdw0Var, wcf0 wcf0Var, wcf0 wcf0Var2, r5k0 r5k0Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        z4x0 z4x0Var;
        char c;
        int iC = c(cdw0Var);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(cdw0Var, wcf0Var2) == ddw0.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (cdw0Var == cdw0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && r5k0Var.d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (wcf0Var.containsKey(cdw0Var) && (z4x0Var = (z4x0) wcf0Var.get(cdw0Var)) != null) {
                int iOrdinal = z4x0Var.ordinal();
                ddw0 ddw0Var = ddw0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    ddw0 ddw0Var2 = ddw0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(cdw0Var, wcf0Var2) == ddw0Var ? f(cdw0Var, cArr, str3, z2) : e(cdw0Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return g(cdw0Var, wcf0Var2) == ddw0Var2 ? e(cdw0Var, cArr, str2, z) : f(cdw0Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (g(cdw0Var, wcf0Var2) != ddw0Var2) {
                        return f(cdw0Var, cArr, str3, z2);
                    }
                } else if (g(cdw0Var, wcf0Var2) != ddw0Var) {
                    return e(cdw0Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c;
        return false;
    }

    public static final int c(cdw0 cdw0Var) {
        if (cdw0Var == cdw0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (cdw0Var == cdw0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (cdw0Var == cdw0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return cdw0Var == cdw0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(cdw0 cdw0Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < cdw0Var.zza()) ? "0" : String.valueOf(str.charAt(cdw0Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= cdw0Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(cdw0Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(cdw0 cdw0Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(cdw0Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= cdw0Var.zza()) {
                char cCharAt = str.charAt(cdw0Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(cdw0 cdw0Var, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(cdw0Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= cdw0Var.zza()) {
                char cCharAt = str.charAt(cdw0Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final ddw0 g(cdw0 cdw0Var, wcf0 wcf0Var) {
        Object obj = wcf0Var.get(cdw0Var);
        if (obj == null) {
            obj = ddw0.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (ddw0) obj;
    }
}
