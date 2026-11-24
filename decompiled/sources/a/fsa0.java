package a;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/fsa0;", "La/yx5;", "La/ocl0;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fsa0 extends yx5 implements ocl0 {
    public final e9o0 K1;
    public xi70 L1;
    public wdk0 M1;
    public ugf0 N1;
    public ujd O1;
    public final r34 P1;
    public final a8z Q1;
    public final a8z R1;
    public final s0r S1;
    public final boolean U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(fsa0.class, "gameId", "getGameId()J", 0), new j0d0(fsa0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final nh70 V1 = new nh70();

    public fsa0() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.P1 = new r34("GAME_ID_KEY");
        this.Q1 = maz.a(wez.b, new csa0(this, (byte) 0));
        this.R1 = xbc.a0(this, sre0.f32672a.b(ata0.class), null, new csa0(this, (byte) 1), 14);
        this.S1 = ltt0.o(this, esa0.f8320a);
        this.U1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new csa0(this, (byte) 2));
        Object objN = this.S1.n(W1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, qek0.h, null, new ugd(-1678184228, true, new lma0(this, (byte) 2)));
        ujd ujdVar = this.O1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new dsa0(this, (byte) 0));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        ooi ooiVar = (ooi) this.Q1.getValue();
        this.L1 = ooiVar.k.f();
        this.M1 = ooiVar.w;
        this.N1 = ooiVar.d;
        ujd ujdVarD = ooiVar.q.d();
        x1x.x(ujdVarD);
        this.O1 = ujdVarD;
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        if (this.O1 == null) {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
        ujd.a(this);
        super.Z();
    }

    @Override // a.ocl0
    public final pcl0 u(Function0 function0) {
        ugf0 ugf0Var = this.N1;
        if (ugf0Var != null) {
            return ugf0Var;
        }
        Intrinsics.h("sportGameCoreLib");
        throw null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.U1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
