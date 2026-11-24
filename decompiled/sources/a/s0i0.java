package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s0i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final toc0 f31409a;
    public final Long b;
    public final y0b c;
    public final y0b d;
    public final boolean e;
    public final boolean f;

    public s0i0(toc0 toc0Var, Long l, y0b y0bVar, y0b y0bVar2, boolean z, boolean z2) {
        this.f31409a = toc0Var;
        this.b = l;
        this.c = y0bVar;
        this.d = y0bVar2;
        this.e = z;
        this.f = z2;
    }

    public static s0i0 a(s0i0 s0i0Var, Long l, y0b y0bVar, y0b y0bVar2, boolean z, boolean z2, int i) {
        Long l2 = l;
        toc0 toc0Var = s0i0Var.f31409a;
        if ((i & 2) != 0) {
            l2 = s0i0Var.b;
        }
        if ((i & 4) != 0) {
            y0bVar = s0i0Var.c;
        }
        if ((i & 8) != 0) {
            y0bVar2 = s0i0Var.d;
        }
        if ((i & 16) != 0) {
            z = s0i0Var.e;
        }
        if ((i & 32) != 0) {
            z2 = s0i0Var.f;
        }
        boolean z3 = z2;
        s0i0Var.getClass();
        boolean z4 = z;
        y0b y0bVar3 = y0bVar2;
        return new s0i0(toc0Var, l2, y0bVar, y0bVar3, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0i0)) {
            return false;
        }
        s0i0 s0i0Var = (s0i0) obj;
        return this.f31409a.equals(s0i0Var.f31409a) && Intrinsics.d(this.b, s0i0Var.b) && this.c == s0i0Var.c && this.d == s0i0Var.d && this.e == s0i0Var.e && this.f == s0i0Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.f31409a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.f) + brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectCashbackScreenStateModel(promoSettingsModel=");
        sb.append(this.f31409a);
        sb.append(", pointsAccumulated=");
        sb.append(this.b);
        sb.append(", selectedCashbackType=");
        sb.append(this.c);
        sb.append(", newCashbackType=");
        sb.append(this.d);
        sb.append(", loading=");
        return ohs0.p(", error=", Separators.RPAREN, sb, this.e, this.f);
    }
}
