package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/i4e0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i4e0 extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final khf0 M1;
    public final boolean N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(i4e0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(i4e0.class, "screenParams", "getScreenParams()Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;", 0)};
    public static final xi70 P1 = new xi70();

    public i4e0() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, h4e0.f12429a);
        this.M1 = new khf0("SCREEN_PARAMS");
        this.N1 = true;
        this.O1 = xbc.b0(this, sre0.f32672a.b(t4e0.class), new p7d0(this, (byte) 15));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        vcc.g0(this, "EXTRA_REQUEST_KEY", new f4e0(this, (byte) 1));
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
                this.K1 = q7e0Var.a(a4n0.f(this), (RatingStatisticScreenParams) this.M1.n(this, Q1[1])).i();
                return;
            }
        }
        jf4.n(b1j.i(q7e0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) ((k3t0) this.O1.getValue())).C();
        s9c0 s9c0Var = new s9c0(this, null, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0((i89) gmqVarC, clzVarW, s9c0Var, (yje) null), 3);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(1973173316, true, new f4e0(this, (byte) 0)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
