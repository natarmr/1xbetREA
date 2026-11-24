package a;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"La/qid0;", "La/yx5;", "<init>", "()V", "a/oid0", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qid0 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public ii M1;
    public final kiu0 N1;
    public final s0r O1;
    public final phf0 P1;
    public final phf0 Q1;
    public final n0o0 R1;
    public final n0o0 S1;
    public final ywq U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(qid0.class, "binding", "getBinding()Lorg/xplatform/authqr/impl/databinding/FragmentQrScannerBinding;", 0), new ez40(qid0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(qid0.class, "bundleKey", "getBundleKey()Ljava/lang/String;", 0)};
    public static final rl70 V1 = new rl70();

    public qid0() {
        super(R.layout.fragment_qr_scanner);
        this.K1 = hnm0.f13359a;
        nid0 nid0Var = new nid0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 13), (byte) 14));
        this.N1 = agc.G(this, sre0.f32672a.b(sid0.class), new ync0(a8zVarA, (byte) 16), new ync0(a8zVarA, (byte) 17), nid0Var);
        this.O1 = ltt0.o(this, pid0.f27038a);
        this.P1 = new phf0("QR_SCAN_RESULT_REQUEST_KEY");
        this.Q1 = new phf0("QR_SCAN_RESULT_BUNDLE_KEY");
        this.R1 = maz.b(new nid0(this, (byte) 1));
        this.S1 = maz.b(new nid0(this, (byte) 2));
        this.U1 = m0(new yl3(this, (byte) 11), new xn((byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.b(new nid0(this, (byte) 5));
        DecoratedBarcodeView decoratedBarcodeView = G0().c;
        decoratedBarcodeView.getViewFinder().setLaserVisibility(false);
        decoratedBarcodeView.getStatusView().setVisibility(8);
        decoratedBarcodeView.getBarcodeView().getCameraSettings().b = 1;
        decoratedBarcodeView.getBarcodeView().getCameraSettings().b = 1;
        Intent intent = new Intent();
        intent.putExtra("SCAN_FORMATS", CommonConstant.RETKEY.QR_CODE);
        intent.putExtra("SCAN_FORMATS", "2");
        decoratedBarcodeView.c(intent);
        decoratedBarcodeView.a((iu5) this.S1.getValue());
        if (jiq0.j0(o0(), "android.permission.CAMERA") == -1) {
            this.U1.a("android.permission.CAMERA");
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rid0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rid0 rid0Var = (rid0) (ze3Var instanceof rid0 ? ze3Var : null);
            if (rid0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ii iiVar = rid0Var.f30538a;
                iiVar.getClass();
                yzn0 yzn0Var = new yzn0();
                yzn0Var.f43523a = i1w0VarF;
                yzn0Var.b = new ppi(yzn0Var, (byte) 10);
                this.L1 = new fiu0(Collections.singletonMap(sid0.class, (ppi) yzn0Var.b));
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(rid0.class, "Cannot create dependency "));
    }

    public final n3r G0() {
        Object objN = this.O1.n(W1[0], this);
        objN.getClass();
        return (n3r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.T(this, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY", new nid0(this, (byte) 3));
        ccq0.V(this, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY", new nid0(this, (byte) 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        if (jiq0.j0(o0(), "android.permission.CAMERA") == 0) {
            G0().c.d();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        if (jiq0.j0(o0(), "android.permission.CAMERA") == 0) {
            G0().c.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        BarcodeView barcodeView = G0().c.getBarcodeView();
        barcodeView.B = 1;
        barcodeView.f1 = null;
        barcodeView.j();
        this.j1 = true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
