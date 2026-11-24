package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;

/* JADX INFO: loaded from: classes4.dex */
public final class a8h extends i3t0 {
    public static final /* synthetic */ int O = 0;
    public final gmd0 A;
    public final mne B;
    public final bby C;
    public final bby D;
    public final bby E;
    public final c4m0 F;
    public final c4m0 G;
    public final c4m0 H;
    public final c4m0 I;
    public final c4m0 J;
    public c4m0 K;
    public final LinkedHashMap L;
    public dao M;
    public volatile Long N;
    public final vzg0 o;
    public final CyberBottomSheetParams p;
    public final e1u q;
    public final yk50 r;
    public final pru s;
    public final pzu t;
    public final sd60 u;
    public final cmt v;
    public final ub60 w;
    public final qmo x;
    public final u230 y;
    public final ove z;

    /* JADX WARN: Illegal instructions before constructor call */
    public a8h(vzg0 vzg0Var, CyberBottomSheetParams cyberBottomSheetParams, b8u b8uVar, e1u e1uVar, yk50 yk50Var, pru pruVar, pzu pzuVar, sd60 sd60Var, e1u e1uVar2, cmt cmtVar, ub60 ub60Var, qmo qmoVar, u230 u230Var, ove oveVar, gmd0 gmd0Var, mne mneVar, r9u r9uVar, ctf0 ctf0Var) {
        r9uVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(new x3h((byte) 11), cvm0.p(rwjVar, rwjVar), new n7h(ctf0Var, r9uVar), (yzn0) null);
        this.o = vzg0Var;
        this.p = cyberBottomSheetParams;
        this.q = e1uVar;
        this.r = yk50Var;
        this.s = pruVar;
        this.t = pzuVar;
        this.u = sd60Var;
        this.v = cmtVar;
        this.w = ub60Var;
        this.x = qmoVar;
        this.y = u230Var;
        this.z = oveVar;
        this.A = gmd0Var;
        this.B = mneVar;
        this.L = new LinkedHashMap();
        Long l = (Long) vzg0Var.a("KEY_CATEGORY_ID");
        this.N = (l == null || l.longValue() == -26) ? null : l;
        bby bbyVar = this.C;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        bby bbyVar2 = this.D;
        if (bbyVar2 != null) {
            e3c.n(bbyVar2);
        }
        bby bbyVar3 = this.E;
        if (bbyVar3 != null) {
            e3c.n(bbyVar3);
        }
        byte b = 3;
        this.C = i3t0.F(this, u230Var, null, new hfg(this, (byte) 15), new p1h((byte) 3), 117);
        byte b2 = 4;
        this.D = i3t0.F(this, oveVar, null, null, new p1h((byte) 4), 119);
        this.E = i3t0.F(this, gmd0Var, null, null, new p1h((byte) 5), 119);
        c4m0 c4m0Var = this.F;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        fnq fnqVar = new fnq(b8uVar.d(), new o7h(b, yjeVar, this), (byte) 4);
        sje sjeVarS = d5c.S(jiu0.a(this), mneVar.f22085a);
        foe foeVar = foe.h;
        this.F = sac.T(fnqVar, sjeVarS, foeVar);
        c4m0 c4m0Var2 = this.G;
        if (c4m0Var2 != null) {
            e3c.n(c4m0Var2);
        }
        byte b3 = 1;
        this.G = sac.T(new fnq(aoq.c(i120.W(new i89(cmtVar.a(), (byte) 16)), new p7h(b3, yjeVar, this)), new o7h(b2, yjeVar, this), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foeVar);
        c4m0 c4m0Var3 = this.H;
        if (c4m0Var3 != null) {
            e3c.n(c4m0Var3);
        }
        byte b4 = 0;
        this.H = sac.T(new fnq(i120.W(((bs20) e1uVar2.b).f3107a.f44835a), new o7h(b4, yjeVar, this), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foeVar);
        c4m0 c4m0Var4 = this.I;
        if (c4m0Var4 != null) {
            e3c.n(c4m0Var4);
        }
        this.I = sac.T(new fnq(i120.W(cmtVar.a()), new o7h(b3, yjeVar, this), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foeVar);
        c4m0 c4m0Var5 = this.J;
        if (c4m0Var5 != null) {
            e3c.n(c4m0Var5);
        }
        this.J = sac.T(new fnq(aoq.c(i120.W(new i89(cmtVar.a(), (byte) 16)), new p7h(b4, yjeVar, this)), new o7h((byte) 2, yjeVar, this), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foeVar);
        long j = cyberBottomSheetParams.b;
        if (j != 0) {
            i3t0.A(this, u230Var, new k230(j), null, null, 6);
        }
    }

    public final dao M(eu6 eu6Var) {
        Object next;
        hfg hfgVar = new hfg(eu6Var, (byte) 14);
        Object obj = ((g7h) D()).b().get(Long.valueOf(eu6Var.f));
        Object obj2 = null;
        xw7 xw7Var = obj instanceof xw7 ? (xw7) obj : null;
        if (xw7Var != null) {
            bkq bkqVar = new bkq(pgi0.k(new sx3(xw7Var.f41596a, (byte) 1), new m7h((byte) 1)));
            do {
                if (!bkqVar.hasNext()) {
                    next = null;
                    break;
                }
                next = bkqVar.next();
            } while (!((Boolean) hfgVar.invoke(next)).booleanValue());
            dao daoVar = (dao) next;
            if (daoVar != null) {
                return daoVar;
            }
        }
        bkq bkqVar2 = new bkq(pgi0.k(pgi0.k(pgi0.h(CollectionsKt.I(((g7h) D()).b().values()), ske.i), new m7h((byte) 2)), new m7h((byte) 3)));
        while (bkqVar2.hasNext()) {
            Object next2 = bkqVar2.next();
            if (((Boolean) hfgVar.invoke(next2)).booleanValue()) {
                obj2 = next2;
                break;
            }
        }
        return (dao) obj2;
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.C;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        bby bbyVar2 = this.D;
        if (bbyVar2 != null) {
            e3c.n(bbyVar2);
        }
        bby bbyVar3 = this.E;
        if (bbyVar3 != null) {
            e3c.n(bbyVar3);
        }
        c4m0 c4m0Var = this.F;
        if (c4m0Var != null) {
            e3c.n(c4m0Var);
        }
        c4m0 c4m0Var2 = this.G;
        if (c4m0Var2 != null) {
            e3c.n(c4m0Var2);
        }
        c4m0 c4m0Var3 = this.H;
        if (c4m0Var3 != null) {
            e3c.n(c4m0Var3);
        }
        c4m0 c4m0Var4 = this.I;
        if (c4m0Var4 != null) {
            e3c.n(c4m0Var4);
        }
        c4m0 c4m0Var5 = this.J;
        if (c4m0Var5 != null) {
            e3c.n(c4m0Var5);
        }
        c4m0 c4m0Var6 = this.K;
        if (c4m0Var6 != null) {
            e3c.n(c4m0Var6);
        }
        LinkedHashMap linkedHashMap = this.L;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            e3c.n((bby) it.next());
        }
        linkedHashMap.clear();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        m9s m9sVar;
        ms2 ms2Var;
        ms2 ms2Var2;
        n6h n6hVar = (n6h) obj;
        n6hVar.getClass();
        super.x(n6hVar);
        if (n6hVar instanceof a6h) {
            E();
            return;
        }
        if (n6hVar instanceof i6h) {
            i6h i6hVar = (i6h) n6hVar;
            i3t0.A(this, this.y, new e230(i6hVar.f14239a, i6hVar.c, i6hVar.b), null, null, 6);
            return;
        }
        if (n6hVar instanceof k6h) {
            k6h k6hVar = (k6h) n6hVar;
            i3t0.A(this, this.y, new i230(k6hVar.d, k6hVar.c, k6hVar.f17769a, k6hVar.b), null, null, 6);
            return;
        }
        if (n6hVar instanceof m6h) {
            i3t0.A(this, this.y, new k230(((m6h) n6hVar).f21270a), null, null, 6);
            return;
        }
        if (n6hVar instanceof g6h) {
            i3t0.A(this, this.y, new b230(((g6h) n6hVar).f10764a), null, null, 6);
            return;
        }
        if (n6hVar instanceof h6h) {
            h6h h6hVar = (h6h) n6hVar;
            i3t0.A(this, this.y, new c230(h6hVar.b, h6hVar.f12528a), null, null, 6);
            return;
        }
        boolean z = n6hVar instanceof d6h;
        pru pruVar = this.s;
        if (z) {
            c4m0 c4m0Var = this.K;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            boolean z2 = pruVar.a().J1;
            sd60 sd60Var = this.u;
            this.K = sac.T(aoq.c(i120.W(new h2c(((ros) sd60Var.b).b.f44549a, (byte) 19)), new xpp((yje) null, (Object) sd60Var, z2, (byte) 15)), d5c.S(jiu0.a(this), this.B.f22085a), foe.h);
            return;
        }
        if (n6hVar instanceof c6h) {
            c4m0 c4m0Var2 = this.K;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
                return;
            }
            return;
        }
        if (n6hVar instanceof e6h) {
            dao daoVarM = M(((e6h) n6hVar).f7283a);
            m9s m9sVar2 = ((g7h) D()).f10812a;
            ms2 ms2Var3 = ((g7h) D()).b;
            if (daoVarM == null || m9sVar2 == null || ms2Var3 == null) {
                return;
            }
            this.M = daoVarM;
            if (this.q.f()) {
                i3t0.A(this, this.z, new fve(daoVarM, m9sVar2), null, null, 6);
                return;
            }
            if (this.r.g()) {
                i3t0.A(this, this.A, new xld0(daoVarM, m9sVar2, ms2Var3, false), null, null, 6);
                return;
            } else if (pruVar.a().f32117a.g) {
                i3t0.A(this, this.z, new cve(daoVarM, m9sVar2, ms2Var3, ctc.f4929a), null, null, 6);
                return;
            } else {
                i3t0.A(this, this.A, new zld0(daoVarM, m9sVar2, ms2Var3), null, null, 6);
                return;
            }
        }
        if (n6hVar instanceof f6h) {
            dao daoVarM2 = M(((f6h) n6hVar).f9009a);
            m9s m9sVar3 = ((g7h) D()).f10812a;
            ms2 ms2Var4 = ((g7h) D()).b;
            if (daoVarM2 == null || m9sVar3 == null || ms2Var4 == null) {
                return;
            }
            i3t0.A(this, this.z, new cve(daoVarM2, m9sVar3, ms2Var4, ctc.b), null, null, 6);
            return;
        }
        if (n6hVar instanceof l6h) {
            dao daoVar = this.M;
            m9s m9sVar4 = ((g7h) D()).f10812a;
            ms2 ms2Var5 = ((g7h) D()).b;
            if (daoVar == null || m9sVar4 == null || ms2Var5 == null) {
                return;
            }
            i3t0.A(this, this.A, new xld0(daoVar, m9sVar4, ms2Var5, true), null, null, 6);
            return;
        }
        if (n6hVar instanceof j6h) {
            i3t0.A(this, this.A, yld0.f42834a, null, null, 6);
            return;
        }
        if (n6hVar instanceof b6h) {
            b6h b6hVar = (b6h) n6hVar;
            m9s m9sVar5 = ((g7h) D()).f10812a;
            if (m9sVar5 == null || (ms2Var2 = ((g7h) D()).b) == null) {
                return;
            }
            i3t0.A(this, this.z, new hve(b6hVar.f2054a, b6hVar.b, m9sVar5, ms2Var2), null, null, 6);
            return;
        }
        if (n6hVar instanceof x5h) {
            x5h x5hVar = (x5h) n6hVar;
            m9s m9sVar6 = ((g7h) D()).f10812a;
            if (m9sVar6 == null || (ms2Var = ((g7h) D()).b) == null) {
                return;
            }
            i3t0.A(this, this.z, new bve(x5hVar.f40316a, x5hVar.b, m9sVar6, ms2Var), null, null, 6);
            return;
        }
        if (n6hVar instanceof y5h) {
            i3t0.A(this, this.z, dve.f6739a, null, null, 6);
            return;
        }
        if (!(n6hVar instanceof z5h)) {
            t9f.b();
            return;
        }
        dao daoVar2 = this.M;
        if (daoVar2 == null || (m9sVar = ((g7h) D()).f10812a) == null) {
            return;
        }
        i3t0.A(this, this.z, new eve(daoVar2, m9sVar), null, null, 6);
    }
}
