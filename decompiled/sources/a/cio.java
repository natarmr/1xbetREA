package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cio;", "La/yx5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cio extends yx5 {
    public final boolean K1;
    public final a8z L1;
    public final a8z M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(cio.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final ddk P1 = new ddk();

    public cio() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        ago agoVar = new ago((byte) 12);
        wez wezVar = wez.b;
        this.L1 = maz.a(wezVar, agoVar);
        this.M1 = maz.a(wezVar, new yho(this, (byte) 1));
        this.N1 = ltt0.o(this, aio.f933a);
        this.O1 = xbc.a0(this, sre0.f32672a.b(hh2.class), null, new yho(this, (byte) 2), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(Q1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(-557622725, true, new tx(this, (byte) 19)));
        ujd ujdVarD = G0().m.d();
        x1x.x(ujdVarD);
        ujdVarD.c(this, new lr2(), new zho(this, (byte) 0));
        C().u0("REMOVE_ALL_SPORT_EVENTS_RESULT", this, new z9f(this, (byte) 17));
        ccq0.V(this, "REQUEST_CLEAR_GROUPS_DIALOG_KEY", new yho(this, (byte) 0));
    }

    public final mgi G0() {
        return (mgi) this.M1.getValue();
    }

    public final k3t0 H0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        x1x.x(G0().m.d());
        ujd.a(this);
        super.Z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
