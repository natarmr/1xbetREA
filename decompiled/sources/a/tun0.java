package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tun0;", "La/yx5;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tun0 extends yx5 {
    public final boolean K1;
    public final a8z L1;
    public final s0r M1;
    public final r34 N1;
    public final r34 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(tun0.class, "binding", "getBinding()Lorg/xplatform/swipex/impl/databinding/FiltersFragmentBinding;", 0), new ez40(tun0.class, "expandSportId", "getExpandSportId()J", 0), new ez40(tun0.class, "expandSubSportId", "getExpandSubSportId()J", 0)};
    public static final y2m0 P1 = new y2m0((byte) 8);

    public tun0() {
        super(R.layout.filters_fragment);
        this.K1 = true;
        this.L1 = maz.a(wez.b, new jfm0(this, (byte) 18));
        this.M1 = ltt0.o(this, sun0.f32830a);
        this.N1 = new r34("EXPAND_SPORT_ID_KEY");
        this.O1 = new r34("EXPAND_SUB_SPORT_ID_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "CHANGE_FILTERS_KEY", new a7n0((byte) 20));
        Object objN = this.M1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((w5q) objN).b, new ugd(-1822140570, true, new abn0(this, (byte) 11)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
