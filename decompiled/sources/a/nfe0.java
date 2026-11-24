package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nfe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aie f23433a;
    public final long b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final kg f;
    public final ot0 g;
    public final Set h;
    public final ql5 i;

    public nfe0(aie aieVar, long j, int i, boolean z, boolean z2, kg kgVar, ot0 ot0Var, Set set, ql5 ql5Var) {
        kgVar.getClass();
        set.getClass();
        this.f23433a = aieVar;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = kgVar;
        this.g = ot0Var;
        this.h = set;
        this.i = ql5Var;
    }

    public static nfe0 a(nfe0 nfe0Var, aie aieVar, boolean z, Set set, ql5 ql5Var, int i) {
        if ((i & 1) != 0) {
            aieVar = nfe0Var.f23433a;
        }
        aie aieVar2 = aieVar;
        long j = nfe0Var.b;
        int i2 = nfe0Var.c;
        if ((i & 8) != 0) {
            z = nfe0Var.d;
        }
        boolean z2 = z;
        boolean z3 = nfe0Var.e;
        kg kgVar = nfe0Var.f;
        ot0 ot0Var = nfe0Var.g;
        Set set2 = (i & 128) != 0 ? nfe0Var.h : set;
        ql5 ql5Var2 = (i & 256) != 0 ? nfe0Var.i : ql5Var;
        nfe0Var.getClass();
        kgVar.getClass();
        set2.getClass();
        return new nfe0(aieVar2, j, i2, z2, z3, kgVar, ot0Var, set2, ql5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfe0)) {
            return false;
        }
        nfe0 nfe0Var = (nfe0) obj;
        return this.f23433a.equals(nfe0Var.f23433a) && this.b == nfe0Var.b && this.c == nfe0Var.c && this.d == nfe0Var.d && this.e == nfe0Var.e && this.f == nfe0Var.f && this.g == nfe0Var.g && Intrinsics.d(this.h, nfe0Var.h) && Intrinsics.d(this.i, nfe0Var.i);
    }

    public final int hashCode() {
        int iG = ohs0.g(this.h, (this.g.hashCode() + ((this.f.hashCode() + brm0.e(brm0.e(twn.a(this.c, rw2.b(this.f23433a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e)) * 31)) * 31, 31);
        ql5 ql5Var = this.i;
        return iG + (ql5Var == null ? 0 : ql5Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedGamesState(contentState=");
        sb.append(this.f23433a);
        sb.append(", partitionId=");
        sb.append(this.b);
        dw9.v(this.c, ", lottieTypeId=", ", isAuthorized=", sb, this.d);
        sb.append(", isVirtual=");
        sb.append(this.e);
        sb.append(", accountSelectionStyle=");
        sb.append(this.f);
        sb.append(", aggregatorGameCardCollectionStyleType=");
        sb.append(this.g);
        sb.append(", favorites=");
        sb.append(this.h);
        sb.append(", balance=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
