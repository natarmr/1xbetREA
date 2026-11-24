package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kqo;", "La/yx5;", "<init>", "()V", "a/pek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kqo extends yx5 {
    public final s0r K1;
    public final cgx0 L1;
    public final n0o0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(kqo.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(kqo.class, "line", "getLine()Z", 0)};
    public static final pek P1 = new pek();

    public kqo() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, jqo.f16963a);
        this.L1 = new cgx0("OPEN_LINE");
        this.M1 = maz.b(new iqo(this, (byte) 0));
        this.N1 = xbc.a0(this, sre0.f32672a.b(tqo.class), null, new iqo(this, (byte) 1), 14);
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(1859389788, true, new f5o(this, (byte) 5)));
        ccq0.V(this, "REQUEST_EXPRESS_DIALOG_EXPRESS", new iqo(this, (byte) 2));
    }

    public final dfi G0() {
        return (dfi) this.M1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
