package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ala0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ala0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final boolean M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(ala0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final mi70 O1 = new mi70();

    public ala0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, zka0.f44522a);
        this.M1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(fla0.class), new l3a0(this, (byte) 24));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-1373803063, true, new cz90(this, (byte) 22)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wka0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wka0 wka0Var = (wka0) (ze3Var instanceof wka0 ? ze3Var : null);
            if (wka0Var != null) {
                this.L1 = wka0Var.a(a4n0.f(this), "", 0L).i();
                return;
            }
        }
        jf4.n(b1j.i(wka0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
