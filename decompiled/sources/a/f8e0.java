package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/f8e0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f8e0 extends yx5 {
    public final i9o0 K1;
    public final khf0 L1;
    public final s0r M1;
    public fiu0 N1;
    public final boolean O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(f8e0.class, "screenParams", "getScreenParams()Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;", 0), new j0d0(f8e0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final mi70 Q1 = new mi70();

    public f8e0() {
        super(R.layout.compose_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = new khf0("SCREEN_PARAMS");
        this.M1 = ltt0.o(this, e8e0.f7367a);
        this.O1 = true;
        this.P1 = xbc.b0(this, sre0.f32672a.b(x8e0.class), new p7d0(this, (byte) 22));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(q7e0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            q7e0 q7e0Var = (q7e0) (ze3Var instanceof q7e0 ? ze3Var : null);
            if (q7e0Var != null) {
                this.N1 = q7e0Var.a(a4n0.f(this), (RatingStatisticScreenParams) this.L1.n(this, R1[0])).i();
                return;
            }
        }
        jf4.n(b1j.i(q7e0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        ((k3t0) this.P1.getValue()).x(v7e0.f36920a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        Object objN = this.M1.n(R1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(-1415874210, true, new nrc0(this, (byte) 22)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
