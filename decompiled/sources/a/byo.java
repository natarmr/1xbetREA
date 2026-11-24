package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/byo;", "La/yx5;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class byo extends yx5 {
    public final f9o0 K1;
    public final s0r L1;
    public final yzn0 M1;
    public final a8z N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(byo.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(byo.class, "navigation", "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;", 0)};
    public static final bek P1 = new bek();

    public byo() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, ayo.f1677a);
        this.M1 = new yzn0("EXTRA_NAVIGATION_KEY");
        this.N1 = maz.a(wez.b, new zxo(this, (byte) 0));
        this.O1 = xbc.a0(this, sre0.f32672a.b(gzo.class), null, new zxo(this, (byte) 1), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        b1j.t(G0().b, new ugd(-2070389246, true, new f5o(this, (byte) 9)));
    }

    public final aid G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (aid) objN;
    }

    public final k3t0 H0() {
        return (k3t0) this.O1.getValue();
    }

    public final void I0(sek0 sek0Var, String str) {
        wdk0 wdk0Var = (wdk0) ((egi) this.N1.getValue()).f7767a.o;
        x1x.y(wdk0Var);
        wdk0.k(wdk0Var, new xdk0(sek0Var, str, null, null, null, null, 124), this, null, null, false, null, 1020);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "ERROR_REQUEST_KEY", new zxo(this, (byte) 2));
        ((egi) this.N1.getValue()).getClass();
        F().u0("CAPTCHA_REQUEST_KEY", this, new hi("CAPTCHA_REQUEST_KEY", new ago((byte) 24), new yhn((Object) this, (byte) 21)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        View view = this.l1;
        if (view != null) {
            j120.X(view);
            view.clearFocus();
        }
        hxm0.m(G0().f919a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(G0().f919a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
