package a;

import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.core.content.FileProvider;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/o890;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o890 extends yx5 {
    public final hnm0 K1;
    public nni L1;
    public oni M1;
    public z7z N1;
    public z7z O1;
    public z7z P1;
    public z7z Q1;
    public ojj R1;
    public final kiu0 S1;
    public final s0r U1;
    public final n0o0 V1;
    public final n0o0 W1;
    public final n0o0 X1;
    public final n0o0 Y1;
    public ValueCallback Z1;
    public PermissionRequest a2;
    public final r34 b2;
    public final phf0 c2;
    public final cgx0 d2;
    public final zz2 e2;
    public static final /* synthetic */ iiy[] g2 = {new j0d0(o890.class, "binding", "getBinding()Lorg/xplatform/feature/office/payment/impl/databinding/FragmentPaymentBrowserBinding;", 0), new ez40(o890.class, "balanceId", "getBalanceId()J", 0), new ez40(o890.class, "redirectionURL", "getRedirectionURL()Ljava/lang/String;", 0), new ez40(o890.class, "deposit", "getDeposit()Z", 0), new ez40(o890.class, "notificationId", "getNotificationId()I", 0)};
    public static final jh70 f2 = new jh70();

    public o890() {
        super(R.layout.fragment_payment_browser);
        this.K1 = hnm0.f13359a;
        l890 l890Var = new l890(this, (byte) 10);
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, (byte) 6), (byte) 7));
        this.S1 = agc.G(this, sre0.f32672a.b(p990.class), new a190(a8zVarA, (byte) 6), new a190(a8zVarA, (byte) 7), l890Var);
        this.U1 = ltt0.o(this, n890.f23079a);
        this.V1 = maz.b(new l890(this, (byte) 11));
        this.W1 = maz.b(new l890(this, (byte) 12));
        this.X1 = maz.b(new l890(this, (byte) 13));
        this.Y1 = maz.b(new l890(this, (byte) 14));
        this.b2 = new r34("CURRENCY_ID", 0L);
        this.c2 = new phf0("REDIRECT_URL");
        this.d2 = new cgx0("deposit", false);
        this.e2 = new zz2("NOTIFICATION_ID", -1);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object value;
        final byte b = 3;
        bdx.O(n0().k(), K(), new Function1(this) { // from class: a.m890
            public final /* synthetic */ o890 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                byte b3 = 10;
                yje yjeVar = null;
                o890 o890Var = this.b;
                switch (b2) {
                    case 0:
                        jb90 jb90Var = (jb90) obj;
                        jh70 jh70Var = o890.f2;
                        jb90Var.getClass();
                        ojj ojjVar = o890Var.R1;
                        if (ojjVar != null) {
                            ojjVar.b(jb90Var);
                            return Unit.f46060a;
                        }
                        Intrinsics.h("webViewErrorLogger");
                        throw null;
                    case 1:
                        mbu0 mbu0Var = (mbu0) obj;
                        jh70 jh70Var2 = o890.f2;
                        mbu0Var.getClass();
                        p990 p990VarM0 = o890Var.M0();
                        if (mbu0.l.contains(mbu0Var)) {
                            p990VarM0.B();
                            sac.V(jiu0.a(p990VarM0), new r890(p990VarM0, (byte) 4), null, p990VarM0.p.b, new w090(p990VarM0, mbu0Var, yjeVar, b3), 10);
                        }
                        return Unit.f46060a;
                    case 2:
                        String str = (String) obj;
                        jh70 jh70Var3 = o890.f2;
                        str.getClass();
                        p990 p990VarM1 = o890Var.M0();
                        v890 v890Var = new v890(str);
                        sac.V(jiu0.a(p990VarM1), new ev80((byte) 18), null, p990VarM1.p.c, new s980(p990VarM1, v890Var, null, (byte) 10), 10);
                        return Unit.f46060a;
                    default:
                        jh70 jh70Var4 = o890.f2;
                        ((eg60) obj).getClass();
                        o890Var.M0().A();
                        return Unit.f46060a;
                }
            }
        });
        nq8 nq8Var = K0().f;
        final byte b2 = 0;
        knm0.h(K0().g, false);
        PaymentWebView paymentWebView = K0().g;
        int i = 0;
        int i2 = 1;
        Class<o890> cls = o890.class;
        xj80 xj80Var = new xj80(i2, this, cls, "onShowFileChooser", "onShowFileChooser(Landroid/webkit/ValueCallback;)V", i, (byte) 26);
        xj80 xj80Var2 = new xj80(i2, this, cls, "onPermissionRequest", "onPermissionRequest(Landroid/webkit/PermissionRequest;)V", i, (byte) 27);
        paymentWebView.m = xj80Var;
        paymentWebView.n = xj80Var2;
        K0().g.setOnWebViewErrorListener$impl(new Function1(this) { // from class: a.m890
            public final /* synthetic */ o890 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                byte b4 = 10;
                yje yjeVar = null;
                o890 o890Var = this.b;
                switch (b3) {
                    case 0:
                        jb90 jb90Var = (jb90) obj;
                        jh70 jh70Var = o890.f2;
                        jb90Var.getClass();
                        ojj ojjVar = o890Var.R1;
                        if (ojjVar != null) {
                            ojjVar.b(jb90Var);
                            return Unit.f46060a;
                        }
                        Intrinsics.h("webViewErrorLogger");
                        throw null;
                    case 1:
                        mbu0 mbu0Var = (mbu0) obj;
                        jh70 jh70Var2 = o890.f2;
                        mbu0Var.getClass();
                        p990 p990VarM0 = o890Var.M0();
                        if (mbu0.l.contains(mbu0Var)) {
                            p990VarM0.B();
                            sac.V(jiu0.a(p990VarM0), new r890(p990VarM0, (byte) 4), null, p990VarM0.p.b, new w090(p990VarM0, mbu0Var, yjeVar, b4), 10);
                        }
                        return Unit.f46060a;
                    case 2:
                        String str = (String) obj;
                        jh70 jh70Var3 = o890.f2;
                        str.getClass();
                        p990 p990VarM1 = o890Var.M0();
                        v890 v890Var = new v890(str);
                        sac.V(jiu0.a(p990VarM1), new ev80((byte) 18), null, p990VarM1.p.c, new s980(p990VarM1, v890Var, null, (byte) 10), 10);
                        return Unit.f46060a;
                    default:
                        jh70 jh70Var4 = o890.f2;
                        ((eg60) obj).getClass();
                        o890Var.M0().A();
                        return Unit.f46060a;
                }
            }
        });
        final byte b3 = 1;
        final byte b4 = 2;
        int i3 = 1;
        K0().g.k(new xj80(1, this, cls, "checkOnPay", "checkOnPay(Ljava/lang/String;)Z", i, (byte) 28), new l890(this, b3), new pl70(nq8Var, (byte) 15), new cz60(0, this, cls, "showErrorData", "showErrorData()V", i, (byte) 16), new kx2(3, this, cls, "startLaunchSocial", "startLaunchSocial(ILjava/lang/String;Ljava/lang/String;)V", i, (byte) 4), new l890(this, b4), new Function1(this) { // from class: a.m890
            public final /* synthetic */ o890 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b3;
                byte b6 = 10;
                yje yjeVar = null;
                o890 o890Var = this.b;
                switch (b5) {
                    case 0:
                        jb90 jb90Var = (jb90) obj;
                        jh70 jh70Var = o890.f2;
                        jb90Var.getClass();
                        ojj ojjVar = o890Var.R1;
                        if (ojjVar != null) {
                            ojjVar.b(jb90Var);
                            return Unit.f46060a;
                        }
                        Intrinsics.h("webViewErrorLogger");
                        throw null;
                    case 1:
                        mbu0 mbu0Var = (mbu0) obj;
                        jh70 jh70Var2 = o890.f2;
                        mbu0Var.getClass();
                        p990 p990VarM0 = o890Var.M0();
                        if (mbu0.l.contains(mbu0Var)) {
                            p990VarM0.B();
                            sac.V(jiu0.a(p990VarM0), new r890(p990VarM0, (byte) 4), null, p990VarM0.p.b, new w090(p990VarM0, mbu0Var, yjeVar, b6), 10);
                        }
                        return Unit.f46060a;
                    case 2:
                        String str = (String) obj;
                        jh70 jh70Var3 = o890.f2;
                        str.getClass();
                        p990 p990VarM1 = o890Var.M0();
                        v890 v890Var = new v890(str);
                        sac.V(jiu0.a(p990VarM1), new ev80((byte) 18), null, p990VarM1.p.c, new s980(p990VarM1, v890Var, null, (byte) 10), 10);
                        return Unit.f46060a;
                    default:
                        jh70 jh70Var4 = o890.f2;
                        ((eg60) obj).getClass();
                        o890Var.M0().A();
                        return Unit.f46060a;
                }
            }
        }, new xj80(i3, this, cls, "startIntentAction", "startIntentAction(Landroid/content/Intent;)V", i, (byte) 24), new xj80(i3, this, cls, "startIntentActionAndFinish", "startIntentActionAndFinish(Landroid/content/Intent;)V", i, (byte) 25));
        K0().g.setDownloadListener$impl(new ww0(this, b3));
        iiy[] iiyVarArr = g2;
        int i4 = this.d2.n(this, iiyVarArr[3]).booleanValue() ? R.string.payments_pay_in : R.string.payments_pay_out;
        DsNavigationBar dsNavigationBar = K0().d;
        String strH = H(i4);
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        mc50.a(K0().d, new l890(this, (byte) 7));
        K0().d.setNavigationBarButtons(q3d.e(new hc50("REFRESH_BUTTON", ybg0.f42342a, R.drawable.ic_payments_refresh, new l890(this, (byte) 8), 2032)));
        K0().b.setVisibility(8);
        ((ProgressBar) K0().f.b).setVisibility(0);
        if (K0().g.b() && (n0().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        byte b5 = 4;
        yje yjeVar = null;
        if (this.e2.n(this, iiyVarArr[4]).intValue() >= 0) {
            Object systemService = o0().getSystemService(RemoteMessageConst.NOTIFICATION);
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null) {
                notificationManager.cancel(this.z);
            }
        }
        p990 p990VarM0 = M0();
        mne mneVar = p990VarM0.p;
        byte b6 = 5;
        if (p990VarM0.B.length() > 0) {
            p990VarM0.x();
        } else {
            long j = p990VarM0.F;
            if (j == 0) {
                sac.V(jiu0.a(p990VarM0), new r890(p990VarM0, b6), null, mneVar.b, new f990(p990VarM0, yjeVar, b2), 10);
            } else {
                sac.V(jiu0.a(p990VarM0), new r890(p990VarM0, b), null, mneVar.b, new wn10(p990VarM0, j, yjeVar, (byte) 6), 10);
            }
        }
        sac.V(jiu0.a(p990VarM0), new r890(p990VarM0, b4), null, mneVar.f22085a, new f990(p990VarM0, yjeVar, b4), 10);
        p7m0 p7m0Var = p990VarM0.z;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, d990.f5690a));
        p990VarM0.C();
        ccq0.V(this, "VERIFICATION_LISTENER", new l890(this, (byte) 3));
        ccq0.V(this, "BONUS_LISTENER", new l890(this, b5));
        ccq0.T(this, "BONUS_LISTENER", new l890(this, b6));
        ccq0.V(this, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new l890(this, b2));
        ccq0.V(this, "ERROR_DIALOG_LISTENER", new l890(this, (byte) 9));
        siq fixedWebView = K0().g.getFixedWebView();
        if (fixedWebView != null) {
            l890 l890Var = new l890(this, (byte) 6);
            Function1 function1 = new Function1(this) { // from class: a.m890
                public final /* synthetic */ o890 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b7 = b4;
                    byte b8 = 10;
                    yje yjeVar2 = null;
                    o890 o890Var = this.b;
                    switch (b7) {
                        case 0:
                            jb90 jb90Var = (jb90) obj;
                            jh70 jh70Var = o890.f2;
                            jb90Var.getClass();
                            ojj ojjVar = o890Var.R1;
                            if (ojjVar != null) {
                                ojjVar.b(jb90Var);
                                return Unit.f46060a;
                            }
                            Intrinsics.h("webViewErrorLogger");
                            throw null;
                        case 1:
                            mbu0 mbu0Var = (mbu0) obj;
                            jh70 jh70Var2 = o890.f2;
                            mbu0Var.getClass();
                            p990 p990VarM1 = o890Var.M0();
                            if (mbu0.l.contains(mbu0Var)) {
                                p990VarM1.B();
                                sac.V(jiu0.a(p990VarM1), new r890(p990VarM1, (byte) 4), null, p990VarM1.p.b, new w090(p990VarM1, mbu0Var, yjeVar2, b8), 10);
                            }
                            return Unit.f46060a;
                        case 2:
                            String str = (String) obj;
                            jh70 jh70Var3 = o890.f2;
                            str.getClass();
                            p990 p990VarM2 = o890Var.M0();
                            v890 v890Var = new v890(str);
                            sac.V(jiu0.a(p990VarM2), new ev80((byte) 18), null, p990VarM2.p.c, new s980(p990VarM2, v890Var, null, (byte) 10), 10);
                            return Unit.f46060a;
                        default:
                            jh70 jh70Var4 = o890.f2;
                            ((eg60) obj).getClass();
                            o890Var.M0().A();
                            return Unit.f46060a;
                    }
                }
            };
            z7z z7zVar = this.Q1;
            if (z7zVar == null) {
                Intrinsics.h("json");
                throw null;
            }
            Object obj = z7zVar.get();
            obj.getClass();
            fixedWebView.addJavascriptInterface(new l3v0(l890Var, function1, (vby) obj), "paymentWebHandler");
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p890.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p890 p890Var = (p890) (ze3Var instanceof p890 ? ze3Var : null);
            if (p890Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = g2;
                k790 k790Var = new k790(this.c2.n(this, iiyVarArr[2]), this.b2.n(this, iiyVarArr[1]).longValue(), this.d2.n(this, iiyVarArr[3]).booleanValue());
                i1w0VarF.getClass();
                zas0 zas0Var = p890Var.h;
                d1p d1pVar = p890Var.i;
                zx10 zx10Var = p890Var.o;
                hse0 hse0Var = p890Var.f26543a;
                pv00 pv00Var = p890Var.e;
                rou rouVar = p890Var.b;
                buo0 buo0Var = p890Var.c;
                lp4 lp4Var = p890Var.d;
                wsf0 wsf0Var = p890Var.p;
                vd1 vd1Var = p890Var.f;
                duj dujVar = p890Var.g;
                mne mneVar = p890Var.j;
                ii iiVar = p890Var.q;
                ctf0 ctf0Var = p890Var.k;
                pru pruVar = p890Var.l;
                sa10 sa10Var = p890Var.m;
                zri zriVar = p890Var.n;
                ntu ntuVar = p890Var.r;
                grj grjVar = p890Var.s;
                wdk0 wdk0Var = p890Var.t;
                i7u0 i7u0Var = p890Var.u;
                gst0 gst0Var = p890Var.v;
                vby vbyVar = p890Var.w;
                ony onyVar = p890Var.x;
                d1pVar.getClass();
                lp4Var.getClass();
                iiVar.getClass();
                hse0Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                gst0Var.getClass();
                vbyVar.getClass();
                onyVar.getClass();
                o9i o9iVar = new o9i(zas0Var, zx10Var, pv00Var, d1pVar, wsf0Var, lp4Var, iiVar, k790Var, hse0Var, rouVar, buo0Var, vd1Var, dujVar, mneVar, ctf0Var, pruVar, sa10Var, zriVar, ntuVar, grjVar, wdk0Var, i7u0Var, gst0Var, vbyVar, onyVar);
                this.L1 = (nni) ((n5d0) o9iVar.m).get();
                this.M1 = (oni) ((n5d0) o9iVar.n).get();
                this.N1 = mbl.a((zix) o9iVar.A);
                this.O1 = mbl.a((omi) o9iVar.l);
                this.P1 = mbl.a((zix) o9iVar.C);
                this.Q1 = mbl.a((zix) o9iVar.D);
                this.R1 = new ojj((ony) o9iVar.v, (byte) 1);
                return;
            }
        }
        jf4.n(b1j.i(p890.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        n6r n6rVarK = K();
        p7m0 p7m0Var = M0().z;
        hi70 hi70Var = new hi70(2, this, o890.class, "handleReloadState", "handleReloadState(Lorg/xplatform/feature/office/payment/impl/presentation/PaymentOldViewModel$ReloadState;)V", 4, (byte) 14);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w090(p7m0Var, clzVarW, hi70Var, (yje) null), 3);
        qjj.W(x0x.Q(n6rVarK.x()), null, null, new w090(M0().y, n6rVarK, new s980(this, null, (byte) 9), (yje) null), 3);
    }

    public final void G0() {
        qog0 qog0Var = (qog0) this.W1.getValue();
        if (qog0Var != null) {
            qog0Var.f29072a.add(new lz9(qog0Var, this, (byte) 5));
            qog0Var.a();
        }
    }

    public final void H0(PermissionRequest permissionRequest) {
        qog0 qog0Var = (qog0) this.Y1.getValue();
        if (qog0Var != null) {
            qog0Var.f29072a.add(new p790(qog0Var, permissionRequest, this, (byte) 1));
            qog0Var.a();
        }
    }

    public final void I0(boolean z) {
        Iterator it = K0().d.c.d.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setNavigationBarButtonEnable(z);
        }
        e1i e1iVarB = K0().d.b("REFRESH_BUTTON");
        if (e1iVarB != null) {
            e1iVarB.setNavigationBarButtonAlpha(!z);
        }
    }

    public final z7z J0() {
        z7z z7zVar = this.N1;
        if (z7zVar != null) {
            return z7zVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final s2r K0() {
        Object objN = this.U1.n(g2[0], this);
        objN.getClass();
        return (s2r) objN;
    }

    public final qm90 L0() {
        return (qm90) this.V1.getValue();
    }

    public final p990 M0() {
        return (p990) this.S1.getValue();
    }

    public final void N0() {
        K0().c.setVisibility(8);
        K0().b.setVisibility(8);
        siq fixedWebView = K0().g.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setVisibility(0);
        }
    }

    public final void O0(boolean z, PermissionRequest permissionRequest) {
        ii iiVar = (ii) J0().get();
        String strH = H(R.string.caution);
        String strH2 = H(R.string.permission_message_camera);
        String strH3 = H(R.string.permission_allow);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "CAMERA_PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
        ccq0.V(this, "CAMERA_PERMISSION_DIALOG", new lf2(z, (Object) this, (Object) permissionRequest, (byte) 11));
    }

    public final void P0(boolean z) {
        ii iiVar = (ii) J0().get();
        String strH = H(R.string.caution);
        String strH2 = H(R.string.permission_message_read_files);
        String strH3 = H(R.string.permission_allow);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
        ccq0.V(this, "PERMISSION_DIALOG", new rd7(z, (Object) this, (byte) 13));
    }

    public final void Q0(int i, sek0 sek0Var) {
        Context contextD = D();
        if (contextD != null) {
            z7z z7zVar = this.P1;
            if (z7zVar == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            Object obj = z7zVar.get();
            obj.getClass();
            String string = contextD.getString(i);
            string.getClass();
            wdk0.k((wdk0) obj, new xdk0(sek0Var, string, null, null, null, null, 124), this, null, null, false, null, 1020);
        }
    }

    public final void R0(Intent intent) {
        try {
            w0(intent);
        } catch (Exception unused) {
            z7z z7zVar = this.P1;
            if (z7zVar == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            Object obj = z7zVar.get();
            obj.getClass();
            rek0 rek0Var = rek0.b;
            String strH = H(R.string.intent_app_not_installed);
            strH.getClass();
            wdk0.k((wdk0) obj, new xdk0(rek0Var, strH, null, null, null, null, 124), this, null, null, false, null, 1020);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void U(int i, int i2, Intent intent) {
        PermissionRequest permissionRequest;
        super.U(i, i2, intent);
        if (i == 555) {
            G0();
        } else {
            if (i != 531 || (permissionRequest = this.a2) == null) {
                return;
            }
            H0(permissionRequest);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        Object serializable;
        super.W(bundle);
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("BUNDLE_EXTRA_CONTAINER", pm90.class);
            } else {
                Object serializable2 = bundle.getSerializable("BUNDLE_EXTRA_CONTAINER");
                if (!(serializable2 instanceof pm90)) {
                    serializable2 = null;
                }
                serializable = (pm90) serializable2;
            }
            pm90 pm90Var = (pm90) serializable;
            if (pm90Var != null) {
                qm90 qm90VarL0 = L0();
                qm90VarL0.getClass();
                qm90VarL0.g = pm90Var;
            }
        }
        qm90 qm90VarL1 = L0();
        final byte b = 0;
        Function2 function2 = new Function2(this) { // from class: a.k890
            public final /* synthetic */ o890 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                Uri[] uriArr;
                Uri[] uriArr2;
                byte b2 = b;
                o890 o890Var = this.b;
                int iIntValue = ((Integer) obj).intValue();
                switch (b2) {
                    case 0:
                        File file = (File) obj2;
                        jh70 jh70Var = o890.f2;
                        file.getClass();
                        if (iIntValue != -1 || o890Var.Z1 == null) {
                            uriArr = null;
                        } else {
                            Uri uriC = FileProvider.c(o890Var.o0(), file, o890Var.n0().getPackageName() + ".provider");
                            uriC.getClass();
                            uriArr = new Uri[]{Uri.parse(uriC.toString())};
                        }
                        ValueCallback valueCallback = o890Var.Z1;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(uriArr);
                        }
                        o890Var.Z1 = null;
                        break;
                    default:
                        Intent intent = (Intent) obj2;
                        jh70 jh70Var2 = o890.f2;
                        intent.getClass();
                        if (iIntValue == -1) {
                            qm90 qm90VarL2 = o890Var.L0();
                            Context contextO0 = o890Var.o0();
                            qm90VarL2.getClass();
                            boolean zB = qm90.b(contextO0, intent);
                            ValueCallback valueCallback2 = o890Var.Z1;
                            if (!zB) {
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(new Uri[0]);
                                }
                                o890Var.Z1 = null;
                            } else if (valueCallback2 != null) {
                                Intent intent2 = o890Var.n0().getIntent();
                                if ((intent2 != null ? intent2.getData() : null) == null) {
                                    String dataString = intent.getDataString();
                                    if (dataString == null) {
                                        dataString = "";
                                    }
                                    uriArr2 = new Uri[]{Uri.parse(dataString)};
                                } else {
                                    String dataString2 = o890Var.n0().getIntent().getDataString();
                                    if (dataString2 != null) {
                                        uriArr2 = new Uri[]{Uri.parse(dataString2)};
                                    }
                                }
                            }
                            uriArr2 = null;
                        } else {
                            uriArr2 = null;
                        }
                        ValueCallback valueCallback3 = o890Var.Z1;
                        if (valueCallback3 != null) {
                            valueCallback3.onReceiveValue(uriArr2);
                        }
                        o890Var.Z1 = null;
                        break;
                }
                return Unit.f46060a;
            }
        };
        final byte b2 = 1;
        Function2 function3 = new Function2(this) { // from class: a.k890
            public final /* synthetic */ o890 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                Uri[] uriArr;
                Uri[] uriArr2;
                byte b3 = b2;
                o890 o890Var = this.b;
                int iIntValue = ((Integer) obj).intValue();
                switch (b3) {
                    case 0:
                        File file = (File) obj2;
                        jh70 jh70Var = o890.f2;
                        file.getClass();
                        if (iIntValue != -1 || o890Var.Z1 == null) {
                            uriArr = null;
                        } else {
                            Uri uriC = FileProvider.c(o890Var.o0(), file, o890Var.n0().getPackageName() + ".provider");
                            uriC.getClass();
                            uriArr = new Uri[]{Uri.parse(uriC.toString())};
                        }
                        ValueCallback valueCallback = o890Var.Z1;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(uriArr);
                        }
                        o890Var.Z1 = null;
                        break;
                    default:
                        Intent intent = (Intent) obj2;
                        jh70 jh70Var2 = o890.f2;
                        intent.getClass();
                        if (iIntValue == -1) {
                            qm90 qm90VarL2 = o890Var.L0();
                            Context contextO0 = o890Var.o0();
                            qm90VarL2.getClass();
                            boolean zB = qm90.b(contextO0, intent);
                            ValueCallback valueCallback2 = o890Var.Z1;
                            if (!zB) {
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(new Uri[0]);
                                }
                                o890Var.Z1 = null;
                            } else if (valueCallback2 != null) {
                                Intent intent2 = o890Var.n0().getIntent();
                                if ((intent2 != null ? intent2.getData() : null) == null) {
                                    String dataString = intent.getDataString();
                                    if (dataString == null) {
                                        dataString = "";
                                    }
                                    uriArr2 = new Uri[]{Uri.parse(dataString)};
                                } else {
                                    String dataString2 = o890Var.n0().getIntent().getDataString();
                                    if (dataString2 != null) {
                                        uriArr2 = new Uri[]{Uri.parse(dataString2)};
                                    }
                                }
                            }
                            uriArr2 = null;
                        } else {
                            uriArr2 = null;
                        }
                        ValueCallback valueCallback3 = o890Var.Z1;
                        if (valueCallback3 != null) {
                            valueCallback3.onReceiveValue(uriArr2);
                        }
                        o890Var.Z1 = null;
                        break;
                }
                return Unit.f46060a;
            }
        };
        qm90VarL1.getClass();
        qm90VarL1.c = function2;
        qm90VarL1.d = function3;
        this.u1.a(L0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        siq fixedWebView = K0().g.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setDownloadListener(null);
        }
        PaymentWebView paymentWebView = K0().g;
        paymentWebView.o = null;
        paymentWebView.p = null;
        paymentWebView.q = null;
        paymentWebView.r = null;
        paymentWebView.s = null;
        paymentWebView.t = null;
        paymentWebView.u = null;
        paymentWebView.v = null;
        paymentWebView.w = null;
        paymentWebView.m = null;
        paymentWebView.n = null;
        paymentWebView.x = null;
        K0().g.a();
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        View view = this.l1;
        if (view != null) {
            hxm0.m(view);
        }
        this.j1 = true;
        K0().g.e();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        K0().g.f();
        View view = this.l1;
        if (view != null) {
            hxm0.n(view);
        }
        super.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putSerializable("BUNDLE_EXTRA_CONTAINER", L0().g);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
