package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/eyz;", "La/yx5;", "<init>", "()V", "a/evz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eyz extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(eyz.class, "binding", "getBinding()Lorg/xplatform/limits_kenya/impl/databinding/FragmentKenyaLimitsBinding;", 0)};
    public static final evz O1 = new evz();

    public eyz() {
        super(R.layout.fragment_kenya_limits);
        this.M1 = xbc.b0(this, sre0.f32672a.b(bzz.class), new cyz(this, (byte) 0));
        this.N1 = ltt0.o(this, dyz.f6916a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        h97.t(((v0r) objN).b, new owp0(this), new ugd(727294475, true, new byz(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fyz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fyz fyzVar = (fyz) (ze3Var instanceof fyz ? ze3Var : null);
            if (fyzVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = fyzVar.f10382a;
                sa10 sa10Var = fyzVar.b;
                ii iiVar = fyzVar.c;
                m1e m1eVar = fyzVar.d;
                duj dujVar = fyzVar.e;
                btt0 btt0Var = fyzVar.f;
                ctf0 ctf0Var = fyzVar.g;
                gii0 gii0Var = fyzVar.h;
                knf0 knf0Var = fyzVar.i;
                cad cadVar = fyzVar.j;
                us00 us00Var = fyzVar.k;
                iiVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(bzz.class, (rii) new cr(new jyz(), iw20Var, cadVar, us00Var, i1w0VarF, sa10Var, iiVar, m1eVar, dujVar, btt0Var, ctf0Var, gii0Var, knf0Var).r));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(fyz.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        vcc.g0(this, "SEND_RESULT_REQUEST_KEY", new byz(this, (byte) 1));
        C().u0("REQUEST_SET_LIMIT_KEY", this, new viq(this, (byte) 15));
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", new cyz(this, (byte) 2));
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_ALL_LIMITS_DIALOG_REQUEST_KEY", new cyz(this, (byte) 1));
    }
}
