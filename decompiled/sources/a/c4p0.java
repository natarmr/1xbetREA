package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c4p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3737a;
    public final /* synthetic */ e4p0 b;

    public /* synthetic */ c4p0(e4p0 e4p0Var, byte b) {
        this.f3737a = b;
        this.b = e4p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3737a;
        e4p0 e4p0Var = this.b;
        switch (b) {
            case 0:
                m6m0 m6m0Var = e4p0.O1;
                ComponentCallbacks2 application = e4p0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(f4p0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof f4p0)) {
                        ze3Var = null;
                    }
                    f4p0 f4p0Var = (f4p0) ze3Var;
                    if (f4p0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(e4p0Var);
                        i1w0VarF.getClass();
                        return new iwi(f4p0Var.f8927a, f4p0Var.b, i1w0VarF);
                    }
                }
                jf4.n(b1j.i(f4p0.class, "Cannot create dependency "));
                return null;
            case 1:
                m6m0 m6m0Var2 = e4p0.O1;
                return new q0h0((hwi) ((iwi) e4p0Var.M1.getValue()).d.get());
            case 2:
                m6m0 m6m0Var3 = e4p0.O1;
                e4p0Var.G0().x(p3p0.f26310a);
                return Unit.f46060a;
            case 3:
                m6m0 m6m0Var4 = e4p0.O1;
                e4p0Var.G0().x(q3p0.f28063a);
                return Unit.f46060a;
            default:
                m6m0 m6m0Var5 = e4p0.O1;
                e4p0Var.G0().x(y3p0.f41964a);
                return Unit.f46060a;
        }
    }
}
