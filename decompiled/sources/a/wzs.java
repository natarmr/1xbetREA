package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wzs extends w46 implements dke {
    public final ali b;
    public final xsc c;
    public final mpx d;
    public final mpx e;
    public final a5v f;
    public final lut g;
    public final yox h;
    public final ljf0 i;
    public final hrx j;
    public final iqt k;
    public final m1e l;
    public final mne m;
    public final hrx n;
    public final g2v o;
    public final psc p;
    public final fuj0 q;
    public final nw20 r;
    public final chf0 s;
    public final xex t;
    public final p7m0 u;
    public final p7m0 v;
    public c4m0 w;
    public bby x;
    public c4m0 y;
    public c4m0 z;

    public wzs(ali aliVar, xsc xscVar, mpx mpxVar, mpx mpxVar2, a5v a5vVar, lut lutVar, yox yoxVar, ljf0 ljf0Var, hrx hrxVar, iqt iqtVar, m1e m1eVar, mne mneVar, hrx hrxVar2, g2v g2vVar, psc pscVar, fuj0 fuj0Var, nw20 nw20Var, chf0 chf0Var, xex xexVar, lut lutVar2, pru pruVar) {
        m1eVar.getClass();
        this.b = aliVar;
        this.c = xscVar;
        this.d = mpxVar;
        this.e = mpxVar2;
        this.f = a5vVar;
        this.g = lutVar;
        this.h = yoxVar;
        this.i = ljf0Var;
        this.j = hrxVar;
        this.k = iqtVar;
        this.l = m1eVar;
        this.m = mneVar;
        this.n = hrxVar2;
        this.o = g2vVar;
        this.p = pscVar;
        this.q = fuj0Var;
        this.r = nw20Var;
        this.s = chf0Var;
        this.t = xexVar;
        this.u = q7m0.a(new czs(0L, 0L, "", 0L, "", false, false, false, lutVar2.a(), hrxVar2.a(), false, pruVar.a().F1, false, true, ""));
        this.v = q7m0.a(zys.f45220a);
    }

    @Override // a.diu0
    public final void v() {
        p7m0 p7m0Var = this.u;
        if (((czs) p7m0Var.getValue()).n) {
            b49 b49VarM = this.s.M(((czs) p7m0Var.getValue()).o);
            if (b49VarM instanceof a49) {
                a49 a49Var = (a49) b49VarM;
                this.t.O(a49Var.b, a49Var.c, a49Var.f212a, a49Var.d, a49Var.e);
            }
        }
    }

    public final void w() {
        bby bbyVar = this.x;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.x = sac.V(jiu0.a(this), uzs.f36550a, null, this.m.c, new mzs(this, null, (byte) 3), 10);
        }
    }

    public final void x() {
        Object value;
        boolean zA = this.n.a();
        p7m0 p7m0Var = this.u;
        if (zA) {
            long j = ((czs) p7m0Var.getValue()).b;
            long j2 = ((czs) p7m0Var.getValue()).d;
            if (j != 0) {
                xex xexVar = this.t;
                s1p s1pVar = ((ik4) xexVar.b).f14907a;
                yni0 yni0Var = new yni0();
                yni0Var.add(new i1p((byte) 2, j));
                if (j == 40) {
                    yni0Var.add(new i1p((byte) 0, j2));
                }
                s1pVar.a(cui0.a(yni0Var), 12009L);
                kt2 kt2Var = ((vd1) xexVar.f40764a).f37210a;
                jo20 jo20Var = new jo20();
                jo20Var.put("sport_id", Long.valueOf(j));
                if (j == 40) {
                    jo20Var.put("sub_sport_id", Long.valueOf(j2));
                }
                kt2Var.a("broadcasting_locker_click", jo20Var.b());
            }
        }
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 49151)));
        sac.V(jiu0.a(this), vzs.f38312a, null, this.m.f22085a, new mzs(this, null, (byte) 4), 10);
    }

    public final void y() {
        this.r.o(((czs) this.u.getValue()).o);
    }

    public final void z() {
        if (((czs) this.u.getValue()).k) {
            v3c.N(this.j.f13553a.f23405a.b);
        }
    }
}
