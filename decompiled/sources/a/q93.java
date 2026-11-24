package a;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/q93;", "La/yx5;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q93 extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public final a8z M1;
    public final s0r N1;
    public final r34 O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(q93.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(q93.class, "selectedCategoryId", "getSelectedCategoryId()J", 0)};
    public static final pek0 Q1 = new pek0();

    public q93() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 8);
        this.M1 = xbc.b0(this, sre0.f32672a.b(v93.class), new a13(this, (byte) 7));
        this.N1 = ltt0.o(this, p93.f26588a);
        this.O1 = new r34("ANOTHER_AWARDS_SELECTED_CATEGORY");
        this.P1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        Application application = n0().getApplication();
        application.getClass();
        this.L1 = dyb.X(application).f();
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1339302644, true, new fa2((Object) this, (byte) 8)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((k3t0) this.M1.getValue()).x(new n93(this.O1.n(this, R1[1]).longValue()));
        return super.X(layoutInflater, viewGroup, bundle);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.P1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
