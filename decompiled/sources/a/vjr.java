package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vjr;", "La/yx5;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vjr extends yx5 {
    public lhi K1;
    public ii L1;
    public atz M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(vjr.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xak P1 = new xak((byte) 21);

    public vjr() {
        super(R.layout.compose_fragment);
        this.N1 = xbc.a0(this, sre0.f32672a.b(hkr.class), null, new tjr(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, ujr.f35796a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_RESULT_DIALOG_KEY", new tjr(this, (byte) 1));
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(407596500, true, new jar(this, (byte) 3)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wjr.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wjr wjrVar = (wjr) (ze3Var instanceof wjr ? ze3Var : null);
            if (wjrVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                gii0 gii0Var = wjrVar.f39277a;
                btt0 btt0Var = wjrVar.b;
                ctf0 ctf0Var = wjrVar.c;
                duj dujVar = wjrVar.d;
                ii iiVar = wjrVar.e;
                mne mneVar = wjrVar.f;
                njo njoVar = wjrVar.g;
                wgu wguVar = wjrVar.h;
                gii0Var.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                iiVar.getClass();
                njoVar.getClass();
                wguVar.getClass();
                this.K1 = (lhi) ((n5d0) new nc0(new htz(), mneVar, gii0Var, btt0Var, ctf0Var, i1w0VarF, dujVar, iiVar, njoVar, wguVar).n).get();
                this.L1 = iiVar;
                this.M1 = new atz();
                return;
            }
        }
        jf4.n(b1j.i(wjr.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) ((k3t0) this.N1.getValue())).C();
        sxk sxkVar = new sxk(this, null, (byte) 27);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g6q((i89) gmqVarC, clzVarW, sxkVar, (yje) null), 3);
    }
}
