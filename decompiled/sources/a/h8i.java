package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h8i implements eg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u f12626a;
    public final q7d0 b;
    public final knf0 c;
    public final gii0 d;
    public final cad e;
    public final j1q0 f;
    public final vwb0 g;
    public final vby h;
    public final us00 i;
    public final rrc j;
    public final uqe k;
    public final ulk l;
    public final n5d0 m = mbl.b(new t5i(this, (byte) 29));

    public h8i(cad cadVar, q7d0 q7d0Var, vwb0 vwb0Var, knf0 knf0Var, gii0 gii0Var, ulk ulkVar, vby vbyVar, us00 us00Var, j1q0 j1q0Var, uqe uqeVar, rrc rrcVar, r9u r9uVar) {
        this.f12626a = r9uVar;
        this.b = q7d0Var;
        this.c = knf0Var;
        this.d = gii0Var;
        this.e = cadVar;
        this.f = j1q0Var;
        this.g = vwb0Var;
        this.h = vbyVar;
        this.i = us00Var;
        this.j = rrcVar;
        this.k = uqeVar;
        this.l = ulkVar;
    }

    @Override // a.eg3
    public final x4u a() {
        return new x4u(new n4u(new edu(this.d, new pek()), (byte) 23));
    }

    @Override // a.eg3
    public final evt b() {
        return new evt(l());
    }

    @Override // a.eg3
    public final vl00 c() {
        return new vl00(m(), this.k);
    }

    @Override // a.eg3
    public final xox d() {
        fvt0 fvt0Var = new fvt0(this.d, (byte) 23);
        mne mneVarH = ((psc) this.e.b).h();
        x1x.x(mneVarH);
        return new xox(new nhf0(this.b, this.c, fvt0Var, mneVarH));
    }

    @Override // a.eg3
    public final iqi e() {
        fvt0 fvt0Var = new fvt0(this.d, (byte) 23);
        mne mneVarH = ((psc) this.e.b).h();
        x1x.x(mneVarH);
        return new iqi(new nhf0(this.b, this.c, fvt0Var, mneVarH), this.f);
    }

    @Override // a.eg3
    public final do20 f() {
        return new do20(this.l);
    }

    @Override // a.eg3
    public final lsn g() {
        return new lsn(m());
    }

    @Override // a.eg3
    public final nmo h() {
        return new nmo(l());
    }

    @Override // a.eg3
    public final bh3 i() {
        return (bh3) this.m.get();
    }

    @Override // a.eg3
    public final f7u j() {
        rrc rrcVar = this.j;
        us00 us00Var = this.i;
        knf0 knf0Var = this.c;
        return new f7u(us00Var, knf0Var, new lhf0(rrcVar, us00Var, knf0Var), new hsj(this.h, us00Var));
    }

    @Override // a.eg3
    public final nr k() {
        pmi pmiVarM = m();
        vby vbyVar = this.h;
        us00 us00Var = this.i;
        hsj hsjVar = new hsj(vbyVar, us00Var);
        mne mneVarH = ((psc) this.e.b).h();
        x1x.x(mneVarH);
        return new nr(pmiVarM, new iqi(hsjVar, mneVarH, (byte) 2), new lhf0(this.j, us00Var, this.c), (byte) 21);
    }

    public final gr00 l() {
        yk50 yk50Var = new yk50(this.d, (byte) 9);
        bf3 bf3Var = new bf3(this.b, (byte) 1);
        mne mneVarH = ((psc) this.e.b).h();
        x1x.x(mneVarH);
        return new gr00(yk50Var, bf3Var, this.c, mneVarH, this.h);
    }

    public final pmi m() {
        clc clcVar = new clc(this.d, (byte) 29);
        vlk vlkVar = new vlk(this.g, (byte) 0);
        mne mneVarH = ((psc) this.e.b).h();
        x1x.x(mneVarH);
        return new pmi(clcVar, vlkVar, this.c, mneVarH);
    }
}
