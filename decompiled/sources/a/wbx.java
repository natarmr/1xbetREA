package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wbx;", "La/yx5;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wbx extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(wbx.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(wbx.class, "playerId", "getPlayerId()Ljava/lang/String;", 0)};
    public static final bst P1 = new bst();

    public wbx() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, vbx.f37161a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(hcx.class), new y2x(this, (byte) 3));
        this.N1 = new phf0("player_id");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ubx.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ubx ubxVar = (ubx) (ze3Var instanceof ubx ? ze3Var : null);
            if (ubxVar != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = ubxVar.b;
                gii0 gii0Var = ubxVar.f35404a;
                m1e m1eVar = ubxVar.c;
                ocl oclVar = ubxVar.f;
                ctf0 ctf0Var = ubxVar.d;
                knf0 knf0Var = ubxVar.e;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = gii0Var;
                g45Var.b = knf0Var;
                g45Var.c = cadVar;
                g45Var.d = m1eVar;
                g45Var.g = strN;
                g45Var.e = i1w0VarF;
                g45Var.f = ctf0Var;
                g45Var.h = oclVar;
                g45Var.i = new tii(g45Var, (byte) 9);
                this.K1 = new fiu0(Collections.singletonMap(hcx.class, (tii) g45Var.i));
                return;
            }
        }
        jf4.n(b1j.i(ubx.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1430372027, true, new xxv(this, (byte) 18)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
