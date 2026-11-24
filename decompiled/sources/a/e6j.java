package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.xplatform.aggregator.daily_tasks.impl.navigation.DailyTasksScreens$DailyTasksRulesScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class e6j extends i3t0 {
    public static final /* synthetic */ int L = 0;
    public final wyb A;
    public final qoc B;
    public final nou C;
    public final trm0 D;
    public final kd30 E;
    public bby F;
    public final c4m0 G;
    public bby H;
    public bby I;
    public final c4m0 J;
    public c4m0 K;
    public final oeg0 o;
    public final duj p;
    public final mne q;
    public final ctf0 r;
    public final khf0 s;
    public final edu t;
    public final crt u;
    public final rpt v;
    public final peg0 w;
    public final b4j x;
    public final je y;
    public final es z;

    /* JADX WARN: Illegal instructions before constructor call */
    public e6j(oeg0 oeg0Var, duj dujVar, mne mneVar, ctf0 ctf0Var, khf0 khf0Var, m1e m1eVar, ali aliVar, edu eduVar, crt crtVar, rpt rptVar, peg0 peg0Var, b4j b4jVar, je jeVar, es esVar, wyb wybVar, qoc qocVar, nou nouVar, trm0 trm0Var, kd30 kd30Var, bzt bztVar, pru pruVar, kc60 kc60Var) {
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        byte b = 0;
        yje yjeVar = null;
        super(new z5j(pruVar, bztVar, (byte) 0), g090VarP, new ep4(ctf0Var, (byte) 27), (yzn0) null);
        this.o = oeg0Var;
        this.p = dujVar;
        this.q = mneVar;
        this.r = ctf0Var;
        this.s = khf0Var;
        this.t = eduVar;
        this.u = crtVar;
        this.v = rptVar;
        this.w = peg0Var;
        this.x = b4jVar;
        this.y = jeVar;
        this.z = esVar;
        this.A = wybVar;
        this.B = qocVar;
        this.C = nouVar;
        this.D = trm0Var;
        this.E = kd30Var;
        byte b2 = 1;
        byte b3 = 2;
        fnq fnqVar = new fnq(dtb.z(kc60Var.a(), 1), new b6j(this, yjeVar, b3), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), d6j.h);
        if (!((w5j) D()).e) {
            c4m0 c4m0Var = this.J;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.J = sac.T(new dnq(new fnq(m1eVar.b(), new c6j(this, yjeVar, b), (byte) 4), new rj((Object) this, yjeVar, (byte) 19), (byte) 1), d5c.S(jiu0.a(this), dvjVar), new f1e(b3, yjeVar, (byte) 14));
                return;
            }
            return;
        }
        Q();
        c4m0 c4m0Var2 = this.G;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.G = sac.T(u1c.J(new p6d(m1eVar.b(), dub.e0(((nmt) aliVar.d).a(), new i89(((o0j) ((nmt) aliVar.f1068a).f23788a.c).d, (byte) 22), ((crt) aliVar.b).a(), new i89(((o0j) ((crt) aliVar.c).f4861a.c).e, (byte) 22), new i4u(5, yjeVar, b2)), new ko0(this, (yje) null, (byte) 10), (byte) 1)), d5c.S(jiu0.a(this), dvjVar), new b6j(this, yjeVar, b));
        }
    }

    public static void P(e6j e6jVar, Throwable th) {
        e6jVar.p.b(th, new igm(false, e6jVar, th));
    }

    public final String M() {
        List list = ((w5j) D()).g;
        if (list == null) {
            return "";
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oll ollVar = ((d4j) it.next()).b;
                if ((ollVar instanceof kll) && !((kll) ollVar).b) {
                    return "start";
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                oll ollVar2 = ((d4j) it2.next()).b;
                if ((ollVar2 instanceof kll) && ((kll) ollVar2).b) {
                    return "progress";
                }
            }
        }
        if (list.isEmpty()) {
            return "";
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            oll ollVar3 = ((d4j) it3.next()).b;
            if ((ollVar3 instanceof kll) && ((kll) ollVar3).f18495a) {
                return "finish";
            }
        }
        return "";
    }

    public final void N() {
        bby bbyVar = this.H;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.H = sac.V(jiu0.a(this), new y5j(this, (byte) 3), null, this.q.b, new wg0(this, null, (byte) 4), 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v16 */
    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void x(z3j z3jVar) {
        Object value;
        Object value2;
        z3jVar.getClass();
        super.x(z3jVar);
        if (z3jVar instanceof m3j) {
            E();
            return;
        }
        boolean z = z3jVar instanceof n3j;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        mne mneVar = this.q;
        d4j d4jVar = 0;
        Object obj = null;
        d4j d4jVar2 = null;
        Object obj2 = null;
        if (z) {
            if (((w5j) D()).d) {
                sac.V(jiu0.a(this), a6j.f320a, null, mneVar.b, new ya(this, d4jVar, (byte) 23), 10);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, w5j.a((w5j) value2, null, null, 119)));
                return;
            }
            return;
        }
        boolean z2 = z3jVar instanceof p3j;
        je jeVar = this.y;
        b4j b4jVar = this.x;
        if (z2) {
            int i = ((p3j) z3jVar).f26302a;
            if (!((w5j) D()).c) {
                b1j.w("index", Integer.valueOf(i), b4jVar.f1961a, "dchallenge_section_swap");
                b1j.r(i, jeVar.f16351a, 10941L);
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, w5j.a((w5j) value, null, null, 123)));
            return;
        }
        boolean z3 = z3jVar instanceof q3j;
        oeg0 oeg0Var = this.o;
        if (z3) {
            b4jVar.f1961a.c("dchallenge_section_close");
            jeVar.f16351a.a(xun.f41520a, 10937L);
            i1w0 i1w0VarC = oeg0Var.c();
            i1w0VarC.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z4 = z3jVar instanceof o3j;
            u3j u3jVar = u3j.f34999a;
            if (z4) {
                long j = ((o3j) z3jVar).f24588a;
                List list = ((w5j) D()).g;
                if (list != null) {
                    for (Object obj3 : list) {
                        if (((d4j) obj3).f5458a == j) {
                            obj = obj3;
                            break;
                        }
                    }
                    d4jVar2 = (d4j) obj;
                }
                if (d4jVar2 == null) {
                    return;
                }
                oll ollVar = d4jVar2.b;
                if (!(ollVar instanceof kll)) {
                    if (ollVar instanceof lll) {
                        if (((lll) ollVar).f20253a) {
                            x(u3jVar);
                            return;
                        }
                        return;
                    } else {
                        if (ollVar instanceof mll) {
                            x(v3j.f36734a);
                            return;
                        }
                        return;
                    }
                }
                kll kllVar = (kll) ollVar;
                boolean z5 = kllVar.f18495a;
                boolean z6 = kllVar.b;
                if (z6 && z5) {
                    x(u3jVar);
                    return;
                }
                if (z6 && !z5) {
                    x(new s3j(kllVar.g, kllVar.c));
                    return;
                } else {
                    if (z6 || z5) {
                        return;
                    }
                    x(new r3j(d4jVar2.f5458a));
                    return;
                }
            }
            if (z3jVar instanceof w3j) {
                long j2 = ((w3j) z3jVar).f38505a;
                List list2 = ((w5j) D()).g;
                if (list2 != null) {
                    for (Object obj4 : list2) {
                        if (((d4j) obj4).f5458a == j2) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    d4jVar = (d4j) obj2;
                }
                if (d4jVar == 0) {
                    return;
                }
                oll ollVar2 = d4jVar.b;
                if (ollVar2 instanceof kll) {
                    kll kllVar2 = (kll) ollVar2;
                    byte b = kllVar2.f.f27188a;
                    boolean z7 = kllVar2.f18495a;
                    boolean z8 = kllVar2.b;
                    if (z8 && z7) {
                        x(u3jVar);
                        return;
                    }
                    if (z8 && !z7) {
                        jh70 jh70Var = sba0.b;
                        Integer numValueOf = Integer.valueOf(b);
                        jh70Var.getClass();
                        x(new t3j(jh70.f(numValueOf), kllVar2.g, kllVar2.c, M()));
                        return;
                    }
                    if (z8 || z7) {
                        return;
                    }
                    jh70 jh70Var2 = sba0.b;
                    Integer numValueOf2 = Integer.valueOf(b);
                    jh70Var2.getClass();
                    x(new t3j(jh70.f(numValueOf2), kllVar2.g, 0, M()));
                    return;
                }
                return;
            }
            if (z3jVar instanceof s3j) {
                s3j s3jVar = (s3j) z3jVar;
                long j3 = s3jVar.f31561a;
                int i2 = s3jVar.b;
                b4jVar.e(i2, "dchallenge");
                jeVar.c(i2, "dchallenge");
                oeg0Var.c().d(new ngh(this, new hm1(1, null, kotlin.collections.a.c(Long.valueOf(j3))), (byte) 9));
                return;
            }
            if (z3jVar instanceof r3j) {
                long j4 = ((r3j) z3jVar).f29791a;
                bby bbyVar = this.F;
                if (bbyVar == null || !bbyVar.isActive()) {
                    b4jVar.d("dchallenge");
                    jeVar.b("dchallenge");
                    this.F = sac.V(jiu0.a(this), new y5j(this, (byte) 1), null, mneVar.b, new yg1(this, j4, d4jVar, (byte) 10), 10);
                    return;
                }
                return;
            }
            if (z3jVar instanceof t3j) {
                t3j t3jVar = (t3j) z3jVar;
                sba0 sba0Var = t3jVar.f33270a;
                long j5 = t3jVar.b;
                int i3 = t3jVar.c;
                String str = t3jVar.d;
                b4jVar.getClass();
                b4jVar.f1961a.a("dchallenge_section_more", wp20.b(new Pair("option", str)));
                jeVar.getClass();
                jeVar.f16351a.a(cui0.b(new j1p(str, (byte) 0)), 10935L);
                G(new t5j(sba0Var, j5, i3));
                return;
            }
            if (z3jVar instanceof u3j) {
                b4jVar.f1961a.c("dchallenge_section_prize");
                jeVar.f16351a.a(xun.f41520a, 10939L);
                G(new r5j(new jr1(new cvc0(d7v.b))));
                return;
            }
            if (z3jVar instanceof v3j) {
                b4jVar.f1961a.c("dchallenge_section_end");
                jeVar.f16351a.a(xun.f41520a, 10940L);
                G(new r5j(new jr1()));
                return;
            }
            if (!(z3jVar instanceof x3j)) {
                if (!(z3jVar instanceof y3j)) {
                    t9f.b();
                    return;
                } else if (((w5j) D()).e) {
                    Q();
                    return;
                } else {
                    N();
                    return;
                }
            }
            String strM = M();
            b4jVar.getClass();
            b4jVar.f1961a.a("dchallenge_section_rules", wp20.b(new Pair("option", strM)));
            jeVar.getClass();
            jeVar.f16351a.a(cui0.b(new j1p(strM, (byte) 0)), 10934L);
            i1w0 i1w0VarC2 = oeg0Var.c();
            i1w0VarC2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            FragmentScreen dailyTasksScreens$DailyTasksRulesScreen = new DailyTasksScreens$DailyTasksRulesScreen();
            if (dailyTasksScreens$DailyTasksRulesScreen instanceof DialogScreen) {
                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) dailyTasksScreens$DailyTasksRulesScreen)));
            } else {
                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(dailyTasksScreens$DailyTasksRulesScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0VarC2, copyOnWriteArrayList2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void Q() {
        bby bbyVar = this.I;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.I = sac.V(jiu0.a(this), new y5j(this, (byte) 0), null, this.q.b, new c6j(this, null, b), 10);
        }
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.I;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        c4m0 c4m0Var = this.J;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.G;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        bby bbyVar2 = this.H;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
    }
}
