package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/w560;", "La/yx5;", "La/rg90;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w560 extends yx5 implements rg90 {
    public fiu0 K1;
    public ii L1;
    public final a8z M1;
    public final a8z N1;
    public final s0r O1;
    public final n0o0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(w560.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final uuz Q1 = new uuz();

    public w560() {
        super(R.layout.compose_fragment);
        this.M1 = xbc.b0(this, sre0.f32672a.b(y560.class), new u560(this, (byte) 0));
        this.N1 = maz.a(wez.b, new u560(this, (byte) 1));
        this.O1 = ltt0.o(this, v560.f36814a);
        this.P1 = maz.b(new u560(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "NOMA_PAY_REQUEST_DIALOG_KEY", new u560(this, (byte) 3));
        qcc.W(this, this, new u560(this, (byte) 4));
        ccq0.V(this, "REQUEST_SHOW_PERMISSION_DENIED_DIALOG_KEY", new u560(this, (byte) 5));
        ccq0.T(this, "REQUEST_SHOW_PERMISSION_DENIED_DIALOG_KEY", new u560(this, (byte) 6));
        n0o0 n0o0Var = this.P1;
        qog0 qog0Var = (qog0) n0o0Var.getValue();
        qog0Var.getClass();
        qog0Var.f29072a.add(this);
        ((qog0) n0o0Var.getValue()).a();
    }

    @Override // a.yx5
    public final void C0() {
        fmi fmiVar = (fmi) this.N1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(y560.class, fmiVar.o));
        this.L1 = fmiVar.l;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        h97.t(((aid) objN).b, new owp0(this), new ugd(-1262825496, true, new pi40(this, (byte) 23)));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        if (n7x.p(arrayList)) {
            G0().x(f560.f8945a);
        } else {
            G0().x(e560.f7217a);
        }
    }
}
