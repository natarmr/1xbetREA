package a;

import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cdw;", "La/yx5;", "<init>", "()V", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cdw extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public e720 M1;
    public vq N1;
    public final a8z O1;
    public final s0r P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(cdw.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final rqt R1 = new rqt();

    public cdw() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.O1 = xbc.b0(this, sre0.f32672a.b(hfw.class), new zcw(this, (byte) 0));
        this.P1 = ltt0.o(this, bdw.f2421a);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        vq vqVar = this.N1;
        if (vqVar == null) {
            Intrinsics.h("addEventToCouponDelegate");
            throw null;
        }
        vqVar.e(this, new mq2(), new elm(this, (byte) 20));
        vq vqVar2 = this.N1;
        if (vqVar2 != null) {
            vqVar2.f(this, new mq2(), new zcw(this, (byte) 1));
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
        Object objN = this.P1.n(S1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1732766068, true, new xxv(this, (byte) 3)));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
