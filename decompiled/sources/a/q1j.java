package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"La/q1j;", "La/iw5;", "<init>", "()V", "", "lastPage", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q1j extends iw5 {
    public static final /* synthetic */ int n2 = 0;
    public wdk0 k2;
    public fiu0 l2;
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(u1j.class), new o1j(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(166565885);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object y6hVar = new y6h(1, this, q1j.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/daily_tasks/impl/presentation/onboarding/models/DailyTaskOnboardingSideEffect;)V", 0, (byte) 6);
            fetVar.o0(y6hVar);
            objP = y6hVar;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        yje yjeVar = null;
        if (zI2 || objP2 == obj) {
            objP2 = new g6g(k3t0VarP0, (q1j) this, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, this, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        ((e2j) pz40VarY.getValue()).f7089a.getClass();
        boolean zG = fetVar.g(pz40VarY);
        Object objP3 = fetVar.P();
        if (zG || objP3 == obj) {
            objP3 = new xx(pz40VarY, (byte) 29);
            fetVar.o0(objP3);
        }
        kwj kwjVarB = zk80.b(0, (Function0) objP3, fetVar, 0, 2);
        Integer numValueOf = Integer.valueOf(kwjVarB.k());
        Integer numValueOf2 = Integer.valueOf(kwjVarB.n());
        boolean zI3 = fetVar.i(this) | fetVar.g(kwjVarB);
        Object objP4 = fetVar.P();
        if (zI3 || objP4 == obj) {
            objP4 = new e9g(this, kwjVarB, yjeVar, (byte) 11);
            fetVar.o0(objP4);
        }
        m0x0.v(numValueOf, numValueOf2, (Function2) objP4, fetVar);
        boolean zI4 = fetVar.i(this);
        Object objP5 = fetVar.P();
        if (zI4 || objP5 == obj) {
            objP5 = new o1j(this, (byte) 1);
            fetVar.o0(objP5);
        }
        Function0 function0 = (Function0) objP5;
        boolean zI5 = fetVar.i(this);
        Object objP6 = fetVar.P();
        if (zI5 || objP6 == obj) {
            objP6 = new o1j(this, (byte) 2);
            fetVar.o0(objP6);
        }
        v3c.A(function0, (Function0) objP6, null, fetVar, 0, 4);
        Object objP7 = fetVar.P();
        if (objP7 == obj) {
            objP7 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP7);
        }
        vne vneVar = (vne) objP7;
        Object objP8 = fetVar.P();
        if (objP8 == obj) {
            objP8 = jgk0.b(new vef(kwjVarB, pz40VarY, (byte) 17));
            fetVar.o0(objP8);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(-469641940, new hgs0(pz40VarY, kwjVarB, vneVar, this, (l7m0) objP8, (byte) 4), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.m2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v4j.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v4j v4jVar = (v4j) (ze3Var instanceof v4j ? ze3Var : null);
            if (v4jVar != null) {
                cad cadVar = v4jVar.f36782a;
                knf0 knf0Var = v4jVar.c;
                duj dujVar = v4jVar.d;
                ctf0 ctf0Var = v4jVar.e;
                q7d0 q7d0Var = v4jVar.f;
                gii0 gii0Var = v4jVar.g;
                btt0 btt0Var = v4jVar.h;
                o0j o0jVar = v4jVar.i;
                wdk0 wdk0Var = v4jVar.j;
                b4j b4jVar = v4jVar.b;
                je jeVar = v4jVar.k;
                knf0Var.getClass();
                ctf0Var.getClass();
                q7d0Var.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                o0jVar.getClass();
                wdk0Var.getClass();
                o3c o3cVar = new o3c(cadVar, knf0Var, dujVar, ctf0Var, q7d0Var, gii0Var, btt0Var, o0jVar, wdk0Var, b4jVar, jeVar);
                this.k2 = wdk0Var;
                this.l2 = new fiu0(Collections.singletonMap(u1j.class, (yei) o3cVar.k));
                return;
            }
        }
        jf4.n(b1j.i(v4j.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().N(3);
        L0().K = true;
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        P0().x(g1j.f10514a);
    }
}
