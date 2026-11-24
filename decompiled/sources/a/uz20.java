package a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.sportgame.markets.display_settings.impl.navigation.MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class uz20 extends i3t0 {
    public static final /* synthetic */ int R = 0;
    public final tpp A;
    public final pqc B;
    public final cl5 C;
    public final r1u D;
    public final ntt E;
    public final abu F;
    public final reu G;
    public final iw20 H;
    public final nvu I;
    public final uii J;
    public final mne K;
    public c4m0 L;
    public c4m0 M;
    public c4m0 N;
    public c4m0 O;
    public c4m0 P;
    public c4m0 Q;
    public final vzg0 o;
    public final i1w0 p;
    public final MarketsCategoriesParams q;
    public final j1u r;
    public final s1u s;
    public final lku t;
    public final s1u u;
    public final evz v;
    public final s1u w;
    public final dq00 x;
    public final pru y;
    public final ik9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz20(vzg0 vzg0Var, i1w0 i1w0Var, MarketsCategoriesParams marketsCategoriesParams, j1u j1uVar, s1u s1uVar, lku lkuVar, s1u s1uVar2, ctf0 ctf0Var, evz evzVar, s1u s1uVar3, dq00 dq00Var, pru pruVar, ik9 ik9Var, tpp tppVar, pqc pqcVar, cl5 cl5Var, r1u r1uVar, ntt nttVar, abu abuVar, reu reuVar, cmt cmtVar, iw20 iw20Var, nvu nvuVar, uii uiiVar, mne mneVar) {
        super(new mr0(pruVar, vzg0Var, marketsCategoriesParams, cmtVar, (byte) 19), cvm0.p(mneVar.c, mneVar.f22085a), new v510(ctf0Var, (byte) 5), (yzn0) null);
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = marketsCategoriesParams;
        this.r = j1uVar;
        this.s = s1uVar;
        this.t = lkuVar;
        this.u = s1uVar2;
        this.v = evzVar;
        this.w = s1uVar3;
        this.x = dq00Var;
        this.y = pruVar;
        this.z = ik9Var;
        this.A = tppVar;
        this.B = pqcVar;
        this.C = cl5Var;
        this.D = r1uVar;
        this.E = nttVar;
        this.F = abuVar;
        this.G = reuVar;
        this.H = iw20Var;
        this.I = nvuVar;
        this.J = uiiVar;
        this.K = mneVar;
    }

    public final void M(Long l) {
        Object next;
        List list = ((dz20) D()).d;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long id = ((xvm0) next).getId();
                if (l != null && id == l.longValue()) {
                    break;
                }
            }
            xvm0 xvm0Var = (xvm0) next;
            if (xvm0Var != null) {
                s1u s1uVar = this.s;
                s1uVar.getClass();
                kym0 kym0Var = s1uVar.f31473a;
                kym0Var.getClass();
                kym0Var.b.b(xvm0Var);
                H(new k110((Object) xvm0Var, (Object) this, (byte) 27));
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object obj2;
        Object obj3;
        Object next;
        xvm0 xvm0Var;
        az20 az20Var = (az20) obj;
        az20Var.getClass();
        super.x(az20Var);
        boolean z = az20Var instanceof uy20;
        byte b = 2;
        i1w0 i1w0Var = this.p;
        byte b2 = 1;
        byte b3 = 0;
        MarketsCategoriesParams marketsCategoriesParams = this.q;
        dq00 dq00Var = this.x;
        if (z) {
            List list = ((dz20) D()).f6921a;
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((js20) next).a() != ((uy20) az20Var).f36469a);
                js20 js20Var = (js20) next;
                if (js20Var != null) {
                    long jA = js20Var.a();
                    Long l = ((dz20) D()).c;
                    if (l != null && jA == l.longValue()) {
                        return;
                    }
                    long j = marketsCategoriesParams.f46990a;
                    s1p s1pVar = ((je) dq00Var.c).f16351a;
                    bn6 bn6Var = (bn6) dq00Var.b;
                    if (js20Var.equals(gs20.f11808a)) {
                        bn6Var.g(j, "all_markets");
                        s1pVar.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p("all_markets", (byte) 0)}), 11091L);
                    } else if (js20Var.equals(hs20.f13560a)) {
                        bn6Var.g(j, "bet_on_players");
                        s1pVar.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p("bet_on_players", (byte) 0)}), 11091L);
                    } else if (!(js20Var instanceof is20)) {
                        t9f.b();
                        return;
                    } else {
                        long j2 = ((is20) js20Var).f15285a;
                        bn6Var.b.a("bet_market_cathegory_click", xp20.f(new Pair("game_id", Long.valueOf(j)), new Pair("option", Long.valueOf(j2))));
                        s1pVar.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new i1p((byte) 0, j2)}), 11091L);
                    }
                    if (js20Var instanceof hs20) {
                        i1w0Var.d(new km00(this, (byte) 27));
                        return;
                    }
                    j1u j1uVar = this.r;
                    j1uVar.getClass();
                    j1uVar.f15754a.a(js20Var);
                    H(new k110((Object) js20Var, (Object) this, (byte) 28));
                    List list2 = ((dz20) D()).d;
                    M((list2 == null || (xvm0Var = (xvm0) CollectionsKt.firstOrNull(list2)) == null) ? null : Long.valueOf(xvm0Var.getId()));
                    return;
                }
                return;
            }
            return;
        }
        if (az20Var instanceof wy20) {
            List list3 = ((dz20) D()).d;
            if (list3 != null) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    Object next2 = it2.next();
                    if (((xvm0) next2).getId() == ((wy20) az20Var).f39958a) {
                        obj3 = next2;
                        break;
                    }
                }
                xvm0 xvm0Var2 = (xvm0) obj3;
                if (xvm0Var2 != null) {
                    long j3 = marketsCategoriesParams.d;
                    s1p s1pVar2 = ((je) dq00Var.c).f16351a;
                    bn6 bn6Var2 = (bn6) dq00Var.b;
                    if (!(xvm0Var2 instanceof rvm0)) {
                        if (xvm0Var2 instanceof svm0) {
                            bn6Var2.a(j3);
                            s1pVar2.a(tx3.l0(new k1p[]{new i1p((byte) 2, j3), new j1p("insight", (byte) 0)}), 3182L);
                        } else if (!(xvm0Var2 instanceof tvm0) && !(xvm0Var2 instanceof wvm0)) {
                            t9f.b();
                            return;
                        } else {
                            bn6Var2.o(j3, xvm0Var2.getId());
                            s1pVar2.a(tx3.l0(new k1p[]{new i1p((byte) 2, j3), new i1p((byte) 0, xvm0Var2.getId())}), 3182L);
                        }
                    }
                }
            }
            M(Long.valueOf(((wy20) az20Var).f39958a));
            return;
        }
        if (az20Var instanceof xy20) {
            long j4 = marketsCategoriesParams.d;
            h97.x("sport_id", Long.valueOf(j4), ((bn6) dq00Var.b).b, "bet_game_sub_call");
            h97.r(j4, ((je) dq00Var.c).f16351a, 3183L);
            G(cz20.f5205a);
            return;
        }
        if (az20Var instanceof yy20) {
            List list4 = ((dz20) D()).d;
            if (list4 != null) {
                Iterator it3 = list4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next3 = it3.next();
                    if (((xvm0) next3).getId() == ((yy20) az20Var).f43448a) {
                        obj2 = next3;
                        break;
                    }
                }
                xvm0 xvm0Var3 = (xvm0) obj2;
                if (xvm0Var3 != null) {
                    long id = xvm0Var3.getId();
                    long j5 = marketsCategoriesParams.d;
                    ((bn6) dq00Var.b).p(j5, id);
                    ((je) dq00Var.c).f16351a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j5), new i1p((byte) 0, id)}), 3184L);
                }
            }
            M(Long.valueOf(((yy20) az20Var).f43448a));
            return;
        }
        if (az20Var instanceof vy20) {
            E();
            return;
        }
        if (az20Var.equals(ty20.d)) {
            yje yjeVar = null;
            this.L = sac.T(new fnq(new i89(this.t.f20218a.f1372a.f43101a, (byte) 22), new oz20(this, yjeVar, b3), (byte) 4), jiu0.a(this), pz20.h);
            s1u s1uVar = this.u;
            this.M = sac.T(new fnq(s1uVar.a(), new oz20(this, yjeVar, b), (byte) 4), jiu0.a(this), rz20.h);
            this.O = sac.T(new fnq(this.G.b(), new oz20(this, yjeVar, b2), (byte) 4), jiu0.a(this), qz20.h);
            this.P = sac.T(new fnq(this.F.o(), new w620((Object) this, yjeVar, (byte) 5), (byte) 4), jiu0.a(this), sz20.h);
            uii uiiVar = this.J;
            r9u r9uVar = (r9u) uiiVar.c;
            ygp ygpVar = ygp.s1;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean z2 = j1q0Var.f15748a.d(ygpVar) && ((pru) uiiVar.d).a().f32117a.f12063a.s;
            yje yjeVar2 = null;
            this.Q = sac.T(new fnq(i120.W(aoq.c(i120.W(new tst(new i89(((tdl0) ((rpt) uiiVar.f35730a).f30901a).n.f23420a, (byte) 22), z2, (byte) 0)), new pst(yjeVar2, uiiVar, b3))), new d21(this, yjeVar2, (byte) 9), (byte) 4), jiu0.a(this), nz20.h);
            if (this.y.a().S1) {
                gmq gmqVarW = i120.W(s1uVar.a());
                chf0 chf0Var = this.z.f14914a;
                this.N = i3t0.L(this, new p6d(gmqVarW, i120.W(new c00(chf0Var.u(owe.f25963a), chf0Var, (byte) 17)), new sot((Object) this, (yje) null, (byte) 26), (byte) 1), null, null, 3);
                return;
            }
            return;
        }
        if (az20Var.equals(ty20.e)) {
            c4m0 c4m0Var = this.L;
            if (c4m0Var != null) {
                e3c.n(c4m0Var);
            }
            c4m0 c4m0Var2 = this.M;
            if (c4m0Var2 != null) {
                e3c.n(c4m0Var2);
            }
            c4m0 c4m0Var3 = this.N;
            if (c4m0Var3 != null) {
                e3c.n(c4m0Var3);
            }
            c4m0 c4m0Var4 = this.O;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            c4m0 c4m0Var5 = this.P;
            if (c4m0Var5 != null) {
                e3c.n(c4m0Var5);
            }
            c4m0 c4m0Var6 = this.Q;
            if (c4m0Var6 != null) {
                e3c.n(c4m0Var6);
                return;
            }
            return;
        }
        if (!az20Var.equals(ty20.c)) {
            boolean zEquals = az20Var.equals(ty20.g);
            ntt nttVar = this.E;
            if (zEquals) {
                if (((dz20) D()).h) {
                    nttVar.c(false);
                    return;
                } else {
                    nttVar.c(true);
                    return;
                }
            }
            if (az20Var.equals(ty20.f)) {
                nttVar.c(false);
                return;
            }
            if (az20Var instanceof zy20) {
                this.D.b(((zy20) az20Var).f45185a);
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, dz20.a((dz20) value, null, null, null, null, null, null, false, ((zy20) az20Var).f45185a, null, null, false, 3839)));
                return;
            }
            boolean zEquals2 = az20Var.equals(ty20.f34731a);
            mne mneVar = this.K;
            if (zEquals2) {
                i3t0.K(this, mneVar.c, null, new tz20(this, null, (byte) 1), 2);
                return;
            }
            if (!az20Var.equals(ty20.b)) {
                t9f.b();
                return;
            }
            boolean z3 = ((dz20) D()).k.b;
            nttVar.c(false);
            ((of6) ((yk50) this.H.f15470a).b).f25150a.d("KEY_MARKETS_CATEGORIES_BET_BUILDER_BADGE_CLICKED", true);
            if (z3) {
                G(cz20.b);
            }
            i3t0.K(this, mneVar.c, null, new tz20(this, null, b3), 2);
            return;
        }
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.v.getClass();
        k0w0VarI.h(new MarketsDisplaySettingsScreenFactoryImpl$getScreen$1());
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
