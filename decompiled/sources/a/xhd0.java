package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.secret_question.params.QrConfirmSecretQuestionFragmentScreenParams;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xhd0;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xhd0 extends yx5 {
    public pqi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final yzn0 P1;
    public final phf0 Q1;
    public final phf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(xhd0.class, "binding", "getBinding()Lorg/xplatform/authqr/impl/databinding/FragmentQrConfirmSecretQuestionBinding;", 0), new ez40(xhd0.class, "temporaryToken", "getTemporaryToken()Lorg/xplatform/onexuser/domain/models/TemporaryToken;", 0), new ez40(xhd0.class, CrashHianalyticsData.MESSAGE, "getMessage()Ljava/lang/String;", 0), new ez40(xhd0.class, Payload.TYPE, "getType()Ljava/lang/String;", 0)};
    public static final fl70 S1 = new fl70();

    public xhd0() {
        super(R.layout.fragment_qr_confirm_secret_question);
        uhd0 uhd0Var = new uhd0(this, (byte) 6);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 11), (byte) 12));
        this.N1 = agc.G(this, sre0.f32672a.b(jid0.class), new ync0(a8zVarA, (byte) 14), new ync0(a8zVarA, (byte) 15), uhd0Var);
        this.O1 = ltt0.o(this, vhd0.f37425a);
        this.P1 = new yzn0("TEMPORARY_TOKEN_KEY");
        this.Q1 = new phf0("MESSAGE_ID_KEY");
        this.R1 = new phf0("TYPE_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.b(new uhd0(this, (byte) 0));
        qcc.X(this, new uhd0(this, (byte) 1));
        DsTextField dsTextField = G0().e;
        dsTextField.a(new jt6(new csw((Object) this, (byte) 14), (byte) 11));
        byte b = 2;
        dsTextField.setOnEditorActionListener(new dfd0(this, b));
        DsBottomBar.u(G0().b, new uhd0(this, b));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yhd0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yhd0 yhd0Var = (yhd0) (ze3Var instanceof yhd0 ? ze3Var : null);
            if (yhd0Var != null) {
                iiy[] iiyVarArr = U1;
                QrConfirmSecretQuestionFragmentScreenParams qrConfirmSecretQuestionFragmentScreenParams = new QrConfirmSecretQuestionFragmentScreenParams((swp0) this.P1.n(this, iiyVarArr[1]), this.Q1.n(this, iiyVarArr[2]), this.R1.n(this, iiyVarArr[3]));
                zx10 zx10Var = yhd0Var.f42633a;
                mne mneVar = yhd0Var.b;
                ctf0 ctf0Var = yhd0Var.c;
                rou rouVar = yhd0Var.d;
                ii iiVar = yhd0Var.e;
                ubu ubuVar = yhd0Var.f;
                zoi0 zoi0Var = yhd0Var.g;
                m1e m1eVar = yhd0Var.h;
                wdk0 wdk0Var = yhd0Var.i;
                iiVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = ctf0Var;
                g45Var.b = zx10Var;
                g45Var.c = mneVar;
                g45Var.d = qrConfirmSecretQuestionFragmentScreenParams;
                g45Var.e = rouVar;
                g45Var.f = ubuVar;
                g45Var.g = zoi0Var;
                g45Var.h = m1eVar;
                g45Var.i = n0k0.a(new ppi(g45Var, (byte) 9));
                this.K1 = (pqi) ((n5d0) g45Var.i).get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(yhd0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        jid0 jid0VarH0 = H0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(jid0VarH0.k, new d7a0(jid0VarH0, yjeVar, (byte) 14)), new gbv(jid0VarH0, yjeVar, (byte) 28), (byte) 0);
        whd0 whd0Var = new whd0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(dnqVar, clzVarW, whd0Var, (yje) null), 3);
        ol60 ol60Var = H0().l;
        whd0 whd0Var2 = new whd0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(ol60Var, clzVarW2, whd0Var2, (yje) null), 3);
    }

    public final m3r G0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (m3r) objN;
    }

    public final jid0 H0() {
        return (jid0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new uhd0(this, (byte) 7));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new uhd0(this, (byte) 3));
        ccq0.V(this, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY", new uhd0(this, (byte) 4));
        ccq0.V(this, "TOKEN_EXPIRED_ERROR_KEY", new uhd0(this, (byte) 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        C().f("REQUEST_PROCESS_INTERRUPTION_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        j120.Y(this);
        n0().getWindow().setSoftInputMode(32);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().e.clearFocus();
        n0().getWindow().setSoftInputMode(16);
    }
}
