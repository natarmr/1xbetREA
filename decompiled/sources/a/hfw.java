package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$cyberChampScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class hfw extends i3t0 {
    public static final /* synthetic */ int J = 0;
    public final cr A;
    public final xzp B;
    public final esg0 C;
    public bby D;
    public c4m0 E;
    public c4m0 F;
    public c4m0 G;
    public long H;
    public boolean I;
    public final mne o;
    public final hzg p;
    public final duj q;
    public final m1e r;
    public final uii s;
    public final pru t;
    public final rrd u;
    public final ugf0 v;
    public final n4u w;
    public final oeg0 x;
    public final vqc y;
    public final gud z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfw(mne mneVar, hzg hzgVar, duj dujVar, m1e m1eVar, ctf0 ctf0Var, uii uiiVar, pru pruVar, rrd rrdVar, ugf0 ugf0Var, n4u n4uVar, svu svuVar, oeg0 oeg0Var, vqc vqcVar, gud gudVar, cr crVar, xzp xzpVar, esg0 esg0Var) {
        super(new b6u(pruVar, (byte) 14), cvm0.p(mneVar.c, mneVar.f22085a), new cfw(ctf0Var, svuVar, (byte) 0), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        oeg0Var.getClass();
        this.o = mneVar;
        this.p = hzgVar;
        this.q = dujVar;
        this.r = m1eVar;
        this.s = uiiVar;
        this.t = pruVar;
        this.u = rrdVar;
        this.v = ugf0Var;
        this.w = n4uVar;
        this.x = oeg0Var;
        this.y = vqcVar;
        this.z = gudVar;
        this.A = crVar;
        this.B = xzpVar;
        this.C = esg0Var;
    }

    public final void M() {
        c4m0 c4m0Var = this.G;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.G = sac.T(aoq.c(new i89(((pew) this.w.b).b.f21668a, (byte) 22), new sot((yje) null, (Object) this, (byte) 21)), d5c.S(jiu0.a(this), this.o.f22085a), foe.h);
        }
    }

    public final void N() {
        c4m0 c4m0Var = this.F;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            uii uiiVar = this.s;
            pew pewVar = (pew) ((f4u) uiiVar.f35730a).b;
            yje yjeVar = null;
            this.F = sac.T(new fnq(new dnq(new p6d(gfx.R(pewVar.b.b, pew.c, null, new epp(pewVar, yjeVar, (byte) 8), 252), new vsg0(new o3s(uiiVar, yjeVar, (byte) 6)), new qos(3, yjeVar, (byte) 4), (byte) 1), new rl2(3, null, (byte) 21), (byte) 1), new gfw(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), this.o.f22085a), foe.h);
        }
    }

    public final void O() {
        Long l = (Long) CollectionsKt.firstOrNull(this.t.a().c.p);
        final long jLongValue = l != null ? l.longValue() : 0L;
        j0g0 j0g0Var = ((lew) D()).b.f33842a;
        String str = null;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            Cnew cnew = (Cnew) obj;
            if (cnew != null) {
                str = cnew.f23407a;
            }
        }
        if (str == null) {
            str = "";
        }
        final String str2 = str;
        final byte b = CyberGamesPage.Real.INSTANCE.f46556a;
        k1g k1gVar = k1g.OPEN_REGULAR;
        final uzg uzgVar = (uzg) this.p;
        uzgVar.getClass();
        uzgVar.f36533a.c().d(new Function1() { // from class: a.lzg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                k0w0 k0w0Var = (k0w0) obj2;
                k0w0Var.getClass();
                k0w0Var.k(new CyberGamesScreenFactoryImpl$cyberChampScreen$1(new CyberChampParams(str2, jLongValue, 46L, b), uzgVar.b));
                return Unit.f46060a;
            }
        });
        uzgVar.d.k(pzb.C(new Function1() { // from class: a.nzg
            /* JADX WARN: Multi-variable type inference failed */
            {
                k1g k1gVar2 = k1g.OPEN_REGULAR;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                k1g k1gVar2 = k1g.OPEN_REGULAR;
                n1g n1gVar = (n1g) obj2;
                n1gVar.getClass();
                n1gVar.c = 46L;
                j1g.b.getClass();
                n1gVar.d = std.e(b);
                long j = jLongValue;
                n1gVar.e = new jq2(j);
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1gVar2;
                n1gVar.b = j;
                return Unit.f46060a;
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final void P(long j) {
        List list;
        vcw vcwVar;
        List list2;
        Object next;
        j0g0 j0g0Var = ((lew) D()).b.f33842a;
        jdw jdwVar = null;
        Object obj = null;
        jdwVar = null;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            Cnew cnew = (Cnew) obj2;
            if (cnew != null) {
                list = cnew.b;
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((vcw) next).f37207a != ((lew) D()).f19925a);
            vcwVar = (vcw) next;
        } else {
            vcwVar = null;
        }
        if (vcwVar != null && (list2 = vcwVar.c) != null) {
            for (Object obj3 : list2) {
                if (((jdw) obj3).f16349a == j) {
                    obj = obj3;
                    break;
                }
            }
            jdwVar = (jdw) obj;
        }
        this.x.c().d(new qp7((Object) this, j, jdwVar != null ? jdwVar.c : 0L, (byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final void Q(long j) {
        vcw vcwVar;
        List list;
        Object next;
        j0g0 j0g0Var = ((lew) D()).b.f33842a;
        yje yjeVar = null;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            Cnew cnew = (Cnew) obj;
            if (cnew == null || (list = cnew.b) == null) {
                vcwVar = null;
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((vcw) next).f37207a != j);
                vcwVar = (vcw) next;
            }
        } else {
            vcwVar = null;
        }
        if (vcwVar != null) {
            jdw jdwVar = (jdw) CollectionsKt.firstOrNull(vcwVar.c);
            sac.V(jiu0.a(this), new h7w((byte) 4), null, null, new u5u(this, jdwVar != null ? Long.valueOf(jdwVar.c) : null, yjeVar, (byte) 17), 14);
        }
    }

    @Override // a.diu0
    public final void v() {
        e3c.n(this.F);
        dyb.f6885a = null;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        tcw tcwVar = (tcw) obj;
        tcwVar.getClass();
        super.x(tcwVar);
        boolean z = tcwVar instanceof scw;
        byte b = 1;
        byte b2 = 0;
        mne mneVar = this.o;
        yje yjeVar = null;
        if (z) {
            scw scwVar = (scw) tcwVar;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.H;
            ymx ymxVar = ymx.INTERVAL_100;
            if (j > 200) {
                bby bbyVar = this.D;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.D = sac.V(jiu0.a(this), new dfw(this, (byte) 0), null, mneVar.f22085a, new kaw(scwVar, this, yjeVar, b), 10);
                this.H = jCurrentTimeMillis;
                return;
            }
            return;
        }
        if (!(tcwVar instanceof hcw)) {
            t9f.b();
            return;
        }
        hcw hcwVar = (hcw) tcwVar;
        if (hcwVar instanceof gcw) {
            e3c.n(this.E);
            this.E = sac.T(new fnq(i120.W(this.r.b()), new ffw(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), foe.h);
            return;
        }
        if (hcwVar instanceof fcw) {
            e3c.n(this.G);
            e3c.n(this.E);
            return;
        }
        if (hcwVar instanceof dcw) {
            E();
            return;
        }
        if (hcwVar instanceof ecw) {
            ecw ecwVar = (ecw) hcwVar;
            m0k0 m0k0Var = ecwVar.f7587a;
            zxj0 zxj0Var = ecwVar.b;
            sac.V(jiu0.a(this), new n5w(1, this.q, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.b, new efw(this, m0k0Var, zxj0Var, yjeVar, (byte) 2), 10);
            return;
        }
        if (hcwVar instanceof bcw) {
            bcw bcwVar = (bcw) hcwVar;
            m0k0 m0k0Var2 = bcwVar.f2373a;
            zxj0 zxj0Var2 = bcwVar.b;
            sac.V(jiu0.a(this), new n5w(1, this.q, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, mneVar.b, new efw(this, m0k0Var2, zxj0Var2, yjeVar, (byte) 0), 10);
            return;
        }
        if (!(hcwVar instanceof ccw)) {
            t9f.b();
            return;
        }
        sac.V(jiu0.a(this), new n5w(1, this.q, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.b, new ffw(this, yjeVar, b), 10);
    }
}
