package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hpz;", "La/yx5;", "<init>", "()V", "a/tqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hpz extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final s0r M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(hpz.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final tqt O1 = new tqt();

    public hpz() {
        super(R.layout.compose_fragment);
        this.M1 = ltt0.o(this, gpz.f11706a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(qpz.class), new fpz(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new shd((byte) 15), new ugd(1652582560, true, new g2z(this, (byte) 4)));
        qcc.X(this, new fpz(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ipz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ipz ipzVar = (ipz) (ze3Var instanceof ipz ? ze3Var : null);
            if (ipzVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                btt0 btt0Var = ipzVar.f15185a;
                gii0 gii0Var = ipzVar.b;
                knf0 knf0Var = ipzVar.c;
                ctf0 ctf0Var = ipzVar.d;
                cad cadVar = ipzVar.e;
                ii iiVar = ipzVar.f;
                duj dujVar = ipzVar.g;
                iiVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(qpz.class, (rii) new qv2(new dvz(), cadVar, iiVar, btt0Var, gii0Var, knf0Var, ctf0Var, i1w0VarF, dujVar).n));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(ipz.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_LIMIT_DIALOG_REQUEST_KEY", new fpz(this, (byte) 2));
        ccq0.V(this, "SHOW_ERROR_DIALOG_REQUEST_KEY", new fpz(this, (byte) 3));
    }
}
