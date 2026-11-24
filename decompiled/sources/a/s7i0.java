package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s7i0;", "La/yx5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s7i0 extends yx5 {
    public gti K1;
    public ii L1;
    public evz M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(s7i0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gne0 P1 = new gne0((byte) 17);

    public s7i0() {
        super(R.layout.compose_fragment);
        this.N1 = xbc.a0(this, sre0.f32672a.b(e8i0.class), null, new p7i0(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, q7i0.f28251a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_CONFIRMATION_DIALOG_KEY", new p7i0(this, (byte) 1));
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(2002755587, true, new uph0(this, (byte) 7)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(t7i0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            t7i0 t7i0Var = (t7i0) (ze3Var instanceof t7i0 ? ze3Var : null);
            if (t7i0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                mne mneVar = t7i0Var.g;
                ocl oclVar = t7i0Var.f33468a;
                duj dujVar = t7i0Var.b;
                btt0 btt0Var = t7i0Var.c;
                ctf0 ctf0Var = t7i0Var.d;
                gii0 gii0Var = t7i0Var.e;
                kuy kuyVar = t7i0Var.f;
                ii iiVar = t7i0Var.h;
                rou rouVar = t7i0Var.i;
                e400 e400Var = t7i0Var.j;
                evz evzVar = t7i0Var.k;
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                kuyVar.getClass();
                iiVar.getClass();
                e400Var.getClass();
                this.K1 = (gti) ((n5d0) new h6i(new wsz(), mneVar, i1w0VarF, oclVar, dujVar, btt0Var, ctf0Var, gii0Var, kuyVar, iiVar, rouVar, e400Var, evzVar).p).get();
                this.L1 = iiVar;
                this.M1 = evzVar;
                return;
            }
        }
        jf4.n(b1j.i(t7i0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        tye0 tye0Var = new tye0(this, null, (byte) 28);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0((i89) gmqVarC, clzVarW, tye0Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }
}
