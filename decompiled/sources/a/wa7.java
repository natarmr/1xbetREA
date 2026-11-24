package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wa7;", "La/yx5;", "<init>", "()V", "a/kj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wa7 extends yx5 {
    public final phf0 K1;
    public final khf0 L1;
    public final s0r M1;
    public x9i N1;
    public wdk0 O1;
    public ii P1;
    public final a8z Q1;
    public final ywq R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(wa7.class, "betId", "getBetId()Ljava/lang/String;", 0), new ez40(wa7.class, "betInfoScreenModel", "getBetInfoScreenModel()Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;", 0), new j0d0(wa7.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kj5 U1 = new kj5();

    public wa7() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("BET_ID");
        this.L1 = new khf0("BET_INFO_HISTORY_SCREEN_MODEL_KEY");
        this.M1 = ltt0.o(this, va7.f37071a);
        this.Q1 = xbc.a0(this, sre0.f32672a.b(kd7.class), null, new ta7(this, (byte) 2), 14);
        this.R1 = m0(new yl3(this, (byte) 3), new xn((byte) 7));
        this.S1 = true;
    }

    public final ii G0() {
        ii iiVar = this.P1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final String H0() {
        return this.K1.n(this, V1[0]);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pa7.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pa7 pa7Var = (pa7) (ze3Var instanceof pa7 ? ze3Var : null);
            if (pa7Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String strH0 = H0();
                BetInfoScreenModel betInfoScreenModel = (BetInfoScreenModel) this.L1.n(this, V1[1]);
                i1w0VarF.getClass();
                strH0.getClass();
                cad cadVar = pa7Var.f26640a;
                ctf0 ctf0Var = pa7Var.c;
                k7u k7uVar = pa7Var.e;
                gii0 gii0Var = pa7Var.b;
                m1e m1eVar = pa7Var.i;
                tgk tgkVar = pa7Var.B;
                q7d0 q7d0Var = pa7Var.C;
                onv onvVar = pa7Var.D;
                us3 us3Var = pa7Var.F;
                duj dujVar = pa7Var.j;
                t47 t47Var = pa7Var.E;
                sjl0 sjl0Var = pa7Var.l;
                j1q0 j1q0Var = pa7Var.m;
                wyu wyuVar = pa7Var.t;
                kuy kuyVar = pa7Var.q;
                ugf0 ugf0Var = pa7Var.n;
                wsf0 wsf0Var = pa7Var.s;
                bn6 bn6Var = pa7Var.G;
                ocl oclVar = pa7Var.p;
                wsf0 wsf0Var2 = pa7Var.k;
                peg0 peg0Var = pa7Var.Q;
                au0 au0Var = pa7Var.y;
                s2m0 s2m0Var = pa7Var.N;
                wdk0 wdk0Var = pa7Var.b0;
                s64 s64Var = pa7Var.x;
                o470 o470Var = pa7Var.w;
                edo edoVar = pa7Var.r;
                b8u b8uVar = pa7Var.o;
                ix0 ix0Var = pa7Var.H;
                kt2 kt2Var = pa7Var.J;
                gst0 gst0Var = pa7Var.I;
                fsd fsdVar = pa7Var.R;
                b3c0 b3c0Var = pa7Var.S;
                h3c h3cVar = pa7Var.W;
                gr00 gr00Var = pa7Var.X;
                roi0 roi0Var = pa7Var.Y;
                qv2 qv2Var = pa7Var.Z;
                vqc vqcVar = pa7Var.a0;
                ouu ouuVar = pa7Var.M;
                sue sueVar = pa7Var.L;
                jh70 jh70Var = pa7Var.U;
                org.xplatform.toto_bet.core.navigation.a aVar = pa7Var.O;
                l7k l7kVar = pa7Var.z;
                v88 v88Var = pa7Var.K;
                s64 s64Var2 = pa7Var.A;
                wdd0 wdd0Var = pa7Var.e0;
                cmt cmtVar = pa7Var.u;
                hru hruVar = pa7Var.c0;
                ocl oclVar2 = pa7Var.d0;
                r9u r9uVar = pa7Var.v;
                fme fmeVar = pa7Var.f;
                y3v y3vVar = pa7Var.T;
                evz evzVar = pa7Var.P;
                ii iiVar = pa7Var.V;
                btt0 btt0Var = pa7Var.g;
                knf0 knf0Var = pa7Var.d;
                pru pruVar = pa7Var.h;
                sueVar.getClass();
                wdd0Var.getClass();
                ctf0Var.getClass();
                fsdVar.getClass();
                b3c0Var.getClass();
                wyuVar.getClass();
                sjl0Var.getClass();
                gst0Var.getClass();
                wdk0Var.getClass();
                tgkVar.getClass();
                q7d0Var.getClass();
                t47Var.getClass();
                us3Var.getClass();
                iiVar.getClass();
                kt2Var.getClass();
                gii0Var.getClass();
                j1q0Var.getClass();
                edoVar.getClass();
                k7uVar.getClass();
                knf0Var.getClass();
                kuyVar.getClass();
                m1eVar.getClass();
                r9uVar.getClass();
                fmeVar.getClass();
                btt0Var.getClass();
                this.N1 = (x9i) new y9i(cadVar, ugf0Var, wsf0Var, wsf0Var2, sueVar, wdd0Var, s2m0Var, evzVar, roi0Var, onvVar, ctf0Var, fsdVar, b3c0Var, l7kVar, au0Var, wyuVar, vqcVar, gr00Var, h3cVar, qv2Var, sjl0Var, gst0Var, o470Var, s64Var, aVar, wdk0Var, tgkVar, q7d0Var, t47Var, us3Var, iiVar, v88Var, kt2Var, ix0Var, ouuVar, s64Var2, gii0Var, j1q0Var, edoVar, k7uVar, oclVar, b8uVar, knf0Var, kuyVar, jh70Var, y3vVar, i1w0VarF, bn6Var, m1eVar, dujVar, peg0Var, pruVar, r9uVar, fmeVar, btt0Var, cmtVar, hruVar, oclVar2, strH0, betInfoScreenModel).g0.get();
                this.O1 = wdk0Var;
                this.P1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(pa7.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        this.R1.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        I0().x(ea7.f7453a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        I0().x(ga7.f10951a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        final byte b = 0;
        C().u0("REQUEST_CONFIRM_SALE_DIALOG_KEY", this, new k4r(this) { // from class: a.sa7
            public final /* synthetic */ wa7 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b2 = b;
                wa7 wa7Var = this.b;
                switch (b2) {
                    case 0:
                        kj5 kj5Var = wa7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            wa7Var.I0().x(ha7.f12711a);
                        }
                        break;
                    default:
                        kj5 kj5Var2 = wa7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_MENU_ITEM_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                wa7Var.I0().x(new y97(historyMenuItem));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "REQUEST_COUPON_DIALOG_KEY", new ta7(this, (byte) 7));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new ta7(this, (byte) 5));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new ta7(this, (byte) 6));
        ccq0.V(this, "REQUEST_ENABLE_PUSH_TRACKING_DIALOG_KEY", new ta7(this, (byte) 4));
        ccq0.V(this, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", new ta7(this, (byte) 8));
        ccq0.V(this, "REQUEST_AUTO_BET_CANCEL_DIALOG_KEY", new ta7(this, (byte) 0));
        final byte b2 = 1;
        ccq0.V(this, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", new ta7(this, (byte) 1));
        C().u0("REQUEST_MENU_ITEM_KEY", this, new k4r(this) { // from class: a.sa7
            public final /* synthetic */ wa7 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                wa7 wa7Var = this.b;
                switch (b3) {
                    case 0:
                        kj5 kj5Var = wa7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle2.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                            wa7Var.I0().x(ha7.f12711a);
                        }
                        break;
                    default:
                        kj5 kj5Var2 = wa7.U1;
                        str.getClass();
                        if (str.equals("REQUEST_MENU_ITEM_KEY") && bundle2.containsKey("HISTORY_MENU_ITEM_RESULT")) {
                            HistoryMenuItem historyMenuItem = (HistoryMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT") : (Parcelable) bundle2.getParcelable("HISTORY_MENU_ITEM_RESULT", HistoryMenuItem.class));
                            if (historyMenuItem != null) {
                                wa7Var.I0().x(new y97(historyMenuItem));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        vcc.g0(this, "REQUEST_KEY_SUCCESS_SALE", new Function2(this) { // from class: a.ra7
            public final /* synthetic */ wa7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        Bundle bundle2 = (Bundle) obj2;
                        kj5 kj5Var = wa7.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            this.b.I0().x(ia7.f14423a);
                        }
                        break;
                    default:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kj5 kj5Var2 = wa7.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            wa7 wa7Var = this.b;
                            k3t0 k3t0VarI0 = wa7Var.I0();
                            boolean zI = fetVar.i(wa7Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                ur6 ur6Var = new ur6(1, wa7Var, wa7.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/bet_info/presentation/model/viewmodel/BetInfoSideEffect;)V", 0, (byte) 23);
                                fetVar.o0(ur6Var);
                                objP = ur6Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(wa7Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                ua7 ua7Var = new ua7(k3t0VarI0, wa7Var, pz40VarF, null, (byte) 0);
                                fetVar.o0(ua7Var);
                                objP2 = ua7Var;
                            }
                            m0x0.t(fetVar, wa7Var, (Function2) objP2);
                            pz40 pz40VarY = ((i3t0) wa7Var.I0()).y(fetVar);
                            k3t0 k3t0VarI1 = wa7Var.I0();
                            boolean zI3 = fetVar.i(k3t0VarI1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                ur6 ur6Var2 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                                fetVar.o0(ur6Var2);
                                objP3 = ur6Var2;
                            }
                            rq8.n(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        qcc.X(this, new ta7(this, (byte) 3));
        Object objN = this.M1.n(V1[2], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(738992150, true, new Function2(this) { // from class: a.ra7
            public final /* synthetic */ wa7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        Bundle bundle2 = (Bundle) obj2;
                        kj5 kj5Var = wa7.U1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_KEY_SUCCESS_SALE")) {
                            this.b.I0().x(ia7.f14423a);
                        }
                        break;
                    default:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kj5 kj5Var2 = wa7.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            wa7 wa7Var = this.b;
                            k3t0 k3t0VarI0 = wa7Var.I0();
                            boolean zI = fetVar.i(wa7Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                ur6 ur6Var = new ur6(1, wa7Var, wa7.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/bet_info/presentation/model/viewmodel/BetInfoSideEffect;)V", 0, (byte) 23);
                                fetVar.o0(ur6Var);
                                objP = ur6Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarI0) | fetVar.i(wa7Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                ua7 ua7Var = new ua7(k3t0VarI0, wa7Var, pz40VarF, null, (byte) 0);
                                fetVar.o0(ua7Var);
                                objP2 = ua7Var;
                            }
                            m0x0.t(fetVar, wa7Var, (Function2) objP2);
                            pz40 pz40VarY = ((i3t0) wa7Var.I0()).y(fetVar);
                            k3t0 k3t0VarI1 = wa7Var.I0();
                            boolean zI3 = fetVar.i(k3t0VarI1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                ur6 ur6Var2 = new ur6(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                                fetVar.o0(ur6Var2);
                                objP3 = ur6Var2;
                            }
                            rq8.n(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.S1;
    }
}
