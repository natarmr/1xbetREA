package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.NumberItemView;
import org.xplatform.ui_core.viewcomponents.views.NumberKeyboardView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/e68;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e68 extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final kiu0 M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(e68.class, "binding", "getBinding()Lorg/xplatform/biometry/impl/databinding/FragmentBiometryBinding;", 0)};
    public static final cl5 N1 = new cl5((byte) 8);

    public e68() {
        super(R.layout.fragment_biometry);
        this.L1 = ltt0.o(this, c68.f3805a);
        zo4 zo4Var = new zo4(this, (byte) 28);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 24), (byte) 25));
        this.M1 = agc.G(this, sre0.f32672a.b(j68.class), new rt6(a8zVarA, (byte) 10), new rt6(a8zVarA, (byte) 11), zo4Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().w(rv00.d);
        final qyq qyqVarG0 = G0();
        NumberKeyboardView numberKeyboardView = qyqVarG0.b;
        final byte b = 0;
        numberKeyboardView.setNumberClickListener(new Function1() { // from class: a.b68
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                qyq qyqVar = qyqVarG0;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        cl5 cl5Var = e68.N1;
                        view.getClass();
                        NumberItemView numberItemView = view instanceof NumberItemView ? (NumberItemView) view : null;
                        qyqVar.d.c(String.valueOf(numberItemView != null ? Integer.valueOf(numberItemView.a()) : null));
                        break;
                    default:
                        cl5 cl5Var2 = e68.N1;
                        view.getClass();
                        qyqVar.d.e();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        numberKeyboardView.setEraseClickListener(new Function1() { // from class: a.b68
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                qyq qyqVar = qyqVarG0;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        cl5 cl5Var = e68.N1;
                        view.getClass();
                        NumberItemView numberItemView = view instanceof NumberItemView ? (NumberItemView) view : null;
                        qyqVar.d.c(String.valueOf(numberItemView != null ? Integer.valueOf(numberItemView.a()) : null));
                        break;
                    default:
                        cl5 cl5Var2 = e68.N1;
                        view.getClass();
                        qyqVar.d.e();
                        break;
                }
                return Unit.f46060a;
            }
        });
        G0().d.setPasswordFinishedInterface(new a68(this, (byte) 0));
        C().u0("FINGERPRINT_REQUEST_KEY", this, new gne(this, (byte) 17));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f68.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f68 f68Var = (f68) (ze3Var instanceof f68 ? ze3Var : null);
            if (f68Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                y58 y58Var = f68Var.f8997a;
                eg3 eg3Var = f68Var.b;
                y58Var.getClass();
                eg3Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(j68.class, (n8i) new nhf0(y58Var, eg3Var, i1w0VarF).d));
                return;
            }
        }
        jf4.n(b1j.i(f68.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().j;
        Class<e68> cls = e68.class;
        c48 c48Var = new c48(2, this, cls, "handleBiometryUIState", "handleBiometryUIState(Lorg/xplatform/biometry/impl/presentation/models/BiometryAvailabilityUiState;)V", 4, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new u47(p7m0Var, clzVarW, c48Var, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().k;
        lkz lkzVar2 = lkz.f20223a;
        c48 c48Var2 = new c48(2, this, cls, "onAction", "onAction(Lorg/xplatform/biometry/impl/presentation/BiometryViewModel$ActionUi;)V", 4, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new u47(ol60Var, clzVarW2, c48Var2, (yje) null), 3);
    }

    public final qyq G0() {
        Object objN = this.L1.n(O1[0], this);
        objN.getClass();
        return (qyq) objN;
    }

    public final j68 H0() {
        return (j68) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        H0().w(gqw0.q);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        if (G0().b.getVisibility() == 0) {
            G0().b.setFingerprintClickListener(new a68(this, (byte) 1));
        }
        super.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        vcc.C(this, "FINGERPRINT_REQUEST_KEY");
    }
}
