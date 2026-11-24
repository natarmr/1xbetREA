package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bfc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2495a;
    public final /* synthetic */ dfc b;

    public /* synthetic */ bfc(dfc dfcVar, byte b) {
        this.f2495a = b;
        this.b = dfcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2495a;
        dfc dfcVar = this.b;
        switch (b) {
            case 0:
                gl5 gl5Var = dfc.N1;
                ComponentCallbacks2 application = dfcVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(f1q0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof f1q0)) {
                        ze3Var = null;
                    }
                    f1q0 f1q0Var = (f1q0) ze3Var;
                    if (f1q0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(dfcVar);
                        i1w0VarF.getClass();
                        g1q0 g1q0Var = f1q0Var.f8778a;
                        ctf0 ctf0Var = f1q0Var.b;
                        mne mneVar = f1q0Var.c;
                        iqt iqtVar = f1q0Var.d;
                        pmi0 pmi0Var = f1q0Var.e;
                        g1q0Var.getClass();
                        ctf0Var.getClass();
                        return new zwi(i1w0VarF, g1q0Var, ctf0Var, mneVar, iqtVar, pmi0Var);
                    }
                }
                jf4.n(b1j.i(f1q0.class, "Cannot create dependency "));
                return null;
            case 1:
                return new q0h0((ywi) ((zwi) dfcVar.L1.getValue()).g.get());
            case 2:
                gl5 gl5Var2 = dfc.N1;
                ((k3t0) dfcVar.M1.getValue()).x(vec.f37278a);
                return Unit.f46060a;
            default:
                gl5 gl5Var3 = dfc.N1;
                ((k3t0) dfcVar.M1.getValue()).x(wec.f39012a);
                return Unit.f46060a;
        }
    }
}
