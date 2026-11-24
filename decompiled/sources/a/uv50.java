package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uv50;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uv50 extends yx5 {
    public final s0r K1;
    public final phf0 L1;
    public final phf0 M1;
    public final yzn0 N1;
    public final cgx0 O1;
    public final cgx0 P1;
    public ii Q1;
    public final n0o0 R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(uv50.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentNewsPagerBinding;", 0), new ez40(uv50.class, "bannerId", "getBannerId()Ljava/lang/String;", 0), new ez40(uv50.class, "bannerTitle", "getBannerTitle()Ljava/lang/String;", 0), new ez40(uv50.class, "actionType", "getActionType()Lorg/xplatform/banners/api/domain/models/BannerActionType;", 0), new ez40(uv50.class, "confirmFlag", "getConfirmFlag()Z", 0), new ez40(uv50.class, "showNavBarBundle", "getShowNavBarBundle()Z", 0)};
    public static final xuz U1 = new xuz();

    public uv50() {
        super(R.layout.fragment_news_pager);
        this.K1 = ltt0.o(this, tv50.f34583a);
        this.L1 = new phf0("ID");
        this.M1 = new phf0("BANNER_TITLE");
        this.N1 = new yzn0("ACTION_TYPE_EXTRA");
        this.O1 = new cgx0("CONFIRM_FLAG");
        this.P1 = new cgx0("SHOW_NAVBAR_ITEM", true);
        this.R1 = maz.b(new sv50(this, (byte) 0));
        this.S1 = xbc.a0(this, sre0.f32672a.b(kw50.class), null, new sv50(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(V1[0], this);
        objN.getClass();
        h97.t(((e2r) objN).b, new owp0(this), new ugd(701627499, true, new pi40(this, (byte) 19)));
    }

    @Override // a.yx5
    public final void C0() {
        this.Q1 = ((ami) this.R1.getValue()).f1109a;
    }

    public final k3t0 G0() {
        return (k3t0) this.S1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getS1() {
        return this.P1.n(this, V1[5]).booleanValue();
    }
}
