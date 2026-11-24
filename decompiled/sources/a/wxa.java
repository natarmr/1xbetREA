package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wxa;", "La/yx5;", "<init>", "()V", "a/kl5", "cashback"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wxa extends yx5 {
    public final r34 K1;
    public final s0r L1;
    public fiu0 M1;
    public ii N1;
    public wdk0 O1;
    public final a8z P1;
    public final hnm0 Q1;
    public final n0o0 R1;
    public int S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(wxa.class, "monthGameId", "getMonthGameId()J", 0), new j0d0(wxa.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kl5 U1 = new kl5();

    public wxa() {
        super(R.layout.compose_fragment);
        this.K1 = new r34("MONTH_GAME_ID");
        this.L1 = ltt0.o(this, vxa.f38191a);
        this.P1 = xbc.b0(this, sre0.f32672a.b(uya.class), new uxa(this, (byte) 1));
        this.Q1 = hnm0.f13359a;
        this.R1 = maz.b(new uxa(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        byte b = 3;
        ccq0.V(this, "SAVE_CONFIRMATION_REQUEST_KEY", new uxa(this, b));
        ccq0.T(this, "SAVE_CONFIRMATION_REQUEST_KEY", new uxa(this, (byte) 4));
        ccq0.V(this, "SAVE_SUCCESS_REQUEST_KEY", new uxa(this, (byte) 5));
        qcc.X(this, new uxa(this, (byte) 0));
        Object objN = this.L1.n(V1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, qek0.h, new shd((byte) 14), new ugd(1790860420, true, new bna(this, b)));
    }

    @Override // a.yx5
    public final void C0() {
        rbi rbiVar = (rbi) this.R1.getValue();
        this.M1 = rbiVar.a();
        this.N1 = rbiVar.R;
        this.O1 = rbiVar.S;
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        n0().getWindow().setSoftInputMode(this.S1);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        this.S1 = n0().getWindow().getAttributes().softInputMode;
        n0().getWindow().setSoftInputMode(a8k0.A() ? 16 : 48);
        super.i0(view, bundle);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.Q1;
    }
}
