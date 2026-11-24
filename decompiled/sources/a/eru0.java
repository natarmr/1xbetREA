package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/eru0;", "La/yx5;", "<init>", "()V", "a/wxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eru0 extends yx5 {
    public fiu0 K1;
    public final boolean L1;
    public final a8z M1;
    public final a8z N1;
    public final s0r O1;
    public final qdz P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(eru0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wxs0 Q1 = new wxs0((byte) 9);

    public eru0() {
        super(R.layout.compose_fragment);
        this.L1 = true;
        this.M1 = maz.a(wez.b, new cru0(this, (byte) 0));
        this.N1 = xbc.b0(this, sre0.f32672a.b(jru0.class), new cru0(this, (byte) 1));
        this.O1 = ltt0.o(this, dru0.f6582a);
        this.P1 = new qdz();
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new cru0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = new fiu0(Collections.singletonMap(jru0.class, ((bzi) this.M1.getValue()).k));
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1175210812, true, new ggt0(this, (byte) 10)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.L1;
    }
}
