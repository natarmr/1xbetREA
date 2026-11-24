package a;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.special_event.impl.results.presentation.model.ResultsScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/y5g0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y5g0 extends yx5 {
    public final s0r K1;
    public oll0 L1;
    public final n0o0 M1;
    public final khf0 N1;
    public final a8z O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(y5g0.class, "binding", "getBinding()Lorg/xplatform/special_event/impl/databinding/ComposeScreenViewBinding;", 0), new ez40(y5g0.class, "screenParams", "getScreenParams()Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;", 0)};
    public static final gle0 Q1 = new gle0();
    public static final String S1 = y5g0.class.getSimpleName();

    public y5g0() {
        super(R.layout.compose_screen_view);
        this.K1 = ltt0.o(this, x5g0.f40315a);
        this.M1 = maz.b(new w5g0(this, (byte) 0));
        this.N1 = new khf0("RESULTS_FRAGMENT_SCREEN_PARAMS");
        this.O1 = xbc.a0(this, sre0.f32672a.b(o9g0.class), null, new w5g0(this, (byte) 1), 14);
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        pkd.k(((ekd) objN).b, ((hsi) this.M1.getValue()).q.f8531a, new ugd(1304135847, true, new dke0(this, (byte) 12)));
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = ((g45) ((hsi) this.M1.getValue()).f13584a.f45137a).K();
    }

    public final ResultsScreenParams G0() {
        return (ResultsScreenParams) this.N1.n(this, R1[1]);
    }

    public final k3t0 H0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        kxq kxqVarB;
        if (F().J(this.B) == null || ((kxqVarB = B()) != null && kxqVarB.isFinishing())) {
            LinkedHashMap linkedHashMap = n8l0.f23096a;
            int i = G0().f46971a;
            String str = efx.v(this).f4046a;
            String str2 = S1;
            str2.getClass();
            n8l0.f23096a.remove(i + str + str2);
        }
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
