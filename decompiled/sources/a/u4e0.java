package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u4e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35043a;
    public final /* synthetic */ w4e0 b;

    public /* synthetic */ u4e0(w4e0 w4e0Var, byte b) {
        this.f35043a = b;
        this.b = w4e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35043a;
        w4e0 w4e0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = w4e0.O1;
                ComponentCallbacks2 application = w4e0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(x4e0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof x4e0)) {
                        ze3Var = null;
                    }
                    x4e0 x4e0Var = (x4e0) ze3Var;
                    if (x4e0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(w4e0Var);
                        i1w0VarF.getClass();
                        cad cadVar = x4e0Var.f40261a;
                        gii0 gii0Var = x4e0Var.b;
                        g2v g2vVar = x4e0Var.c;
                        m1e m1eVar = x4e0Var.d;
                        ctf0 ctf0Var = x4e0Var.e;
                        pru pruVar = x4e0Var.f;
                        uxs0 uxs0Var = x4e0Var.g;
                        gii0Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        return new bri(cadVar, i1w0VarF, gii0Var, g2vVar, m1eVar, ctf0Var, pruVar, uxs0Var);
                    }
                }
                jf4.n(b1j.i(x4e0.class, "Cannot create dependency "));
                return null;
            case 1:
                rl70 rl70Var2 = w4e0.O1;
                fiu0 fiu0Var = w4e0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                rl70 rl70Var3 = w4e0.O1;
                ((k3t0) w4e0Var.M1.getValue()).x(b3e0.f1899a);
                return Unit.f46060a;
            default:
                rl70 rl70Var4 = w4e0.O1;
                ((k3t0) w4e0Var.M1.getValue()).x(a3e0.f168a);
                return Unit.f46060a;
        }
    }
}
