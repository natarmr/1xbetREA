package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.xplatform.special_event.impl.top_players.presentation.model.TopPlayersSearchModel;

/* JADX INFO: loaded from: classes5.dex */
public final class edr0 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public bby A;
    public final int o;
    public final m1e p;
    public final zpu q;
    public final tsc r;
    public final owp0 s;
    public final i1w0 t;
    public final yo4 u;
    public final zr1 v;
    public final tsc w;
    public c4m0 x;
    public bby y;
    public c4m0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public edr0(vzg0 vzg0Var, int i, m1e m1eVar, zpu zpuVar, tsc tscVar, owp0 owp0Var, luu luuVar, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, yo4 yo4Var, zr1 zr1Var, bzt bztVar, r9u r9uVar, tsc tscVar2) {
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        super(vzg0Var, new yeo0(bztVar, luuVar, i, r9uVar), cvm0.p(vs10Var, vs10Var), new h0j0(ctf0Var, (byte) 21));
        this.o = i;
        this.p = m1eVar;
        this.q = zpuVar;
        this.r = tscVar;
        this.s = owp0Var;
        this.t = i1w0Var;
        this.u = yo4Var;
        this.v = zr1Var;
        this.w = tscVar2;
        if (((dbr0) D()).e.b.length() > 0) {
            owp0Var.h(((dbr0) D()).e.b);
        }
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.y;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (((dbr0) D()).g.b.isEmpty()) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, dbr0.a((dbr0) value, true, null, null, null, 507)));
            }
            this.y = i3t0.K(this, null, new w6q0(1, this, edr0.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 29), new hhb0(this, null, (byte) 28), 1);
        }
    }

    @Override // a.diu0
    public final void v() {
        Object value;
        p7m0 p7m0Var = this.w.f34454a.d.f24943a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, null));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        dbr0 dbr0Var;
        Object value2;
        dbr0 dbr0Var2;
        TopPlayersSearchModel topPlayersSearchModel;
        n9r0 n9r0Var = (n9r0) obj;
        n9r0Var.getClass();
        super.x(n9r0Var);
        if (n9r0Var.equals(g9r0.f10931a)) {
            c4m0 c4m0Var = this.x;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.x = i3t0.L(this, new fnq(this.p.b(), new z2n0(this, null, (byte) 24), (byte) 4), null, new ddr0(1, this, edr0.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 0), 1);
            }
            c4m0 c4m0Var2 = this.z;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.z = i3t0.L(this, new fnq(new i89(this.r.f34454a.d.f24943a, (byte) 22), new rtq0(this, null, (byte) 1), (byte) 4), null, null, 3);
                return;
            }
            return;
        }
        if (n9r0Var.equals(e9r0.f7436a)) {
            e3c.n(this.y);
            e3c.n(this.z);
            e3c.n(this.A);
            return;
        }
        if (n9r0Var.equals(f9r0.f9169a)) {
            E();
            return;
        }
        boolean zEquals = n9r0Var.equals(h9r0.f12691a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!zEquals) {
            boolean zEquals2 = n9r0Var.equals(j9r0.f16153a);
            zr1 zr1Var = this.v;
            int i = this.o;
            yo4 yo4Var = this.u;
            if (zEquals2) {
                G(cbr0.f4074a);
                b1j.w("championship_id", Integer.valueOf(i), yo4Var.f42966a, "bet_statistic_player_info_call");
                b1j.r(i, zr1Var.f44833a, 3111L);
                return;
            }
            if (n9r0Var instanceof m9r0) {
                int i2 = (int) ((m9r0) n9r0Var).f21425a;
                if (!((dbr0) D()).d && !((dbr0) D()).g.b.isEmpty()) {
                    tcr0 tcr0Var = (tcr0) ((dbr0) D()).g.b.get(i2);
                    zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new i1p(tcr0Var.b, (byte) 0)}), 3112L);
                    yo4Var.f42966a.a("bet_statistic_player_type_call", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("point", Integer.valueOf(tcr0Var.b))));
                }
                H(new u49((byte) 29, i2, false));
                return;
            }
            if (!(n9r0Var instanceof l9r0)) {
                if (n9r0Var instanceof k9r0) {
                    H(new p6r0(n9r0Var, (byte) 5));
                    return;
                } else if (n9r0Var.equals(i9r0.f14402a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            String str = ((l9r0) n9r0Var).f19671a;
            if (((dbr0) D()).g.b.isEmpty() || !((dbr0) D()).e.f46977a) {
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                dbr0Var = (dbr0) value;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, dbr0.a(dbr0Var, false, new TopPlayersSearchModel(str, dbr0Var.e.f46977a), null, null, 479)));
            bby bbyVar = this.A;
            if (bbyVar != null) {
                e3c.n(bbyVar);
            }
            this.A = i3t0.K(this, null, null, new gv60(this, str, null, (byte) 21), 3);
            return;
        }
        if (((dbr0) D()).e.f46977a) {
            bby bbyVar2 = this.A;
            if (bbyVar2 != null) {
                e3c.n(bbyVar2);
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                dbr0Var2 = (dbr0) value2;
                oyg0Var.getClass();
                dbr0Var2.e.getClass();
                topPlayersSearchModel = new TopPlayersSearchModel("", false);
                q7x.F(oyg0Var, topPlayersSearchModel, "SEARCH_MODEL_KEY");
            } while (!p7m0Var2.m(value2, dbr0.a(dbr0Var2, false, topPlayersSearchModel, null, null, 479)));
            this.s.h("");
            return;
        }
        i1w0 i1w0Var = this.t;
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
