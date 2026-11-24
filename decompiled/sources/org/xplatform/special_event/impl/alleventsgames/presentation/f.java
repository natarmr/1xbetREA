package org.xplatform.special_event.impl.alleventsgames.presentation;

import a.b1j;
import a.b32;
import a.bby;
import a.bqk0;
import a.bu;
import a.bzt;
import a.c32;
import a.c42;
import a.c4m0;
import a.c8d;
import a.ccq0;
import a.cqk0;
import a.ctf0;
import a.cvm0;
import a.d0t;
import a.d32;
import a.d5c;
import a.did;
import a.dj1;
import a.dqk0;
import a.duj;
import a.e1u;
import a.e1w0;
import a.e32;
import a.ebc;
import a.eui0;
import a.f32;
import a.f4u;
import a.fll0;
import a.fmt0;
import a.fnq;
import a.gll0;
import a.hjd;
import a.i1p;
import a.i1w0;
import a.i22;
import a.i32;
import a.i3t0;
import a.ill0;
import a.iun;
import a.j1p;
import a.j22;
import a.j3c;
import a.jiu0;
import a.jll0;
import a.k1p;
import a.k22;
import a.kuu;
import a.l22;
import a.lbu;
import a.lyu;
import a.m1e;
import a.m22;
import a.m32;
import a.mne;
import a.n22;
import a.n32;
import a.n4u;
import a.o22;
import a.ocj;
import a.oe50;
import a.oyg0;
import a.p0w0;
import a.p22;
import a.p7m0;
import a.paw;
import a.pd;
import a.pg1;
import a.pru;
import a.q22;
import a.q3d;
import a.r22;
import a.r3d;
import a.r9u;
import a.rus;
import a.s22;
import a.sac;
import a.sr1;
import a.sre0;
import a.t22;
import a.t9f;
import a.tx3;
import a.u32;
import a.uc;
import a.unh0;
import a.v32;
import a.v3c;
import a.vid;
import a.vzg0;
import a.w0w0;
import a.w32;
import a.wcb;
import a.x32;
import a.xg1;
import a.xp20;
import a.xun;
import a.y1p;
import a.y78;
import a.y7d;
import a.yfm0;
import a.yhi;
import a.yje;
import a.yo4;
import a.yzn0;
import a.z32;
import a.zfm0;
import a.zr1;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.team.impl.team_statistic.presentation.screen.SingleTeamStatisticFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i3t0 {
    public static final /* synthetic */ int Q = 0;
    public final f4u A;
    public final yhi B;
    public final m1e C;
    public final yo4 D;
    public final zr1 E;
    public final fmt0 F;
    public final hjd G;
    public final rus H;
    public c4m0 I;
    public bby J;
    public c4m0 K;
    public c4m0 L;
    public c4m0 M;
    public bby N;
    public bby O;
    public bby P;
    public final vzg0 o;
    public final i1w0 p;
    public final AllEventGamesScreenParams q;
    public final duj r;
    public final ctf0 s;
    public final y78 t;
    public final j3c u;
    public final mne v;
    public final yfm0 w;
    public final lyu x;
    public final e1u y;
    public final n4u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vzg0 vzg0Var, i1w0 i1w0Var, AllEventGamesScreenParams allEventGamesScreenParams, duj dujVar, ctf0 ctf0Var, y78 y78Var, lbu lbuVar, pru pruVar, j3c j3cVar, mne mneVar, yfm0 yfm0Var, lyu lyuVar, e1u e1uVar, n4u n4uVar, f4u f4uVar, yhi yhiVar, m1e m1eVar, yo4 yo4Var, zr1 zr1Var, fmt0 fmt0Var, hjd hjdVar, rus rusVar, kuu kuuVar, r9u r9uVar, bzt bztVar) {
        super(null, new pg1(vzg0Var, allEventGamesScreenParams, bztVar, kuuVar, pruVar, lbuVar, r9uVar), new uc(ctf0Var, (byte) 16), cvm0.p(mneVar.f22085a, mneVar.c), new yzn0(sre0.f32672a.b(s22.class)));
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = allEventGamesScreenParams;
        this.r = dujVar;
        this.s = ctf0Var;
        this.t = y78Var;
        this.u = j3cVar;
        this.v = mneVar;
        this.w = yfm0Var;
        this.x = lyuVar;
        this.y = e1uVar;
        this.z = n4uVar;
        this.A = f4uVar;
        this.B = yhiVar;
        this.C = m1eVar;
        this.D = yo4Var;
        this.E = zr1Var;
        this.F = fmt0Var;
        this.G = hjdVar;
        this.H = rusVar;
        fmt0Var.a(false);
        sac.V(jiu0.a(this), new dj1((byte) 24), null, mneVar.f22085a, new z32(this, null, (byte) 0), 10);
    }

    public final ArrayList M(List list) {
        AllEventGamesScreenParams allEventGamesScreenParams = this.q;
        if (allEventGamesScreenParams != null) {
            if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.AllGames) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    d0t d0tVar = (d0t) obj;
                    ArrayList arrayList2 = ((AllEventGamesScreenParams.AllGames) allEventGamesScreenParams).b;
                    if (arrayList2.contains(Long.valueOf(d0tVar.q.f8731a)) || arrayList2.contains(Long.valueOf(d0tVar.r.f8731a))) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.ParticipantGames) {
                long j = ((AllEventGamesScreenParams.ParticipantGames) allEventGamesScreenParams).b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    d0t d0tVar2 = (d0t) obj2;
                    if (j == d0tVar2.q.f8731a || j == d0tVar2.r.f8731a) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            }
            if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.StadiumGames) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    if (((AllEventGamesScreenParams.StadiumGames) allEventGamesScreenParams).b == ((d0t) obj3).L) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            }
        }
        t9f.b();
        return null;
    }

    public final String N() {
        AllEventGamesScreenParams allEventGamesScreenParams = this.q;
        if (allEventGamesScreenParams != null) {
            if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.AllGames) {
                y1p y1pVar = y1p.MAIN;
                return "sport_champ_allmatches";
            }
            if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.ParticipantGames) {
                y1p y1pVar2 = y1p.MAIN;
                return "sport_champ_team";
            }
            if (allEventGamesScreenParams instanceof AllEventGamesScreenParams.StadiumGames) {
                y1p y1pVar3 = y1p.MAIN;
                return "sport_champ_stadium";
            }
        }
        t9f.b();
        return null;
    }

    public final void O() {
        c4m0 c4m0Var = this.I;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.I = sac.T(new fnq(this.C.b(), new e(this, null), (byte) 4), d5c.S(jiu0.a(this), this.v.f22085a), new pd(2, null, (byte) 9));
        }
    }

    public final void P(dqk0 dqk0Var, Function1 function1, Function0 function0) {
        if (dqk0Var != null) {
            if (dqk0Var instanceof bqk0) {
                this.r.b(((bqk0) dqk0Var).f3036a, new c42(function0, (byte) 0));
                return;
            } else if (dqk0Var instanceof cqk0) {
                function1.invoke(((cqk0) dqk0Var).f4798a);
                return;
            }
        }
        t9f.b();
    }

    public final void Q() {
        i3t0.B(this, this.G, new vid[]{new did(CollectionsKt.q0(((n32) D()).b.b, ((n32) D()).c.b))});
    }

    public final void R(x32 x32Var) {
        List list;
        Object value;
        m32 m32Var;
        List list2;
        List list3;
        Object value2;
        m32 m32Var2;
        List list4;
        e32 e32Var;
        Object value3;
        n32 n32Var;
        Object value4;
        n32 n32Var2;
        u32 u32Var;
        boolean z = x32Var instanceof u32;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                n32Var2 = (n32) value4;
                oyg0Var.getClass();
                u32Var = (u32) x32Var;
            } while (!p7m0Var.m(value4, n32.a(n32Var2, null, null, null, b32.a(n32Var2.d, u32Var.f34975a, u32Var.b, u32Var.c, 4), null, null, 247)));
        } else {
            boolean z2 = x32Var instanceof v32;
            int i = 0;
            y78 y78Var = this.t;
            ctf0 ctf0Var = this.s;
            if (z2) {
                List list5 = ((v32) x32Var).b;
                i32 i32Var = ((n32) D()).g;
                wcb wcbVar = ((n32) D()).e;
                boolean z3 = ((n32) D()).h;
                list5.getClass();
                ctf0Var.getClass();
                y78Var.getClass();
                if (list5.isEmpty()) {
                    list3 = iun.f15405a;
                } else {
                    ArrayList arrayList = new ArrayList(r3d.q(list5, 10));
                    for (Object obj : list5) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        d0t d0tVar = (d0t) obj;
                        boolean z4 = i32Var.d;
                        boolean z5 = z3;
                        boolean z6 = i32Var.g;
                        ctf0 ctf0Var2 = ctf0Var;
                        y78 y78Var2 = y78Var;
                        String strA = wcbVar != null ? wcbVar.a(d0tVar.v, d0tVar.u) : null;
                        String str = strA == null ? "" : strA;
                        ArrayList arrayList2 = arrayList;
                        y78Var = y78Var2;
                        ctf0Var = ctf0Var2;
                        arrayList2.add(ccq0.a0(d0tVar, ctf0Var, y78Var, z4, z6, str, i32Var.f14076a, i32Var.b, i32Var.c, i32Var.e, i32Var.h, unh0.i0(i, list5), z5));
                        arrayList = arrayList2;
                        wcbVar = wcbVar;
                        z3 = z5;
                        i = i2;
                        i32Var = i32Var;
                    }
                    list3 = arrayList;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    v32 v32Var = (v32) x32Var;
                    m32Var2 = v32Var.f36714a;
                    list4 = v32Var.b;
                    list4.getClass();
                    list3.getClass();
                } while (!p7m0Var2.m(value2, n32.a((n32) value2, null, null, new c32(m32Var2, list4, list3), null, null, null, 251)));
            } else {
                if (!(x32Var instanceof w32)) {
                    t9f.b();
                    return;
                }
                List list6 = ((w32) x32Var).b;
                i32 i32Var2 = ((n32) D()).g;
                wcb wcbVar2 = ((n32) D()).e;
                boolean z7 = ((n32) D()).h;
                list6.getClass();
                ctf0Var.getClass();
                y78Var.getClass();
                if (list6.isEmpty()) {
                    list = iun.f15405a;
                } else {
                    ArrayList arrayList3 = new ArrayList(r3d.q(list6, 10));
                    for (Object obj2 : list6) {
                        int i3 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        d0t d0tVar2 = (d0t) obj2;
                        boolean z8 = z7;
                        boolean z9 = i32Var2.d;
                        ArrayList arrayList4 = arrayList3;
                        boolean z10 = i32Var2.g;
                        ctf0 ctf0Var3 = ctf0Var;
                        y78 y78Var3 = y78Var;
                        String strA2 = wcbVar2 != null ? wcbVar2.a(d0tVar2.v, d0tVar2.u) : null;
                        if (strA2 == null) {
                            strA2 = "";
                        }
                        String str2 = strA2;
                        ctf0Var = ctf0Var3;
                        y78Var = y78Var3;
                        arrayList4.add(ccq0.a0(d0tVar2, ctf0Var, y78Var, z9, z10, str2, i32Var2.f14076a, i32Var2.b, i32Var2.c, i32Var2.e, i32Var2.h, unh0.i0(i, list6), z8));
                        wcbVar2 = wcbVar2;
                        arrayList3 = arrayList4;
                        z7 = z8;
                        i = i3;
                    }
                    list = arrayList3;
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    w32 w32Var = (w32) x32Var;
                    m32Var = w32Var.f38478a;
                    list2 = w32Var.b;
                    list2.getClass();
                    list.getClass();
                } while (!p7m0Var3.m(value, n32.a((n32) value, null, new d32(m32Var, list2, list), null, null, null, null, 253)));
            }
        }
        n32 n32Var3 = (n32) D();
        m32 m32Var3 = n32Var3.b.f5381a;
        m32 m32Var4 = m32.b;
        if (m32Var3 == m32Var4 && n32Var3.c.f3651a == m32Var4 && n32Var3.d.f1881a == m32Var4) {
            e32Var = e32.b;
        } else {
            n32 n32Var4 = (n32) D();
            m32 m32Var5 = n32Var4.b.f5381a;
            m32 m32Var6 = m32.c;
            e32Var = ((m32Var5 == m32Var6 && n32Var4.c.f3651a == m32Var6 && n32Var4.d.f1881a == m32Var6) || ((n32) D()).b()) ? e32.c : e32.f7113a;
        }
        e32 e32Var2 = e32Var;
        p7m0 p7m0Var4 = ocjVar.f25029a;
        do {
            value3 = p7m0Var4.getValue();
            value3.getClass();
            n32Var = (n32) value3;
            oyg0Var.getClass();
        } while (!p7m0Var4.m(value3, n32.a(n32Var, null, null, null, null, null, new f32(e32Var2, n32Var.f.b), 223)));
    }

    @Override // a.diu0
    public final void v() {
        this.B.c();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        m32 m32Var;
        iun iunVar;
        t22 t22Var = (t22) obj;
        t22Var.getClass();
        super.x(t22Var);
        boolean zEquals = t22Var.equals(i22.f14028a);
        yhi yhiVar = this.B;
        if (zEquals) {
            v3c.N(this.I);
            yhiVar.c();
            v3c.N(this.N);
            v3c.N(this.K);
            v3c.N(this.L);
            v3c.N(this.M);
            v3c.N(this.O);
            v3c.N(this.P);
            return;
        }
        if (t22Var.equals(j22.f15761a)) {
            E();
            return;
        }
        byte b = 1;
        yje yjeVar = null;
        if (t22Var.equals(k22.f17555a)) {
            i3t0.K(this, null, null, new bu(this, yjeVar, b), 3);
            return;
        }
        if (t22Var.equals(l22.f19286a)) {
            this.O = i3t0.F(this, this.G, null, null, new xg1((byte) 19), 119);
            this.P = i3t0.F(this, this.H, null, null, new xg1((byte) 20), 119);
            O();
            return;
        }
        boolean z = t22Var instanceof o22;
        byte b2 = 0;
        hjd hjdVar = this.G;
        if (z) {
            i3t0.B(this, hjdVar, new vid[]{new did(CollectionsKt.q0(((n32) D()).b.b, ((n32) D()).c.b)), ((o22) t22Var).f24509a});
            return;
        }
        boolean zEquals2 = t22Var.equals(q22.f27980a);
        i1w0 i1w0Var = this.p;
        if (zEquals2) {
            AllEventGamesScreenParams allEventGamesScreenParams = this.q;
            if (!(allEventGamesScreenParams instanceof AllEventGamesScreenParams.ParticipantGames)) {
                return;
            }
            AllEventGamesScreenParams.ParticipantGames participantGames = (AllEventGamesScreenParams.ParticipantGames) allEventGamesScreenParams;
            int i = participantGames.b;
            this.D.f42966a.a("statistic_team_call", xp20.f(new Pair("championship_id", Integer.valueOf(((n32) D()).g.f14076a)), new Pair("option", Integer.valueOf(i))));
            int i2 = ((n32) D()).g.f14076a;
            String strValueOf = String.valueOf(i);
            zr1 zr1Var = this.E;
            zr1Var.getClass();
            strValueOf.getClass();
            zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new j1p(strValueOf, (byte) 0)}), 3106L);
            String str = participantGames.d;
            long j = participantGames.e;
            int i3 = participantGames.f46962a;
            int i4 = participantGames.b;
            ((zfm0) this.w).getClass();
            str.getClass();
            FragmentScreen singleTeamStatisticFragmentScreen = new SingleTeamStatisticFragmentScreen(str, i3, i4, j);
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            if (singleTeamStatisticFragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) singleTeamStatisticFragmentScreen)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(singleTeamStatisticFragmentScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (t22Var instanceof n22) {
                i3t0.B(this, hjdVar, new vid[]{new did(CollectionsKt.q0(((n32) D()).b.b, ((n32) D()).c.b)), ebc.n0(((n22) t22Var).f22779a)});
                return;
            }
            if (!t22Var.equals(p22.f26232a)) {
                if (t22Var instanceof m22) {
                    fll0 fll0Var = new fll0(((n32) D()).d.b);
                    ill0 ill0Var = ((m22) t22Var).f21035a;
                    i3t0.B(this, this.H, new jll0[]{fll0Var, ill0Var});
                    if (ill0Var instanceof gll0) {
                        long j2 = ((gll0) ill0Var).f11497a;
                        Set set = ((n32) D()).d.d;
                        H(new sr1(set.contains(Long.valueOf(j2)) ? eui0.e(CollectionsKt.O0(set), Long.valueOf(j2)) : eui0.h(CollectionsKt.O0(set), Long.valueOf(j2)), this, (byte) 5));
                        return;
                    }
                    return;
                }
                if (!t22Var.equals(r22.f29710a)) {
                    t9f.b();
                    return;
                }
                v3c.N(this.I);
                yhiVar.c();
                v3c.N(this.N);
                v3c.N(this.K);
                v3c.N(this.L);
                v3c.N(this.M);
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                    m32Var = m32.f21092a;
                    iunVar = iun.f15405a;
                } while (!p7m0Var.m(value, n32.a((n32) value, null, new d32(m32Var, iunVar, iunVar), new c32(m32Var, iunVar, iunVar), new b32(m32Var, iunVar, iunVar, xun.f41520a), null, null, 241)));
                sac.V(jiu0.a(this), new dj1((byte) 24), null, this.v.f22085a, new z32(this, yjeVar, b2), 10);
                this.F.a(true);
                O();
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
