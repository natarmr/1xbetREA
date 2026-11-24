package a;

import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fhn implements btn {
    public static final fhn c = new fhn();
    public static final String[] d = {"standard", "accelerate", "decelerate", "linear"};
    public static final fhn e;
    public static final fhn f;
    public static final fhn g;
    public static final fhn h;
    public static final fhn i;
    public static final fhn j;
    public static final fhn k;
    public static final fhn l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9550a;
    public String b;

    static {
        byte b = 1;
        boolean z = false;
        e = new fhn(b, "SHA1", z);
        f = new fhn(b, "SHA224", z);
        g = new fhn(b, "SHA256", z);
        h = new fhn(b, "SHA384", z);
        i = new fhn(b, "SHA512", z);
        byte b2 = 2;
        j = new fhn(b2, "TINK", z);
        k = new fhn(b2, "CRUNCHY", z);
        l = new fhn(b2, "NO_PREFIX", z);
    }

    public fhn(String str, byte b) {
        this.f9550a = b;
        switch (b) {
            case 6:
                this.b = (str == null || str.length() <= 0) ? null : str;
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    public static void c(yuu yuuVar, z6j0 z6j0Var) {
        String str = z6j0Var.f43871a;
        if (str != null) {
            yuuVar.l("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        yuuVar.l("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        yuuVar.l("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.1");
        yuuVar.l("Accept", "application/json");
        yuuVar.l("X-CRASHLYTICS-DEVICE-MODEL", z6j0Var.b);
        String str2 = z6j0Var.c;
        if (str2 != null) {
            yuuVar.l("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = z6j0Var.d;
        if (str3 != null) {
            yuuVar.l("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = z6j0Var.e.c().f1941a;
        if (str4 != null) {
            yuuVar.l("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static fhn f(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new ehn(str);
        }
        if (str.startsWith("spline")) {
            wom0 wom0Var = new wom0();
            wom0Var.b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i2 = 0;
            while (iIndexOf2 != -1) {
                dArr[i2] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i2++;
            }
            dArr[i2] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i2 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i3 = 0; i3 < dArrCopyOf.length; i3++) {
                double d3 = dArrCopyOf[i3];
                int i4 = i3 + length2;
                dArr2[i4][0] = d3;
                double d4 = ((double) i3) * d2;
                dArr3[i4] = d4;
                if (i3 > 0) {
                    int i5 = (length2 * 2) + i3;
                    dArr2[i5][0] = d3 + 1.0d;
                    dArr3[i5] = d4 + 1.0d;
                    int i6 = i3 - 1;
                    dArr2[i6][0] = (d3 - 1.0d) - d2;
                    dArr3[i6] = (d4 - 1.0d) - d2;
                }
            }
            pq40 pq40Var = new pq40(dArr3, dArr2);
            System.out.println(" 0 " + pq40Var.O(0.0d));
            System.out.println(" 1 " + pq40Var.O(1.0d));
            wom0Var.m = pq40Var;
            return wom0Var;
        }
        if (str.startsWith("Schlick")) {
            z2h0 z2h0Var = new z2h0();
            z2h0Var.b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            z2h0Var.m = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i7 = iIndexOf4 + 1;
            z2h0Var.n = Double.parseDouble(str.substring(i7, str.indexOf(44, i7)).trim());
            return z2h0Var;
        }
        switch (str) {
            case "accelerate":
                return new ehn("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new ehn("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new ehn("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new ehn("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new ehn("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new ehn("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(d));
                return c;
        }
    }

    public static HashMap g(z6j0 z6j0Var) {
        HashMap map = new HashMap();
        map.put("build_version", z6j0Var.h);
        map.put("display_version", z6j0Var.g);
        map.put(Payload.SOURCE, Integer.toString(z6j0Var.i));
        String str = z6j0Var.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // a.btn
    public boolean a(CharSequence charSequence, int i2, int i3, u0t0 u0t0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.b)) {
            return true;
        }
        u0t0Var.c = (u0t0Var.c & 3) | 4;
        return false;
    }

    public double e(double d2) {
        return 1.0d;
    }

    public JSONObject h(kge kgeVar) {
        String str = this.b;
        int i2 = kgeVar.f18234a;
        rv00 rv00Var = rv00.s;
        rv00Var.D("Settings response code was: " + i2);
        if (i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203) {
            String str2 = kgeVar.b;
            try {
                return new JSONObject(str2);
            } catch (Exception e2) {
                rv00Var.E("Failed to parse settings JSON from ".concat(str), e2);
                rv00Var.E("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i2 + ") from " + str;
        if (rv00Var.p(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }

    public String toString() {
        switch (this.f9550a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // a.btn
    public Object b() {
        return this;
    }

    public double d(double d2) {
        return d2;
    }

    public fhn() {
        this.f9550a = (byte) 0;
        this.b = "identity";
    }

    public fhn(String str, art artVar) {
        this.f9550a = (byte) 4;
        this.b = str;
    }

    public /* synthetic */ fhn(byte b, String str, boolean z) {
        this.f9550a = b;
        this.b = str;
    }
}
