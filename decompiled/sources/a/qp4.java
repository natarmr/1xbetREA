package a;

import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qp4;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qp4 extends yx5 {
    public final a8z K1;
    public final kiu0 L1;
    public final s0r M1;
    public final phf0 N1;
    public final yzn0 O1;
    public final yzn0 P1;
    public final ywq Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(qp4.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(qp4.class, "operationGuidBundle", "getOperationGuidBundle()Ljava/lang/String;", 0), new ez40(qp4.class, "operationConfirmationBundle", "getOperationConfirmationBundle()Lorg/xplatform/authenticator/api/domain/models/OperationConfirmation;", 0), new ez40(qp4.class, "navigation", "getNavigation()Lorg/xplatform/authenticator/api/navigation/AuthenticatorNavigationEnum;", 0)};
    public static final hfk0 R1 = new hfk0((byte) 27);

    public qp4() {
        super(R.layout.compose_fragment);
        mp4 mp4Var = new mp4(this, (byte) 0);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, mp4Var);
        pp4 pp4Var = new pp4(new mp4(this, (byte) 1), (byte) 0);
        a8z a8zVarA = maz.a(wezVar, new pp4(new pp4(this, (byte) 1), (byte) 2));
        this.L1 = agc.G(this, sre0.f32672a.b(ku4.class), new t51(a8zVarA, (byte) 22), new t51(a8zVarA, (byte) 23), pp4Var);
        this.M1 = ltt0.o(this, op4.f25622a);
        this.N1 = new phf0("OPERATION_GUID_EXTRA");
        this.O1 = new yzn0("OPERATION_CONFIRMATION_EXTRA");
        this.P1 = new yzn0("NAVIGATION_EXTRA");
        this.Q1 = m0(new rg3((byte) 1), new xn((byte) 7));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        Object objN = this.M1.n(S1[0], this);
        objN.getClass();
        final byte b2 = 1;
        pkd.i(((aid) objN).f919a, new shd((byte) 15), new ugd(617996375, true, new fa2((Object) this, (byte) 13)));
        ccq0.V(this, "REQUEST_SHOW_DISABLE_AUTH_CONF_DIALOG_KEY", new f8(0, H0(), ku4.class, "disableAuthenticator", "disableAuthenticator()V", 0, (byte) 15));
        ccq0.T(this, "REQUEST_SHOW_DISABLE_AUTH_CONF_DIALOG_KEY", new f8(0, H0(), ku4.class, "disableAuthenticatorCancelled", "disableAuthenticatorCancelled()V", 0, (byte) 16));
        C().u0("APPLY_FILTERS_REQUEST_KEY", this, new k4r(this) { // from class: a.np4
            public final /* synthetic */ qp4 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                byte b3 = b;
                qp4 qp4Var = this.b;
                switch (b3) {
                    case 0:
                        hfk0 hfk0Var = qp4.R1;
                        str.getClass();
                        if (str.equals("APPLY_FILTERS_REQUEST_KEY") && bundle2.containsKey("RESULT_TYPE_FILTER") && bundle2.containsKey("RESULT_PERIOD_FILTER")) {
                            ku4 ku4VarH0 = qp4Var.H0();
                            NotificationTypeInfo notificationTypeInfo = (NotificationTypeInfo) bundle2.getParcelable("RESULT_TYPE_FILTER");
                            if (notificationTypeInfo == null) {
                                notificationTypeInfo = new NotificationTypeInfo();
                            }
                            NotificationPeriodInfo notificationPeriodInfo = (NotificationPeriodInfo) bundle2.getParcelable("RESULT_PERIOD_FILTER");
                            if (notificationPeriodInfo == null) {
                                notificationPeriodInfo = new NotificationPeriodInfo();
                            }
                            ku4VarH0.B = notificationTypeInfo;
                            ku4VarH0.C = notificationPeriodInfo;
                            p7m0 p7m0Var = ku4VarH0.A;
                            lc00 lc00VarB = kotlin.collections.a.b();
                            NotificationTypeInfo notificationTypeInfo2 = ku4VarH0.B;
                            if (notificationTypeInfo2.f46355a != c860.ALL) {
                                lc00VarB.add(new k3q(notificationTypeInfo2.b, v3q.f36742a));
                            }
                            NotificationPeriodInfo notificationPeriodInfo2 = ku4VarH0.C;
                            if (notificationPeriodInfo2.f46354a != q760.ALL_TIME) {
                                lc00VarB.add(new k3q(notificationPeriodInfo2.b, v3q.b));
                            }
                            p7m0Var.n(kotlin.collections.a.a(lc00VarB));
                        }
                        break;
                    default:
                        hfk0 hfk0Var2 = qp4.R1;
                        str.getClass();
                        if (bundle2.containsKey("KEY_OPTIONS_TYPE")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("KEY_OPTIONS_TYPE", n680.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("KEY_OPTIONS_TYPE");
                                if (!(serializable2 instanceof n680)) {
                                    serializable2 = null;
                                }
                                serializable = (n680) serializable2;
                            }
                            n680 n680Var = (n680) serializable;
                            if (n680Var != null) {
                                ku4 ku4VarH1 = qp4Var.H0();
                                int iOrdinal = n680Var.ordinal();
                                if (iOrdinal == 0) {
                                    ku4VarH1.q.d(new it4(ku4VarH1, (byte) 4));
                                } else if (iOrdinal != 1) {
                                    t9f.b();
                                } else {
                                    ku4VarH1.v.f(ot4.f25814a);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ku4 ku4VarH0 = H0();
        boolean zL = sj3.L(o0());
        ku4VarH0.A(false);
        if (!zL && !ku4VarH0.n.f22595a.e.b) {
            ku4VarH0.v.f(rt4.f31061a);
            ku4VarH0.m.f22595a.e.b = true;
        }
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new mp4(this, (byte) 2));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new mp4(this, (byte) 3));
        C().u0("KEY_OPTIONS_TYPE", this, new k4r(this) { // from class: a.np4
            public final /* synthetic */ qp4 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                byte b3 = b2;
                qp4 qp4Var = this.b;
                switch (b3) {
                    case 0:
                        hfk0 hfk0Var = qp4.R1;
                        str.getClass();
                        if (str.equals("APPLY_FILTERS_REQUEST_KEY") && bundle2.containsKey("RESULT_TYPE_FILTER") && bundle2.containsKey("RESULT_PERIOD_FILTER")) {
                            ku4 ku4VarH1 = qp4Var.H0();
                            NotificationTypeInfo notificationTypeInfo = (NotificationTypeInfo) bundle2.getParcelable("RESULT_TYPE_FILTER");
                            if (notificationTypeInfo == null) {
                                notificationTypeInfo = new NotificationTypeInfo();
                            }
                            NotificationPeriodInfo notificationPeriodInfo = (NotificationPeriodInfo) bundle2.getParcelable("RESULT_PERIOD_FILTER");
                            if (notificationPeriodInfo == null) {
                                notificationPeriodInfo = new NotificationPeriodInfo();
                            }
                            ku4VarH1.B = notificationTypeInfo;
                            ku4VarH1.C = notificationPeriodInfo;
                            p7m0 p7m0Var = ku4VarH1.A;
                            lc00 lc00VarB = kotlin.collections.a.b();
                            NotificationTypeInfo notificationTypeInfo2 = ku4VarH1.B;
                            if (notificationTypeInfo2.f46355a != c860.ALL) {
                                lc00VarB.add(new k3q(notificationTypeInfo2.b, v3q.f36742a));
                            }
                            NotificationPeriodInfo notificationPeriodInfo2 = ku4VarH1.C;
                            if (notificationPeriodInfo2.f46354a != q760.ALL_TIME) {
                                lc00VarB.add(new k3q(notificationPeriodInfo2.b, v3q.b));
                            }
                            p7m0Var.n(kotlin.collections.a.a(lc00VarB));
                        }
                        break;
                    default:
                        hfk0 hfk0Var2 = qp4.R1;
                        str.getClass();
                        if (bundle2.containsKey("KEY_OPTIONS_TYPE")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("KEY_OPTIONS_TYPE", n680.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("KEY_OPTIONS_TYPE");
                                if (!(serializable2 instanceof n680)) {
                                    serializable2 = null;
                                }
                                serializable = (n680) serializable2;
                            }
                            n680 n680Var = (n680) serializable;
                            if (n680Var != null) {
                                ku4 ku4VarH2 = qp4Var.H0();
                                int iOrdinal = n680Var.ordinal();
                                if (iOrdinal == 0) {
                                    ku4VarH2.q.d(new it4(ku4VarH2, (byte) 4));
                                } else if (iOrdinal != 1) {
                                    t9f.b();
                                } else {
                                    ku4VarH2.v.f(ot4.f25814a);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().v;
        cm3 cm3Var = new cm3(this, null, (byte) 12);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ac4(ol60Var, clzVarW, cm3Var, (yje) null), 3);
    }

    public final f9i G0() {
        return (f9i) this.K1.getValue();
    }

    public final ku4 H0() {
        return (ku4) this.L1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.Q1.b();
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        c4m0 c4m0Var = H0().F;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().A(false);
    }
}
