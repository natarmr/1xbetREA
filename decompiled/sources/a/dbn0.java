package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dbn0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dbn0 extends yx5 {
    public final boolean K1;
    public ii L1;
    public bvi M1;
    public wdk0 N1;
    public ujd O1;
    public final a8z P1;
    public final a8z Q1;
    public final s0r R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(dbn0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final j6m0 S1 = new j6m0((byte) 4);

    public dbn0() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.P1 = xbc.a0(this, sre0.f32672a.b(ven0.class), null, new bbn0(this, (byte) 0), 14);
        this.Q1 = maz.a(wez.b, new bbn0(this, (byte) 1));
        this.R1 = ltt0.o(this, cbn0.f4070a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.R1.n(U1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1940392770, true, new abn0(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        cvi cviVar = (cvi) this.Q1.getValue();
        this.L1 = cviVar.f5029a;
        this.M1 = (bvi) cviVar.C.get();
        this.N1 = cviVar.B;
        ujd ujdVarD = cviVar.y.d();
        x1x.x(ujdVarD);
        this.O1 = ujdVarD;
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_SHOW_CONFIRM_DELETE_DIALOG_KEY", new bbn0(this, (byte) 2));
        ccq0.V(this, "REQUEST_SELF_EXCLUSION_ERROR_DIALOG_KEY", new bbn0(this, (byte) 3));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        wdk0 wdk0Var = this.N1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.K1);
        ujd ujdVar = this.O1;
        if (ujdVar != null) {
            ujdVar.c(this, new is2(), new j1l0(this, (byte) 21));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        if (this.N1 == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        vcc.C(this, "request_key_notification_updated");
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.K1;
    }
}
