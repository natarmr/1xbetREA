package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/wn60;", "La/yx5;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wn60 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(wn60.class, "viewBinding", "getViewBinding()Lorg/xplatform/core/databinding/FragmentGamesBonusFreeBinding;", 0)};
    public final i9o0 K1;
    public a7i L1;
    public final s0r M1;
    public final kiu0 N1;

    public wn60() {
        super(R.layout.fragment_games_bonus_free);
        this.K1 = i9o0.f14396a;
        this.M1 = ltt0.o(this, vn60.f37704a);
        pu50 pu50Var = new pu50(this, (byte) 16);
        a8z a8zVarA = maz.a(wez.b, new ej50(new ej50(this, (byte) 9), (byte) 10));
        this.N1 = agc.G(this, sre0.f32672a.b(yn60.class), new y620(a8zVarA, (byte) 28), new y620(a8zVarA, (byte) 29), pu50Var);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        bn70 bn70Var = fragment instanceof bn70 ? (bn70) fragment : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.n(this);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.M1.n(O1[0], this);
        objN.getClass();
        dyb.N(((i0r) objN).b, ymx.INTERVAL_2000, new cd60((Object) this, (byte) 6));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
