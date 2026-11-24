package a;

import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.feature.office.payment.impl.presentation.view.PaymentWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/r790;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r790 extends yx5 {
    public final a8z K1;
    public final s0r L1;
    public final a8z M1;
    public final a8z N1;
    public final hnm0 O1;
    public final a8z P1;
    public final a8z Q1;
    public final a8z R1;
    public ValueCallback S1;
    public PaymentWebView U1;
    public final r34 V1;
    public final phf0 W1;
    public final cgx0 X1;
    public final zz2 Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(r790.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(r790.class, "balanceId", "getBalanceId()J", 0), new ez40(r790.class, "redirectionURL", "getRedirectionURL()Ljava/lang/String;", 0), new ez40(r790.class, "deposit", "getDeposit()Z", 0), new ez40(r790.class, "notificationId", "getNotificationId()I", 0)};
    public static final xi70 Z1 = new xi70();

    public r790() {
        super(R.layout.compose_fragment);
        m790 m790Var = new m790(this, (byte) 6);
        wez wezVar = wez.b;
        this.K1 = maz.a(wezVar, m790Var);
        this.L1 = ltt0.o(this, o790.f24776a);
        this.M1 = xbc.a0(this, sre0.f32672a.b(db90.class), null, new m790(this, (byte) 7), 14);
        this.N1 = maz.a(wezVar, new m790(this, (byte) 8));
        this.O1 = hnm0.f13359a;
        this.P1 = maz.a(wezVar, new m790(this, (byte) 9));
        this.Q1 = maz.a(wezVar, new m790(this, (byte) 10));
        this.R1 = maz.a(wezVar, new m790(this, (byte) 11));
        this.V1 = new r34("CURRENCY_ID", 0L);
        this.W1 = new phf0("REDIRECT_URL");
        this.X1 = new cgx0("deposit", false);
        this.Y1 = new zz2("NOTIFICATION_ID", -1);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        iiy[] iiyVarArr = a2;
        byte b = 4;
        iiy iiyVar = iiyVarArr[4];
        zz2 zz2Var = this.Y1;
        if (zz2Var.n(this, iiyVar).intValue() >= 0) {
            Object systemService = o0().getSystemService(RemoteMessageConst.NOTIFICATION);
            NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
            if (notificationManager != null) {
                notificationManager.cancel(zz2Var.n(this, iiyVarArr[4]).intValue());
            }
        }
        byte b2 = 2;
        byte b3 = 1;
        if ((n0().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        Object objN = this.L1.n(iiyVarArr[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(1738099788, true, new n790(this, b2)));
        ccq0.V(this, "VERIFICATION_LISTENER", new m790(this, b3));
        ccq0.V(this, "BONUS_LISTENER", new m790(this, b2));
        ccq0.T(this, "BONUS_LISTENER", new m790(this, (byte) 3));
        ccq0.V(this, "ERROR_DIALOG_LISTENER", new m790(this, b));
        ccq0.V(this, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new m790(this, (byte) 5));
    }

    public final mni G0() {
        return (mni) this.K1.getValue();
    }

    public final qm90 H0() {
        return (qm90) this.N1.getValue();
    }

    public final k3t0 I0() {
        return (k3t0) this.M1.getValue();
    }

    public final void J0(boolean z, PermissionRequest permissionRequest) {
        ii iiVar = G0().s;
        DialogFields dialogFields = new DialogFields((CharSequence) G0().o.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), (CharSequence) G0().o.b.a(R.string.permission_message_camera, Arrays.copyOf(new Object[0], 0)), (CharSequence) G0().o.b.a(R.string.permission_allow, Arrays.copyOf(new Object[0], 0)), G0().o.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "CAMERA_PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
        ccq0.V(this, "CAMERA_PERMISSION_DIALOG", new lf2(z, (Object) this, (Object) permissionRequest, (byte) 10));
    }

    public final void K0(boolean z) {
        ii iiVar = G0().s;
        DialogFields dialogFields = new DialogFields((CharSequence) G0().o.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), (CharSequence) G0().o.b.a(R.string.permission_message_read_files, Arrays.copyOf(new Object[0], 0)), (CharSequence) G0().o.b.a(R.string.permission_allow, Arrays.copyOf(new Object[0], 0)), G0().o.b.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
        ccq0.V(this, "PERMISSION_DIALOG", new rd7(z, (Object) this, (byte) 12));
    }

    public final void L0(String str, da90 da90Var) {
        sek0 sek0Var;
        int iOrdinal = da90Var.ordinal();
        if (iOrdinal == 0) {
            sek0Var = qek0.f28589a;
        } else if (iOrdinal == 1) {
            sek0Var = rek0.b;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            sek0Var = pek0.f26859a;
        }
        wdk0.k(G0().u, new xdk0(sek0Var, str, null, null, null, null, 124), this, null, null, false, null, 1020);
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
                qm90 qm90VarH0 = H0();
                qm90VarH0.getClass();
                qm90VarH0.g = pm90Var;
            }
        }
        qm90 qm90VarH1 = H0();
        n790 n790Var = new n790(this, (byte) 0);
        n790 n790Var2 = new n790(this, (byte) 1);
        qm90VarH1.getClass();
        qm90VarH1.c = n790Var;
        qm90VarH1.d = n790Var2;
        this.u1.a(H0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        PaymentWebView paymentWebView = this.U1;
        if (paymentWebView != null) {
            siq fixedWebView = paymentWebView.getFixedWebView();
            if (fixedWebView != null) {
                fixedWebView.setDownloadListener(null);
            }
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
            paymentWebView.a();
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        View view = this.l1;
        if (view != null) {
            hxm0.m(view);
        }
        this.j1 = true;
        PaymentWebView paymentWebView = this.U1;
        if (paymentWebView != null) {
            paymentWebView.e();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        View view = this.l1;
        if (view != null) {
            hxm0.n(view);
        }
        PaymentWebView paymentWebView = this.U1;
        if (paymentWebView != null) {
            paymentWebView.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putSerializable("BUNDLE_EXTRA_CONTAINER", H0().g);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.O1;
    }
}
