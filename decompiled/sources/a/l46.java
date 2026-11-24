package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/l46;", "La/yx5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l46 extends yx5 {
    public final s0r K1;
    public r9i L1;
    public ii M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(l46.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kl5 O1 = new kl5();

    public l46() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, k46.f17653a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(s46.class), null, new j46(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_ERROR_DIALOG_KEY", new j46(this, (byte) 1));
        Object objN = this.K1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new gh5((byte) 7), new ugd(1728040064, true, new fa2(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(m46.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            m46 m46Var = (m46) (ze3Var instanceof m46 ? ze3Var : null);
            if (m46Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ii iiVar = m46Var.f21152a;
                mne mneVar = m46Var.b;
                iiVar.getClass();
                this.L1 = (r9i) ((n5d0) new cu(iiVar, i1w0VarF, mneVar).d).get();
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(m46.class, "Cannot create dependency "));
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
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }
}
