package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/sf70;", "La/yx5;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class sf70 extends yx5 {
    public static final /* synthetic */ iiy[] M1 = {new j0d0(sf70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentBetButtonBinding;", 0)};
    public final i9o0 K1;
    public final s0r L1;

    public sf70() {
        super(R.layout.fragment_bet_button);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, rf70.f30372a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        dyb.b0(G0().b, ymx.INTERVAL_600, new cd60((Object) this, (byte) 18));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().c;
        nf60 nf60Var = new nf60(this, null, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(p7m0Var, clzVarW, nf60Var, (yje) null), 3);
    }

    public final kyq G0() {
        Object objN = this.L1.n(M1[0], this);
        objN.getClass();
        return (kyq) objN;
    }

    public abstract uf70 H0();

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public j9o0 getK1() {
        return this.K1;
    }
}
