package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx4 f20797a;
    public final String b;
    public final boolean c;

    public lx4(gx4 gx4Var, String str, boolean z) {
        str.getClass();
        this.f20797a = gx4Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx4)) {
            return false;
        }
        lx4 lx4Var = (lx4) obj;
        return Intrinsics.d(this.f20797a, lx4Var.f20797a) && Intrinsics.d(this.b, lx4Var.b) && this.c == lx4Var.c;
    }

    public final int hashCode() {
        gx4 gx4Var = this.f20797a;
        return Boolean.hashCode(this.c) + ua80.b((gx4Var == null ? 0 : gx4Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBetTabKeyModel(autoBetState=");
        sb.append(this.f20797a);
        sb.append(", currencySymbol=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
