package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mnd0 f2878a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public bnd0(mnd0 mnd0Var, String str, boolean z, boolean z2) {
        this.f2878a = mnd0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnd0)) {
            return false;
        }
        bnd0 bnd0Var = (bnd0) obj;
        return this.f2878a.equals(bnd0Var.f2878a) && Intrinsics.d(this.b, bnd0Var.b) && this.c == bnd0Var.c && this.d == bnd0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f2878a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + brm0.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickBetKeyModel(quickBetStateModel=");
        sb.append(this.f2878a);
        sb.append(", infoLine=");
        sb.append(this.b);
        sb.append(", isSimpleBetTab=");
        return ohs0.p(", forceLoading=", Separators.RPAREN, sb, this.c, this.d);
    }
}
