package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/c400;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c400 extends yx5 {
    public sji K1;
    public final a8z L1;
    public final s0r M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(c400.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xuz N1 = new xuz();

    public c400() {
        super(R.layout.compose_fragment);
        this.L1 = xbc.a0(this, sre0.f32672a.b(w400.class), null, new rcz(this, (byte) 16), 14);
        this.M1 = ltt0.o(this, b400.f1934a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(O1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-957015632, true, new a400(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(d400.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            d400 d400Var = (d400) (ze3Var instanceof d400 ? ze3Var : null);
            if (d400Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = d400Var.f5430a;
                ocl oclVar = d400Var.b;
                m1e m1eVar = d400Var.c;
                duj dujVar = d400Var.d;
                btt0 btt0Var = d400Var.e;
                ctf0 ctf0Var = d400Var.f;
                gii0 gii0Var = d400Var.g;
                wgu wguVar = d400Var.h;
                kuy kuyVar = d400Var.i;
                cad cadVar = d400Var.j;
                e400 e400Var = d400Var.k;
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                wguVar.getClass();
                kuyVar.getClass();
                e400Var.getClass();
                this.K1 = (sji) ((n5d0) new cr(new wsz(), iw20Var, cadVar, i1w0VarF, oclVar, m1eVar, dujVar, btt0Var, ctf0Var, gii0Var, wguVar, kuyVar, e400Var).r).get();
                return;
            }
        }
        jf4.n(b1j.i(d400.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        vcc.g0(this, "SEND_RESULT_REQUEST_KEY", new a400(this, (byte) 0));
    }
}
