package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final class w3m0 extends i3t0 {
    public static final /* synthetic */ int N = 0;
    public final wyu A;
    public final kki B;
    public final luu C;
    public final qv2 D;
    public final gr00 E;
    public final ljf0 F;
    public final h3c G;
    public final r9u H;
    public final vjp I;
    public bby J;
    public boolean K;
    public final p7m0 L;
    public tyj M;
    public final TypeStageId o;
    public final long p;
    public final long q;
    public final long r;
    public final ctf0 s;
    public final mne t;
    public final i1w0 u;
    public final m1e v;
    public final yfu w;
    public final qzt x;
    public final fhj y;
    public final cu z;

    public w3m0(final TypeStageId typeStageId, final long j, long j2, final long j3, final ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, g2v g2vVar, m1e m1eVar, yfu yfuVar, final qzt qztVar, final fhj fhjVar, uyu uyuVar, cu cuVar, final wyu wyuVar, kki kkiVar, luu luuVar, qv2 qv2Var, gr00 gr00Var, ljf0 ljf0Var, h3c h3cVar, r9u r9uVar, vjp vjpVar) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        Function0 function0 = new Function0() { // from class: a.s3m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long j4 = j3;
                return new l1m0(true, false, null, new ihh0(), null, aem0.x(new edm0(j4), qztVar.a(), ctf0Var), fhjVar.s(org.xplatform.statistic.stage.api.domain.c.a(typeStageId), j, wyuVar.a(), j4));
            }
        };
        rib ribVar = new rib(g2vVar, (byte) 4);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(null, function0, ribVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = typeStageId;
        this.p = j;
        this.q = j2;
        this.r = j3;
        this.s = ctf0Var;
        this.t = mneVar;
        this.u = i1w0Var;
        this.v = m1eVar;
        this.w = yfuVar;
        this.x = qztVar;
        this.y = fhjVar;
        this.z = cuVar;
        this.A = wyuVar;
        this.B = kkiVar;
        this.C = luuVar;
        this.D = qv2Var;
        this.E = gr00Var;
        this.F = ljf0Var;
        this.G = h3cVar;
        this.H = r9uVar;
        this.I = vjpVar;
        this.K = true;
        p7m0 p7m0VarA = q7m0.a("");
        this.L = p7m0VarA;
        N();
        O();
        sac.T(new fnq(uyuVar.f36509a.h(), new tmg0(this, yjeVar, (byte) 22), (byte) 4), d5c.S(jiu0.a(this), rwjVar), v3m0.h);
        ymx ymxVar = ymx.INTERVAL_100;
        sac.T(new fnq(sj3.S(p7m0VarA, 200L), new ssl0((Object) this, yjeVar, (byte) 5), (byte) 4), jiu0.a(this), u3m0.h);
    }

    public final a1m0 M(a1m0 a1m0Var) {
        v5l0 v5l0VarE = this.I.e();
        ctf0 ctf0Var = this.s;
        boolean zH = ctf0Var.h();
        Map map = a1m0Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Iterable<lk50> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            for (lk50 lk50Var : iterable) {
                mk50 mk50VarC = g1x.C(lk50Var, zH);
                ygp ygpVar = ygp.B;
                r9u r9uVar = this.H;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                arrayList.add(new pab(lk50Var, mk50VarC, dub.q0(mk50VarC, ctf0Var, v5l0VarE, j1q0Var.f15748a.d(ygpVar)), v5l0VarE));
            }
            linkedHashMap.put(key, arrayList);
        }
        Iterator it = a1m0Var.f77a.iterator();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                a1m0 a1m0Var2 = a1m0Var.d;
                return a1m0.a(a1m0Var, linkedHashMap, a1m0Var2 != null ? M(a1m0Var2) : null, i, 3);
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            List list = (List) linkedHashMap.get((String) next);
            if (list != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    mk50 mk50Var = ((pab) it2.next()).b;
                    if (dub.l0(mk50Var) && mk50Var.f21928a.length() > 0 && mk50Var.b.length() > 0) {
                        i = i2;
                        break;
                    }
                }
            }
            i2 = i3;
        }
    }

    public final void N() {
        bby bbyVar = this.J;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.J = sac.V(jiu0.a(this), new kcl0(1, this, w3m0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, this.t.b, new gc1((Object) this, (yje) null, (byte) 21), 10);
        }
    }

    public final void O() {
        sac.T(new fnq(this.v.a(), new yng0(this, null, (byte) 25), (byte) 4), d5c.S(jiu0.a(this), this.t.f22085a), t3m0.h);
    }

    public final void P(String str) {
        Object value;
        String strA = this.s.b.a(R.string.tour_net_search_hint, Arrays.copyOf(new Object[0], 0));
        eme emeVarA = ((l1m0) D()).f.a();
        eme emeVar = eme.c;
        boolean z = this.K;
        vhh0 shh0Var = emeVarA == emeVar ? new shh0(str, strA, z) : new rhh0(str, strA, z);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, l1m0.a((l1m0) value, false, false, null, shh0Var, null, null, null, 239)));
    }

    public final void Q() {
        Object value;
        vhh0 vhh0Var = ((l1m0) D()).f.a() == eme.c ? mhh0.f21794a : lhh0.f20055a;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, l1m0.a((l1m0) value, false, false, null, vhh0Var, null, null, null, 207)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        wzl0 wzl0Var = (wzl0) obj;
        wzl0Var.getClass();
        if (wzl0Var instanceof pzl0) {
            N();
            return;
        }
        boolean zEquals = wzl0Var.equals(mzl0.f22659a);
        i1w0 i1w0Var = this.u;
        if (!zEquals) {
            if (wzl0Var instanceof tzl0) {
                return;
            }
            if (wzl0Var instanceof uzl0) {
                O();
                return;
            }
            if (wzl0Var instanceof jzl0) {
                if (this.p == 40) {
                    i3t0.K(this, null, null, new xg0(((jzl0) wzl0Var).f17420a, this, (yje) null), 3);
                    return;
                } else {
                    i3t0.K(this, null, null, new gv60(this, ((jzl0) wzl0Var).f17420a, null, (byte) 15), 3);
                    return;
                }
            }
            boolean z = wzl0Var instanceof szl0;
            ctf0 ctf0Var = this.s;
            if (z) {
                mk50 mk50Var = ((szl0) wzl0Var).f33075a;
                boolean zH = ctf0Var.h();
                v5l0 v5l0VarE = this.I.e();
                ygp ygpVar = ygp.B;
                r9u r9uVar = this.H;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                ArrayList arrayListD0 = b8k0.d0(mk50Var, zH, v5l0VarE, this.p, this.s, j1q0Var.f15748a.d(ygpVar));
                ljf0 ljf0Var = this.F;
                ljf0Var.getClass();
                a0m0 a0m0Var = (a0m0) ((lef0) ljf0Var.f20148a).f19899a;
                a0m0Var.getClass();
                a0m0Var.f32a = arrayListD0;
                i1w0Var.d(new u5l0((Object) wzl0Var, (Object) this, (byte) 17));
                return;
            }
            if (wzl0Var instanceof ozl0) {
                ozl0 ozl0Var = (ozl0) wzl0Var;
                int i = ozl0Var.f26106a;
                int i2 = ozl0Var.b;
                Object obj2 = ((l1m0) D()).c;
                if (obj2 == null) {
                    obj2 = iun.f15405a;
                }
                H(new al1((byte) 5, i2, i, obj2));
                return;
            }
            boolean z2 = wzl0Var instanceof rzl0;
            p7m0 p7m0Var = this.L;
            if (z2) {
                String str = ((rzl0) wzl0Var).f31367a;
                p7m0Var.getClass();
                p7m0Var.o(null, str);
                return;
            }
            if (wzl0Var instanceof vzl0) {
                this.K = ((vzl0) wzl0Var).f38305a;
                if ((((l1m0) D()).d instanceof shh0) || (((l1m0) D()).d instanceof rhh0)) {
                    P((String) p7m0Var.getValue());
                    return;
                }
                return;
            }
            boolean z3 = wzl0Var instanceof qzl0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z3) {
                tyj tyjVar = this.M;
                if (tyjVar == null) {
                    return;
                }
                int i3 = tyjVar.b;
                int i4 = i3 - 1;
                tyjVar.b = i4;
                int iMax = Math.max(i4, 0);
                tyjVar.b = iMax;
                if (i3 != iMax) {
                    xhh0 xhh0VarC = tyjVar.c(ctf0Var);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, l1m0.a((l1m0) value2, false, false, null, null, xhh0VarC, null, null, 223)));
                    return;
                }
                return;
            }
            if (!(wzl0Var instanceof lzl0)) {
                if (wzl0Var instanceof kzl0) {
                    Q();
                    return;
                }
                if (!(wzl0Var instanceof nzl0)) {
                    t9f.b();
                    return;
                }
                p7m0Var.getClass();
                p7m0Var.o(null, "");
                this.K = true;
                P("");
                return;
            }
            tyj tyjVar2 = this.M;
            if (tyjVar2 == null) {
                return;
            }
            int i5 = tyjVar2.b;
            int i6 = i5 + 1;
            tyjVar2.b = i6;
            int iMin = Math.min(i6, tyjVar2.f34759a.size() - 1);
            tyjVar2.b = iMin;
            if (i5 != iMin) {
                xhh0 xhh0VarC2 = tyjVar2.c(ctf0Var);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, l1m0.a((l1m0) value, false, false, null, null, xhh0VarC2, null, null, 223)));
                return;
            }
            return;
        }
        if ((((l1m0) D()).d instanceof shh0) || (((l1m0) D()).d instanceof rhh0)) {
            Q();
            return;
        }
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

    @Override // a.diu0
    public final void v() {
    }
}
