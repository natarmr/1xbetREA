package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/bua;", "La/yx5;", "<init>", "()V", "a/gl5", "La/mua;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bua extends yx5 {
    public final f9o0 K1;
    public qbi L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(bua.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gl5 Q1 = new gl5((byte) 18);

    public bua() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.O1 = ltt0.o(this, aua.f1468a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(nua.class), null, new zta(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, new shd((byte) 15), new ugd(-978591350, true, new bna(this, (byte) 2)));
        ccq0.V(this, "REQUEST_RESET_CONFIRM_DIALOG_KEY", new zta(this, (byte) 1));
        ccq0.V(this, "REQUEST_EXIT_CONFIRM_DIALOG_KEY", new zta(this, (byte) 2));
        qcc.X(this, new zta(this, (byte) 3));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(cua.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            cua cuaVar = (cua) (ze3Var instanceof cua ? ze3Var : null);
            if (cuaVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ctf0 ctf0Var = cuaVar.b;
                cad cadVar = cuaVar.f4978a;
                wsf0 wsf0Var = cuaVar.c;
                pru pruVar = cuaVar.d;
                ii iiVar = cuaVar.e;
                wdk0 wdk0Var = cuaVar.f;
                ctf0Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = i1w0VarF;
                esg0Var.b = cadVar;
                esg0Var.c = ctf0Var;
                esg0Var.d = wsf0Var;
                esg0Var.e = pruVar;
                esg0Var.f = n0k0.a(new pai(esg0Var, (byte) 7));
                this.L1 = (qbi) ((n5d0) esg0Var.f).get();
                this.M1 = iiVar;
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(cua.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
