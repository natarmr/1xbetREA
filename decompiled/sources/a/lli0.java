package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lli0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lli0 extends yx5 {
    public oti K1;
    public ii L1;
    public final zz2 M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(lli0.class, "limitTypeId", "getLimitTypeId()I", 0), new j0d0(lli0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cge0 P1 = new cge0((byte) 19);

    public lli0() {
        super(R.layout.compose_fragment);
        this.M1 = new zz2("LIMIT_TYPE_ID");
        this.N1 = xbc.a0(this, sre0.f32672a.b(wli0.class), null, new jli0(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, kli0.f18490a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_CONFIRMATION_DIALOG_KEY", new jli0(this, (byte) 1));
        ccq0.V(this, "REQUEST_RESPONSE_ERROR_DIALOG_KEY", new jli0(this, (byte) 2));
        Object objN = this.O1.n(Q1[1], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-879951963, true, new uph0(this, (byte) 14)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mli0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mli0 mli0Var = (mli0) (ze3Var instanceof mli0 ? ze3Var : null);
            if (mli0Var != null) {
                Integer numN = this.M1.n(this, Q1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = mli0Var.f21992a;
                ocl oclVar = mli0Var.b;
                m1e m1eVar = mli0Var.c;
                duj dujVar = mli0Var.d;
                btt0 btt0Var = mli0Var.e;
                ctf0 ctf0Var = mli0Var.f;
                gii0 gii0Var = mli0Var.g;
                wgu wguVar = mli0Var.h;
                rrt0 rrt0Var = mli0Var.i;
                kuy kuyVar = mli0Var.j;
                cad cadVar = mli0Var.k;
                ii iiVar = mli0Var.l;
                e400 e400Var = mli0Var.m;
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                wguVar.getClass();
                rrt0Var.getClass();
                kuyVar.getClass();
                iiVar.getClass();
                e400Var.getClass();
                this.K1 = (oti) ((n5d0) new f6i(new wsz(), iw20Var, cadVar, i1w0VarF, numN, oclVar, m1eVar, dujVar, btt0Var, ctf0Var, gii0Var, wguVar, kuyVar, iiVar, e400Var).t).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(mli0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        bai0 bai0Var = new bai0(this, null, (byte) 4);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0((i89) gmqVarC, clzVarW, bai0Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }
}
