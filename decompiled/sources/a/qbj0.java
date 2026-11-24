package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qbj0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qbj0 extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public rqj0 M1;
    public ii N1;
    public ux00 O1;
    public nwd P1;
    public gl5 Q1;
    public wdk0 R1;
    public zav S1;
    public tti U1;
    public qgd V1;
    public ynb W1;
    public xi70 X1;
    public final a8z Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(qbj0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final lme0 Z1 = new lme0((byte) 20);

    public qbj0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, pbj0.f26711a);
        this.L1 = maz.a(wez.b, new hwi0((byte) 6));
        this.Y1 = xbc.a0(this, sre0.f32672a.b(odj0.class), null, new mbj0(this, (byte) 4), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        ccq0.V(this, "REQUEST_OPEN_SITE_DIALOG_KEY", new mbj0(this, (byte) 0));
        final byte b2 = 1;
        sj3.s0(this, "DEV_PASS_REQUEST_KEY", new Function1(this) { // from class: a.nbj0
            public final /* synthetic */ qbj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                qbj0 qbj0Var = this.b;
                switch (b3) {
                    case 0:
                        iqt0 iqt0Var = (iqt0) obj;
                        lme0 lme0Var = qbj0.Z1;
                        iqt0Var.getClass();
                        qbj0Var.H0().x(new faj0(iqt0Var));
                        break;
                    default:
                        String str = (String) obj;
                        lme0 lme0Var2 = qbj0.Z1;
                        str.getClass();
                        qbj0Var.H0().x(new iaj0(str));
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY", new mbj0(this, (byte) 8));
        ccq0.V(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new mbj0(this, (byte) 5));
        ccq0.T(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new mbj0(this, (byte) 6));
        ccq0.T(this, "REQUEST_DELETE_ACCOUNT", new mbj0(this, (byte) 7));
        C().u0("SELECT_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.obj0
            public final /* synthetic */ qbj0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b;
                qbj0 qbj0Var = this.b;
                switch (b3) {
                    case 0:
                        lme0 lme0Var = qbj0.Z1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            qbj0Var.H0().x(new vaj0((ql5) serializable));
                        }
                        break;
                    case 1:
                        lme0 lme0Var2 = qbj0.Z1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            qbj0Var.H0().x(new gaj0((ql5) serializable2));
                            qbj0Var.H0().x(new eaj0(z));
                        } else {
                            qbj0Var.H0().x(waj0.f38830a);
                        }
                        break;
                    case 2:
                        lme0 lme0Var3 = qbj0.Z1;
                        str.getClass();
                        qbj0Var.H0().x(saj0.f31891a);
                        break;
                    default:
                        lme0 lme0Var4 = qbj0.Z1;
                        str.getClass();
                        if (str.equals("REQUEST_SHOW_LOGOUT_DIALOG") && bundle2.containsKey("CONNECTION_LOST")) {
                            ii iiVarG0 = qbj0Var.G0();
                            String strH = qbj0Var.H(R.string.no_connection_title);
                            String strH2 = qbj0Var.H(R.string.error_get_data);
                            String strH3 = qbj0Var.H(R.string.ok_new);
                            strH3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC = qbj0Var.C();
                            eVarC.getClass();
                            iiVarG0.d(dialogFields, eVarC);
                        }
                        break;
                }
            }
        });
        C().u0("CHANGE_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.obj0
            public final /* synthetic */ qbj0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b2;
                qbj0 qbj0Var = this.b;
                switch (b3) {
                    case 0:
                        lme0 lme0Var = qbj0.Z1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            qbj0Var.H0().x(new vaj0((ql5) serializable));
                        }
                        break;
                    case 1:
                        lme0 lme0Var2 = qbj0.Z1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            qbj0Var.H0().x(new gaj0((ql5) serializable2));
                            qbj0Var.H0().x(new eaj0(z));
                        } else {
                            qbj0Var.H0().x(waj0.f38830a);
                        }
                        break;
                    case 2:
                        lme0 lme0Var3 = qbj0.Z1;
                        str.getClass();
                        qbj0Var.H0().x(saj0.f31891a);
                        break;
                    default:
                        lme0 lme0Var4 = qbj0.Z1;
                        str.getClass();
                        if (str.equals("REQUEST_SHOW_LOGOUT_DIALOG") && bundle2.containsKey("CONNECTION_LOST")) {
                            ii iiVarG0 = qbj0Var.G0();
                            String strH = qbj0Var.H(R.string.no_connection_title);
                            String strH2 = qbj0Var.H(R.string.error_get_data);
                            String strH3 = qbj0Var.H(R.string.ok_new);
                            strH3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC = qbj0Var.C();
                            eVarC.getClass();
                            iiVarG0.d(dialogFields, eVarC);
                        }
                        break;
                }
            }
        });
        if (this.Q1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new mbj0(this, (byte) 1), new Function1(this) { // from class: a.nbj0
            public final /* synthetic */ qbj0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                qbj0 qbj0Var = this.b;
                switch (b3) {
                    case 0:
                        iqt0 iqt0Var = (iqt0) obj;
                        lme0 lme0Var = qbj0.Z1;
                        iqt0Var.getClass();
                        qbj0Var.H0().x(new faj0(iqt0Var));
                        break;
                    default:
                        String str = (String) obj;
                        lme0 lme0Var2 = qbj0.Z1;
                        str.getClass();
                        qbj0Var.H0().x(new iaj0(str));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        C().u0("REQUEST_QUICKBET_KEY", this, new k4r(this) { // from class: a.obj0
            public final /* synthetic */ qbj0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b4 = b3;
                qbj0 qbj0Var = this.b;
                switch (b4) {
                    case 0:
                        lme0 lme0Var = qbj0.Z1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            qbj0Var.H0().x(new vaj0((ql5) serializable));
                        }
                        break;
                    case 1:
                        lme0 lme0Var2 = qbj0.Z1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            qbj0Var.H0().x(new gaj0((ql5) serializable2));
                            qbj0Var.H0().x(new eaj0(z));
                        } else {
                            qbj0Var.H0().x(waj0.f38830a);
                        }
                        break;
                    case 2:
                        lme0 lme0Var3 = qbj0.Z1;
                        str.getClass();
                        qbj0Var.H0().x(saj0.f31891a);
                        break;
                    default:
                        lme0 lme0Var4 = qbj0.Z1;
                        str.getClass();
                        if (str.equals("REQUEST_SHOW_LOGOUT_DIALOG") && bundle2.containsKey("CONNECTION_LOST")) {
                            ii iiVarG0 = qbj0Var.G0();
                            String strH = qbj0Var.H(R.string.no_connection_title);
                            String strH2 = qbj0Var.H(R.string.error_get_data);
                            String strH3 = qbj0Var.H(R.string.ok_new);
                            strH3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC = qbj0Var.C();
                            eVarC.getClass();
                            iiVarG0.d(dialogFields, eVarC);
                        }
                        break;
                }
            }
        });
        final byte b4 = 3;
        n0().r().u0("REQUEST_SHOW_LOGOUT_DIALOG", this, new k4r(this) { // from class: a.obj0
            public final /* synthetic */ qbj0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b5 = b4;
                qbj0 qbj0Var = this.b;
                switch (b5) {
                    case 0:
                        lme0 lme0Var = qbj0.Z1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            qbj0Var.H0().x(new vaj0((ql5) serializable));
                        }
                        break;
                    case 1:
                        lme0 lme0Var2 = qbj0.Z1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            qbj0Var.H0().x(new gaj0((ql5) serializable2));
                            qbj0Var.H0().x(new eaj0(z));
                        } else {
                            qbj0Var.H0().x(waj0.f38830a);
                        }
                        break;
                    case 2:
                        lme0 lme0Var3 = qbj0.Z1;
                        str.getClass();
                        qbj0Var.H0().x(saj0.f31891a);
                        break;
                    default:
                        lme0 lme0Var4 = qbj0.Z1;
                        str.getClass();
                        if (str.equals("REQUEST_SHOW_LOGOUT_DIALOG") && bundle2.containsKey("CONNECTION_LOST")) {
                            ii iiVarG0 = qbj0Var.G0();
                            String strH = qbj0Var.H(R.string.no_connection_title);
                            String strH2 = qbj0Var.H(R.string.error_get_data);
                            String strH3 = qbj0Var.H(R.string.ok_new);
                            strH3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                            androidx.fragment.app.e eVarC = qbj0Var.C();
                            eVarC.getClass();
                            iiVarG0.d(dialogFields, eVarC);
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "REQUEST_APP_INFO_DIALOG_KEY", new mbj0(this, (byte) 9));
        Object objN = this.K1.n(a2[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-1619230235, true, new uph0(this, (byte) 20)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(j0j0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            j0j0 j0j0Var = (j0j0) (ze3Var instanceof j0j0 ? ze3Var : null);
            if (j0j0Var != null) {
                uti utiVarA = j0j0Var.a(a4n0.f(this), qbj0.class.getSimpleName());
                this.M1 = utiVarA.f36255a;
                this.N1 = utiVarA.b;
                this.O1 = new ux00();
                this.P1 = utiVarA.c;
                this.Q1 = new gl5((byte) 17);
                this.R1 = utiVarA.d;
                zav zavVarF = ((vqc) utiVarA.v0.f25390a).f();
                x1x.x(zavVarF);
                this.S1 = zavVarF;
                this.U1 = (tti) utiVarA.G0.get();
                this.V1 = utiVarA.i;
                ynb ynbVarI = ((yzn0) utiVarA.C0.b).i();
                x1x.x(ynbVarI);
                this.W1 = ynbVarI;
                this.X1 = utiVarA.Z.f();
                return;
            }
        }
        jf4.n(b1j.i(j0j0.class, "Cannot create dependency "));
    }

    public final ii G0() {
        ii iiVar = this.N1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final k3t0 H0() {
        return (k3t0) this.Y1.getValue();
    }

    public final void I0(String str, String str2) {
        ii iiVarG0 = G0();
        String strH = H(R.string.ok_new);
        strH.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVarG0.d(dialogFields, eVarC);
    }
}
