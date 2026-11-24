package a;

import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/l6h0;", "La/yx5;", "<init>", "()V", "scratch_card"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l6h0 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(l6h0.class, "viewBinding", "getViewBinding()Lorg/xplatform/scratch_card/databinding/FragmentScratchCardBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;

    public l6h0() {
        super(R.layout.fragment_scratch_card);
        this.K1 = i9o0.f14396a;
        j6h0 j6h0Var = new j6h0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 14), (byte) 15));
        this.M1 = agc.G(this, sre0.f32672a.b(w6h0.class), new fxf0(a8zVarA, (byte) 16), new fxf0(a8zVarA, (byte) 17), j6h0Var);
        this.N1 = ltt0.o(this, k6h0.f17770a);
    }

    @Override // a.yx5
    public final void C0() {
        qsi qsiVar;
        Fragment fragment = this.y;
        l7h0 l7h0Var = fragment instanceof l7h0 ? (l7h0) fragment : null;
        if (l7h0Var == null || (qsiVar = (qsi) l7h0Var.W1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(w6h0.class, qsiVar.n0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((w6h0) this.M1.getValue()).n;
        tye0 tye0Var = new tye0(this, null, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kmg0(p7m0Var, clzVarW, tye0Var, (yje) null), 3);
    }

    public final m4r G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (m4r) objN;
    }

    public final void H0(boolean z) {
        G0().f.setVisibility(z ? 0 : 8);
        G0().c.setVisibility(z ? 0 : 8);
        G0().b.setVisibility(!z ? 0 : 8);
        G0().d.setVisibility(z ? 8 : 0);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        w6h0 w6h0Var = (w6h0) this.M1.getValue();
        sac.V(jiu0.a(w6h0Var), new aif0(1, w6h0Var, w6h0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, null, new tmg0(w6h0Var, null, (byte) 1), 14);
        super.Z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
