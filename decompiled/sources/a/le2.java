package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.results.impl.presentation.alt_live_games.GamesLiveResultsParams;

/* JADX INFO: loaded from: classes5.dex */
public final class le2 extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final bzt A;
    public final n0o0 B;
    public bby C;
    public bby D;
    public bby E;
    public final vzg0 o;
    public final GamesLiveResultsParams p;
    public final luu q;
    public final n660 r;
    public final m1e s;
    public final mne t;
    public final i1w0 u;
    public final j3c v;
    public final duj w;
    public final hjd x;
    public final pru y;
    public final lbu z;

    public le2(vzg0 vzg0Var, GamesLiveResultsParams gamesLiveResultsParams, luu luuVar, n660 n660Var, m1e m1eVar, mne mneVar, y78 y78Var, ctf0 ctf0Var, i1w0 i1w0Var, j3c j3cVar, duj dujVar, hjd hjdVar, pru pruVar, lbu lbuVar, bzt bztVar, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        kk0 kk0Var = new kk0(pruVar, r9uVar, y78Var, (byte) 4);
        rwj rwjVar = mneVar.f22085a;
        super(kk0Var, cvm0.p(rwjVar, rwjVar), new ge2(ctf0Var, y78Var, (byte) 0), (yzn0) null);
        this.o = vzg0Var;
        this.p = gamesLiveResultsParams;
        this.q = luuVar;
        this.r = n660Var;
        this.s = m1eVar;
        this.t = mneVar;
        this.u = i1w0Var;
        this.v = j3cVar;
        this.w = dujVar;
        this.x = hjdVar;
        this.y = pruVar;
        this.z = lbuVar;
        this.A = bztVar;
        this.B = maz.b(new nc((Object) this, (byte) 28));
        i3t0.K(this, null, null, new je2(this, null), 3);
        M(false);
    }

    public final void M(boolean z) {
        bby bbyVar = this.C;
        if (bbyVar != null && bbyVar.isActive()) {
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            ce2 ce2Var = (ce2) value;
            this.f.getClass();
            boolean z2 = z;
            if (p7m0Var.m(value, ce2.a(ce2Var, null, z2, z ? ce2Var.c : qhe.f28733a, 0, false, null, null, false, false, 16377))) {
                this.C = sac.g0(jiu0.a(this), "AltResultLiveGamesViewModel.loadData", this.t.b, new ln1(1, this, le2.class, "onDataLoadError", "onDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 19), new ie2(this, null, (byte) 0), 68);
                return;
            }
            z = z2;
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        sd2 sd2Var = (sd2) obj;
        sd2Var.getClass();
        if (sd2Var.equals(id2.f14561a)) {
            E();
            return;
        }
        byte b = 1;
        if (sd2Var.equals(jd2.f16308a)) {
            bby bbyVar = this.D;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.D = sac.V(jiu0.a(this), ke2.f18132a, null, this.t.f22085a, new ie2(this, null, b), 10);
            }
            v3c.N(this.E);
            this.E = i3t0.F(this, this.x, null, null, new ma2((byte) 5), 119);
            return;
        }
        if (sd2Var.equals(kd2.f18084a)) {
            v3c.N(this.C);
            v3c.N(this.D);
            v3c.N(this.E);
            return;
        }
        boolean zEquals = sd2Var.equals(md2.f21576a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!zEquals) {
            if (sd2Var.equals(ld2.f19828a)) {
                G(yd2.f42412a);
                return;
            }
            if (sd2Var instanceof nd2) {
                String str = ((nd2) sd2Var).f23320a;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, ce2.a((ce2) value3, str, false, null, 0, false, null, null, false, false, 16382)));
                this.o.e("KEY_SEARCH_QUERY", str);
                return;
            }
            if (sd2Var.equals(od2.f25057a)) {
                v3c.N(this.C);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, ce2.a((ce2) value2, null, true, null, 0, false, null, null, false, false, 16381)));
                M(true);
                return;
            }
            if (sd2Var.equals(pd2.f26786a)) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, ce2.a((ce2) value, null, false, null, 0, true, null, null, false, false, 16255)));
                return;
            }
            if (sd2Var.equals(qd2.f28513a)) {
                M(false);
                return;
            } else if (!(sd2Var instanceof rd2)) {
                t9f.b();
                return;
            } else {
                i3t0.A(this, this.x, ebc.n0(((rd2) sd2Var).f30270a), null, null, 6);
                return;
            }
        }
        if (((ce2) D()).h) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value4, ce2.a((ce2) value4, "", false, null, 0, false, null, null, false, false, 16254)));
            return;
        }
        i1w0 i1w0Var = this.u;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
