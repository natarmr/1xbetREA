package a;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.hltv.SelectAwardParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/izh0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class izh0 extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public e720 M1;
    public vq N1;
    public final boolean O1;
    public final a8z P1;
    public final s0r Q1;
    public final khf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(izh0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(izh0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;", 0)};
    public static final lme0 S1 = new lme0((byte) 16);

    public izh0() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 8);
        this.O1 = true;
        this.P1 = xbc.b0(this, sre0.f32672a.b(zzh0.class), new gzh0(this, (byte) 1));
        this.Q1 = ltt0.o(this, hzh0.f13906a);
        this.R1 = new khf0("SELECT_AWARD_PARAMS");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        vq vqVar = this.N1;
        if (vqVar == null) {
            Intrinsics.h("addEventToCouponDelegate");
            throw null;
        }
        vqVar.e(this, new nq2(), new rqc0(this, (byte) 6));
        vq vqVar2 = this.N1;
        if (vqVar2 != null) {
            vqVar2.f(this, new nq2(), new gzh0(this, (byte) 0));
        } else {
            Intrinsics.h("addEventToCouponDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        Application application = n0().getApplication();
        application.getClass();
        v8i v8iVarX = dyb.X(application);
        this.L1 = v8iVarX.f();
        this.M1 = (e720) v8iVarX.w;
        vq vqVarW = ((sue) v8iVarX.s).w();
        x1x.x(vqVarW);
        this.N1 = vqVarW;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-97339571, true, new uph0(this, (byte) 2)));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        G0().x(new dzh0((SelectAwardParams) this.R1.n(this, U1[1])));
        return super.X(layoutInflater, viewGroup, bundle);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
