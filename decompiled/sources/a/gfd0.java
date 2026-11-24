package a;

import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gfd0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gfd0 extends yx5 {
    public lqi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final a8z P1;
    public final yzn0 Q1;
    public final r34 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(gfd0.class, "binding", "getBinding()Lorg/xplatform/authqr/impl/databinding/FragmentQrCheckCodeByMailBinding;", 0), new ez40(gfd0.class, "temporaryToken", "getTemporaryToken()Lorg/xplatform/onexuser/domain/models/TemporaryToken;", 0), new ez40(gfd0.class, "smsTimeSeconds", "getSmsTimeSeconds()J", 0)};
    public static final mi70 S1 = new mi70();

    public gfd0() {
        super(R.layout.fragment_qr_check_code_by_mail);
        cfd0 cfd0Var = new cfd0(this, (byte) 0);
        f1d0 f1d0Var = new f1d0(this, (byte) 7);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new f1d0(f1d0Var, (byte) 8));
        this.N1 = agc.G(this, sre0.f32672a.b(fgd0.class), new ync0(a8zVarA, (byte) 10), new ync0(a8zVarA, (byte) 11), cfd0Var);
        this.O1 = ltt0.o(this, efd0.f7717a);
        this.P1 = maz.a(wezVar, new cfd0(this, (byte) 3));
        this.Q1 = new yzn0("TEMPORARY_TOKEN_KEY");
        this.R1 = new r34("SMS_TIME_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        egx egxVar = new egx(1);
        ConstraintLayout constraintLayout = H0().f17633a;
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(constraintLayout, egxVar);
        H0().c.b(new cfd0(this, (byte) 9));
        dyb.O(H0().f, new v6d0(this, (byte) 4));
        qcc.X(this, new cfd0(this, (byte) 10));
        DsTextField dsTextField = H0().e;
        dsTextField.a(new jt6(new csw((Object) this, (byte) 12), (byte) 11));
        dsTextField.setOnEditorActionListener(new dfd0(this, (byte) 0));
        DsBottomBar dsBottomBar = H0().b;
        DsBottomBar.v(dsBottomBar, new cfd0(this, (byte) 1));
        DsBottomBar.u(dsBottomBar, new cfd0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        mqi mqiVar = (mqi) this.P1.getValue();
        this.K1 = (lqi) mqiVar.p.get();
        this.L1 = mqiVar.n;
        this.M1 = mqiVar.o;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        fgd0 fgd0VarI0 = I0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(fgd0VarI0.q, new d7a0(fgd0VarI0, yjeVar, (byte) 12)), new gbv(fgd0VarI0, yjeVar, (byte) 26), (byte) 0);
        ffd0 ffd0Var = new ffd0(this, yjeVar, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(dnqVar, clzVarW, ffd0Var, (yje) null), 3);
        p7m0 p7m0Var = I0().r;
        ffd0 ffd0Var2 = new ffd0(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(p7m0Var, clzVarW2, ffd0Var2, (yje) null), 3);
        ol60 ol60Var = I0().s;
        ffd0 ffd0Var3 = new ffd0(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fxc0(ol60Var, clzVarW3, ffd0Var3, (yje) null, (byte) 0), 3);
        fgd0 fgd0VarI1 = I0();
        p6d p6dVar = new p6d(fgd0VarI1.q, fgd0VarI1.n.b(), new y0g(3, (yje) null, (byte) 10), (byte) 1);
        coc0 coc0Var = new coc0(this, yjeVar, (byte) 3);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new fxc0(p6dVar, clzVarW4, coc0Var, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.L1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final k3r H0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (k3r) objN;
    }

    public final fgd0 I0() {
        return (fgd0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new cfd0(this, (byte) 4));
        ccq0.V(this, "REQUEST_TOKEN_EXPIRED_KEY", new cfd0(this, (byte) 5));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new cfd0(this, (byte) 6));
        ccq0.V(this, "QR_CODE_ACTIVATION_SUCCESS_RESULT_KEY", new cfd0(this, (byte) 7));
        ccq0.V(this, "REQUEST_CONSULTANT_KEY", new cfd0(this, (byte) 8));
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
