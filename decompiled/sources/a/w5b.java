package a;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;

/* JADX INFO: loaded from: classes4.dex */
public final class w5b extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final gg5 A;
    public final s31 B;
    public final ih5 C;
    public final l7k D;
    public final cmt E;
    public final s31 F;
    public final cyu G;
    public final vzg0 o;
    public final i1w0 p;
    public final mne q;
    public final pru r;
    public final lbu s;
    public final phf0 t;
    public final jqt u;
    public final urt v;
    public final eke0 w;
    public final r9u x;
    public final svu y;
    public final v88 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public w5b(vzg0 vzg0Var, i1w0 i1w0Var, mne mneVar, pru pruVar, lbu lbuVar, phf0 phf0Var, jqt jqtVar, urt urtVar, eke0 eke0Var, r9u r9uVar, svu svuVar, ctf0 ctf0Var, v88 v88Var, gg5 gg5Var, s31 s31Var, ih5 ih5Var, l7k l7kVar, cmt cmtVar, s31 s31Var2, cyu cyuVar, r8i r8iVar) {
        jx70 ex70Var;
        Object value;
        Object value2;
        Object value3;
        i1w0Var.getClass();
        r9uVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(new wg2(vzg0Var, (byte) 2), cvm0.p(rwjVar, rwjVar), new ep4(ctf0Var, (byte) 15), (yzn0) null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = mneVar;
        this.r = pruVar;
        this.s = lbuVar;
        this.t = phf0Var;
        this.u = jqtVar;
        this.v = urtVar;
        this.w = eke0Var;
        this.x = r9uVar;
        this.y = svuVar;
        this.z = v88Var;
        this.A = gg5Var;
        this.B = s31Var;
        this.C = ih5Var;
        this.D = l7kVar;
        this.E = cmtVar;
        this.F = s31Var2;
        this.G = cyuVar;
        tcp tcpVar = (tcp) vzg0Var.a("FAVORITE_SECTION_KEY");
        byte b = 0;
        switch (tcpVar == null ? -1 : r5b.f29876a[tcpVar.ordinal()]) {
            case 1:
                ex70Var = new ex70(new zpv(false, false));
                break;
            case 2:
                ex70Var = new ex70(new zpv(false, false));
                break;
            case 3:
                ex70Var = new hx70(new zpv(false, false));
                break;
            case 4:
                ex70Var = new ix70(new zpv(false, false));
                break;
            case 5:
                ex70Var = new cx70(new zpv(false, false));
                break;
            case 6:
                ex70Var = new fx70(new zpv(false, false));
                break;
            case 7:
                ex70Var = new gx70(new zpv(false, false));
                break;
            case 8:
                ex70Var = new dx70(new zpv(false, false));
                break;
            default:
                ex70Var = new ex70(new zpv(false, false));
                break;
        }
        vzg0Var.d("FAVORITE_SECTION_KEY");
        if (ex70Var instanceof cx70) {
            O(CategoryImageHeaderTab.c);
        } else if (ex70Var instanceof dx70) {
            O(CategoryImageHeaderTab.b);
        } else if (ex70Var instanceof ex70) {
            String str = (String) vzg0Var.a("SEARCH_QUERY_KEY");
            str = str == null ? "" : str;
            boolean zD = Intrinsics.d(vzg0Var.a("SEARCH_FIELD_STATE_KEY"), Boolean.TRUE);
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value4 = p7m0Var.getValue();
                value4.getClass();
                this.f.getClass();
                boolean z = zD;
                if (p7m0Var.m(value4, p5b.a((p5b) value4, null, null, null, new ex70(new zpv(false, false)), false, z, str, false, 151))) {
                    G(new m5b(ih2.Events));
                } else {
                    zD = z;
                }
            }
        } else if (ex70Var instanceof fx70) {
            z4b z4bVar = ((p5b) D()).f26397a;
            if (z4bVar != null && z4bVar.i) {
                M();
            }
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                this.f.getClass();
            } while (!p7m0Var2.m(value3, p5b.a((p5b) value3, null, null, null, new fx70(new zpv(false, false)), false, false, null, false, 247)));
            G(new m5b(ih2.Teams));
        } else if (ex70Var instanceof gx70) {
            p7m0 p7m0Var3 = this.i.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                this.f.getClass();
            } while (!p7m0Var3.m(value2, p5b.a((p5b) value2, null, null, null, new gx70(new zpv(false, false)), false, false, null, false, 247)));
            G(new m5b(ih2.Tournaments));
        } else if (ex70Var instanceof hx70) {
            p7m0 p7m0Var4 = this.i.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var4.m(value, p5b.a((p5b) value, null, null, null, new hx70(new zpv(false, false)), false, false, null, false, 247)));
            G(new m5b(ih2.Tracked));
        } else {
            if (!(ex70Var instanceof ix70)) {
                t9f.b();
                throw null;
            }
            O(CategoryImageHeaderTab.d);
        }
        sac.V(jiu0.a(this), s5b.f31647a, null, mneVar.f22085a, new wa(this, yjeVar, (byte) 29), 10);
        sac.V(jiu0.a(this), t5b.f33360a, null, null, new u5b(this, yjeVar, b), 14);
        if (r8iVar.r(fk60.TEAM_BET)) {
            G(n5b.f22935a);
        }
    }

    public final void M() {
        Object value;
        this.o.e("SEARCH_QUERY_KEY", "");
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, p5b.a((p5b) value, null, null, null, null, false, false, "", false, 159)));
        G(new l5b(""));
    }

    public final void N(CategoryImageHeaderTab categoryImageHeaderTab) {
        int iOrdinal = categoryImageHeaderTab.ordinal();
        gg5 gg5Var = this.A;
        s31 s31Var = this.B;
        if (iOrdinal == 1) {
            vcp vcpVar = vcp.Classic;
            s31Var.getClass();
            s31Var.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "games"), new Pair("option", "categoryImageHeader")));
            gg5Var.getClass();
            gg5Var.r("games", "categoryImageHeader");
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            vcp vcpVar2 = vcp.Classic;
            s31Var.K("categoryImageHeader");
            gg5Var.getClass();
            gg5Var.r("viewed", "categoryImageHeader");
            return;
        }
        z4b z4bVar = ((p5b) D()).f26397a;
        if (z4bVar == null || !z4bVar.d) {
            vcp vcpVar3 = vcp.Classic;
            s31Var.getClass();
            s31Var.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "virtual"), new Pair("option", "categoryImageHeader")));
            gg5Var.getClass();
            gg5Var.r("virtual", "categoryImageHeader");
            return;
        }
        vcp vcpVar4 = vcp.Classic;
        s31Var.getClass();
        s31Var.f31532a.a("bet_favor_menu_call", xp20.f(new Pair("menu", "aggregator"), new Pair("option", "categoryImageHeader")));
        gg5Var.getClass();
        gg5Var.r("aggregator", "categoryImageHeader");
    }

    public final void O(CategoryImageHeaderTab categoryImageHeaderTab) {
        this.o.e("CURRENT_TAB_KEY", categoryImageHeaderTab);
        N(categoryImageHeaderTab);
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            CategoryImageHeaderTab categoryImageHeaderTab2 = categoryImageHeaderTab;
            if (p7m0Var.m(value, p5b.a((p5b) value, null, categoryImageHeaderTab2, null, null, false, false, null, false, 253))) {
                return;
            } else {
                categoryImageHeaderTab = categoryImageHeaderTab2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        z4b z4bVar;
        Object value6;
        Object value7;
        z4b z4bVar2;
        x4b x4bVar = (x4b) obj;
        x4bVar.getClass();
        super.x(x4bVar);
        if (x4bVar.equals(n4b.f22892a)) {
            E();
            return;
        }
        boolean zEquals = x4bVar.equals(r4b.f29828a);
        i1w0 i1w0Var = this.p;
        if (zEquals) {
            i8i.D("screen", "favorite", this.C.f14765a, "deposit_call");
            y1p y1pVar = y1p.MAIN;
            this.D.b("favorite", this.E.g());
            v88.b(this.z, i1w0Var, 0L, 6);
            return;
        }
        boolean z = x4bVar instanceof u4b;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        byte b = 1;
        vzg0 vzg0Var = this.o;
        if (z) {
            int i = ((u4b) x4bVar).f35037a;
            if (i == 0) {
                if (((p5b) D()).d.a().b) {
                    G(new k5b(((p5b) D()).d));
                    return;
                }
                return;
            }
            if (i == 1 && ((p5b) D()).d.a().f44779a) {
                this.F.g(wgh0.FAVORITES);
                this.G.C("favor_aggregator");
                if ((((p5b) D()).d instanceof fx70) && (z4bVar2 = ((p5b) D()).f26397a) != null && z4bVar2.i) {
                    i1w0Var.d(new lya(this, (byte) 4));
                    return;
                }
                vzg0Var.e("SEARCH_FIELD_STATE_KEY", Boolean.TRUE);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value7 = p7m0Var.getValue();
                    value7.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value7, p5b.a((p5b) value7, null, null, null, null, false, true, null, true, 95)));
                return;
            }
            return;
        }
        Object obj2 = null;
        Object[] objArr = 0;
        if (x4bVar instanceof w4b) {
            String str = ((w4b) x4bVar).f38535a;
            for (Object obj3 : CategoryImageHeaderTab.f) {
                if (Intrinsics.d(((CategoryImageHeaderTab) obj3).name(), str)) {
                    obj2 = obj3;
                    break;
                }
            }
            CategoryImageHeaderTab categoryImageHeaderTab = (CategoryImageHeaderTab) obj2;
            if (categoryImageHeaderTab == null) {
                return;
            }
            vzg0Var.e("CURRENT_TAB_KEY", categoryImageHeaderTab);
            N(categoryImageHeaderTab);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value6 = p7m0Var2.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value6, p5b.a((p5b) value6, null, categoryImageHeaderTab, null, null, false, false, null, false, 253)));
            return;
        }
        if (x4bVar.equals(q4b.f28089a)) {
            sac.V(jiu0.a(this), v5b.f36819a, null, this.q.b, new u5b(this, objArr == true ? 1 : 0, b), 10);
            return;
        }
        if (x4bVar instanceof o4b) {
            jx70 jx70Var = ((o4b) x4bVar).f24625a;
            if ((jx70Var instanceof fx70) && (z4bVar = ((p5b) D()).f26397a) != null && z4bVar.i) {
                M();
            } else if (jx70Var instanceof ex70) {
                String str2 = (String) vzg0Var.a("SEARCH_QUERY_KEY");
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                boolean zD = Intrinsics.d(vzg0Var.a("SEARCH_FIELD_STATE_KEY"), Boolean.TRUE);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var3.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value4, p5b.a((p5b) value4, null, null, null, null, false, zD, str3, false, 159)));
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value5 = p7m0Var4.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value5, p5b.a((p5b) value5, null, null, null, jx70Var, false, false, null, false, 247)));
            return;
        }
        if (x4bVar.equals(s4b.f31596a)) {
            vzg0Var.e("SEARCH_FIELD_STATE_KEY", Boolean.FALSE);
            M();
            return;
        }
        if (x4bVar instanceof v4b) {
            if (((p5b) D()).f) {
                String str4 = ((v4b) x4bVar).f36767a;
                vzg0Var.e("SEARCH_QUERY_KEY", str4);
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var5.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value3, p5b.a((p5b) value3, null, null, null, null, false, false, ((v4b) x4bVar).f36767a, false, 191)));
                G(new l5b(str4));
                return;
            }
            return;
        }
        if (x4bVar.equals(m4b.f21159a)) {
            vzg0Var.e("SEARCH_FIELD_STATE_KEY", Boolean.FALSE);
            M();
            return;
        }
        if (x4bVar.equals(p4b.f26345a)) {
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value2 = p7m0Var6.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var6.m(value2, p5b.a((p5b) value2, null, null, null, null, false, false, null, false, 127)));
            return;
        }
        if (!x4bVar.equals(t4b.f33311a)) {
            t9f.b();
            return;
        }
        p7m0 p7m0Var7 = ocjVar.f25029a;
        do {
            value = p7m0Var7.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var7.m(value, p5b.a((p5b) value, null, null, null, null, false, false, null, false, 127)));
        G(j5b.f15924a);
    }
}
