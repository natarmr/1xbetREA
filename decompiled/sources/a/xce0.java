package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/xce0;", "La/yx5;", "La/vbr;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xce0 extends yx5 implements vbr {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(xce0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final fl70 N1 = new fl70();

    public xce0() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, wce0.f38921a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(dde0.class), new p7d0(this, (byte) 27));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-814745119, true, new nrc0(this, (byte) 23)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vce0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vce0 vce0Var = (vce0) (ze3Var instanceof vce0 ? ze3Var : null);
            if (vce0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                btt0 btt0Var = vce0Var.f37184a;
                gii0 gii0Var = vce0Var.b;
                knf0 knf0Var = vce0Var.c;
                cad cadVar = vce0Var.d;
                pv00 pv00Var = vce0Var.e;
                duj dujVar = vce0Var.f;
                ctf0 ctf0Var = vce0Var.g;
                kwz kwzVar = vce0Var.h;
                njo njoVar = vce0Var.i;
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                kwzVar.getClass();
                njoVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(dde0.class, (omi) new nc0(new htz(), cadVar, pv00Var, btt0Var, gii0Var, i1w0VarF, dujVar, ctf0Var, kwzVar, njoVar).n));
                return;
            }
        }
        jf4.n(b1j.i(vce0.class, "Cannot create dependency "));
    }

    @Override // a.vbr
    public final void onClose() {
        ((k3t0) this.M1.getValue()).x(oce0.f25024a);
    }
}
