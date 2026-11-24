package a;

import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jgd0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jgd0 extends yx5 {
    public nqi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final a8z P1;
    public final yzn0 Q1;
    public final r34 R1;
    public final yzn0 S1;
    public final es U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(jgd0.class, "binding", "getBinding()Lorg/xplatform/authqr/impl/databinding/FragmentQrCheckCodeBySmsBinding;", 0), new ez40(jgd0.class, "temporaryToken", "getTemporaryToken()Lorg/xplatform/onexuser/domain/models/TemporaryToken;", 0), new ez40(jgd0.class, "smsTimeSeconds", "getSmsTimeSeconds()J", 0), new ez40(jgd0.class, "activationType", "getActivationType()Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrActivationType;", 0), new ez40(jgd0.class, "availableActivationTypeList", "getAvailableActivationTypeList()Ljava/util/List;", 0)};
    public static final xi70 V1 = new xi70();

    public jgd0() {
        super(R.layout.fragment_qr_check_code_by_sms);
        ggd0 ggd0Var = new ggd0(this, (byte) 1);
        f1d0 f1d0Var = new f1d0(this, (byte) 9);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new f1d0(f1d0Var, (byte) 10));
        this.N1 = agc.G(this, sre0.f32672a.b(shd0.class), new ync0(a8zVarA, (byte) 12), new ync0(a8zVarA, (byte) 13), ggd0Var);
        this.O1 = ltt0.o(this, hgd0.f13013a);
        this.P1 = maz.a(wezVar, new ggd0(this, (byte) 2));
        this.Q1 = new yzn0("TEMPORARY_TOKEN_KEY");
        this.R1 = new r34("SMS_TIME_KEY");
        this.S1 = new yzn0("ACTIVATION_TYPE_KEY");
        this.U1 = new es("ACTIVATION_TYPE_LIST");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        egx egxVar = new egx(1);
        ConstraintLayout constraintLayout = H0().f19372a;
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(constraintLayout, egxVar);
        H0().c.b(new ggd0(this, (byte) 7));
        qcc.X(this, new ggd0(this, (byte) 8));
        DsTextField dsTextField = H0().e;
        dsTextField.a(new jt6(new csw((Object) this, (byte) 13), (byte) 11));
        dsTextField.setOnEditorActionListener(new dfd0(this, (byte) 1));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new ggd0(this, (byte) 9));
        dyb.O(H0().f, new v6d0(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        oqi oqiVar = (oqi) this.P1.getValue();
        this.K1 = (nqi) oqiVar.q.get();
        this.L1 = oqiVar.o;
        this.M1 = oqiVar.p;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        shd0 shd0VarI0 = I0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(shd0VarI0.t, new d7a0(shd0VarI0, yjeVar, (byte) 13)), new gbv(shd0VarI0, yjeVar, (byte) 27), (byte) 0);
        igd0 igd0Var = new igd0(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(dnqVar, clzVarW, igd0Var, (yje) null), 3);
        ol60 ol60Var = I0().u;
        igd0 igd0Var2 = new igd0(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(ol60Var, clzVarW2, igd0Var2, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.L1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final l3r H0() {
        Object objN = this.O1.n(W1[0], this);
        objN.getClass();
        return (l3r) objN;
    }

    public final shd0 I0() {
        return (shd0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_TOKEN_EXPIRED_KEY", new ggd0(this, (byte) 4));
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new ggd0(this, (byte) 3));
        ccq0.V(this, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY", new ggd0(this, (byte) 5));
        ccq0.V(this, "REQUEST_CONSULTANT_KEY", new ggd0(this, (byte) 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        j120.Y(this);
        n0().getWindow().setSoftInputMode(32);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        if (Build.VERSION.SDK_INT <= 29) {
            n0().getWindow().setSoftInputMode(16);
        }
        super.e0();
    }
}
