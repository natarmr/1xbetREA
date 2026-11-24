package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lj8;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lj8 extends yx5 {
    public final f9o0 K1;
    public fiu0 L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(lj8.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gl5 O1 = new gl5((byte) 10);

    public lj8() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.M1 = xbc.b0(this, sre0.f32672a.b(tj8.class), new vb8(this, (byte) 4));
        this.N1 = ltt0.o(this, kj8.f18375a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1018364397, true, new m87(this, (byte) 15)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hj8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hj8 hj8Var = (hj8) (ze3Var instanceof hj8 ? ze3Var : null);
            if (hj8Var != null) {
                this.L1 = hj8Var.a(a4n0.f(this)).e0();
                return;
            }
        }
        jf4.n(b1j.i(hj8.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        E0(true);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
