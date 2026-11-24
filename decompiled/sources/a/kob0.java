package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kob0;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kob0 extends yx5 {
    public final s0r K1;
    public jpi L1;
    public wdk0 M1;
    public ii N1;
    public final phf0 O1;
    public final r34 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(kob0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(kob0.class, "betId", "getBetId()Ljava/lang/String;", 0), new ez40(kob0.class, "balanceId", "getBalanceId()J", 0)};
    public static final rl70 R1 = new rl70();

    public kob0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, job0.f16850a);
        this.O1 = new phf0("BET_ID_BUNDLE_KEY");
        this.P1 = new r34("BALANCE_ID_BUNDLE_KEY");
        this.Q1 = xbc.a0(this, sre0.f32672a.b(lpb0.class), null, new hob0(this, (byte) 2), 14);
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(gob0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            gob0 gob0Var = (gob0) (ze3Var instanceof gob0 ? ze3Var : null);
            if (gob0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.O1.n(this, iiyVarArr[1]);
                Long lN = this.P1.n(this, iiyVarArr[2]);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = gob0Var.f11623a;
                ctf0 ctf0Var = gob0Var.b;
                j1q0 j1q0Var = gob0Var.p;
                ocl oclVar = gob0Var.c;
                pru pruVar = gob0Var.d;
                r9u r9uVar = gob0Var.e;
                b8u b8uVar = gob0Var.f;
                fme fmeVar = gob0Var.t;
                edo edoVar = gob0Var.g;
                gst0 gst0Var = gob0Var.i;
                bzu bzuVar = gob0Var.x;
                k7u k7uVar = gob0Var.v;
                duj dujVar = gob0Var.l;
                m1e m1eVar = gob0Var.h;
                ii iiVar = gob0Var.m;
                wdk0 wdk0Var = gob0Var.n;
                kt2 kt2Var = gob0Var.k;
                kuy kuyVar = gob0Var.s;
                btt0 btt0Var = gob0Var.q;
                knf0 knf0Var = gob0Var.r;
                gii0 gii0Var = gob0Var.o;
                fsd fsdVar = gob0Var.j;
                ugf0 ugf0Var = gob0Var.u;
                wsf0 wsf0Var = gob0Var.w;
                sue sueVar = gob0Var.y;
                sueVar.getClass();
                k7uVar.getClass();
                ctf0Var.getClass();
                kt2Var.getClass();
                j1q0Var.getClass();
                kuyVar.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                gii0Var.getClass();
                gst0Var.getClass();
                fsdVar.getClass();
                r9uVar.getClass();
                fmeVar.getClass();
                edoVar.getClass();
                this.L1 = (jpi) ((n5d0) new f6i(cadVar, ugf0Var, wsf0Var, sueVar, bzuVar, strN, lN, k7uVar, ctf0Var, j1q0Var, m1eVar, i1w0VarF, dujVar, iiVar, wdk0Var, gst0Var, oclVar, pruVar, b8uVar, fmeVar, edoVar).d).get();
                this.M1 = wdk0Var;
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(gob0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        qcc.X(this, new hob0(this, (byte) 0));
        ccq0.V(this, "ERROR_DIALOG_REQUEST_KEY", new hob0(this, (byte) 1));
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(213440092, true, new iob0((Object) this, (byte) 0)));
    }
}
