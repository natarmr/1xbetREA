package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.aggregator.loyalty_program.api.navigation.models.LoyaltyProgramScreenParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mg10;", "La/yx5;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mg10 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final a8z M1;
    public final s0r N1;
    public final khf0 O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(mg10.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/loyalty_program/impl/databinding/LoyaltyProgramBasicFragmentBinding;", 0), new ez40(mg10.class, "params", "getParams()Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;", 0)};
    public static final uuz Q1 = new uuz();

    public mg10() {
        super(R.layout.loyalty_program_basic_fragment);
        this.M1 = xbc.b0(this, sre0.f32672a.b(ph10.class), new rx00(this, (byte) 8));
        this.N1 = ltt0.o(this, lg10.f19985a);
        this.O1 = new khf0("KEY_VIP_CASHBACK_PARAMS");
        this.P1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        pkd.h(((ng10) objN).b, new owp0(this), null, new ugd(745361649, true, new g2z(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xh10.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xh10 xh10Var = (xh10) (ze3Var instanceof xh10 ? ze3Var : null);
            if (xh10Var != null) {
                v5i v5iVarA = xh10Var.a((LoyaltyProgramScreenParams) this.O1.n(this, R1[1]), a4n0.f(this));
                this.K1 = v5iVarA.o();
                this.L1 = (ii) v5iVarA.r;
                return;
            }
        }
        jf4.n(b1j.i(xh10.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.P1;
    }
}
