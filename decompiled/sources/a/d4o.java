package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class d4o extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final s31 A;
    public final cyu B;
    public final m1e C;
    public bby D;
    public bby E;
    public bby F;
    public c4m0 G;
    public final EsportsGamesScreenParams o;
    public final a6u p;
    public final soi0 q;
    public final mne r;
    public final vqc s;
    public final hzg t;
    public final hjd u;
    public final soi0 v;
    public final nsu w;
    public final fvt0 x;
    public final pmi0 y;
    public final cqc z;

    /* JADX WARN: Illegal instructions before constructor call */
    public d4o(vzg0 vzg0Var, EsportsGamesScreenParams esportsGamesScreenParams, a6u a6uVar, soi0 soi0Var, ctf0 ctf0Var, mne mneVar, g2v g2vVar, vqc vqcVar, pru pruVar, lbu lbuVar, y78 y78Var, hzg hzgVar, hjd hjdVar, soi0 soi0Var2, nsu nsuVar, fvt0 fvt0Var, pmi0 pmi0Var, cqc cqcVar, r9u r9uVar, s31 s31Var, cyu cyuVar, m1e m1eVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, new enm((Object) esportsGamesScreenParams, (Object) lbuVar, (Object) pruVar, (Object) r9uVar, (byte) 2), cvm0.p(rwjVar, rwjVar), new mlb(g2vVar, ctf0Var, y78Var, (byte) 3));
        this.o = esportsGamesScreenParams;
        this.p = a6uVar;
        this.q = soi0Var;
        this.r = mneVar;
        this.s = vqcVar;
        this.t = hzgVar;
        this.u = hjdVar;
        this.v = soi0Var2;
        this.w = nsuVar;
        this.x = fvt0Var;
        this.y = pmi0Var;
        this.z = cqcVar;
        this.A = s31Var;
        this.B = cyuVar;
        this.C = m1eVar;
        i3t0.K(this, null, null, new c4o(this, null, (byte) 0), 3);
    }

    public final void M(boolean z) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, y3o.a((y3o) value, null, null, null, 0, z, false, null, null, 0L, 0L, false, false, false, 65471)));
        bby bbyVar = this.D;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.D = i3t0.K(this, null, new yhn((Object) this, (byte) 10), new c4o(this, yjeVar, (byte) 1), 1);
    }

    @Override // a.diu0
    public final void v() {
        this.z.f4786a.f4698a.f6413a.o(null, new hhq0(ygq0.NOT, -1L, -1L));
        ((cog) this.x.f10231a).f4698a.b.o(null, Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:92:0x01d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        uid uidVarN0;
        List list;
        long j;
        Object value;
        Object value2;
        d4o d4oVar = this;
        h3o h3oVar = (h3o) obj;
        h3oVar.getClass();
        super.x(h3oVar);
        boolean z = h3oVar instanceof g3o;
        mne mneVar = d4oVar.r;
        ?? r7 = 0;
        EsportsGamesScreenParams.BestGames bestGames = null;
        r7 = 0;
        if (!z) {
            if (!(h3oVar instanceof r2o)) {
                t9f.b();
                return;
            }
            r2o r2oVar = (r2o) h3oVar;
            if (r2oVar.equals(o2o.f24539a)) {
                d4oVar.E();
                return;
            }
            if (r2oVar.equals(p2o.f26260a)) {
                e3c.n(d4oVar.D);
                e3c.n(d4oVar.F);
                e3c.n(d4oVar.E);
                e3c.n(d4oVar.G);
                return;
            }
            if (!r2oVar.equals(q2o.f28010a)) {
                t9f.b();
                return;
            }
            e3c.n(d4oVar.F);
            d4oVar.F = i3t0.F(d4oVar, d4oVar.u, null, null, new f4m((byte) 28), 119);
            c4m0 c4m0Var = d4oVar.G;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            d4oVar.G = sac.T(new fnq(d4oVar.C.b(), new hij(d4oVar, r7, (byte) 10), (byte) 4), d5c.S(jiu0.a(d4oVar), mneVar.f22085a), foe.h);
            return;
        }
        g3o g3oVar = (g3o) h3oVar;
        boolean z2 = g3oVar instanceof v2o;
        byte b = 11;
        oyg0 oyg0Var = d4oVar.f;
        ocj ocjVar = d4oVar.i;
        byte b2 = 3;
        u3o u3oVar = u3o.f35006a;
        if (z2) {
            if (!((y3o) d4oVar.D()).h) {
                ((uzg) d4oVar.t).a();
                return;
            }
            e3c.n(d4oVar.E);
            d4oVar.E = i3t0.K(d4oVar, null, null, new hr(d4oVar, "", r7, b), 3);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, y3o.a((y3o) value2, null, null, null, 0, false, false, null, null, 0L, 0L, false, false, false, 65407)));
            d4oVar.G(u3oVar);
            return;
        }
        if (g3oVar instanceof y2o) {
            d4oVar.M(true);
            return;
        }
        if (g3oVar instanceof f3o) {
            d4oVar.M(false);
            return;
        }
        if (g3oVar instanceof w2o) {
            d4oVar.G(u3oVar);
            return;
        }
        if (g3oVar instanceof d3o) {
            d4oVar.G(new w3o(((y3o) d4oVar.D()).i, ((y3o) d4oVar.D()).k, ((y3o) d4oVar.D()).l));
            return;
        }
        if (g3oVar instanceof z2o) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, y3o.a((y3o) value, null, null, null, 0, false, true, null, null, 0L, 0L, false, false, false, 65407)));
            return;
        }
        if (g3oVar instanceof c3o) {
            i3t0.K(d4oVar, null, null, new c4o(d4oVar, r7, b2), 3);
            return;
        }
        if (g3oVar instanceof b3o) {
            int i = ((b3o) g3oVar).f1917a;
            EsportsGamesScreenParams esportsGamesScreenParams = ((y3o) d4oVar.D()).f41962a;
            EsportsGamesScreenParams.BestGames bestGames2 = esportsGamesScreenParams instanceof EsportsGamesScreenParams.BestGames ? (EsportsGamesScreenParams.BestGames) esportsGamesScreenParams : null;
            if (bestGames2 != null) {
                bestGames = new EsportsGamesScreenParams.BestGames(bestGames2.f46561a, i == 0);
            }
            d4oVar.H(new o2l(bestGames, i, (byte) 22));
            d4oVar.M(false);
            return;
        }
        if (g3oVar instanceof a3o) {
            String str = ((a3o) g3oVar).f181a;
            e3c.n(d4oVar.E);
            d4oVar.E = i3t0.K(d4oVar, null, null, new hr(d4oVar, str, r7, b), 3);
            return;
        }
        if (g3oVar instanceof e3o) {
            i3t0.K(d4oVar, null, null, new ffd(d4oVar, (e3o) g3oVar, r7, (byte) 7), 3);
            return;
        }
        byte b3 = 2;
        if (!(g3oVar instanceof u2o)) {
            if (g3oVar instanceof x2o) {
                i3t0.K(d4oVar, null, null, new c4o(d4oVar, r7, b3), 3);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        u2o u2oVar = (u2o) g3oVar;
        boolean z3 = u2oVar instanceof s2o;
        if (z3) {
            bem bemVar = ((s2o) u2oVar).f31511a;
            if (bemVar instanceof wdm) {
                String strValueOf = String.valueOf(((wdm) bemVar).f38979a);
                EsportsGamesScreenParams esportsGamesScreenParams2 = d4oVar.o;
                EsportsGamesScreenParams.SportGames sportGames = esportsGamesScreenParams2 instanceof EsportsGamesScreenParams.SportGames ? (EsportsGamesScreenParams.SportGames) esportsGamesScreenParams2 : null;
                if (sportGames != null) {
                    j = sportGames.d == CyberGamesPage.Real.INSTANCE.f46556a ? sportGames.b : sportGames.f46563a;
                } else {
                    j = -1;
                }
                d4oVar = this;
                qjj.W(jiu0.a(d4oVar), mneVar.b, null, new zg0((Object) this, (Object) strValueOf, j, (yje) null, (byte) 4), 2);
            }
        }
        if (z3) {
            uidVarN0 = ebc.n0(((s2o) u2oVar).f31511a);
        } else {
            if (!(u2oVar instanceof t2o)) {
                t9f.b();
                return;
            }
            uidVarN0 = ((t2o) u2oVar).f33225a;
        }
        j0g0 j0g0Var = ((y3o) d4oVar.D()).b;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            m3o m3oVar = (m3o) obj2;
            if (m3oVar != null) {
                list = m3oVar.f21125a;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        j0g0 j0g0Var2 = ((y3o) d4oVar.D()).c;
        if (j0g0Var2 != null) {
            Object obj3 = j0g0Var2.f15681a;
            if (obj3 instanceof g0g0) {
                obj3 = null;
            }
            m3o m3oVar2 = (m3o) obj3;
            if (m3oVar2 != null) {
                r7 = m3oVar2.f21125a;
            }
        }
        if (r7 == 0) {
            r7 = iun.f15405a;
        }
        i3t0.B(d4oVar, d4oVar.u, new vid[]{new did(CollectionsKt.q0(list, r7)), uidVarN0});
    }
}
