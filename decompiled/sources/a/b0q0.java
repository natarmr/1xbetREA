package a;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/b0q0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b0q0 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(b0q0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new j0d0(b0q0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final g9m0 P1 = new g9m0();

    public b0q0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("PLAYER_ID");
        this.L1 = ltt0.o(this, a0q0.f36a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(x0q0.class), new nxo0(this, (byte) 28));
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(957729341, true, new l7p0(this, (byte) 14)));
        ((k3t0) this.N1.getValue()).x(qzp0.f29590a);
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = d0q0.f5279a;
        iiy[] iiyVarArr = Q1;
        iiy iiyVar = iiyVarArr[0];
        phf0 phf0Var = this.K1;
        this.M1 = d0q0.b(d0q0.a(phf0Var.n(this, iiyVar), efx.v(this)), this, phf0Var.n(this, iiyVarArr[0]), a4n0.f(this)).a();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ((k3t0) this.N1.getValue()).x(uzp0.f36547a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        ((k3t0) this.N1.getValue()).x(vzp0.f38309a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
