package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class csy extends hre0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pry f4912a;
    public final jqy b;
    public final int c;
    public final aiy d;
    public final String e;
    public final a8z f;

    public csy(pry pryVar, jqy jqyVar, int i, aiy aiyVar, nzs0 nzs0Var) {
        jqyVar.getClass();
        nzs0Var.getClass();
        this.f4912a = pryVar;
        this.b = jqyVar;
        this.c = i;
        this.d = aiyVar;
        String str = jqyVar.b;
        this.e = kotlin.text.c.x(str, Separators.LESS_THAN, false) ? null : str;
        this.f = maz.a(wez.f39042a, new nsr((Object) this, (Object) nzs0Var, (byte) 21));
    }

    @Override // a.hre0
    public final dre0 c() {
        return this.f4912a;
    }

    @Override // a.hre0
    public final boolean f() {
        iiy[] iiyVarArr = j24.f15764a;
        jqy jqyVar = this.b;
        jqyVar.getClass();
        return j24.C.m(j24.f15764a[56], jqyVar);
    }

    @Override // a.hre0
    public final String getName() {
        return this.e;
    }

    @Override // a.hre0
    public final int j() {
        return this.c;
    }

    @Override // a.hre0
    public final aiy n() {
        return this.d;
    }

    @Override // a.hre0
    public final kiy p() {
        return (kiy) this.f.getValue();
    }

    @Override // a.hre0
    public final boolean q() {
        pry pryVar = this.f4912a;
        if ((pryVar instanceof osy) || (pryVar.K() instanceof zhy) || fre0.X(pryVar)) {
            iiy[] iiyVarArr = j24.f15764a;
            jqy jqyVar = this.b;
            jqyVar.getClass();
            return j24.C.m(j24.f15764a[56], jqyVar);
        }
        StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
        sb.append(pryVar.K());
        hny.r(sb, pryVar.getName(), this.e);
        return false;
    }

    @Override // a.hre0
    public final boolean u() {
        return this.b.d != null;
    }
}
