package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qoz;", "La/yx5;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qoz extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(qoz.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final sqt N1 = new sqt();

    public qoz() {
        super(R.layout.compose_fragment);
        this.L1 = ltt0.o(this, ooz.f25613a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(woz.class), new noz(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(O1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new shd((byte) 15), new ugd(1587237050, true, new g2z(this, (byte) 3)));
        qcc.X(this, new noz(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(roz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            roz rozVar = (roz) (ze3Var instanceof roz ? ze3Var : null);
            if (rozVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                btt0 btt0Var = rozVar.f30862a;
                gii0 gii0Var = rozVar.b;
                knf0 knf0Var = rozVar.c;
                us00 us00Var = rozVar.d;
                cad cadVar = rozVar.e;
                ii iiVar = rozVar.f;
                iiVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(woz.class, (rii) new o3c(new gtz(), cadVar, iiVar, btt0Var, gii0Var, knf0Var, us00Var, i1w0VarF).k));
                return;
            }
        }
        jf4.n(b1j.i(roz.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "SHOW_ERROR_DIALOG_REQUEST_KEY", new noz(this, (byte) 1));
    }
}
