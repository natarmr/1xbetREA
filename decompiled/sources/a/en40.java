package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/en40;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class en40 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(en40.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wsz N1 = new wsz();

    public en40() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, dn40.f6350a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(kn40.class), new np30(this, (byte) 11));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(71155299, true, new pi40(this, (byte) 5)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bn40.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bn40 bn40Var = (bn40) (ze3Var instanceof bn40 ? ze3Var : null);
            if (bn40Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = bn40Var.f2864a;
                ctf0 ctf0Var = bn40Var.b;
                e1u e1uVar = bn40Var.c;
                ctf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(kn40.class, (rki) new kki(cadVar, ctf0Var, e1uVar, i1w0VarF).f));
                return;
            }
        }
        jf4.n(b1j.i(bn40.class, "Cannot create dependency "));
    }
}
