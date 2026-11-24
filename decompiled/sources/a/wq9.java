package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wq9;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wq9 extends yx5 {
    public final boolean K1;
    public abi L1;
    public ii M1;
    public wdk0 N1;
    public final a8z O1;
    public final phf0 P1;
    public final cgx0 Q1;
    public final r34 R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(wq9.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(wq9.class, "showNavBarArg", "getShowNavBarArg()Z", 0), new ez40(wq9.class, "animatedItemId", "getAnimatedItemId()J", 0)};
    public static final gl5 S1 = new gl5((byte) 15);

    public wq9() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.O1 = xbc.a0(this, sre0.f32672a.b(at9.class), null, new uq9(this, (byte) 0), 14);
        this.P1 = new phf0("BUNDLE_REQUEST_KEY");
        this.Q1 = new cgx0("SHOW_NAV_BAR");
        this.R1 = new r34("ANIMATED_ITEM_ID_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "CANCEL_REQUEST_DIALOG_KEY", new uq9(this, (byte) 3));
        ccq0.T(this, "CANCEL_REQUEST_DIALOG_KEY", new uq9(this, (byte) 4));
        vcc.g0(this, this.P1.n(this, U1[0]), new vq9(this, (byte) 0));
        C().u0("SHOW_OPERATOR_RATING_DIALOG_KEY", this, new gne(this, (byte) 19));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(oq9.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            oq9 oq9Var = (oq9) (ze3Var instanceof oq9 ? ze3Var : null);
            if (oq9Var != null) {
                bbi bbiVarA = oq9Var.a(this.R1.n(this, U1[2]).longValue());
                this.L1 = (abi) bbiVarA.p.get();
                this.M1 = bbiVarA.j;
                this.N1 = bbiVarA.k;
                return;
            }
        }
        jf4.n(b1j.i(oq9.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.i(composeView, null, new ugd(-1895118022, true, new vq9(this, (byte) 1)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
