package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/c8k;", "La/yx5;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c8k extends yx5 {
    public ffi K1;
    public final zz2 L1;
    public ii M1;
    public atz N1;
    public final a8z O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(c8k.class, "limitTypeId", "getLimitTypeId()I", 0), new j0d0(c8k.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kud Q1 = new kud();

    public c8k() {
        super(R.layout.compose_fragment);
        this.L1 = new zz2("LIMIT_TYPE_KEY");
        this.O1 = xbc.a0(this, sre0.f32672a.b(m8k.class), null, new a8k(this, (byte) 0), 14);
        this.P1 = ltt0.o(this, b8k.f2161a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_CONFIRMATION_DIALOG_KEY", new a8k(this, (byte) 1));
        Object objN = this.P1.n(R1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(1627970573, true, new yfg(this, (byte) 20)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(r7k.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            r7k r7kVar = (r7k) (ze3Var instanceof r7k ? ze3Var : null);
            if (r7kVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Integer numN = this.L1.n(this, R1[0]);
                i1w0VarF.getClass();
                gii0 gii0Var = r7kVar.f29979a;
                btt0 btt0Var = r7kVar.b;
                ctf0 ctf0Var = r7kVar.c;
                duj dujVar = r7kVar.d;
                ii iiVar = r7kVar.e;
                mne mneVar = r7kVar.f;
                kwz kwzVar = r7kVar.g;
                njo njoVar = r7kVar.h;
                ocl oclVar = r7kVar.i;
                gii0Var.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                iiVar.getClass();
                kwzVar.getClass();
                njoVar.getClass();
                this.K1 = (ffi) ((n5d0) new gbi(new htz(), mneVar, gii0Var, btt0Var, ctf0Var, i1w0VarF, numN, dujVar, iiVar, kwzVar, njoVar, oclVar).i).get();
                this.M1 = iiVar;
                this.N1 = new atz();
                return;
            }
        }
        jf4.n(b1j.i(r7k.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        e9g e9gVar = new e9g(this, null, (byte) 20);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj((i89) gmqVarC, clzVarW, e9gVar, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }
}
