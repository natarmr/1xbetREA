package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bsy extends sry {
    public final bqy j;
    public final a8z k;
    public final a8z l;
    public final a8z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsy(ihy ihyVar, String str, Object obj, bqy bqyVar, rgy rgyVar) {
        super(ihyVar, str, obj, rgyVar);
        ihyVar.getClass();
        str.getClass();
        bqyVar.getClass();
        rgyVar.getClass();
        this.j = bqyVar;
        wez wezVar = wez.f39042a;
        this.k = maz.a(wezVar, new zry(this, (byte) 0));
        this.l = maz.a(wezVar, new asy(ihyVar, this));
        this.m = maz.a(wezVar, new asy(this, ihyVar));
    }

    @Override // a.sry
    public final fqy A() {
        return (fqy) this.k.getValue();
    }

    @Override // a.sry
    public final hfy B() {
        bqy bqyVar = this.j;
        bqyVar.getClass();
        hfy hfyVar = j0x.u(bqyVar).f39041a;
        if (hfyVar != null) {
            return hfyVar;
        }
        ohq.u(this, "No signature for function: ");
        return null;
    }

    @Override // a.sry
    public final nzs0 C() {
        return (nzs0) this.l.getValue();
    }

    @Override // a.sry
    public final List D() {
        return this.j.f;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new bsy(ihyVar, this.d, op9.NO_RECEIVER, this.j, rgyVar);
    }

    @Override // a.qgy
    public final String getName() {
        return this.j.b;
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return (kiy) this.m.getValue();
    }

    @Override // a.qgy
    public final viy getVisibility() {
        iiy[] iiyVarArr = j24.f15764a;
        bqy bqyVar = this.j;
        bqyVar.getClass();
        return jwb.b0((nuu0) j24.h.v(j24.f15764a[22], bqyVar));
    }

    @Override // a.jhy
    public final boolean isExternal() {
        iiy[] iiyVarArr = j24.f15764a;
        bqy bqyVar = this.j;
        bqyVar.getClass();
        return j24.m.m(j24.f15764a[28], bqyVar);
    }

    @Override // a.jhy
    public final boolean isInfix() {
        iiy[] iiyVarArr = j24.f15764a;
        bqy bqyVar = this.j;
        bqyVar.getClass();
        return j24.k.m(j24.f15764a[25], bqyVar);
    }

    @Override // a.jhy
    public final boolean isInline() {
        iiy[] iiyVarArr = j24.f15764a;
        bqy bqyVar = this.j;
        bqyVar.getClass();
        return j24.l.m(j24.f15764a[26], bqyVar);
    }

    @Override // a.jhy
    public final boolean isOperator() {
        iiy[] iiyVarArr = j24.f15764a;
        bqy bqyVar = this.j;
        bqyVar.getClass();
        return j24.j.m(j24.f15764a[24], bqyVar);
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        iiy[] iiyVarArr = j24.f15764a;
        bqy bqyVar = this.j;
        bqyVar.getClass();
        return j24.n.m(j24.f15764a[29], bqyVar);
    }

    @Override // a.dre0
    public final fm40 m() {
        iiy[] iiyVarArr = j24.f15764a;
        bqy bqyVar = this.j;
        bqyVar.getClass();
        return (fm40) j24.i.v(j24.f15764a[23], bqyVar);
    }

    @Override // a.sry
    public final List z() {
        return this.j.g;
    }
}
