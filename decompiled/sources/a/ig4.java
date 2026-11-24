package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/ig4;", "La/yx5;", "<init>", "()V", "a/rek0", "La/lg4;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ig4 extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(ig4.class, "viewBinding", "getViewBinding()Lorg/xplatform/login/simple/impl/databinding/DialogFragmentAuthLoginSimpleBinding;", 0)};
    public static final rek0 O1 = new rek0((byte) 26);

    public ig4() {
        super(R.layout.fragment_auth_login_surface_simple);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 8);
        this.M1 = xbc.b0(this, sre0.f32672a.b(mg4.class), new eg4(this, (byte) 0));
        this.N1 = ltt0.o(this, hg4.f13001a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ((k3t0) this.M1.getValue()).x(cg4.f4295a);
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        pkd.h(((tik) objN).b, qek0.h, null, new ugd(961328675, true, new tx(this, (byte) 7)));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jg4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jg4 jg4Var = (jg4) (ze3Var instanceof jg4 ? ze3Var : null);
            if (jg4Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = jg4Var.f16462a;
                jqt jqtVar = jg4Var.c;
                kf4 kf4Var = jg4Var.b;
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = cadVar;
                gr00Var.b = i1w0VarF;
                gr00Var.c = kf4Var;
                gr00Var.d = jqtVar;
                gr00Var.e = new n8i(gr00Var, (byte) 5);
                this.L1 = new fiu0(Collections.singletonMap(mg4.class, (n8i) gr00Var.e));
                return;
            }
        }
        jf4.n(b1j.i(jg4.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
