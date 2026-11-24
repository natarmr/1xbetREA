package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ur4;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ur4 extends yx5 {
    public final cgx0 K1;
    public final n0o0 L1;
    public final kiu0 M1;
    public final s0r N1;
    public final phf0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(ur4.class, "updateProfile", "getUpdateProfile()Z", 0), new j0d0(ur4.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ur4.class, "errorMessage", "getErrorMessage()Ljava/lang/String;", 0)};
    public static final qek0 P1 = new qek0();

    public ur4() {
        super(R.layout.compose_fragment);
        this.K1 = new cgx0("PROFILE_EXTRA");
        this.L1 = maz.b(new sr4(this, (byte) 0));
        pp4 pp4Var = new pp4(new sr4(this, (byte) 1), (byte) 8);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 9), (byte) 10));
        this.M1 = agc.G(this, sre0.f32672a.b(zr4.class), new t51(a8zVarA, (byte) 28), new t51(a8zVarA, (byte) 29), pp4Var);
        this.N1 = ltt0.o(this, tr4.f34406a);
        this.O1 = new phf0("ERROR_MESSAGE_EXTRA", "");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(Q1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-199667674, true, new fa2((Object) this, (byte) 14)));
    }
}
