package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ju50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17136a;
    public final /* synthetic */ lu50 b;

    public /* synthetic */ ju50(lu50 lu50Var, byte b) {
        this.f17136a = b;
        this.b = lu50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17136a;
        lu50 lu50Var = this.b;
        switch (b) {
            case 0:
                uuz uuzVar = lu50.V1;
                ComponentCallbacks2 application = lu50Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(iu50.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof iu50)) {
                        ze3Var = null;
                    }
                    iu50 iu50Var = (iu50) ze3Var;
                    if (iu50Var != null) {
                        i1w0 i1w0VarF = a4n0.f(lu50Var);
                        zz2 zz2Var = lu50Var.N1;
                        iiy[] iiyVarArr = lu50.W1;
                        return iu50.a(iu50Var, i1w0VarF, zz2Var.n(lu50Var, iiyVarArr[1]).intValue(), lu50Var.O1.n(lu50Var, iiyVarArr[2]).intValue(), lu50Var.P1.n(lu50Var, iiyVarArr[3]).intValue(), null, lu50Var.Q1.n(lu50Var, iiyVarArr[4]).booleanValue(), 48);
                    }
                }
                jf4.n(b1j.i(iu50.class, "Cannot create dependency "));
                return null;
            case 1:
                uuz uuzVar2 = lu50.V1;
                fiu0 fiu0Var = lu50Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                uuz uuzVar3 = lu50.V1;
                ((k3t0) lu50Var.U1.getValue()).x(fu50.e);
                return Unit.f46060a;
            default:
                uuz uuzVar4 = lu50.V1;
                ((k3t0) lu50Var.U1.getValue()).x(fu50.d);
                return Unit.f46060a;
        }
    }
}
