package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/oi8;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oi8 extends yx5 {
    public lai K1;
    public ii L1;
    public wdk0 M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(oi8.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cl5 P1 = new cl5((byte) 10);

    public oi8() {
        super(R.layout.compose_fragment);
        this.N1 = xbc.a0(this, sre0.f32672a.b(km8.class), null, new gi8(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, ki8.f18325a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_REFUSE_BONUS_DIALOG_KEY", new gi8(this, (byte) 1));
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(2117174023, true, new m87(this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fi8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fi8 fi8Var = (fi8) (ze3Var instanceof fi8 ? ze3Var : null);
            if (fi8Var != null) {
                ctf0 ctf0Var = fi8Var.f9576a;
                m1e m1eVar = fi8Var.b;
                gii0 gii0Var = fi8Var.c;
                btt0 btt0Var = fi8Var.d;
                ii iiVar = fi8Var.g;
                oif0 oif0Var = fi8Var.e;
                g2v g2vVar = fi8Var.f;
                wsf0 wsf0Var = fi8Var.i;
                oeg0 oeg0Var = fi8Var.h;
                duj dujVar = fi8Var.j;
                wdk0 wdk0Var = fi8Var.k;
                cad cadVar = fi8Var.l;
                bzt bztVar = fi8Var.m;
                pru pruVar = fi8Var.n;
                iiVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                oeg0Var.getClass();
                wdk0Var.getClass();
                this.K1 = (lai) ((n5d0) new o3c(cadVar, wsf0Var, iiVar, ctf0Var, m1eVar, oif0Var, g2vVar, oeg0Var, dujVar, wdk0Var, bztVar, pruVar).k).get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(fi8.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(qk8.f28873a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(rk8.f30636a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getL1() {
        return true;
    }
}
