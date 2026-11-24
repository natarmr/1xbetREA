package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hwz;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hwz extends yx5 {
    public pji K1;
    public final a8z L1;
    public final s0r M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(hwz.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wsz N1 = new wsz();

    public hwz() {
        super(R.layout.compose_fragment);
        this.L1 = xbc.a0(this, sre0.f32672a.b(cxz.class), null, new rcz(this, (byte) 12), 14);
        this.M1 = ltt0.o(this, gwz.f12051a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(O1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1907105025, true, new fwz(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(iwz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            iwz iwzVar = (iwz) (ze3Var instanceof iwz ? ze3Var : null);
            if (iwzVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = iwzVar.f15514a;
                ocl oclVar = iwzVar.b;
                ii iiVar = iwzVar.c;
                m1e m1eVar = iwzVar.d;
                duj dujVar = iwzVar.e;
                btt0 btt0Var = iwzVar.f;
                kwz kwzVar = iwzVar.g;
                njo njoVar = iwzVar.h;
                ctf0 ctf0Var = iwzVar.i;
                gii0 gii0Var = iwzVar.j;
                wgu wguVar = iwzVar.k;
                cad cadVar = iwzVar.l;
                iiVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                kwzVar.getClass();
                njoVar.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                wguVar.getClass();
                this.K1 = (pji) ((n5d0) new cr(new htz(), iw20Var, cadVar, i1w0VarF, oclVar, m1eVar, dujVar, btt0Var, kwzVar, njoVar, ctf0Var, gii0Var, wguVar).r).get();
                return;
            }
        }
        jf4.n(b1j.i(iwz.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        vcc.g0(this, "SEND_RESULT_REQUEST_KEY", new fwz(this, (byte) 0));
    }
}
