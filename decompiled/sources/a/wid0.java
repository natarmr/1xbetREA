package a;

import android.os.Build;
import android.os.Bundle;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wid0;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wid0 extends yx5 {
    public qqi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final a8z P1;
    public final yzn0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(wid0.class, "binding", "getBinding()Lorg/xplatform/authqr/impl/databinding/FragmentQrSendConfirmationMailBinding;", 0), new ez40(wid0.class, "temporaryToken", "getTemporaryToken()Lorg/xplatform/onexuser/domain/models/TemporaryToken;", 0)};
    public static final jh70 R1 = new jh70();

    public wid0() {
        super(R.layout.fragment_qr_send_confirmation_mail);
        tid0 tid0Var = new tid0(this, (byte) 0);
        f1d0 f1d0Var = new f1d0(this, (byte) 15);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new f1d0(f1d0Var, (byte) 16));
        this.N1 = agc.G(this, sre0.f32672a.b(ijd0.class), new ync0(a8zVarA, (byte) 18), new ync0(a8zVarA, (byte) 19), tid0Var);
        this.O1 = ltt0.o(this, uid0.f35725a);
        this.P1 = maz.a(wezVar, new tid0(this, (byte) 1));
        this.Q1 = new yzn0("TEMPORARY_TOKEN_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        MaterialTextView materialTextView = G0().d;
        int i = Build.VERSION.SDK_INT;
        materialTextView.setBreakStrategy(0);
        if (i >= 26) {
            materialTextView.setJustificationMode(1);
        }
        G0().c.b(new tid0(this, (byte) 2));
        DsBottomBar.u(G0().b, new tid0(this, (byte) 3));
    }

    @Override // a.yx5
    public final void C0() {
        rqi rqiVar = (rqi) this.P1.getValue();
        this.K1 = (qqi) rqiVar.i.get();
        this.L1 = rqiVar.g;
        this.M1 = rqiVar.h;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().h;
        vid0 vid0Var = new vid0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(p7m0Var, clzVarW, vid0Var, (yje) null), 3);
        ol60 ol60Var = H0().i;
        vid0 vid0Var2 = new vid0(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(ol60Var, clzVarW2, vid0Var2, (yje) null, (byte) 0), 3);
    }

    public final o3r G0() {
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        return (o3r) objN;
    }

    public final ijd0 H0() {
        return (ijd0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", new tid0(this, (byte) 5));
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new tid0(this, (byte) 6));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new tid0(this, (byte) 4));
    }
}
