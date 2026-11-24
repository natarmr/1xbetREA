package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c2c0 {
    public static final boolean a(m2c0 m2c0Var, w2c0 w2c0Var, String str) {
        switch (w2c0Var.ordinal()) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return true;
            case 9:
                return str.length() == 0 && !StringsKt.W(b(m2c0Var, w2c0.j));
            case 10:
                return str.length() == 0 && !StringsKt.W(b(m2c0Var, w2c0.k));
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
                return str.length() == 0;
            default:
                return false;
        }
    }

    public static final String b(m2c0 m2c0Var, w2c0 w2c0Var) {
        String str = m2c0Var.H;
        switch (w2c0Var.ordinal()) {
            case 3:
                return m2c0Var.U;
            case 4:
                return m2c0Var.V;
            case 5:
                return m2c0Var.f21050a;
            case 6:
                return m2c0Var.b;
            case 7:
                return m2c0Var.t;
            case 8:
                return m2c0Var.e;
            case 9:
                return m2c0Var.f;
            case 10:
                return m2c0Var.W;
            case 11:
                return m2c0Var.u;
            case 12:
                return m2c0Var.G;
            case 13:
                return m2c0Var.w;
            case 14:
                return m2c0Var.x;
            case 15:
                return m2c0Var.E;
            case 16:
                return m2c0Var.z;
            case 17:
            case 18:
                return str;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return m2c0Var.d0;
            default:
                return "";
        }
    }

    public static final boolean c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, m2c0 m2c0Var, boolean z6, boolean z7, boolean z8, w2c0 w2c0Var, String str) {
        switch (w2c0Var.ordinal()) {
            case 3:
            case 4:
            case 6:
            case 8:
            case 11:
                return str.length() == 0;
            case 5:
                return (str.length() != 0 || z || z2) ? false : true;
            case 7:
                return str.length() == 0 && !z2;
            case 9:
                return (str.length() != 0 || z || z2) ? false : true;
            case 10:
                return str.length() == 0 && !z2;
            case 12:
                return z3 && !z4;
            case 13:
                return (!z3 || z || z4) ? false : true;
            case 14:
                return !z4;
            case 15:
                return !z4;
            case 16:
                return (!z3 || z || z4) ? false : true;
            case 17:
                return str.length() == 0 && z6;
            case 18:
                if (!z5 || z4) {
                    return false;
                }
                int i = m2c0Var.F;
                return i == 103 || i == 29;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return str.length() == 0 && z7 && z8;
            default:
                return false;
        }
    }
}
