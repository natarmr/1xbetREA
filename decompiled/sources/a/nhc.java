package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nhc;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nhc extends yx5 {
    public final s0r K1;
    public final yzn0 L1;
    public ii M1;
    public fiu0 N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(nhc.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(nhc.class, "limitType", "getLimitType()Lorg/xplatform/limits_ee/impl/domain/models/LossLimitEnum;", 0)};
    public static final bj5 P1 = new bj5();

    public nhc() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, lhc.f20048a);
        this.L1 = new yzn0("LOSS_LIMIT_KEY");
        this.O1 = xbc.b0(this, sre0.f32672a.b(yhc.class), new khc(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-821071302, true, new bna(this, (byte) 28)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ohc.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ohc ohcVar = (ohc) (ze3Var instanceof ohc ? ze3Var : null);
            if (ohcVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                peg0 peg0Var = new peg0((l810) this.L1.n(this, Q1[1]), (byte) 25);
                i1w0VarF.getClass();
                cad cadVar = ohcVar.f25259a;
                btt0 btt0Var = ohcVar.b;
                gii0 gii0Var = ohcVar.c;
                knf0 knf0Var = ohcVar.d;
                duj dujVar = ohcVar.e;
                ctf0 ctf0Var = ohcVar.f;
                ii iiVar = ohcVar.g;
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                iiVar.getClass();
                nc0 nc0Var = new nc0(new dvz(), peg0Var, cadVar, i1w0VarF, btt0Var, gii0Var, knf0Var, dujVar, ctf0Var, iiVar);
                this.M1 = iiVar;
                this.N1 = new fiu0(Collections.singletonMap(yhc.class, (dci) nc0Var.n));
                return;
            }
        }
        jf4.n(b1j.i(ohc.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_MONEY_LIMIT_DIALOG_REQUEST_KEY", new khc(this, (byte) 0));
        ccq0.V(this, "SHOW_ERROR_DIALOG_REQUEST_KEY", new khc(this, (byte) 1));
    }
}
