package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class iuw0 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ilp0 f15417a;

    public iuw0(ilp0 ilp0Var) {
        this.f15417a = ilp0Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        s0x.H(atomicReference);
        s0x.C(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + Separators.LPAREN + strArr[i] + Separators.RPAREN;
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15417a.g() ? str : g(str, cwr0.o, cwr0.j, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15417a.g() ? str : g(str, phu0.l, phu0.k, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f15417a.g()) {
            return str.startsWith("_exp_") ? kng0.l("experiment_id(", str, Separators.RPAREN) : g(str, epv0.q, epv0.p, d);
        }
        return str;
    }

    public final String d(zzbh zzbhVar) {
        String string;
        ilp0 ilp0Var = this.f15417a;
        if (!ilp0Var.g()) {
            return zzbhVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbhVar.c);
        sb.append(",name=");
        sb.append(a(zzbhVar.f45544a));
        sb.append(",params=");
        zzbf zzbfVar = zzbhVar.b;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !ilp0Var.g() ? zzbfVar.f45543a.toString() : e(zzbfVar.s());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f15417a.g()) {
            return bundle.toString();
        }
        StringBuilder sbR = brm0.r("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbR.length() != 8) {
                sbR.append(", ");
            }
            sbR.append(b(str));
            sbR.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbR.append(strF);
        }
        sbR.append("}]");
        return sbR.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbR = brm0.r("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbR.length() != 1) {
                    sbR.append(", ");
                }
                sbR.append(strE);
            }
        }
        sbR.append("]");
        return sbR.toString();
    }
}
