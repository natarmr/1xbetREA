package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/v9r0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v9r0 extends yx5 {
    public final e9o0 K1;
    public final zz2 L1;
    public final s0r M1;
    public final boolean N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(v9r0.class, "eventId", "getEventId()I", 0), new j0d0(v9r0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final j6m0 O1 = new j6m0((byte) 23);
    public static final String Q1 = v9r0.class.getSimpleName();

    public v9r0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = new zz2("BUNDLE_EVENT_ID");
        this.M1 = ltt0.o(this, u9r0.f35297a);
        this.N1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(P1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, qek0.h, null, new ugd(-987008727, true, new p6r0(this, (byte) 1)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.N1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
