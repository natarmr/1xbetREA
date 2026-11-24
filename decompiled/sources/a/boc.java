package a;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final class boc extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final cmt A;
    public final s31 B;
    public final cyu C;
    public final vzg0 o;
    public final i1w0 p;
    public final pru q;
    public final lbu r;
    public final phf0 s;
    public final jqt t;
    public final urt u;
    public final v88 v;
    public final gg5 w;
    public final s31 x;
    public final ih5 y;
    public final l7k z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public boc(vzg0 vzg0Var, i1w0 i1w0Var, mne mneVar, pru pruVar, lbu lbuVar, pj9 pj9Var, abu abuVar, phf0 phf0Var, jqt jqtVar, urt urtVar, ctf0 ctf0Var, v88 v88Var, ouu ouuVar, gg5 gg5Var, s31 s31Var, ih5 ih5Var, l7k l7kVar, cmt cmtVar, s31 s31Var2, cyu cyuVar, r8i r8iVar) {
        Object value;
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        ClassicFavoriteTab classicFavoriteTab = null;
        Object[] objArr = 0;
        super(new wg2(vzg0Var, (byte) 3), cvm0.p(rwjVar, rwjVar), new ep4(ctf0Var, (byte) 20), (yzn0) null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = pruVar;
        this.r = lbuVar;
        this.s = phf0Var;
        this.t = jqtVar;
        this.u = urtVar;
        this.v = v88Var;
        this.w = gg5Var;
        this.x = s31Var;
        this.y = ih5Var;
        this.z = l7kVar;
        this.A = cmtVar;
        this.B = s31Var2;
        this.C = cyuVar;
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar2 = mneVar.f22085a;
        byte b = 0;
        sac.V(bvcVarA, rnc.f30782a, null, rwjVar2, new snc(this, 0 == true ? 1 : 0, b), 10);
        byte b2 = 1;
        sac.V(jiu0.a(this), ync.f42934a, null, null, new xnc(this, 0 == true ? 1 : 0, b2), 14);
        sac.T(new fnq(new p6d(pj9Var.f27077a.b(), new ewt(((gst0) abuVar.c).f11847a.c, abuVar, (byte) 11), new znc(3, null, (byte) 0), (byte) 1), new bh0(this, 0 == true ? 1 : 0, (byte) 6), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
        sac.T(new fnq(new va(((qe50) ouuVar.b).b, (byte) 3), new snc(this, 0 == true ? 1 : 0, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar2), vnc.h);
        tcp tcpVar = (tcp) vzg0Var.a("FAVORITE_SECTION_KEY");
        if (tcpVar == tcp.CHAMPION) {
            sac.V(jiu0.a(this), wnc.f39440a, null, null, new xnc(this, objArr == true ? 1 : 0, b), 14);
        } else {
            int i = tcpVar == null ? -1 : qnc.f29023a[tcpVar.ordinal()];
            if (i == 1) {
                classicFavoriteTab = ClassicFavoriteTab.f46639a;
            } else if (i == 2) {
                classicFavoriteTab = ClassicFavoriteTab.b;
            } else if (i == 3) {
                classicFavoriteTab = ClassicFavoriteTab.c;
            } else if (i == 4) {
                classicFavoriteTab = ClassicFavoriteTab.d;
            } else if (i == 5) {
                classicFavoriteTab = ClassicFavoriteTab.b;
            }
            if (classicFavoriteTab != null) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, onc.a((onc) value, null, classicFavoriteTab, null, 0, null, false, false, null, false, 509)));
            }
            M(((onc) D()).b);
        }
        if (r8iVar.r(fk60.TEAM_BET)) {
            G(mnc.f22082a);
        }
    }

    public final void M(ClassicFavoriteTab classicFavoriteTab) {
        int iOrdinal = classicFavoriteTab.ordinal();
        gg5 gg5Var = this.w;
        s31 s31Var = this.x;
        if (iOrdinal == 0) {
            vcp vcpVar = vcp.Classic;
            s31Var.getClass();
            s31Var.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "events"), new Pair("option", "classic")));
            gg5Var.getClass();
            gg5Var.r("events", "classic");
            return;
        }
        if (iOrdinal == 1) {
            vcp vcpVar2 = vcp.Classic;
            s31Var.getClass();
            s31Var.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "other"), new Pair("option", "classic")));
            gg5Var.getClass();
            gg5Var.r("other", "classic");
            return;
        }
        if (iOrdinal == 2) {
            vcp vcpVar3 = vcp.Classic;
            s31Var.getClass();
            s31Var.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "watched"), new Pair("option", "classic")));
            gg5Var.getClass();
            gg5Var.r("watched", "classic");
            return;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return;
        }
        vcp vcpVar4 = vcp.Classic;
        s31Var.K("classic");
        gg5Var.getClass();
        gg5Var.r("viewed", "classic");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        lw70 lw70Var;
        Object value6;
        kw70 kw70Var;
        Object value7;
        Object value8;
        iw70 iw70Var;
        Object value9;
        xmc xmcVar = (xmc) obj;
        xmcVar.getClass();
        if (xmcVar.equals(nmc.f23763a)) {
            E();
            return;
        }
        if (xmcVar.equals(qmc.f28976a)) {
            i8i.D("screen", "favorite", this.y.f14765a, "deposit_call");
            y1p y1pVar = y1p.MAIN;
            this.z.b("favorite", this.A.g());
            v88.b(this.v, this.p, 0L, 6);
            return;
        }
        if (xmcVar.equals(smc.f32437a)) {
            G(new inc(((onc) D()).b));
            return;
        }
        boolean z = xmcVar instanceof wmc;
        vzg0 vzg0Var = this.o;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            ClassicFavoriteTab classicFavoriteTab = (ClassicFavoriteTab) CollectionsKt.W(((wmc) xmcVar).f39399a, ClassicFavoriteTab.f);
            if (classicFavoriteTab == null) {
                return;
            }
            vzg0Var.e("CURRENT_TAB_KEY", classicFavoriteTab);
            M(classicFavoriteTab);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value9 = p7m0Var.getValue();
                value9.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value9, onc.a((onc) value9, null, classicFavoriteTab, null, 0, null, false, false, null, false, 509)));
            return;
        }
        if (xmcVar.equals(pmc.f27224a)) {
            sac.V(jiu0.a(this), aoc.f1194a, null, null, new xnc(this, null, (byte) 2), 14);
            return;
        }
        if (xmcVar instanceof omc) {
            mw70 mw70Var = ((omc) xmcVar).f25495a;
            if (mw70Var instanceof iw70) {
                if (((onc) D()).b == ClassicFavoriteTab.b) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value8 = p7m0Var2.getValue();
                        value8.getClass();
                        oyg0Var.getClass();
                        iw70Var = (iw70) ((omc) xmcVar).f25495a;
                    } while (!p7m0Var2.m(value8, onc.a((onc) value8, null, null, null, 0, iw70Var.f15475a, false, false, null, iw70Var.b, 239)));
                    return;
                }
                return;
            }
            if (mw70Var instanceof jw70) {
                if (((onc) D()).b == ClassicFavoriteTab.f46639a) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value7 = p7m0Var3.getValue();
                        value7.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value7, onc.a((onc) value7, null, null, null, 0, ((jw70) ((omc) xmcVar).f25495a).f17239a, false, false, null, true, 239)));
                    return;
                }
                return;
            }
            if (mw70Var instanceof kw70) {
                if (((onc) D()).b == ClassicFavoriteTab.c) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value6 = p7m0Var4.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                        kw70Var = (kw70) ((omc) xmcVar).f25495a;
                    } while (!p7m0Var4.m(value6, onc.a((onc) value6, null, null, null, 0, kw70Var.f18988a, false, false, null, kw70Var.b, 239)));
                    return;
                }
                return;
            }
            if (!(mw70Var instanceof lw70)) {
                t9f.b();
                return;
            }
            if (((onc) D()).b == ClassicFavoriteTab.d) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                    lw70Var = (lw70) ((omc) xmcVar).f25495a;
                } while (!p7m0Var5.m(value5, onc.a((onc) value5, null, null, null, 0, lw70Var.f20751a, false, false, null, lw70Var.b, 239)));
                return;
            }
            return;
        }
        if (xmcVar instanceof umc) {
            int i = ((umc) xmcVar).f35913a;
            if (i != 0) {
                if (i == 1 && ((onc) D()).e.b) {
                    G(new inc(((onc) D()).b));
                    return;
                }
                return;
            }
            if (((onc) D()).e.f44779a) {
                this.B.g(wgh0.FAVORITES);
                this.C.C("favor_aggregator");
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var6.m(value4, onc.a((onc) value4, null, null, null, 0, null, false, true, null, false, 447)));
                return;
            }
            return;
        }
        if (xmcVar.equals(rmc.f30736a)) {
            vzg0Var.e("SEARCH_QUERY_KEY", "");
            p7m0 p7m0Var7 = ocjVar.f25029a;
            do {
                value3 = p7m0Var7.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var7.m(value3, onc.a((onc) value3, null, null, null, 0, null, false, false, "", false, 319)));
            G(new jnc(""));
            return;
        }
        if (xmcVar instanceof vmc) {
            if (((onc) D()).g) {
                String str = ((vmc) xmcVar).f37669a;
                vzg0Var.e("SEARCH_QUERY_KEY", str);
                p7m0 p7m0Var8 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var8.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var8.m(value2, onc.a((onc) value2, null, null, null, 0, null, false, false, ((vmc) xmcVar).f37669a, false, 383)));
                G(new jnc(str));
                return;
            }
            return;
        }
        if (!xmcVar.equals(mmc.f22029a)) {
            if (xmcVar.equals(tmc.f34186a)) {
                G(hnc.f13345a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        vzg0Var.e("SEARCH_QUERY_KEY", "");
        p7m0 p7m0Var9 = ocjVar.f25029a;
        do {
            value = p7m0Var9.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var9.m(value, onc.a((onc) value, null, null, null, 0, null, false, false, "", false, 319)));
        G(new jnc(""));
    }
}
