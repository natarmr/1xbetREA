package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class txu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivo0 f34720a;
    public final ivo0 b;
    public final ivo0 c;
    public final ivo0 d;
    public final ivo0 e;
    public final ivo0 f;
    public final ivo0 g;
    public final ivo0 h;
    public final double i;

    static {
        ivo0 ivo0Var = ivo0.c;
    }

    public txu(ivo0 ivo0Var, ivo0 ivo0Var2, ivo0 ivo0Var3, ivo0 ivo0Var4, ivo0 ivo0Var5, ivo0 ivo0Var6, ivo0 ivo0Var7, ivo0 ivo0Var8, double d) {
        ivo0Var.getClass();
        ivo0Var2.getClass();
        ivo0Var3.getClass();
        ivo0Var4.getClass();
        ivo0Var5.getClass();
        ivo0Var6.getClass();
        ivo0Var7.getClass();
        this.f34720a = ivo0Var;
        this.b = ivo0Var2;
        this.c = ivo0Var3;
        this.d = ivo0Var4;
        this.e = ivo0Var5;
        this.f = ivo0Var6;
        this.g = ivo0Var7;
        this.h = ivo0Var8;
        this.i = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txu)) {
            return false;
        }
        txu txuVar = (txu) obj;
        return Intrinsics.d(this.f34720a, txuVar.f34720a) && Intrinsics.d(this.b, txuVar.b) && Intrinsics.d(this.c, txuVar.c) && Intrinsics.d(this.d, txuVar.d) && Intrinsics.d(this.e, txuVar.e) && Intrinsics.d(this.f, txuVar.f) && Intrinsics.d(this.g, txuVar.g) && this.h.equals(txuVar.h) && Double.compare(this.i, txuVar.i) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f34720a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetTaxWithHyperBonusModel(vat=");
        sb.append(this.f34720a);
        sb.append(", sumAfterTax=");
        sb.append(this.b);
        sb.append(", payout=");
        sb.append(this.c);
        sb.append(", tax=");
        sb.append(this.d);
        sb.append(", taxRefund=");
        sb.append(this.e);
        sb.append(", potentialWinning=");
        sb.append(this.f);
        sb.append(", hyperBonusValue=");
        sb.append(this.g);
        sb.append(", summaryPayout=");
        sb.append(this.h);
        sb.append(", payDiff=");
        return axq.l(sb, this.i, Separators.RPAREN);
    }
}
