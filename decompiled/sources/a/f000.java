package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/f000;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f000 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(f000.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final atz O1 = new atz();

    public f000() {
        super(R.layout.compose_fragment);
        this.M1 = xbc.b0(this, sre0.f32672a.b(p100.class), new c000(this, (byte) 0));
        this.N1 = ltt0.o(this, d000.f5248a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-2037849614, true, new b000(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(g000.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            g000 g000Var = (g000) (ze3Var instanceof g000 ? ze3Var : null);
            if (g000Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = g000Var.f10436a;
                ocl oclVar = g000Var.b;
                ii iiVar = g000Var.c;
                m1e m1eVar = g000Var.d;
                duj dujVar = g000Var.e;
                btt0 btt0Var = g000Var.f;
                ctf0 ctf0Var = g000Var.g;
                gii0 gii0Var = g000Var.h;
                knf0 knf0Var = g000Var.i;
                cad cadVar = g000Var.j;
                us00 us00Var = g000Var.k;
                iiVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(p100.class, (rii) new v5i(new w000(), iw20Var, cadVar, us00Var, i1w0VarF, oclVar, iiVar, m1eVar, dujVar, btt0Var, ctf0Var, gii0Var, knf0Var).v));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(g000.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        vcc.g0(this, "SEND_RESULT_REQUEST_KEY", new b000(this, (byte) 0));
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", new c000(this, (byte) 1));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(vzz.f38321a);
    }
}
