package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/bzn;", "La/um40;", "La/ozn;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bzn extends um40 {
    public final oms0 b;
    public final vls0 c;
    public final vls0 d;
    public final vls0 e;
    public final pzn f;
    public final alo g;
    public final toj0 h;
    public final Function0 i;
    public final czn j;

    public bzn(oms0 oms0Var, vls0 vls0Var, vls0 vls0Var2, vls0 vls0Var3, pzn pznVar, alo aloVar, toj0 toj0Var, Function0 function0, czn cznVar) {
        this.b = oms0Var;
        this.c = vls0Var;
        this.d = vls0Var2;
        this.e = vls0Var3;
        this.f = pznVar;
        this.g = aloVar;
        this.h = toj0Var;
        this.i = function0;
        this.j = cznVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bzn)) {
            return false;
        }
        bzn bznVar = (bzn) obj;
        return bznVar.b == this.b && Intrinsics.d(bznVar.c, this.c) && Intrinsics.d(bznVar.d, this.d) && Intrinsics.d(bznVar.e, this.e) && bznVar.f.equals(this.f) && Intrinsics.d(bznVar.g, this.g) && bznVar.h == this.h && bznVar.i == this.i && Intrinsics.d(bznVar.j, this.j);
    }

    @Override // a.um40
    public final lm40 f() {
        return new ozn(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ozn oznVar = (ozn) lm40Var;
        oznVar.p = this.b;
        oznVar.q = this.c;
        oznVar.r = this.d;
        oznVar.s = this.e;
        oznVar.t = this.f;
        oznVar.u = this.g;
        oznVar.v = this.h;
        oznVar.w = this.i;
        oznVar.x = this.j;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        vls0 vls0Var = this.c;
        int iHashCode2 = (iHashCode + (vls0Var != null ? vls0Var.hashCode() : 0)) * 31;
        vls0 vls0Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (vls0Var2 != null ? vls0Var2.hashCode() : 0)) * 31;
        vls0 vls0Var3 = this.e;
        return this.h.hashCode() + (this.j.hashCode() * 31) + ((this.i.hashCode() + ((this.g.f1078a.hashCode() + ((this.f.f27854a.hashCode() + ((iHashCode3 + (vls0Var3 != null ? vls0Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
