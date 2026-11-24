package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uc8;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uc8 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public wdk0 M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(uc8.class, "binding", "getBinding()Lorg/xplatform/bonus_agreements/impl/databinding/BonusAgreementsFragmentBinding;", 0)};
    public static final yk5 P1 = new yk5();

    public uc8() {
        super(R.layout.bonus_agreements_fragment);
        this.N1 = ltt0.o(this, tc8.f33707a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(ld8.class), new sc8(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.T(this, "REQUEST_SELECTED_BONUS_KEY", new sc8(this, (byte) 1));
        Object objN = this.N1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((vc8) objN).f37174a, new ugd(-1766126843, true, new m87(this, (byte) 12)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wc8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wc8 wc8Var = (wc8) (ze3Var instanceof wc8 ? ze3Var : null);
            if (wc8Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                b4j b4jVar = wc8Var.f38913a;
                m1e m1eVar = wc8Var.b;
                duj dujVar = wc8Var.c;
                ii iiVar = wc8Var.d;
                wdk0 wdk0Var = wc8Var.f;
                b3c0 b3c0Var = wc8Var.g;
                btt0 btt0Var = wc8Var.h;
                gst0 gst0Var = wc8Var.i;
                cad cadVar = wc8Var.e;
                knf0 knf0Var = wc8Var.j;
                gii0 gii0Var = wc8Var.k;
                ctf0 ctf0Var = wc8Var.l;
                pv00 pv00Var = wc8Var.m;
                x20 x20Var = wc8Var.n;
                bzt bztVar = wc8Var.o;
                r9u r9uVar = wc8Var.p;
                m1eVar.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                b3c0Var.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(ld8.class, (f7i) new v7i(cadVar, b4jVar, m1eVar, dujVar, iiVar, i1w0VarF, wdk0Var, b3c0Var, btt0Var, knf0Var, gii0Var, ctf0Var, pv00Var, x20Var, bztVar).o));
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(wc8.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(mc8.f21538a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(nc8.f23279a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getS1() {
        return true;
    }
}
