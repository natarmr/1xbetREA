package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"La/ou2;", TokenNames.T, "La/um40;", "La/hv2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ou2<T> extends um40 {
    public final rv2 b;
    public final boolean c;
    public final Boolean d;
    public final gy40 e;
    public final qkq f;

    public ou2(rv2 rv2Var, boolean z, Boolean bool, gy40 gy40Var, qkq qkqVar) {
        ma80 ma80Var = ma80.f21447a;
        this.b = rv2Var;
        this.c = z;
        this.d = bool;
        this.e = gy40Var;
        this.f = qkqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou2)) {
            return false;
        }
        ou2 ou2Var = (ou2) obj;
        if (!Intrinsics.d(this.b, ou2Var.b)) {
            return false;
        }
        ma80 ma80Var = ma80.f21447a;
        return this.c == ou2Var.c && Intrinsics.d(this.d, ou2Var.d) && Intrinsics.d(this.e, ou2Var.e) && Intrinsics.d(this.f, ou2Var.f);
    }

    @Override // a.um40
    public final lm40 f() {
        hv2 hv2Var = new hv2(dv2.f6723a, this.c, this.e, ma80.f21447a);
        hv2Var.k1 = this.b;
        hv2Var.l1 = this.d;
        hv2Var.m1 = this.f;
        return hv2Var;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        boolean z;
        boolean z2;
        hv2 hv2Var = (hv2) lm40Var;
        ma80 ma80Var = ma80.f21447a;
        qkq qkqVar = this.f;
        hv2Var.m1 = qkqVar;
        rv2 rv2Var = hv2Var.k1;
        rv2 rv2Var2 = this.b;
        if (Intrinsics.d(rv2Var, rv2Var2)) {
            z = false;
        } else {
            hv2Var.k1 = rv2Var2;
            hv2Var.w1(qkqVar);
            z = true;
        }
        if (hv2Var.q != ma80Var) {
            hv2Var.q = ma80Var;
            z = true;
        }
        Boolean bool = hv2Var.l1;
        Boolean bool2 = this.d;
        if (Intrinsics.d(bool, bool2)) {
            z2 = z;
        } else {
            hv2Var.l1 = bool2;
            z2 = true;
        }
        hv2Var.t1(hv2Var.r, this.c, this.e, ma80Var, z2);
    }

    public final int hashCode() {
        int iE = brm0.e((ma80.f21447a.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.c);
        Boolean bool = this.d;
        int iHashCode = (iE + (bool != null ? bool.hashCode() : 0)) * 31;
        gy40 gy40Var = this.e;
        int iHashCode2 = (iHashCode + (gy40Var != null ? gy40Var.hashCode() : 0)) * 29791;
        qkq qkqVar = this.f;
        return iHashCode2 + (qkqVar != null ? qkqVar.hashCode() : 0);
    }
}
