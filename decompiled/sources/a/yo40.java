package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yo40;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yo40 extends yx5 {
    public xli K1;
    public final zz2 L1;
    public ii M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(yo40.class, "limitTypeId", "getLimitTypeId()I", 0), new j0d0(yo40.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final atz P1 = new atz();

    public yo40() {
        super(R.layout.compose_fragment);
        this.L1 = new zz2("LIMIT_TYPE_KEY");
        this.N1 = xbc.a0(this, sre0.f32672a.b(ip40.class), null, new wo40(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, xo40.f41198a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_CONFIRMATION_DIALOG_KEY", new wo40(this, (byte) 1));
        ccq0.V(this, "REQUEST_RESPONSE_ERROR_DIALOG_KEY", new wo40(this, (byte) 2));
        Object objN = this.O1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(436212832, true, new pi40(this, (byte) 6)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(zo40.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            zo40 zo40Var = (zo40) (ze3Var instanceof zo40 ? ze3Var : null);
            if (zo40Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Integer numN = this.L1.n(this, Q1[0]);
                i1w0VarF.getClass();
                gii0 gii0Var = zo40Var.f44701a;
                btt0 btt0Var = zo40Var.b;
                ctf0 ctf0Var = zo40Var.c;
                duj dujVar = zo40Var.d;
                ii iiVar = zo40Var.e;
                mne mneVar = zo40Var.f;
                e400 e400Var = zo40Var.g;
                kuy kuyVar = zo40Var.h;
                ocl oclVar = zo40Var.i;
                gii0Var.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                iiVar.getClass();
                e400Var.getClass();
                kuyVar.getClass();
                this.K1 = (xli) ((n5d0) new h6i(new wsz(), mneVar, gii0Var, btt0Var, ctf0Var, i1w0VarF, numN, dujVar, iiVar, e400Var, kuyVar, oclVar).p).get();
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(zo40.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        xr10 xr10Var = new xr10(this, (yje) null, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hk40((i89) gmqVarC, clzVarW, xr10Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }
}
