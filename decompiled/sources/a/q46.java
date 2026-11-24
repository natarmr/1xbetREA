package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/q46;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q46 extends yx5 {
    public final s0r K1;
    public s9i L1;
    public ii M1;
    public final kiu0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(q46.class, "binding", "getBinding()Lorg/xplatform/verification/base/impl/databinding/FragmentBaseVerificationBinding;", 0)};
    public static final bj5 O1 = new bj5();

    public q46() {
        super(R.layout.fragment_base_verification);
        this.K1 = ltt0.o(this, o46.f24617a);
        zo4 zo4Var = new zo4(this, (byte) 15);
        a8z a8zVarA = maz.a(wez.b, new p46(new pp4(this, (byte) 29), (byte) 0));
        this.N1 = agc.G(this, sre0.f32672a.b(t46.class), new qw4(a8zVarA, (byte) 18), new qw4(a8zVarA, (byte) 19), zo4Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        iiy[] iiyVarArr = P1;
        iiy iiyVar = iiyVarArr[0];
        s0r s0rVar = this.K1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((jyq) objN).b.setTitle(H(R.string.verification));
        Object objN2 = s0rVar.n(iiyVarArr[0], this);
        objN2.getClass();
        ((jyq) objN2).b.setNavigationOnClickListener(new q10(this, (byte) 4));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(n46.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            n46 n46Var = (n46) (ze3Var instanceof n46 ? ze3Var : null);
            if (n46Var != null) {
                ii iiVar = n46Var.f22885a;
                iiVar.getClass();
                this.L1 = (s9i) n0k0.a(new p8i((byte) 2)).get();
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(n46.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        ii iiVar = this.M1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.error);
        String strH2 = H(R.string.sdk_not_found_error_message);
        String strH3 = H(R.string.ok_new);
        strH3.getClass();
        iiVar.d(new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528), n0().r());
    }
}
