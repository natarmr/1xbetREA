package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ctz;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ctz extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(ctz.class, "binding", "getBinding()Lorg/xplatform/limits_ug_bj_bf/impl/databinding/FragmentAfricaLimitsBinding;", 0)};
    public static final atz O1 = new atz();

    public ctz() {
        super(R.layout.fragment_africa_limits);
        this.M1 = xbc.b0(this, sre0.f32672a.b(euz.class), new zsz(this, (byte) 0));
        this.N1 = ltt0.o(this, btz.f3206a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        h97.t(((nxq) objN).b, new owp0(this), new ugd(932272597, true, new ysz(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dtz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            dtz dtzVar = (dtz) (ze3Var instanceof dtz ? ze3Var : null);
            if (dtzVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = dtzVar.f6675a;
                sa10 sa10Var = dtzVar.b;
                ii iiVar = dtzVar.c;
                m1e m1eVar = dtzVar.d;
                duj dujVar = dtzVar.e;
                btt0 btt0Var = dtzVar.f;
                ctf0 ctf0Var = dtzVar.g;
                gii0 gii0Var = dtzVar.h;
                knf0 knf0Var = dtzVar.i;
                cad cadVar = dtzVar.j;
                us00 us00Var = dtzVar.k;
                iiVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(euz.class, (rii) new cr(new gtz(), iw20Var, cadVar, us00Var, i1w0VarF, sa10Var, iiVar, m1eVar, dujVar, btt0Var, ctf0Var, gii0Var, knf0Var).r));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(dtz.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        vcc.g0(this, "SEND_RESULT_REQUEST_KEY", new ysz(this, (byte) 0));
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", new zsz(this, (byte) 1));
    }
}
