package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18426a;
    public final int b;
    public final int c;
    public final int d;
    public final uil0 e;
    public final e3n0 f;
    public final giz g;
    public final wfp0 h;
    public final wfp0 i;
    public final teo j;
    public final v40 k;
    public final uoy l;
    public final v5h0 m;
    public final bnq0 n;
    public final String o;

    public kka(int i, int i2, int i3, int i4, uil0 uil0Var, e3n0 e3n0Var, giz gizVar, wfp0 wfp0Var, wfp0 wfp0Var2, teo teoVar, v40 v40Var, uoy uoyVar, v5h0 v5h0Var, bnq0 bnq0Var, String str) {
        this.f18426a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = uil0Var;
        this.f = e3n0Var;
        this.g = gizVar;
        this.h = wfp0Var;
        this.i = wfp0Var2;
        this.j = teoVar;
        this.k = v40Var;
        this.l = uoyVar;
        this.m = v5h0Var;
        this.n = bnq0Var;
        this.o = str;
    }

    public static kka a(kka kkaVar, teo teoVar, v5h0 v5h0Var, bnq0 bnq0Var, int i) {
        return new kka(kkaVar.f18426a, kkaVar.b, kkaVar.c, kkaVar.d, kkaVar.e, kkaVar.f, kkaVar.g, kkaVar.h, kkaVar.i, teoVar, kkaVar.k, kkaVar.l, (i & 4096) != 0 ? kkaVar.m : v5h0Var, (i & 8192) != 0 ? kkaVar.n : bnq0Var, kkaVar.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kka)) {
            return false;
        }
        kka kkaVar = (kka) obj;
        return this.f18426a == kkaVar.f18426a && this.b == kkaVar.b && this.c == kkaVar.c && this.d == kkaVar.d && this.e.equals(kkaVar.e) && this.f.equals(kkaVar.f) && this.g.equals(kkaVar.g) && this.h.equals(kkaVar.h) && Intrinsics.d(this.i, kkaVar.i) && this.j.equals(kkaVar.j) && this.k.equals(kkaVar.k) && this.l == kkaVar.l && Intrinsics.d(this.m, kkaVar.m) && Intrinsics.d(this.n, kkaVar.n) && this.o.equals(kkaVar.o);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f18426a) * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31;
        wfp0 wfp0Var = this.i;
        int iD = twn.d(this.l, (this.k.hashCode() + ((this.j.hashCode() + ((iHashCode + (wfp0Var == null ? 0 : wfp0Var.hashCode())) * 31)) * 31)) * 31, 31);
        v5h0 v5h0Var = this.m;
        int iHashCode2 = (iD + (v5h0Var == null ? 0 : v5h0Var.hashCode())) * 31;
        bnq0 bnq0Var = this.n;
        return this.o.hashCode() + ((iHashCode2 + (bnq0Var != null ? bnq0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("CardModel(id=", this.f18426a, ", constId=", ", startTs=", this.b);
        axq.r(this.c, this.d, ", countryId=", ", sport=", sbT);
        sbT.append(this.e);
        sbT.append(", subSport=");
        sbT.append(this.f);
        sbT.append(", liga=");
        sbT.append(this.g);
        sbT.append(", firstTeam=");
        sbT.append(this.h);
        sbT.append(", secondTeam=");
        sbT.append(this.i);
        sbT.append(", event=");
        sbT.append(this.j);
        sbT.append(", advice=");
        sbT.append(this.k);
        sbT.append(", kind=");
        sbT.append(this.l);
        sbT.append(", scores=");
        sbT.append(this.m);
        sbT.append(", timer=");
        sbT.append(this.n);
        sbT.append(", subGameName=");
        return axq.n(sbT, this.o, Separators.RPAREN);
    }
}
