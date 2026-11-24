package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dm0;", "La/yx5;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dm0 extends yx5 {
    public fiu0 K1;
    public ynb L1;
    public wdk0 M1;
    public ii N1;
    public final a8z O1;
    public final s0r P1;
    public final yzn0 Q1;
    public final n0o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(dm0.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorFavoritesBinding;", 0), new ez40(dm0.class, "favoriteType", "getFavoriteType()Lorg/xplatform/aggregator/api/navigation/FavoriteType;", 0)};
    public static final pek0 S1 = new pek0();

    public dm0() {
        super(R.layout.fragment_aggregator_favorites);
        this.O1 = xbc.b0(this, sre0.f32672a.b(qo0.class), new bm0(this, (byte) 0));
        this.P1 = ltt0.o(this, cm0.f4584a);
        this.Q1 = new yzn0("FAVORITE_TYPE");
        this.R1 = maz.b(new bm0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new gne(this, (byte) 6));
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new bm0(this, (byte) 2));
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        h97.t(((qxq) objN).f29498a, new owp0(this), new ugd(1312576772, true, new tx(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        q7i q7iVar = (q7i) this.R1.getValue();
        this.K1 = q7iVar.c();
        ynb ynbVarI = ((yzn0) q7iVar.b0.b).i();
        x1x.x(ynbVarI);
        this.L1 = ynbVarI;
        this.M1 = q7iVar.c0;
        this.N1 = q7iVar.a0;
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return true;
    }
}
