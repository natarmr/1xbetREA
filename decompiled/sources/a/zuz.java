package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zuz;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zuz extends yx5 {
    public fiu0 K1;
    public final a8z L1;
    public final s0r M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(zuz.class, "binding", "getBinding()Lorg/xplatform/limits_ee/impl/databinding/FragmentEeLimitsBinding;", 0)};
    public static final xuz N1 = new xuz();

    public zuz() {
        super(R.layout.fragment_ee_limits);
        this.L1 = xbc.b0(this, sre0.f32672a.b(qvz.class), new rcz(this, (byte) 11));
        this.M1 = ltt0.o(this, yuz.f43293a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(O1[0], this);
        objN.getClass();
        h97.t(((vzq) objN).b, new owp0(this), new ugd(898744635, true, new wuz(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(avz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            avz avzVar = (avz) (ze3Var instanceof avz ? ze3Var : null);
            if (avzVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = avzVar.f1547a;
                sa10 sa10Var = avzVar.b;
                ii iiVar = avzVar.c;
                m1e m1eVar = avzVar.d;
                duj dujVar = avzVar.e;
                btt0 btt0Var = avzVar.f;
                ctf0 ctf0Var = avzVar.g;
                gii0 gii0Var = avzVar.h;
                knf0 knf0Var = avzVar.i;
                cad cadVar = avzVar.j;
                iiVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(qvz.class, (rii) new v7i(new dvz(), iw20Var, cadVar, i1w0VarF, sa10Var, iiVar, m1eVar, dujVar, btt0Var, ctf0Var, gii0Var, knf0Var).o));
                return;
            }
        }
        jf4.n(b1j.i(avz.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        vcc.g0(this, "SEND_RESULT_REQUEST_KEY", new wuz(this, (byte) 1));
    }
}
