package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nyi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24331a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nyi(Object obj, int i, byte b) {
        this.f24331a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // a.o5d0
    public final Object get() {
        Object r2m0Var;
        byte b = this.f24331a;
        byte b2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                oyi oyiVar = (oyi) obj;
                knf0 knf0Var = oyiVar.o;
                gii0 gii0Var = oyiVar.n;
                if (b2 == 0) {
                    return new myi(this);
                }
                if (b2 == 1) {
                    return new p5t0((wqj0) oyiVar.s.get(), new kd30(gii0Var, (byte) 23), knf0Var);
                }
                if (b2 == 2) {
                    return new wqj0();
                }
                if (b2 == 3) {
                    return new d4t0(new iqi(gii0Var, (byte) 12), new jtj(gii0Var));
                }
                if (b2 == 4) {
                    return new nov(knf0Var, new u8u(gii0Var, (byte) 20), new pyu());
                }
                c99.h(b2);
                return null;
            case 1:
                nc0 nc0Var = (nc0) obj;
                if (b2 == 0) {
                    return new tyi(this);
                }
                if (b2 == 1) {
                    mne mneVarH = ((psc) ((cad) nc0Var.e).b).h();
                    x1x.x(mneVarH);
                    return new ggm0(mneVarH, new fuj0((gii0) nc0Var.f, (byte) 3), (knf0) nc0Var.g, (igm0) nc0Var.f23267a);
                }
                if (b2 == 2) {
                    return new h32();
                }
                c99.h(b2);
                return null;
            case 2:
                kki kkiVar = (kki) obj;
                g8i g8iVar = (g8i) kkiVar.e;
                if (b2 == 0) {
                    return new mzi(this);
                }
                if (b2 == 1) {
                    tij tijVar = (tij) ((n5d0) kkiVar.c).get();
                    tijVar.getClass();
                    return new p6v(tijVar);
                }
                if (b2 != 2) {
                    if (b2 != 3) {
                        c99.h(b2);
                        return null;
                    }
                    gii0 gii0VarJ9 = g8iVar.j9();
                    x1x.x(gii0VarJ9);
                    return new m6v0(gii0VarJ9);
                }
                m6v0 m6v0Var = (m6v0) ((n5d0) kkiVar.b).get();
                knf0 knf0VarJ8 = g8iVar.J8();
                x1x.x(knf0VarJ8);
                btt0 btt0VarO8 = g8iVar.o8();
                x1x.x(btt0VarO8);
                return new tij(m6v0Var, knf0VarJ8, btt0VarO8);
            case 3:
                nc0 nc0Var2 = (nc0) obj;
                if (b2 == 0) {
                    return new j9v0((rou) nc0Var2.d, (ytt) nc0Var2.e, (m4v) ((n5d0) nc0Var2.m).get(), (gsb) nc0Var2.i, (i1w0) nc0Var2.b, (duj) nc0Var2.j, (mne) nc0Var2.f23267a, (ctf0) nc0Var2.c);
                }
                if (b2 == 1) {
                    z8v0 z8v0Var = (z8v0) ((n5d0) nc0Var2.l).get();
                    z8v0Var.getClass();
                    return new m4v(z8v0Var);
                }
                if (b2 != 2) {
                    if (b2 != 3) {
                        c99.h(b2);
                        return null;
                    }
                    gii0 gii0Var2 = (gii0) nc0Var2.g;
                    gii0Var2.getClass();
                    return new x8v0(gii0Var2);
                }
                btt0 btt0Var = (btt0) nc0Var2.f;
                x8v0 x8v0Var = (x8v0) ((n5d0) nc0Var2.k).get();
                knf0 knf0Var2 = (knf0) nc0Var2.h;
                btt0Var.getClass();
                x8v0Var.getClass();
                knf0Var2.getClass();
                return new z8v0(btt0Var, x8v0Var, knf0Var2);
            default:
                ozi oziVar = (ozi) obj;
                switch (b2) {
                    case 0:
                        return new uvu((r2m0) oziVar.v.get());
                    case 1:
                        mne mneVarH2 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH2);
                        r2m0Var = new r2m0(mneVarH2, new ljf0(oziVar.b, (byte) 27), (m2m0) oziVar.t.get(), oziVar.c, (rzf) oziVar.u.get());
                        break;
                    case 2:
                        mne mneVarH3 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH3);
                        return new m2m0(mneVarH3);
                    case 3:
                        return new rzf();
                    case 4:
                        uvu uvuVar = (uvu) oziVar.w.get();
                        bzu bzuVarE = ((xzp) oziVar.h.b).E();
                        h9c h9cVarF = oziVar.i.f();
                        x1x.x(h9cVarF);
                        return new awu(uvuVar, bzuVarE, h9cVarF);
                    case 5:
                        return new gcv0();
                    case 6:
                        return new aag0((z9g0) oziVar.z.get());
                    case 7:
                        return new z9g0();
                    case 8:
                        ivn ivnVar = new ivn(oziVar.b);
                        s6t s6tVar = (s6t) oziVar.B.get();
                        knf0 knf0Var3 = oziVar.c;
                        mne mneVarH4 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH4);
                        return new u6t(ivnVar, s6tVar, knf0Var3, mneVarH4);
                    case 9:
                        mne mneVarH5 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH5);
                        return new s6t(mneVarH5);
                    case 10:
                        a1d a1dVar = new a1d(oziVar.b, (byte) 28);
                        n6t n6tVar = (n6t) oziVar.D.get();
                        knf0 knf0Var4 = oziVar.c;
                        mne mneVarH6 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH6);
                        return new p6t(a1dVar, n6tVar, knf0Var4, mneVarH6);
                    case 11:
                        mne mneVarH7 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH7);
                        return new n6t(mneVarH7);
                    case 12:
                        uyn uynVar = new uyn(oziVar.b, (byte) 8);
                        v5t v5tVar = (v5t) oziVar.F.get();
                        t5t t5tVar = (t5t) oziVar.G.get();
                        knf0 knf0Var5 = oziVar.c;
                        mne mneVarH8 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH8);
                        r2m0Var = new b6t(uynVar, v5tVar, t5tVar, knf0Var5, mneVarH8);
                        break;
                    case 13:
                        mne mneVarH9 = ((psc) oziVar.f26101a.b).h();
                        x1x.x(mneVarH9);
                        return new v5t(mneVarH9);
                    case 14:
                        x1x.x(((psc) oziVar.f26101a.b).h());
                        return new t5t();
                    default:
                        c99.h(b2);
                        return null;
                }
                return r2m0Var;
        }
    }
}
