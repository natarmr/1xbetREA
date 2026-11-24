package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wqz;", "La/yx5;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wqz extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final s0r M1;
    public final zz2 N1;
    public final phf0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(wqz.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(wqz.class, "limitValue", "getLimitValue()I", 0), new ez40(wqz.class, "limitMeasure", "getLimitMeasure()Ljava/lang/String;", 0)};
    public static final bst Q1 = new bst();

    public wqz() {
        super(R.layout.compose_fragment);
        this.M1 = ltt0.o(this, vqz.f37874a);
        this.N1 = new zz2("LIMIT_VALUE_KEY");
        this.O1 = new phf0("LIMIT_MEASURE_KEY");
        this.P1 = xbc.b0(this, sre0.f32672a.b(irz.class), new uqz(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new shd((byte) 15), new ugd(-1966091605, true, new g2z(this, (byte) 8)));
        qcc.X(this, new uqz(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xqz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xqz xqzVar = (xqz) (ze3Var instanceof xqz ? ze3Var : null);
            if (xqzVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                btt0 btt0Var = xqzVar.f41343a;
                gii0 gii0Var = xqzVar.b;
                knf0 knf0Var = xqzVar.c;
                us00 us00Var = xqzVar.d;
                cad cadVar = xqzVar.e;
                ii iiVar = xqzVar.f;
                duj dujVar = xqzVar.g;
                bzt bztVar = xqzVar.h;
                iiVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(irz.class, (rii) new nc0(new gtz(), cadVar, iiVar, btt0Var, gii0Var, knf0Var, us00Var, i1w0VarF, dujVar, bztVar).n));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(xqz.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "SHOW_CONFIRM_CHANGE_LIMIT_DIALOG_REQUEST_KEY", new uqz(this, (byte) 0));
    }
}
