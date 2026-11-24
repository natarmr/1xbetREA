package a;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dw10;", "La/yx5;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dw10 extends yx5 {
    public final boolean K1;
    public final hnm0 L1;
    public final s0r M1;
    public final a8z N1;
    public final kiu0 O1;
    public final yzn0 P1;
    public y2c0 Q1;
    public n2c0 R1;
    public final yzn0 S1;
    public final cgx0 U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(dw10.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentMainMenuContainerBinding;", 0), new ez40(dw10.class, "menuSectionStart", "getMenuSectionStart()Lorg/xplatform/main_menu/api/domain/models/MenuSectionType;", 0), new ez40(dw10.class, "showChangeAccount", "getShowChangeAccount()Z", 0), new ez40(dw10.class, "openTgBot", "getOpenTgBot()Z", 0)};
    public static final uuz V1 = new uuz();

    public dw10() {
        super(R.layout.fragment_main_menu_container);
        this.K1 = true;
        this.L1 = hnm0.f13359a;
        this.M1 = ltt0.o(this, bw10.f3303a);
        zv10 zv10Var = new zv10(this, (byte) 4);
        wez wezVar = wez.b;
        this.N1 = maz.a(wezVar, zv10Var);
        pv10 pv10Var = new pv10(new zv10(this, (byte) 5), (byte) 1);
        a8z a8zVarA = maz.a(wezVar, new pv10(new pv10(this, (byte) 2), (byte) 3));
        this.O1 = agc.G(this, sre0.f32672a.b(cx10.class), new j210(a8zVarA, (byte) 22), new j210(a8zVarA, (byte) 23), pv10Var);
        this.P1 = new yzn0("MENU_SECTION_TAB_KEY");
        this.S1 = new yzn0("MENU_SHOW_CHANGE_ACCOUNT");
        this.U1 = new cgx0("open_bot");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        DsAccountSelection.v(G0().b, new zv10(this, (byte) 6), 1);
        DsAccountSelection dsAccountSelection = G0().b;
        ymx ymxVar = ymx.INTERVAL_1000;
        dsAccountSelection.y(ymxVar, true, new zv10(this, (byte) 7));
        G0().b.A(ymxVar, new zv10(this, (byte) 8));
        final byte b2 = 0;
        G0().c.getAuthorizationButton().setOnClickListener(new View.OnClickListener(this) { // from class: a.aw10
            public final /* synthetic */ dw10 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                dw10 dw10Var = this.b;
                switch (b3) {
                    case 0:
                        uuz uuzVar = dw10.V1;
                        dw10Var.C().t0(i120.V(new Pair("LOGIN_CLICK_REQUEST_KEY", Boolean.TRUE)), "LOGIN_CLICK_REQUEST_KEY");
                        cx10 cx10VarI0 = dw10Var.I0();
                        sac.V(jiu0.a(cx10VarI0), new pf10(1, cx10VarI0, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, cx10VarI0.f.c, new xw10(cx10VarI0, null, (byte) 2), 10);
                        break;
                    default:
                        uuz uuzVar2 = dw10.V1;
                        dw10Var.C().t0(i120.V(new Pair("REG_CLICK_REQUEST_KEY", Boolean.TRUE)), "REG_CLICK_REQUEST_KEY");
                        cx10 cx10VarI1 = dw10Var.I0();
                        sac.V(jiu0.a(cx10VarI1), new pf10(1, cx10VarI1, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), new rx00(cx10VarI1, (byte) 14), cx10VarI1.f.c, new xw10(cx10VarI1, null, (byte) 3), 8);
                        break;
                }
            }
        });
        G0().c.getRegistrationButton().setOnClickListener(new View.OnClickListener(this) { // from class: a.aw10
            public final /* synthetic */ dw10 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                dw10 dw10Var = this.b;
                switch (b3) {
                    case 0:
                        uuz uuzVar = dw10.V1;
                        dw10Var.C().t0(i120.V(new Pair("LOGIN_CLICK_REQUEST_KEY", Boolean.TRUE)), "LOGIN_CLICK_REQUEST_KEY");
                        cx10 cx10VarI0 = dw10Var.I0();
                        sac.V(jiu0.a(cx10VarI0), new pf10(1, cx10VarI0, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, cx10VarI0.f.c, new xw10(cx10VarI0, null, (byte) 2), 10);
                        break;
                    default:
                        uuz uuzVar2 = dw10.V1;
                        dw10Var.C().t0(i120.V(new Pair("REG_CLICK_REQUEST_KEY", Boolean.TRUE)), "REG_CLICK_REQUEST_KEY");
                        cx10 cx10VarI1 = dw10Var.I0();
                        sac.V(jiu0.a(cx10VarI1), new pf10(1, cx10VarI1, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), new rx00(cx10VarI1, (byte) 14), cx10VarI1.f.c, new xw10(cx10VarI1, null, (byte) 3), 8);
                        break;
                }
            }
        });
        G0().g.b.setVisibility(8);
        DsNavigationBar dsNavigationBar = G0().g;
        ybg0 ybg0Var = ybg0.b;
        dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("settings", ybg0Var, R.drawable.ic_glyph_settings_inactive, new zv10(this, (byte) 9), 2032)));
        dyb.O(G0().d, new km00(this, (byte) 14));
        DsNavigationBar dsNavigationBar2 = G0().d;
        r0m r0mVar = r0m.l;
        dsNavigationBar2.setNavigationBarButtons(q3d.e(new hc50(CrashHianalyticsData.MESSAGE, ybg0Var, R.drawable.ic_glyph_message, new zv10(this, b2), 1776), new hc50("settings", ybg0Var, R.drawable.ic_glyph_settings_inactive, new zv10(this, b), 2032)));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        int i;
        int iOrdinal = I0().y.b().ordinal();
        if (iOrdinal == 0) {
            i = R.style.Widget_DSAccountSelection_Primary;
        } else if (iOrdinal == 1) {
            i = R.style.Widget_DSAccountSelection_Secondary;
        } else if (iOrdinal == 2) {
            i = R.style.Widget_DSAccountSelection_Tertiary;
        } else if (iOrdinal == 3) {
            i = R.style.Widget_DSAccountSelection_Quaternary;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            i = R.style.Widget_DSAccountSelection_Fivefold;
        }
        byte b = 12;
        eu4 eu4Var = new eu4(Integer.valueOf(i), b);
        yje yjeVar = null;
        bh0 bh0Var = new bh0(this, yjeVar, (byte) 13);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cm10(eu4Var, clzVarW, bh0Var, (yje) null), 3);
        cx10 cx10VarI0 = I0();
        dnq dnqVar = new dnq(new s6n0(cx10VarI0.I, new uw10(cx10VarI0, yjeVar, (byte) 0)), new gbv(cx10VarI0, yjeVar, (byte) 6), (byte) 0);
        int i2 = 4;
        int i3 = 2;
        Class<dw10> cls = dw10.class;
        dm10 dm10Var = new dm10(i3, this, cls, "handleUiState", "handleUiState(Lorg/xplatform/main_menu/impl/presentation/container/MainMenuContainerViewModel$UiState;)V", i2, (byte) 14);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cm10(dnqVar, clzVarW2, dm10Var, (yje) null), 3);
        ol60 ol60Var = I0().G;
        dm10 dm10Var2 = new dm10(i3, this, cls, "handleUiAction", "handleUiAction(Lorg/xplatform/main_menu/impl/presentation/container/MainMenuContainerViewModel$UiAction;)V", i2, (byte) 15);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new cm10((gmq) ol60Var, clzVarW3, dm10Var2, (yje) null, (char) 0), 3);
        p7m0 p7m0Var = I0().H;
        dm10 dm10Var3 = new dm10(i3, this, cls, "handleSessionTimerState", "handleSessionTimerState(Ljava/lang/String;)V", i2, (byte) 16);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new cm10(p7m0Var, clzVarW4, dm10Var3, (yje) null, 0), 3);
        eu4 eu4Var2 = new eu4(I0().F.g.f, b);
        lkz lkzVar2 = lkz.f20223a;
        dm10 dm10Var4 = new dm10(i3, this, cls, "handleMenuStyleTypeState", "handleMenuStyleTypeState(Lorg/xplatform/remoteconfig/domain/models/MainMenuStyleConfigType;)V", i2, (byte) 17);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new cm10(eu4Var2, clzVarW5, dm10Var4, (yje) null), 3);
    }

    public final j1r G0() {
        Object objN = this.M1.n(W1[0], this);
        objN.getClass();
        return (j1r) objN;
    }

    public final vki H0() {
        return (vki) this.N1.getValue();
    }

    public final cx10 I0() {
        return (cx10) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        final byte b = 0;
        C().u0("SELECT_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.yv10
            public final /* synthetic */ dw10 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b2 = b;
                dw10 dw10Var = this.b;
                switch (b2) {
                    case 0:
                        uuz uuzVar = dw10.V1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                if (!(serializable3 instanceof ql5)) {
                                    serializable3 = null;
                                }
                                serializable = (ql5) serializable3;
                            }
                            ql5 ql5Var = (ql5) serializable;
                            cx10 cx10VarI0 = dw10Var.I0();
                            if (ql5Var != null) {
                                sac.V(jiu0.a(cx10VarI0), new pf10(1, cx10VarI0, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, cx10VarI0.f.b, new tw10(cx10VarI0, ql5Var, null, (byte) 1), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        uuz uuzVar2 = dw10.V1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                if (!(serializable4 instanceof ql5)) {
                                    serializable4 = null;
                                }
                                serializable2 = (ql5) serializable4;
                            }
                            ql5 ql5Var2 = (ql5) serializable2;
                            cx10 cx10VarI1 = dw10Var.I0();
                            if (ql5Var2 != null) {
                                sac.V(jiu0.a(cx10VarI1), sw10.f32899a, null, null, new tw10(cx10VarI1, ql5Var2, null, (byte) 0), 14);
                            }
                            ((vlk) dw10Var.I0().s.b).f37628a.e("changeBalance", z);
                        } else {
                            cx10 cx10VarI2 = dw10Var.I0();
                            sac.V(jiu0.a(cx10VarI2), new pf10(1, cx10VarI2, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, cx10VarI2.f.b, new xw10(cx10VarI2, null, (byte) 1), 10);
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        C().u0("CHANGE_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.yv10
            public final /* synthetic */ dw10 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b2;
                dw10 dw10Var = this.b;
                switch (b3) {
                    case 0:
                        uuz uuzVar = dw10.V1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                if (!(serializable3 instanceof ql5)) {
                                    serializable3 = null;
                                }
                                serializable = (ql5) serializable3;
                            }
                            ql5 ql5Var = (ql5) serializable;
                            cx10 cx10VarI0 = dw10Var.I0();
                            if (ql5Var != null) {
                                sac.V(jiu0.a(cx10VarI0), new pf10(1, cx10VarI0, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, cx10VarI0.f.b, new tw10(cx10VarI0, ql5Var, null, (byte) 1), 10);
                                break;
                            }
                        }
                        break;
                    default:
                        uuz uuzVar2 = dw10.V1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                if (!(serializable4 instanceof ql5)) {
                                    serializable4 = null;
                                }
                                serializable2 = (ql5) serializable4;
                            }
                            ql5 ql5Var2 = (ql5) serializable2;
                            cx10 cx10VarI1 = dw10Var.I0();
                            if (ql5Var2 != null) {
                                sac.V(jiu0.a(cx10VarI1), sw10.f32899a, null, null, new tw10(cx10VarI1, ql5Var2, null, (byte) 0), 14);
                            }
                            ((vlk) dw10Var.I0().s.b).f37628a.e("changeBalance", z);
                        } else {
                            cx10 cx10VarI2 = dw10Var.I0();
                            sac.V(jiu0.a(cx10VarI2), new pf10(1, cx10VarI2, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, cx10VarI2.f.b, new xw10(cx10VarI2, null, (byte) 1), 10);
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY", new o0t(0, I0(), cx10.class, "onPassIdentificationClicked", "onPassIdentificationClicked()V", 0, (byte) 18));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().d.d.c();
        G0().d.b.a();
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        Object value;
        super.e0();
        cx10 cx10VarI0 = I0();
        mne mneVar = cx10VarI0.f;
        yje yjeVar = null;
        if (cx10VarI0.J) {
            byte b = 4;
            sac.T(new fnq(new ewt(vtb.N(((esh0) cx10VarI0.A.f39557a.b).c), cx10VarI0, (byte) 22), new fw10(cx10VarI0, yjeVar, b), b), d5c.S(jiu0.a(cx10VarI0), mneVar.f22085a), new dm10(2, cx10VarI0, cx10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 22));
        } else {
            p7m0 p7m0Var = cx10VarI0.I;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, rw10.a((rw10) value, null, null, false, false, false, false, false, null, null, null, null, null, null, 32511)));
        }
        if (cx10VarI0.E.p == lxw.h) {
            sac.V(jiu0.a(cx10VarI0), new km00(cx10VarI0, (byte) 15), null, mneVar.b, new xw10(cx10VarI0, yjeVar, (byte) 5), 10);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }
}
