package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/icn0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class icn0 extends yx5 {
    public final boolean K1;
    public ii L1;
    public ujd M1;
    public dvi N1;
    public evi O1;
    public fvi P1;
    public final a8z Q1;
    public final a8z R1;
    public final a8z S1;
    public final a8z U1;
    public final s0r V1;
    public static final /* synthetic */ iiy[] X1 = {new j0d0(icn0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final g9m0 W1 = new g9m0();

    public icn0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        tre0 tre0Var = sre0.f32672a;
        this.Q1 = xbc.a0(this, tre0Var.b(pcn0.class), null, new fcn0(this, (byte) 3), 14);
        this.R1 = xbc.a0(this, tre0Var.b(rdn0.class), null, new fcn0(this, (byte) 4), 14);
        this.S1 = xbc.a0(this, tre0Var.b(ren0.class), null, new fcn0(this, (byte) 5), 14);
        this.U1 = maz.a(wez.b, new fcn0(this, (byte) 6));
        this.V1 = ltt0.o(this, hcn0.f12831a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.V1.n(X1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(2064355528, true, new abn0(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        gvi gviVar = (gvi) this.U1.getValue();
        this.L1 = gviVar.f11975a;
        ujd ujdVarD = gviVar.b.d();
        x1x.x(ujdVarD);
        this.M1 = ujdVarD;
        this.N1 = (dvi) gviVar.G.get();
        this.O1 = (evi) gviVar.H.get();
        this.P1 = (fvi) gviVar.I.get();
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    public final k3t0 H0() {
        return (k3t0) this.R1.getValue();
    }

    public final void I0() {
        ii iiVar = this.L1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.attention);
        String strH2 = H(R.string.self_exclusion_changes_prohibited);
        String strH3 = H(R.string.ok_new);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "SELF_EXCLUSION_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "CLEAR_EVENTS_CONFIRM_DIALOG_KEY", new fcn0(this, (byte) 0));
        ccq0.V(this, "CLEAR_TEAMS_CONFIRM_DIALOG_KEY", new fcn0(this, (byte) 1));
        ccq0.V(this, "SELF_EXCLUSION_ERROR_DIALOG_KEY", new fcn0(this, (byte) 2));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.K1;
    }
}
