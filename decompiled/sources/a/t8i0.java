package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/t8i0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t8i0 extends yx5 {
    public hti K1;
    public ii L1;
    public final a8z M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(t8i0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cge0 O1 = new cge0((byte) 18);

    public t8i0() {
        super(R.layout.compose_fragment);
        this.M1 = xbc.a0(this, sre0.f32672a.b(c9i0.class), null, new r8i0(this, (byte) 0), 14);
        this.N1 = ltt0.o(this, s8i0.f31802a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_REQUIREMENTS_DIALOG_KEY", new r8i0(this, (byte) 1));
        ccq0.T(this, "REQUEST_REQUIREMENTS_DIALOG_KEY", new r8i0(this, (byte) 2));
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1346980477, true, new uph0(this, (byte) 9)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u8i0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u8i0 u8i0Var = (u8i0) (ze3Var instanceof u8i0 ? ze3Var : null);
            if (u8i0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ocl oclVar = u8i0Var.f35233a;
                duj dujVar = u8i0Var.b;
                btt0 btt0Var = u8i0Var.c;
                ctf0 ctf0Var = u8i0Var.d;
                gii0 gii0Var = u8i0Var.e;
                kuy kuyVar = u8i0Var.f;
                cad cadVar = u8i0Var.g;
                ii iiVar = u8i0Var.h;
                e400 e400Var = u8i0Var.i;
                rou rouVar = u8i0Var.j;
                drm0 drm0Var = u8i0Var.k;
                evz evzVar = u8i0Var.l;
                sek sekVar = u8i0Var.m;
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                kuyVar.getClass();
                iiVar.getClass();
                e400Var.getClass();
                this.K1 = (hti) ((n5d0) new gbi(new wsz(), cadVar, i1w0VarF, oclVar, dujVar, btt0Var, ctf0Var, gii0Var, kuyVar, iiVar, e400Var, rouVar, drm0Var, evzVar, sekVar).f).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(u8i0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        tye0 tye0Var = new tye0(this, null, (byte) 29);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0((i89) gmqVarC, clzVarW, tye0Var, (yje) null, (byte) 0), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(n8i0.f23090a);
    }
}
