package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/o7u0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o7u0 extends yx5 {
    public static final /* synthetic */ iiy[] N1 = {new j0d0(o7u0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public ii K1;
    public final a8z L1;
    public final s0r M1;

    public o7u0() {
        super(R.layout.compose_fragment);
        this.L1 = maz.a(wez.b, new m7u0(this, (byte) 1));
        this.M1 = ltt0.o(this, n7u0.f23058a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(N1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new shd((byte) 15), hmw0.g);
        ccq0.V(this, "REQUEST_KEY_DIALOG", new m7u0(this, (byte) 0));
        ii iiVar = this.K1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.attention);
        String strH2 = H(R.string.alert_error_body_call_to_support);
        String strH3 = H(R.string.ok);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_KEY_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = ((uyi) this.L1.getValue()).f36490a;
    }
}
