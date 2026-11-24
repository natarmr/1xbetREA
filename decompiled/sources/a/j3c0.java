package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/j3c0;", "La/nw5;", "La/ejk;", "<init>", "()V", "a/rl70", "blocking"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j3c0 extends nw5<ejk> {
    public final nae0 e2 = ltt0.p(this, i3c0.f14091a);
    public static final /* synthetic */ iiy[] g2 = {new j0d0(j3c0.class, "binding", "getBinding()Lorg/xplatform/blocking/databinding/DialogProgressGeoBinding;", 0)};
    public static final rl70 f2 = new rl70();
    public static final String h2 = j3c0.class.getSimpleName();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.e2.n(g2[0], this);
        objN.getClass();
        return (ejk) objN;
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.geo_progress_parent;
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        E0(false);
    }
}
