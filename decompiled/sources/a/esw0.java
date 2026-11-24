package a;

import com.google.android.recaptcha.internal.zzln;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class esw0 {
    public static /* synthetic */ boolean a(int i) {
        return i != 1 ? b(i) : d(i);
    }

    public static final boolean b(int i) {
        Boolean bool;
        if (!pyw0.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            pyw0.f27818a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static final int c(int i) {
        if (i == 5) {
            lkw0.c();
            throw null;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return -1;
        }
        throw null;
    }

    public static final boolean d(int i) {
        return !pyw0.a();
    }

    public static final int e(int i) {
        if (i == 7) {
            lkw0.c();
            throw null;
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return -1;
            default:
                throw null;
        }
    }

    public static int f(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ byte h(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 20;
            case 11:
                return (byte) 21;
            case 12:
                return (byte) 22;
            default:
                throw null;
        }
    }

    public static int i(int i, int i2, int i3) {
        return zzln.zzA(i) + i2 + i3;
    }

    public static xew0 j(xew0 xew0Var) {
        int size = xew0Var.size();
        return xew0Var.zzg(size + size);
    }

    public static void k(StringBuilder sb, String str, List list, String str2, boolean z) {
        sb.append(str);
        sb.append(list);
        sb.append(str2);
        sb.append(z);
    }

    public static void l(StringBuilder sb, String str, boolean z, String str2, List list) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(list);
    }

    public static /* synthetic */ String m(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_KEYMATERIAL";
            case 2:
                return "SYMMETRIC";
            case 3:
                return "ASYMMETRIC_PRIVATE";
            case 4:
                return "ASYMMETRIC_PUBLIC";
            case 5:
                return "REMOTE";
            case 6:
                return "UNRECOGNIZED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_PREFIX";
            case 2:
                return "TINK";
            case 3:
                return "LEGACY";
            case 4:
                return "RAW";
            case 5:
                return "CRUNCHY";
            case 6:
                return "WITH_ID_REQUIREMENT";
            case 7:
                return "UNRECOGNIZED";
            default:
                return "null";
        }
    }
}
