package a;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tu5;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tu5 extends yx5 {
    public final e9o0 K1;
    public q9i L1;
    public ii M1;
    public final kiu0 N1;
    public final s0r O1;
    public final phf0 P1;
    public final phf0 Q1;
    public final n0o0 R1;
    public final ru5 S1;
    public final ywq U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(tu5.class, "binding", "getBinding()Lorg/xplatform/barcode_scanner/impl/databinding/FragmentBarcodeScannerBinding;", 0), new ez40(tu5.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(tu5.class, "bundleKey", "getBundleKey()Ljava/lang/String;", 0)};
    public static final yk5 V1 = new yk5();

    /* JADX WARN: Type inference failed for: r0v10, types: [a.ru5] */
    public tu5() {
        super(R.layout.fragment_barcode_scanner);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, bp3Var, bp3Var);
        qu5 qu5Var = new qu5(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 27), (byte) 28));
        this.N1 = agc.G(this, sre0.f32672a.b(wu5.class), new qw4(a8zVarA, (byte) 16), new qw4(a8zVarA, (byte) 17), qu5Var);
        this.O1 = ltt0.o(this, su5.f32805a);
        this.P1 = new phf0("SCAN_RESULT_REQUEST_KEY");
        this.Q1 = new phf0("SCAN_RESULT_BUNDLE_KEY");
        this.R1 = maz.b(new qu5(this, (byte) 1));
        this.S1 = new iu5() { // from class: a.ru5
            @Override // a.iu5
            public final void b(lu5 lu5Var) {
                yk5 yk5Var = tu5.V1;
                tu5 tu5Var = this.f31108a;
                tu5Var.G0().b.d();
                ((kb6) tu5Var.R1.getValue()).a();
                i0g0 i0g0Var = lu5Var.f20658a;
                String str = i0g0Var.f13947a;
                if (str == null || str.length() == 0) {
                    return;
                }
                phf0 phf0Var = tu5Var.P1;
                iiy[] iiyVarArr = tu5.W1;
                vcc.f0(i120.V(new Pair(tu5Var.Q1.n(tu5Var, iiyVarArr[2]), i0g0Var.f13947a)), tu5Var, phf0Var.n(tu5Var, iiyVarArr[1]));
                tu5Var.H0().w();
            }
        };
        this.U1 = m0(new yl3(this, (byte) 1), new xn((byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().d.setNavigationOnClickListener(new q10(this, (byte) 2));
        iyq iyqVarG0 = G0();
        FrameLayout frameLayout = iyqVarG0.c;
        DecoratedBarcodeView decoratedBarcodeView = iyqVarG0.b;
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new w23(iyqVarG0, (byte) 3));
        } else {
            int height = frameLayout.getHeight();
            decoratedBarcodeView.getBarcodeView().setFramingRectSize(new g7k0(frameLayout.getWidth(), height));
        }
        decoratedBarcodeView.getViewFinder().setLaserVisibility(false);
        decoratedBarcodeView.getStatusView().setVisibility(8);
        decoratedBarcodeView.getBarcodeView().getCameraSettings().b = 1;
        decoratedBarcodeView.getBarcodeView().getCameraSettings().b = 1;
        Intent intent = new Intent();
        intent.putExtra("SCAN_FORMATS", "AZTEC,CODABAR,CODE_39,CODE_93,CODE_128,DATA_MATRIX,EAN_8,EAN_13,ITF,MAXICODE,PDF_417,QR_CODE,RSS_14,RSS_EXPANDED,UPC_A,UPC_E,UPC_EAN_EXTENSION");
        decoratedBarcodeView.c(intent);
        decoratedBarcodeView.a(this.S1);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mu5.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mu5 mu5Var = (mu5) (ze3Var instanceof mu5 ? ze3Var : null);
            if (mu5Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ii iiVar = mu5Var.f22398a;
                c8c c8cVar = mu5Var.b;
                iiVar.getClass();
                c8cVar.getClass();
                es esVar = new es();
                esVar.f8305a = i1w0VarF;
                esVar.b = c8cVar;
                esVar.c = n0k0.a(new n8i(esVar, (byte) 15));
                this.L1 = (q9i) ((n5d0) esVar.c).get();
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(mu5.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        lr lrVar = new lr(H0().e, (byte) 24);
        cm3 cm3Var = new cm3(this, null, (byte) 19);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new me5(lrVar, clzVarW, cm3Var, (yje) null), 3);
    }

    public final iyq G0() {
        Object objN = this.O1.n(W1[0], this);
        objN.getClass();
        return (iyq) objN;
    }

    public final wu5 H0() {
        return (wu5) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.T(this, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY", new qu5(this, (byte) 2));
        ccq0.V(this, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY", new qu5(this, (byte) 3));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        if (jiq0.j0(o0(), "android.permission.CAMERA") == 0) {
            G0().b.d();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        if (jiq0.j0(o0(), "android.permission.CAMERA") == 0) {
            G0().b.e();
        } else {
            H0().x();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        BarcodeView barcodeView = G0().b.getBarcodeView();
        barcodeView.B = 1;
        barcodeView.f1 = null;
        barcodeView.j();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
