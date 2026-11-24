package a;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/iz80;", "La/nw5;", "La/cjk;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iz80 extends nw5<cjk> {
    public final phf0 e2 = new phf0("DEV_PASS_REQUEST_KEY");
    public final nae0 f2 = ltt0.p(this, hz80.f13895a);
    public static final /* synthetic */ iiy[] h2 = {new ez40(iz80.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(iz80.class, "binding", "getBinding()Lorg/xplatform/settings/impl/databinding/DialogPassBinding;", 0)};
    public static final nh70 g2 = new nh70();
    public static final String i2 = iz80.class.getSimpleName();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() {
        E0(false);
        dyb.O(L0().b, new ka70(this, D0(), (byte) 9));
        L0().c.setFocusableInTouchMode(true);
        L0().c.requestFocus();
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.password_enter);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final cjk L0() {
        Object objN = this.f2.n(h2[1], this);
        objN.getClass();
        return (cjk) objN;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.K = true;
        }
        J0();
    }
}
