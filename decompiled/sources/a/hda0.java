package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hda0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hda0 extends yx5 {
    public fiu0 K1;
    public wdk0 L1;
    public final a8z M1;
    public final a8z N1;
    public final khf0 O1;
    public final s0r P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(hda0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;", 0), new j0d0(hda0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final mi70 R1 = new mi70();

    public hda0() {
        super(R.layout.compose_fragment);
        this.M1 = maz.a(wez.b, new eda0(this, (byte) 0));
        this.N1 = xbc.b0(this, sre0.f32672a.b(mea0.class), new eda0(this, (byte) 1));
        this.O1 = new khf0("params_key");
        this.P1 = ltt0.o(this, gda0.f11095a);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new eda0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        goi goiVar = (goi) this.M1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(mea0.class, goiVar.k));
        this.L1 = goiVar.j;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.P1.n(S1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(1064166432, true, new cz90(this, (byte) 12)));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }
}
