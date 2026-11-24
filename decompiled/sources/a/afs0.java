package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/afs0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class afs0 extends yx5 {
    public final phf0 K1;
    public final phf0 L1;
    public fyi M1;
    public final a8z N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(afs0.class, "betId", "getBetId()Ljava/lang/String;", 0), new ez40(afs0.class, "balanceId", "getBalanceId()Ljava/lang/String;", 0), new j0d0(afs0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final g9m0 P1 = new g9m0();

    public afs0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("TRANSACTION_BET_ID");
        this.L1 = new phf0("TRANSACTION_BALANCE_ID");
        this.N1 = xbc.a0(this, sre0.f32672a.b(wfs0.class), null, new wes0(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, yes0.f42505a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(res0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            res0 res0Var = (res0) (ze3Var instanceof res0 ? ze3Var : null);
            if (res0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = Q1;
                String strN = this.K1.n(this, iiyVarArr[0]);
                String strN2 = this.L1.n(this, iiyVarArr[1]);
                strN.getClass();
                strN2.getClass();
                i1w0VarF.getClass();
                cad cadVar = res0Var.f30352a;
                ctf0 ctf0Var = res0Var.b;
                ocl oclVar = res0Var.c;
                r9u r9uVar = res0Var.e;
                b8u b8uVar = res0Var.d;
                fme fmeVar = res0Var.r;
                edo edoVar = res0Var.f;
                gst0 gst0Var = res0Var.h;
                duj dujVar = res0Var.k;
                m1e m1eVar = res0Var.g;
                ii iiVar = res0Var.l;
                wdk0 wdk0Var = res0Var.m;
                kt2 kt2Var = res0Var.j;
                kuy kuyVar = res0Var.q;
                btt0 btt0Var = res0Var.o;
                knf0 knf0Var = res0Var.p;
                gii0 gii0Var = res0Var.n;
                fsd fsdVar = res0Var.i;
                ugf0 ugf0Var = res0Var.s;
                wsf0 wsf0Var = res0Var.t;
                ctf0Var.getClass();
                kt2Var.getClass();
                kuyVar.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                gst0Var.getClass();
                fsdVar.getClass();
                fmeVar.getClass();
                edoVar.getClass();
                this.M1 = (fyi) ((n5d0) new h6i(cadVar, ugf0Var, wsf0Var, strN, strN2, ctf0Var, m1eVar, i1w0VarF, dujVar, btt0Var, gii0Var, oclVar, b8uVar, fmeVar, edoVar).c).get();
                return;
            }
        }
        jf4.n(b1j.i(res0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        qcc.X(this, new wes0(this, (byte) 1));
        Object objN = this.O1.n(Q1[2], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1439821570, true, new p6r0(this, (byte) 18)));
    }
}
