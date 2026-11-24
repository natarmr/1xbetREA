package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hxu implements Serializable {
    public static final hxu h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivo0 f13829a;
    public final ivo0 b;
    public final ivo0 c;
    public final ivo0 d;
    public final ivo0 e;
    public final ivo0 f;
    public final double g;

    static {
        ivo0 ivo0Var = ivo0.c;
        h = new hxu(ivo0Var, ivo0Var, ivo0Var, ivo0Var, ivo0Var, ivo0Var, 0.0d);
    }

    public hxu(ivo0 ivo0Var, ivo0 ivo0Var2, ivo0 ivo0Var3, ivo0 ivo0Var4, ivo0 ivo0Var5, ivo0 ivo0Var6, double d) {
        ivo0Var.getClass();
        ivo0Var2.getClass();
        ivo0Var3.getClass();
        ivo0Var4.getClass();
        ivo0Var5.getClass();
        ivo0Var6.getClass();
        this.f13829a = ivo0Var;
        this.b = ivo0Var2;
        this.c = ivo0Var3;
        this.d = ivo0Var4;
        this.e = ivo0Var5;
        this.f = ivo0Var6;
        this.g = d;
    }

    public static hxu a(hxu hxuVar, ivo0 ivo0Var, double d, int i) {
        ivo0 ivo0Var2 = hxuVar.f13829a;
        ivo0 ivo0Var3 = hxuVar.b;
        ivo0 ivo0Var4 = hxuVar.c;
        ivo0 ivo0Var5 = hxuVar.d;
        ivo0 ivo0Var6 = hxuVar.e;
        if ((i & 32) != 0) {
            ivo0Var = hxuVar.f;
        }
        ivo0 ivo0Var7 = ivo0Var;
        if ((i & 64) != 0) {
            d = hxuVar.g;
        }
        hxuVar.getClass();
        ivo0Var2.getClass();
        ivo0Var3.getClass();
        ivo0Var4.getClass();
        ivo0Var5.getClass();
        ivo0Var6.getClass();
        ivo0Var7.getClass();
        return new hxu(ivo0Var2, ivo0Var3, ivo0Var4, ivo0Var5, ivo0Var6, ivo0Var7, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxu)) {
            return false;
        }
        hxu hxuVar = (hxu) obj;
        return Intrinsics.d(this.f13829a, hxuVar.f13829a) && Intrinsics.d(this.b, hxuVar.b) && Intrinsics.d(this.c, hxuVar.c) && Intrinsics.d(this.d, hxuVar.d) && Intrinsics.d(this.e, hxuVar.e) && Intrinsics.d(this.f, hxuVar.f) && Double.compare(this.g, hxuVar.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13829a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetTaxModel(vat=");
        sb.append(this.f13829a);
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
        sb.append(", payDiff=");
        return axq.l(sb, this.g, Separators.RPAREN);
    }
}
