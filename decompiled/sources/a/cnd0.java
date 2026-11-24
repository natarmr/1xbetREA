package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nnd0 f4648a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public cnd0(nnd0 nnd0Var, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.f4648a = nnd0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnd0)) {
            return false;
        }
        cnd0 cnd0Var = (cnd0) obj;
        return this.f4648a.equals(cnd0Var.f4648a) && Intrinsics.d(this.b, cnd0Var.b) && Intrinsics.d(this.c, cnd0Var.c) && this.d == cnd0Var.d && this.e == cnd0Var.e;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f4648a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + brm0.e((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickBetKeyModel(quickBetStateModel=");
        sb.append(this.f4648a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", infoLine=");
        brm0.C(this.c, ", isSimpleBetTab=", ", forceLoading=", sb, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
