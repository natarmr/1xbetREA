package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class tu7 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public c4m0 A;
    public bby B;
    public c4m0 C;
    public final BetsOnPlayersScreenParams o;
    public final i1w0 p;
    public final mne q;
    public final m1e r;
    public final wti s;
    public final pmi t;
    public final zsu u;
    public final ehf0 v;
    public final zas0 w;
    public final ugf0 x;
    public final s64 y;
    public final qu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public tu7(BetsOnPlayersScreenParams betsOnPlayersScreenParams, i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, m1e m1eVar, wti wtiVar, pmi pmiVar, ntu ntuVar, zsu zsuVar, oif0 oif0Var, ehf0 ehf0Var, zas0 zas0Var, pru pruVar, abu abuVar, jru jruVar, ugf0 ugf0Var, s64 s64Var, qu quVar, bzt bztVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(new zo4(oif0Var, (byte) 27), cvm0.p(vs10Var, rwjVar), new dg(ctf0Var, betsOnPlayersScreenParams, ntuVar, pruVar, bztVar, (byte) 3), (yzn0) null);
        this.o = betsOnPlayersScreenParams;
        this.p = i1w0Var;
        this.q = mneVar;
        this.r = m1eVar;
        this.s = wtiVar;
        this.t = pmiVar;
        this.u = zsuVar;
        this.v = ehf0Var;
        this.w = zas0Var;
        this.x = ugf0Var;
        this.y = s64Var;
        this.z = quVar;
        sac.T(new fnq(new fnq(((hqp0) abuVar.b).f13495a.f44771a, new j0s(abuVar, yjeVar, (byte) 15), (byte) 4), new su7(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foe.h);
        sac.T(new fnq(((b8h0) jruVar.b).f2157a.f38672a, new su7(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foe.h);
    }

    public final sfp0 M(String str) {
        qqp0 qqp0Var = ((pu7) D()).f27601a;
        Object obj = null;
        List list = qqp0Var instanceof oqp0 ? ((oqp0) qqp0Var).f25700a : null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((sfp0) obj2).f32128a.equals(str)) {
                obj = obj2;
                break;
            }
        }
        return (sfp0) obj;
    }

    public final void N() {
        c4m0 c4m0Var = this.A;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.A = sac.T(new fnq(this.r.b(), new wa(this, null, (byte) 27), (byte) 4), d5c.S(jiu0.a(this), this.q.f22085a), foe.h);
        }
    }

    public final void O(a8h0 a8h0Var, String str) {
        z7h0 y7h0Var;
        z7h0 z7h0Var = a8h0Var.b;
        if (z7h0Var == null) {
            y7h0Var = null;
        } else if (z7h0Var instanceof x7h0) {
            y7h0Var = new x7h0(str);
        } else {
            if (!(z7h0Var instanceof y7h0)) {
                t9f.b();
                return;
            }
            y7h0Var = new y7h0(((y7h0) z7h0Var).f42151a, str);
        }
        a8h0 a8h0VarA = a8h0.a(a8h0Var, y7h0Var);
        ugf0 ugf0Var = this.x;
        ugf0Var.getClass();
        ((b8h0) ugf0Var.f35622a).a(a8h0VarA);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        sfp0 sfp0VarM;
        v800 v800Var;
        sfp0 sfp0Var;
        a8h0 a8h0Var;
        List list;
        a8h0 a8h0Var2;
        z7h0 z7h0Var;
        z7h0 y7h0Var;
        List list2;
        rt7 rt7Var = (rt7) obj;
        rt7Var.getClass();
        super.x(rt7Var);
        if (rt7Var.equals(gt7.f11867a)) {
            e3c.n(this.A);
            e3c.n(this.C);
            e3c.n(this.B);
            return;
        }
        if (rt7Var.equals(ht7.f13620a)) {
            E();
            return;
        }
        if (rt7Var.equals(it7.f15342a)) {
            N();
            return;
        }
        if (!rt7Var.equals(jt7.f17086a)) {
            boolean z = rt7Var instanceof lt7;
            ugf0 ugf0Var = this.x;
            String strT = null;
            s64 s64Var = this.y;
            BetsOnPlayersScreenParams betsOnPlayersScreenParams = this.o;
            qu quVar = this.z;
            if (z) {
                if (((lt7) rt7Var).f20617a != 0 || (a8h0Var2 = ((pu7) D()).d) == null || (z7h0Var = a8h0Var2.b) == null) {
                    return;
                }
                h97.x("sport_id", Long.valueOf(betsOnPlayersScreenParams.c), quVar.f29324a, "bet_player_screen_view");
                h97.r(betsOnPlayersScreenParams.c, s64Var.f31684a, 11353L);
                sfp0 sfp0VarM2 = M(a8h0Var2.f425a);
                if (sfp0VarM2 != null) {
                    if (z7h0Var instanceof y7h0) {
                        y7h0Var = new x7h0(nsm0.t(sfp0VarM2.d));
                    } else {
                        if (!(z7h0Var instanceof x7h0)) {
                            t9f.b();
                            return;
                        }
                        v800 v800Var2 = (v800) CollectionsKt.firstOrNull(sfp0VarM2.c);
                        Integer numValueOf = v800Var2 != null ? Integer.valueOf(v800Var2.b) : null;
                        if (v800Var2 != null && (list2 = v800Var2.c) != null) {
                            strT = nsm0.t(list2);
                        }
                        y7h0Var = new y7h0(numValueOf, strT);
                    }
                    a8h0 a8h0VarA = a8h0.a(a8h0Var2, y7h0Var);
                    ugf0Var.getClass();
                    ((b8h0) ugf0Var.f35622a).a(a8h0VarA);
                    return;
                }
                return;
            }
            if (rt7Var instanceof mt7) {
                String str = ((mt7) rt7Var).f22358a;
                a8h0 a8h0Var3 = ((pu7) D()).d;
                if (a8h0Var3 == null) {
                    return;
                }
                String str2 = a8h0Var3.f425a;
                long j = betsOnPlayersScreenParams.c;
                quVar.getClass();
                str2.getClass();
                quVar.f29324a.a("bet_player_choose", xp20.f(new Pair("sport_id", Long.valueOf(j)), new Pair("point", str2), new Pair("option", str)));
                long j2 = betsOnPlayersScreenParams.c;
                s64Var.getClass();
                s64Var.f31684a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j2), new j1p(str2, (byte) 0), new j1p(str, (byte) 1)}), 11351L);
                O(a8h0Var3, str);
                return;
            }
            if (rt7Var instanceof nt7) {
                String str3 = ((nt7) rt7Var).f24082a;
                a8h0 a8h0Var4 = ((pu7) D()).d;
                if (a8h0Var4 == null) {
                    return;
                }
                O(a8h0Var4, str3);
                return;
            }
            if (rt7Var.equals(pt7.f27550a)) {
                G(ou7.f25864a);
                return;
            }
            if (!(rt7Var instanceof qt7)) {
                if (rt7Var.equals(ot7.f25816a)) {
                    e3c.n(this.A);
                    e3c.n(this.C);
                    e3c.n(this.B);
                    N();
                    return;
                }
                if (!(rt7Var instanceof kt7)) {
                    t9f.b();
                    return;
                }
                int i = ((kt7) rt7Var).f18849a;
                a8h0 a8h0Var5 = ((pu7) D()).d;
                if (a8h0Var5 == null || (sfp0VarM = M(a8h0Var5.f425a)) == null || (v800Var = (v800) CollectionsKt.W(i, sfp0VarM.c)) == null) {
                    return;
                }
                int i2 = v800Var.b;
                String str4 = sfp0VarM.f32128a;
                long j3 = betsOnPlayersScreenParams.c;
                quVar.getClass();
                quVar.f29324a.a("bet_player_line_choose", xp20.f(new Pair("sport_id", Long.valueOf(j3)), new Pair("point", str4), new Pair("option", Integer.valueOf(i2))));
                long j4 = betsOnPlayersScreenParams.c;
                s64Var.getClass();
                s64Var.f31684a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j4), new i1p(i2, (byte) 0), new j1p(str4, (byte) 0)}), 11350L);
                a8h0 a8h0VarA2 = a8h0.a(a8h0Var5, new y7h0(Integer.valueOf(i2), nsm0.t(v800Var.c)));
                ugf0Var.getClass();
                ((b8h0) ugf0Var.f35622a).a(a8h0VarA2);
                return;
            }
            int i3 = ((qt7) rt7Var).f29286a;
            qqp0 qqp0Var = ((pu7) D()).f27601a;
            List list3 = qqp0Var instanceof oqp0 ? ((oqp0) qqp0Var).f25700a : null;
            if (list3 == null || (sfp0Var = (sfp0) CollectionsKt.W(i3, list3)) == null) {
                return;
            }
            String str5 = sfp0Var.f32128a;
            long j5 = betsOnPlayersScreenParams.c;
            quVar.getClass();
            quVar.f29324a.a("bet_player_team_choose", xp20.f(new Pair("sport_id", Long.valueOf(j5)), new Pair("point", str5)));
            long j6 = betsOnPlayersScreenParams.c;
            s64Var.getClass();
            s64Var.f31684a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j6), new j1p(str5, (byte) 0)}), 11349L);
            a8h0 a8h0Var6 = ((pu7) D()).d;
            if (a8h0Var6 == null) {
                return;
            }
            z7h0 z7h0Var2 = a8h0Var6.b;
            if (z7h0Var2 == null) {
                a8h0Var = new a8h0(str5, null);
            } else if (z7h0Var2 instanceof y7h0) {
                v800 v800Var3 = (v800) CollectionsKt.firstOrNull(sfp0Var.c);
                Integer numValueOf2 = v800Var3 != null ? Integer.valueOf(v800Var3.b) : null;
                if (v800Var3 != null && (list = v800Var3.c) != null) {
                    strT = nsm0.t(list);
                }
                a8h0Var = new a8h0(str5, new y7h0(numValueOf2, strT));
            } else {
                if (!(z7h0Var2 instanceof x7h0)) {
                    t9f.b();
                    return;
                }
                a8h0Var = new a8h0(str5, new x7h0(nsm0.t(sfp0Var.d)));
            }
            ugf0Var.getClass();
            ((b8h0) ugf0Var.f35622a).a(a8h0Var);
            return;
        }
        i1w0 i1w0Var = this.p;
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
