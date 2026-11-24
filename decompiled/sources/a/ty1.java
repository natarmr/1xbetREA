package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ty1;", "La/yx5;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ty1 extends yx5 {
    public final r34 K1;
    public fiu0 L1;
    public ynb M1;
    public ii N1;
    public final a8z O1;
    public final s0r P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(ty1.class, "bannerIdToOpen", "getBannerIdToOpen()J", 0), new j0d0(ty1.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/AggregatorTournamentsFragmentBinding;", 0)};
    public static final rek0 R1 = new rek0((byte) 19);

    public ty1() {
        super(R.layout.aggregator_tournaments_fragment);
        this.K1 = new r34("BANNER_ITEM");
        this.O1 = xbc.b0(this, sre0.f32672a.b(wz1.class), new nc(this, (byte) 27));
        this.P1 = ltt0.o(this, sy1.f33003a);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().r().u0("REQUEST_KEY_TOURNAMENT_ACTION", K(), new gne(this, (byte) 8));
        Object objN = this.P1.n(S1[1], this);
        objN.getClass();
        pkd.h(((uy1) objN).f36467a, new owp0(this), null, new ugd(-1225239909, true, new o00(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        for (Fragment fragment = this.y; fragment != null; fragment = fragment.y) {
            if (fragment instanceof v51) {
                q7i q7iVar = (q7i) ((v51) fragment).V1.getValue();
                this.L1 = q7iVar.c();
                ynb ynbVarI = ((yzn0) q7iVar.b0.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                this.N1 = q7iVar.a0;
                return;
            }
        }
        jf4.n("Can't find AggregatorComponentHolder");
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(wx1.f39909a);
        iiy[] iiyVarArr = S1;
        iiy iiyVar = iiyVarArr[0];
        r34 r34Var = this.K1;
        if (r34Var.n(this, iiyVar).longValue() != 0) {
            G0().x(new ay1(r34Var.n(this, iiyVarArr[0]).longValue()));
            r34Var.j(this, iiyVarArr[0], 0L);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        G0().x(vx1.f38179a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.Q1;
    }
}
