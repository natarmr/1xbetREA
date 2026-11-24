package a;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"La/v51;", "La/yx5;", "La/jhg0;", "La/cg60;", "La/ia50;", "La/e1j;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v51 extends yx5 implements jhg0, cg60, ia50, e1j {
    public final h9o0 K1;
    public o7i L1;
    public fiu0 M1;
    public o91 N1;
    public ehf0 O1;
    public ii P1;
    public oeg0 Q1;
    public final yzn0 R1;
    public final khf0 S1;
    public final n0o0 U1;
    public final n0o0 V1;
    public final kiu0 W1;
    public final kiu0 X1;
    public final s0r Y1;
    public q5j Z1;
    public static final /* synthetic */ iiy[] b2 = {new ez40(v51.class, "aggregatorTabToOpen", "getAggregatorTabToOpen()Lorg/xplatform/aggregator/api/navigation/AggregatorTab;", 0), new ez40(v51.class, "aggregatorScreenToOpen", "getAggregatorScreenToOpen()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;", 0), new j0d0(v51.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentMainAggregatorBinding;", 0)};
    public static final qek0 a2 = new qek0();

    public v51() {
        super(R.layout.fragment_main_aggregator);
        this.K1 = h9o0.f12688a;
        this.R1 = new yzn0("OPEN_AGGREGATOR_TAB");
        this.S1 = new khf0("OPEN_AGGREGATOR_SCREEN_ITEM");
        this.U1 = maz.b(new p51(this, (byte) 1));
        this.V1 = maz.b(new p51(this, (byte) 2));
        p51 p51Var = new p51(this, (byte) 3);
        s51 s51Var = new s51(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new f80(s51Var, (byte) 6));
        tre0 tre0Var = sre0.f32672a;
        this.W1 = agc.G(this, tre0Var.b(yb0.class), new k8(a8zVarA, (byte) 28), new k8(a8zVarA, (byte) 29), p51Var);
        p51 p51Var2 = new p51(this, (byte) 4);
        a8z a8zVarA2 = maz.a(wezVar, new f80(new s51(this, (byte) 1), (byte) 7));
        this.X1 = agc.G(this, tre0Var.b(b61.class), new t51(a8zVarA2, (byte) 0), new t51(a8zVarA2, (byte) 1), p51Var2);
        this.Y1 = ltt0.o(this, u51.f35073a);
    }

    @Override // a.yx5
    public final void C0() {
        q7i q7iVar = (q7i) this.V1.getValue();
        this.L1 = (o7i) q7iVar.e0.get();
        this.M1 = q7iVar.c();
        this.N1 = q7iVar.Y;
        this.O1 = new ehf0(q7iVar.Z, new gle0(), new q5j(), q7iVar.r);
        this.P1 = q7iVar.a0;
        this.Q1 = q7iVar.d;
        this.Z1 = new q5j();
    }

    public final i1r G0() {
        Object objN = this.Y1.n(b2[2], this);
        objN.getClass();
        return (i1r) objN;
    }

    public final b61 H0() {
        return (b61) this.X1.getValue();
    }

    public final void I0(lr1 lr1Var, boolean z) {
        hs0 hs0Var;
        yz1 yz1Var;
        ehf0 ehf0Var = this.O1;
        if (ehf0Var == null) {
            Intrinsics.h("aggregatorScreenUtils");
            throw null;
        }
        tm1 tm1Var = lr1Var.b;
        boolean z2 = true;
        FragmentScreen fragmentScreenW = ehf0Var.w(tm1Var, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511), true);
        m1r m1rVarS = C().S();
        m1rVarS.getClass();
        Fragment fragmentA = fragmentScreenW.a(m1rVarS);
        Class<?> cls = fragmentA != null ? fragmentA.getClass() : null;
        b61 b61VarH0 = H0();
        ix0 ix0Var = b61VarH0.k;
        hs60 hs60Var = b61VarH0.j;
        if (z) {
            if (lr1Var instanceof gr1) {
                yz1Var = yz1.FAVORITES;
            } else if (lr1Var instanceof hr1) {
                yz1Var = yz1.MY_VIRTUAL;
            } else {
                yz1Var = lr1Var instanceof fr1 ? yz1.CATEGORIES : null;
            }
            if (yz1Var != null) {
                String str = yz1Var.f43494a;
                hs60Var.getClass();
                i8i.D("option", str, hs60Var.f13566a, "footer_menu_virtual_call");
                ix0Var.getClass();
                b1j.v(str, ix0Var.f15516a, 11078L);
            }
        } else {
            boolean z3 = tm1Var instanceof jm1;
            if (z3) {
                i8i.D("promocode_page_type", "my_aggregator", b61VarH0.h.f1961a, "promocode_page_opened");
                b1j.v("my_aggregator", b61VarH0.i.f15516a, 3084L);
            }
            kt2 kt2Var = hs60Var.f13566a;
            boolean z4 = tm1Var instanceof am1;
            if (z4) {
                i8i.D("option", "category", kt2Var, "footer_menu_aggregator_call");
            } else if (tm1Var instanceof cm1) {
                i8i.D("option", "favor", kt2Var, "footer_menu_aggregator_call");
            } else if (tm1Var instanceof fm1) {
                i8i.D("option", "my_aggregator", kt2Var, "footer_menu_aggregator_call");
            } else if (z3) {
                i8i.D("option", "promo", kt2Var, "footer_menu_aggregator_call");
            } else if (tm1Var instanceof km1) {
                i8i.D("option", "providers", kt2Var, "footer_menu_aggregator_call");
            }
            if (z4) {
                hs0Var = hs0.CATEGORY;
            } else if (tm1Var instanceof cm1) {
                hs0Var = hs0.FAVOR;
            } else if (tm1Var instanceof fm1) {
                hs0Var = hs0.MY_AGGREGATOR;
            } else if (z3) {
                hs0Var = hs0.PROMO;
            } else {
                hs0Var = tm1Var instanceof km1 ? hs0.PROVIDERS : null;
            }
            if (hs0Var != null) {
                ix0Var.getClass();
                ix0Var.f15516a.a(cui0.b(new j1p(hs0Var.f13556a, (byte) 0)), 3067L);
            }
        }
        b61 b61VarH1 = H0();
        if (C().P() <= 1) {
            Fragment fragmentI = C().I(R.id.fragmentContainer);
            if (Intrinsics.d(fragmentI != null ? fragmentI.getClass() : null, cls)) {
                z2 = false;
            }
        }
        b61.x(b61VarH1, lr1Var, z2, null, 28);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        H0();
        e9s0.f7438a.clear();
        uo0.f35987a.clear();
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        C().g("DAILY_TASKS_SWITCH_TAB_REQUEST");
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        o91 o91Var = this.N1;
        if (o91Var == null) {
            Intrinsics.h("aggregatorNavigationHolder");
            throw null;
        }
        o91Var.f24857a.f7902a.f14021a.b = null;
        oeg0 oeg0Var = this.Q1;
        if (oeg0Var == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        oeg0Var.f25121a.remove(ehg0.f7808a);
        H0().u.v();
        b61 b61VarH0 = H0();
        s91 s91Var = b61VarH0.f;
        gx3 gx3Var = s91Var.c;
        vzg0 vzg0Var = b61VarH0.c;
        vzg0Var.e("NAVIGATION_MAP_ITEM_KEY", new HashMap(gx3Var));
        vzg0Var.e("CURRENT_TAB_KEY", s91Var.e.getValue());
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        oeg0 oeg0Var = this.Q1;
        if (oeg0Var == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        oeg0Var.a(ehg0.f7808a, getRouter());
        ((yb0) this.W1.getValue()).w();
        H0().u.x();
        o91 o91Var = this.N1;
        if (o91Var != null) {
            o91Var.f24857a.f7902a.f14021a.q((rs3) this.U1.getValue());
        } else {
            Intrinsics.h("aggregatorNavigationHolder");
            throw null;
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        b61 b61VarH0 = H0();
        c4m0 c4m0Var = b61VarH0.B;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            b61VarH0.B = sac.T(new fnq(i120.W(new h2c(b61VarH0.v.f2242a, (byte) 17)), new w51(b61VarH0, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(b61VarH0), b61VarH0.o.c), foe.h);
        }
    }

    @Override // a.jhg0
    public final i1w0 getRouter() {
        o91 o91Var = this.N1;
        if (o91Var != null) {
            return (rl1) o91Var.f24857a.f7902a;
        }
        Intrinsics.h("aggregatorNavigationHolder");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        v3c.N(H0().B);
        this.j1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        gx3 gx3Var;
        view.getClass();
        super.i0(view, bundle);
        final byte b = 1;
        bdx.O(n0().k(), K(), new o51(this, b));
        p7m0 p7m0Var = H0().C;
        String str = 0;
        str = 0;
        pa paVar = new pa((Object) this, (yje) str, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kz(p7m0Var, clzVarW, paVar, (yje) null), 3);
        p7m0 p7m0Var2 = H0().A;
        final byte b3 = 0;
        r51 r51Var = new r51(this, str, b3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new kz(p7m0Var2, clzVarW2, r51Var, (yje) null), 3);
        vae0 vae0VarM = vtb.M(H0().f.d);
        r51 r51Var2 = new r51(this, str, b);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new kz(vae0VarM, clzVarW3, r51Var2, (yje) null), 3);
        ol60 ol60Var = H0().z;
        r51 r51Var3 = new r51(this, str, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new kz((gmq) ol60Var, clzVarW4, r51Var3, (yje) null, (byte) 0), 3);
        qoj0 qoj0Var = H0().u.y;
        r51 r51Var4 = new r51(this, str, (byte) 3);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new kz((gmq) qoj0Var, clzVarW5, r51Var4, (yje) null, (char) 0), 3);
        ol60 ol60Var2 = ((yb0) this.W1.getValue()).g;
        r51 r51Var5 = new r51(this, str, (byte) 4);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new kz(ol60Var2, clzVarW6, r51Var5, (yje) null, 0), 3);
        b61 b61VarH0 = H0();
        boolean z = C().P() > 1;
        vzg0 vzg0Var = b61VarH0.c;
        if (((LinkedHashMap) vzg0Var.b.f38604a).containsKey("NAVIGATION_MAP_ITEM_KEY")) {
            Object obj = (lr1) vzg0Var.a("CURRENT_TAB_KEY");
            if (obj == null) {
                obj = ir1.c;
            }
            HashMap map = (HashMap) vzg0Var.a("NAVIGATION_MAP_ITEM_KEY");
            if (map == null) {
                gx3Var = new gx3(5);
            } else {
                gx3 gx3Var2 = new gx3(5);
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Boolean bool = (Boolean) entry.getValue();
                    bool.getClass();
                    gx3Var2.put(str2, bool);
                }
                gx3Var = gx3Var2;
            }
            s91 s91Var = b61VarH0.f;
            s91Var.getClass();
            obj.getClass();
            gx3 gx3Var3 = s91Var.c;
            gx3Var3.clear();
            gx3Var3.putAll(gx3Var);
            s91Var.e.o(null, obj);
            boolean z2 = b61VarH0.y;
            if (z2) {
                if (obj instanceof gr1) {
                    str = "FAVORITES_TAB_TAG";
                } else if (obj instanceof hr1) {
                    str = "MY_VIRTUAL_TAB_TAG";
                } else if (obj instanceof fr1) {
                    str = "AGGREGATOR_CATEGORIES_TAB_TAG";
                }
            } else if (obj instanceof jr1) {
                str = "PROMO_TAB_TAG";
            } else if (obj instanceof gr1) {
                str = "FAVORITES_AGGREGATOR_TAB_TAG";
            } else if (obj instanceof hr1) {
                str = "MY_AGGREGATOR_TAB_TAG";
            } else if ((obj instanceof kr1) || (obj instanceof er1)) {
                str = "PROVIDERS_AGGREGATOR_TAB_TAG";
            } else if (obj instanceof fr1) {
                str = "AGGREGATOR_CATEGORIES_TAB_TAG";
            }
            if (str != 0) {
                b61VarH0.z.f(new axf0(str, z2));
            }
        } else {
            b61.x(b61VarH0, b61VarH0.d, z, b61VarH0.e, 24);
        }
        ccq0.U((yc3) n0(), new p51(this, b3));
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new k4r(this) { // from class: a.q51
            public final /* synthetic */ v51 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str3) {
                Object serializable;
                byte b4 = b;
                v51 v51Var = this.b;
                switch (b4) {
                    case 0:
                        qek0 qek0Var = v51.a2;
                        str3.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle2.getSerializable("DAILY_TASKS_SWITCH_TAB", lr1.class);
                        } else {
                            Object serializable2 = bundle2.getSerializable("DAILY_TASKS_SWITCH_TAB");
                            if (!(serializable2 instanceof lr1)) {
                                serializable2 = null;
                            }
                            serializable = (lr1) serializable2;
                        }
                        lr1 lr1Var = (lr1) serializable;
                        if (lr1Var != null) {
                            b61.x(v51Var.H0(), lr1Var, v51Var.C().P() > 1, null, 4);
                            break;
                        }
                        break;
                    default:
                        qek0 qek0Var2 = v51.a2;
                        str3.getClass();
                        v51Var.H0().y();
                        break;
                }
            }
        });
        C().u0("DAILY_TASKS_SWITCH_TAB_REQUEST", this, new k4r(this) { // from class: a.q51
            public final /* synthetic */ v51 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str3) {
                Object serializable;
                byte b4 = b3;
                v51 v51Var = this.b;
                switch (b4) {
                    case 0:
                        qek0 qek0Var = v51.a2;
                        str3.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle2.getSerializable("DAILY_TASKS_SWITCH_TAB", lr1.class);
                        } else {
                            Object serializable2 = bundle2.getSerializable("DAILY_TASKS_SWITCH_TAB");
                            if (!(serializable2 instanceof lr1)) {
                                serializable2 = null;
                            }
                            serializable = (lr1) serializable2;
                        }
                        lr1 lr1Var = (lr1) serializable;
                        if (lr1Var != null) {
                            b61.x(v51Var.H0(), lr1Var, v51Var.C().P() > 1, null, 4);
                            break;
                        }
                        break;
                    default:
                        qek0 qek0Var2 = v51.a2;
                        str3.getClass();
                        v51Var.H0().y();
                        break;
                }
            }
        });
    }

    @Override // a.cg60
    public final boolean j() {
        H0().w(C().P() <= 1);
        return false;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
