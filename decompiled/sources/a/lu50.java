package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lu50;", "La/yx5;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lu50 extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public final s0r M1;
    public final zz2 N1;
    public final zz2 O1;
    public final zz2 P1;
    public final cgx0 Q1;
    public final cgx0 R1;
    public final n0o0 S1;
    public final a8z U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(lu50.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentNewsBinding;", 0), new ez40(lu50.class, "bundleBannerId", "getBundleBannerId()I", 0), new ez40(lu50.class, "bundleBannerType", "getBundleBannerType()I", 0), new ez40(lu50.class, "bundlePosition", "getBundlePosition()I", 0), new ez40(lu50.class, "bundleFromAggregator", "getBundleFromAggregator()Z", 0), new ez40(lu50.class, "bundleShowNavBar", "getBundleShowNavBar()Z", 0)};
    public static final uuz V1 = new uuz();

    public lu50() {
        super(R.layout.fragment_news);
        this.K1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitStaticTransparent, 12);
        this.M1 = ltt0.o(this, ku50.f18898a);
        this.N1 = new zz2("BANNER_ID");
        this.O1 = new zz2("BANNER_TYPE");
        this.P1 = new zz2("news_main_pager_position");
        this.Q1 = new cgx0("FROM_AGGREGATOR", true);
        this.R1 = new cgx0("SHOW_NAVBAR", true);
        this.S1 = maz.b(new ju50(this, (byte) 0));
        this.U1 = xbc.b0(this, sre0.f32672a.b(wu50.class), new ju50(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(W1[0], this);
        objN.getClass();
        h97.t(((c2r) objN).f3638a, new owp0(this), new ugd(-180034947, true, new pi40(this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = ((yli) this.S1.getValue()).a();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
