package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/lmc0;", "La/yx5;", "<init>", "()V", "a/mi70", "La/k3t0;", "La/dmc0;", "La/cnc0;", "La/smc0;", "viewModel", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lmc0 extends yx5 {
    public final boolean K1;
    public final r34 L1;
    public final s0r M1;
    public xpi N1;
    public wdk0 O1;
    public ii P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(lmc0.class, "bundleGameId", "getBundleGameId()J", 0), new j0d0(lmc0.class, "binding", "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoCodesComposeBinding;", 0)};
    public static final mi70 Q1 = new mi70();

    public lmc0() {
        super(R.layout.fragment_promo_codes_compose);
        this.K1 = true;
        this.L1 = new r34("OPEN_BONUS_GAME_KEY");
        this.M1 = ltt0.o(this, kmc0.f18532a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[1], this);
        objN.getClass();
        b1j.t(((d3r) objN).b, new ugd(-1520688175, true, new lma0(this, (byte) 26)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hic0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hic0 hic0Var = (hic0) (ze3Var instanceof hic0 ? ze3Var : null);
            if (hic0Var != null) {
                aqi aqiVarA = hic0Var.a(a4n0.f(this), this.L1.n(this, R1[0]).longValue());
                this.N1 = (xpi) aqiVarA.R.get();
                this.O1 = aqiVarA.z;
                this.P1 = aqiVarA.A;
                return;
            }
        }
        jf4.n(b1j.i(hic0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
