package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/gk7;", "La/yx5;", "La/ygt0;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gk7 extends yx5 implements ygt0 {
    public final s0r K1;
    public final khf0 L1;
    public fiu0 M1;
    public ynb N1;
    public wdk0 O1;
    public ii P1;
    public final a8z Q1;
    public final boolean R1;
    public final ywq S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(gk7.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(gk7.class, "betHistoryScreenModel", "getBetHistoryScreenModel()Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;", 0)};
    public static final kl5 U1 = new kl5();

    public gk7() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, fk7.f9676a);
        this.L1 = new khf0("BET_HISTORY_SCREEN_MODEL_KEY");
        this.Q1 = xbc.b0(this, sre0.f32672a.b(fm7.class), new bk7(this, (byte) 0));
        this.R1 = true;
        this.S1 = m0(new yl3(this, (byte) 4), new xn((byte) 7));
    }

    public final ii G0() {
        ii iiVar = this.P1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final wdk0 H0() {
        wdk0 wdk0Var = this.O1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final k3t0 I0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pj7.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pj7 pj7Var = (pj7) (ze3Var instanceof pj7 ? ze3Var : null);
            if (pj7Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                BetHistoryScreenModel betHistoryScreenModel = (BetHistoryScreenModel) this.L1.n(this, V1[1]);
                i1w0VarF.getClass();
                y3v y3vVar = pj7Var.U;
                cad cadVar = pj7Var.f27073a;
                ctf0 ctf0Var = pj7Var.e;
                gst0 gst0Var = pj7Var.f;
                gii0 gii0Var = pj7Var.b;
                peg0 peg0Var = pj7Var.d;
                t47 t47Var = pj7Var.H;
                k7u k7uVar = pj7Var.o;
                edo edoVar = pj7Var.N;
                wdd0 wdd0Var = pj7Var.B;
                j1q0 j1q0Var = pj7Var.D;
                r9u r9uVar = pj7Var.E;
                au0 au0Var = pj7Var.u;
                s64 s64Var = pj7Var.v;
                ix0 ix0Var = pj7Var.w;
                s64 s64Var2 = pj7Var.x;
                kt2 kt2Var = pj7Var.y;
                s2m0 s2m0Var = pj7Var.R;
                hru hruVar = pj7Var.I;
                o470 o470Var = pj7Var.G;
                sjl0 sjl0Var = pj7Var.m;
                q7d0 q7d0Var = pj7Var.L;
                us3 us3Var = pj7Var.K;
                b8u b8uVar = pj7Var.F;
                wsf0 wsf0Var = pj7Var.C;
                wdk0 wdk0Var = pj7Var.n;
                duj dujVar = pj7Var.s;
                fme fmeVar = pj7Var.S;
                peg0 peg0Var2 = pj7Var.i;
                iip iipVar = pj7Var.P;
                sue sueVar = pj7Var.O;
                btt0 btt0Var = pj7Var.j;
                knf0 knf0Var = pj7Var.k;
                ocl oclVar = pj7Var.r;
                ii iiVar = pj7Var.l;
                v88 v88Var = pj7Var.g;
                pru pruVar = pj7Var.h;
                ugf0 ugf0Var = pj7Var.t;
                l7k l7kVar = pj7Var.z;
                jh70 jh70Var = pj7Var.p;
                org.xplatform.toto_bet.core.navigation.a aVar = pj7Var.A;
                tgk tgkVar = pj7Var.J;
                ouu ouuVar = pj7Var.q;
                m1e m1eVar = pj7Var.Q;
                wsf0 wsf0Var2 = pj7Var.c;
                evz evzVar = pj7Var.T;
                onv onvVar = pj7Var.M;
                wdd0Var.getClass();
                sueVar.getClass();
                iipVar.getClass();
                m1eVar.getClass();
                edoVar.getClass();
                kt2Var.getClass();
                sjl0Var.getClass();
                fmeVar.getClass();
                iiVar.getClass();
                t47Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                q7d0Var.getClass();
                us3Var.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                tgkVar.getClass();
                btt0Var.getClass();
                knf0Var.getClass();
                k7uVar.getClass();
                wdk0Var.getClass();
                gii0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(fm7.class, (f7i) new db(cadVar, wsf0Var2, peg0Var, ugf0Var, sueVar, wdd0Var, wsf0Var, iipVar, evzVar, onvVar, y3vVar, betHistoryScreenModel, m1eVar, peg0Var2, au0Var, s64Var, edoVar, ix0Var, aVar, s2m0Var, kt2Var, s64Var2, sjl0Var, l7kVar, fmeVar, b8uVar, iiVar, o470Var, j1q0Var, r9uVar, hruVar, q7d0Var, us3Var, ctf0Var, gst0Var, oclVar, tgkVar, dujVar, v88Var, btt0Var, knf0Var, pruVar, jh70Var, k7uVar, i1w0VarF, ouuVar, wdk0Var, gii0Var).V));
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.N1 = ynbVarI;
                this.O1 = wdk0Var;
                this.P1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(pj7.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        I0().x(pi7.f27030a);
        this.S1.b();
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        I0().x(cj7.f4446a);
    }

    @Override // a.ygt0
    public final void e() {
        I0().x(lj7.f20137a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        I0().x(jj7.f16608a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        final byte b = 3;
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new bk7(this, (byte) 3));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new bk7(this, (byte) 4));
        final byte b2 = 0;
        C().u0("REQUEST_BET_HISTORY_MENU_KEY", this, new k4r(this) { // from class: a.dk7
            public final /* synthetic */ gk7 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                gk7 gk7Var = this.b;
                switch (b3) {
                    case 0:
                        kl5 kl5Var = gk7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI0 = gk7Var.I0();
                                string.getClass();
                                k3t0VarI0.x(new vi7(historyMenuItem, string));
                                break;
                            }
                        }
                        break;
                    default:
                        kl5 kl5Var2 = gk7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI1 = gk7Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI1.x(new ej7(string2));
                        }
                        break;
                }
            }
        });
        final byte b3 = 2;
        ccq0.V(this, "REQUEST_ENABLE_PUSH_TRACKING_DIALOG_KEY", new bk7(this, (byte) 2));
        final byte b4 = 1;
        C().u0("REQUEST_CONFIRM_SALE_DIALOG_KEY", this, new k4r(this) { // from class: a.dk7
            public final /* synthetic */ gk7 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b5 = b4;
                gk7 gk7Var = this.b;
                switch (b5) {
                    case 0:
                        kl5 kl5Var = gk7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_BET_HISTORY_MENU_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                String string = bundle2.getString("HISTORY_MENU_BET_ID_RESULT", "");
                                k3t0 k3t0VarI0 = gk7Var.I0();
                                string.getClass();
                                k3t0VarI0.x(new vi7(historyMenuItem, string));
                                break;
                            }
                        }
                        break;
                    default:
                        kl5 kl5Var2 = gk7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            k3t0 k3t0VarI1 = gk7Var.I0();
                            String string2 = bundle2.getString("BET_SALE_CONFIRM_REQUEST", "");
                            string2.getClass();
                            k3t0VarI1.x(new ej7(string2));
                        }
                        break;
                }
            }
        });
        vcc.g0(this, "REQUEST_KEY_SUCCESS_SALE", new Function2(this) { // from class: a.ek7
            public final /* synthetic */ gk7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b;
                gk7 gk7Var = this.b;
                switch (b5) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kl5 kl5Var = gk7.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            gk7 gk7Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) gk7Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = gk7Var2.I0();
                            boolean zI = fetVar.i(gk7Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ye7(1, gk7Var2, gk7.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/bet_sale/presentation/model/BetSaleSideEffect;)V", 0, (byte) 3);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(gk7Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new ua7(k3t0VarI0, gk7Var2, pz40VarF, null, (byte) 1);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, gk7Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) gk7Var2.L1.n(gk7Var2, gk7.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(1595088308);
                                n0q n0qVar = o7k0.c;
                                pl7 pl7Var = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = gk7Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ye7(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                                    fetVar.o0(objP3);
                                }
                                l7x.y(n0qVar, pl7Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(1595385350);
                                n0q n0qVar2 = o7k0.c;
                                pl7 pl7Var2 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = gk7Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ye7(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                                    fetVar.o0(objP4);
                                }
                                aem0.h(n0qVar2, pl7Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(1595698884);
                                n0q n0qVar3 = o7k0.c;
                                pl7 pl7Var3 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = gk7Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ye7(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                                    fetVar.o0(objP5);
                                }
                                r7x.e(n0qVar3, pl7Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 3) {
                                fetVar.e0(1595978132);
                                n0q n0qVar4 = o7k0.c;
                                pl7 pl7Var4 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = gk7Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ye7(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                                    fetVar.o0(objP6);
                                }
                                l7x.y(n0qVar4, pl7Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1594790925);
                                n0q n0qVar5 = o7k0.c;
                                pl7 pl7Var5 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = gk7Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ye7(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                                    fetVar.o0(objP7);
                                }
                                kkb.e(n0qVar5, pl7Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        kl5 kl5Var2 = gk7.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            gk7Var.I0().x(qi7.f28776a);
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        kl5 kl5Var3 = gk7.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI6 = gk7Var.I0();
                            string.getClass();
                            k3t0VarI6.x(new si7(string));
                        }
                        break;
                    default:
                        Bundle bundle4 = (Bundle) obj2;
                        kl5 kl5Var4 = gk7.U1;
                        if (h97.B(bundle4, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle4.getString("BUNDLE_BET_ID", "");
                            boolean z = bundle4.getBoolean("REQUEST_KEY_HIDE_COUPON", false);
                            k3t0 k3t0VarI7 = gk7Var.I0();
                            string2.getClass();
                            k3t0VarI7.x(new fj7(string2, z));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        vcc.g0(this, "REQUEST_EDIT_COUPON_DIALOG", new Function2(this) { // from class: a.ek7
            public final /* synthetic */ gk7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b4;
                gk7 gk7Var = this.b;
                switch (b5) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kl5 kl5Var = gk7.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            gk7 gk7Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) gk7Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = gk7Var2.I0();
                            boolean zI = fetVar.i(gk7Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ye7(1, gk7Var2, gk7.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/bet_sale/presentation/model/BetSaleSideEffect;)V", 0, (byte) 3);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(gk7Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new ua7(k3t0VarI0, gk7Var2, pz40VarF, null, (byte) 1);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, gk7Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) gk7Var2.L1.n(gk7Var2, gk7.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(1595088308);
                                n0q n0qVar = o7k0.c;
                                pl7 pl7Var = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = gk7Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ye7(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                                    fetVar.o0(objP3);
                                }
                                l7x.y(n0qVar, pl7Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(1595385350);
                                n0q n0qVar2 = o7k0.c;
                                pl7 pl7Var2 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = gk7Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ye7(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                                    fetVar.o0(objP4);
                                }
                                aem0.h(n0qVar2, pl7Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(1595698884);
                                n0q n0qVar3 = o7k0.c;
                                pl7 pl7Var3 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = gk7Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ye7(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                                    fetVar.o0(objP5);
                                }
                                r7x.e(n0qVar3, pl7Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 3) {
                                fetVar.e0(1595978132);
                                n0q n0qVar4 = o7k0.c;
                                pl7 pl7Var4 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = gk7Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ye7(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                                    fetVar.o0(objP6);
                                }
                                l7x.y(n0qVar4, pl7Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1594790925);
                                n0q n0qVar5 = o7k0.c;
                                pl7 pl7Var5 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = gk7Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ye7(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                                    fetVar.o0(objP7);
                                }
                                kkb.e(n0qVar5, pl7Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        kl5 kl5Var2 = gk7.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            gk7Var.I0().x(qi7.f28776a);
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        kl5 kl5Var3 = gk7.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI6 = gk7Var.I0();
                            string.getClass();
                            k3t0VarI6.x(new si7(string));
                        }
                        break;
                    default:
                        Bundle bundle4 = (Bundle) obj2;
                        kl5 kl5Var4 = gk7.U1;
                        if (h97.B(bundle4, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle4.getString("BUNDLE_BET_ID", "");
                            boolean z = bundle4.getBoolean("REQUEST_KEY_HIDE_COUPON", false);
                            k3t0 k3t0VarI7 = gk7Var.I0();
                            string2.getClass();
                            k3t0VarI7.x(new fj7(string2, z));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        vcc.g0(this, "REQUEST_BET_UPDATE_BY_ID", new Function2(this) { // from class: a.ek7
            public final /* synthetic */ gk7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b3;
                gk7 gk7Var = this.b;
                switch (b5) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kl5 kl5Var = gk7.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            gk7 gk7Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) gk7Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = gk7Var2.I0();
                            boolean zI = fetVar.i(gk7Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ye7(1, gk7Var2, gk7.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/bet_sale/presentation/model/BetSaleSideEffect;)V", 0, (byte) 3);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(gk7Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new ua7(k3t0VarI0, gk7Var2, pz40VarF, null, (byte) 1);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, gk7Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) gk7Var2.L1.n(gk7Var2, gk7.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(1595088308);
                                n0q n0qVar = o7k0.c;
                                pl7 pl7Var = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = gk7Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ye7(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                                    fetVar.o0(objP3);
                                }
                                l7x.y(n0qVar, pl7Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(1595385350);
                                n0q n0qVar2 = o7k0.c;
                                pl7 pl7Var2 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = gk7Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ye7(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                                    fetVar.o0(objP4);
                                }
                                aem0.h(n0qVar2, pl7Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(1595698884);
                                n0q n0qVar3 = o7k0.c;
                                pl7 pl7Var3 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = gk7Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ye7(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                                    fetVar.o0(objP5);
                                }
                                r7x.e(n0qVar3, pl7Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 3) {
                                fetVar.e0(1595978132);
                                n0q n0qVar4 = o7k0.c;
                                pl7 pl7Var4 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = gk7Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ye7(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                                    fetVar.o0(objP6);
                                }
                                l7x.y(n0qVar4, pl7Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1594790925);
                                n0q n0qVar5 = o7k0.c;
                                pl7 pl7Var5 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = gk7Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ye7(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                                    fetVar.o0(objP7);
                                }
                                kkb.e(n0qVar5, pl7Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        kl5 kl5Var2 = gk7.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            gk7Var.I0().x(qi7.f28776a);
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        kl5 kl5Var3 = gk7.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI6 = gk7Var.I0();
                            string.getClass();
                            k3t0VarI6.x(new si7(string));
                        }
                        break;
                    default:
                        Bundle bundle4 = (Bundle) obj2;
                        kl5 kl5Var4 = gk7.U1;
                        if (h97.B(bundle4, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle4.getString("BUNDLE_BET_ID", "");
                            boolean z = bundle4.getBoolean("REQUEST_KEY_HIDE_COUPON", false);
                            k3t0 k3t0VarI7 = gk7Var.I0();
                            string2.getClass();
                            k3t0VarI7.x(new fj7(string2, z));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        qcc.X(this, new bk7(this, (byte) 1));
        Object objN = this.K1.n(V1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(675489789, true, new Function2(this) { // from class: a.ek7
            public final /* synthetic */ gk7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b2;
                gk7 gk7Var = this.b;
                switch (b5) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kl5 kl5Var = gk7.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            gk7 gk7Var2 = this.b;
                            pz40 pz40VarY = ((i3t0) gk7Var2.I0()).y(fetVar);
                            k3t0 k3t0VarI0 = gk7Var2.I0();
                            boolean zI = fetVar.i(gk7Var2);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new ye7(1, gk7Var2, gk7.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/bet_sale/presentation/model/BetSaleSideEffect;)V", 0, (byte) 3);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(gk7Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                objP2 = new ua7(k3t0VarI0, gk7Var2, pz40VarF, null, (byte) 1);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, gk7Var2, (Function2) objP2);
                            int iOrdinal = ((BetHistoryScreenModel) gk7Var2.L1.n(gk7Var2, gk7.V1[1])).getC().ordinal();
                            if (iOrdinal == 0) {
                                fetVar.e0(1595088308);
                                n0q n0qVar = o7k0.c;
                                pl7 pl7Var = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI1 = gk7Var2.I0();
                                boolean zI3 = fetVar.i(k3t0VarI1);
                                Object objP3 = fetVar.P();
                                if (zI3 || objP3 == cl5Var) {
                                    objP3 = new ye7(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                                    fetVar.o0(objP3);
                                }
                                l7x.y(n0qVar, pl7Var, (Function1) ((jhy) objP3), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 1) {
                                fetVar.e0(1595385350);
                                n0q n0qVar2 = o7k0.c;
                                pl7 pl7Var2 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI2 = gk7Var2.I0();
                                boolean zI4 = fetVar.i(k3t0VarI2);
                                Object objP4 = fetVar.P();
                                if (zI4 || objP4 == cl5Var) {
                                    objP4 = new ye7(1, k3t0VarI2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                                    fetVar.o0(objP4);
                                }
                                aem0.h(n0qVar2, pl7Var2, (Function1) ((jhy) objP4), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal == 2) {
                                fetVar.e0(1595698884);
                                n0q n0qVar3 = o7k0.c;
                                pl7 pl7Var3 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI3 = gk7Var2.I0();
                                boolean zI5 = fetVar.i(k3t0VarI3);
                                Object objP5 = fetVar.P();
                                if (zI5 || objP5 == cl5Var) {
                                    objP5 = new ye7(1, k3t0VarI3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                                    fetVar.o0(objP5);
                                }
                                r7x.e(n0qVar3, pl7Var3, (Function1) ((jhy) objP5), fetVar, 6);
                                fetVar.r(false);
                            } else if (iOrdinal != 3) {
                                fetVar.e0(1595978132);
                                n0q n0qVar4 = o7k0.c;
                                pl7 pl7Var4 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI4 = gk7Var2.I0();
                                boolean zI6 = fetVar.i(k3t0VarI4);
                                Object objP6 = fetVar.P();
                                if (zI6 || objP6 == cl5Var) {
                                    objP6 = new ye7(1, k3t0VarI4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                                    fetVar.o0(objP6);
                                }
                                l7x.y(n0qVar4, pl7Var4, (Function1) ((jhy) objP6), fetVar, 6);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1594790925);
                                n0q n0qVar5 = o7k0.c;
                                pl7 pl7Var5 = (pl7) pz40VarY.getValue();
                                k3t0 k3t0VarI5 = gk7Var2.I0();
                                boolean zI7 = fetVar.i(k3t0VarI5);
                                Object objP7 = fetVar.P();
                                if (zI7 || objP7 == cl5Var) {
                                    objP7 = new ye7(1, k3t0VarI5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                                    fetVar.o0(objP7);
                                }
                                kkb.e(n0qVar5, pl7Var5, (Function1) ((jhy) objP7), fetVar, 6);
                                fetVar.r(false);
                            }
                        } else {
                            fetVar.X();
                        }
                        break;
                    case 1:
                        Bundle bundle2 = (Bundle) obj2;
                        kl5 kl5Var2 = gk7.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_EDIT_COUPON_DIALOG")) {
                            gk7Var.I0().x(qi7.f28776a);
                        }
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) obj2;
                        kl5 kl5Var3 = gk7.U1;
                        if (h97.B(bundle3, (String) obj, "REQUEST_BET_UPDATE_BY_ID")) {
                            String string = bundle3.getString("BUNDLE_BET_ID", "");
                            k3t0 k3t0VarI6 = gk7Var.I0();
                            string.getClass();
                            k3t0VarI6.x(new si7(string));
                        }
                        break;
                    default:
                        Bundle bundle4 = (Bundle) obj2;
                        kl5 kl5Var4 = gk7.U1;
                        if (h97.B(bundle4, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            String string2 = bundle4.getString("BUNDLE_BET_ID", "");
                            boolean z = bundle4.getBoolean("REQUEST_KEY_HIDE_COUPON", false);
                            k3t0 k3t0VarI7 = gk7Var.I0();
                            string2.getClass();
                            k3t0VarI7.x(new fj7(string2, z));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }
}
