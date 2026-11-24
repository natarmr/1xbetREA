package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class uel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bk9 f35535a;
    public static final bk9 b;

    static {
        int i = 3;
        yje yjeVar = null;
        f35535a = new bk9(i, yjeVar, (byte) 1);
        b = new bk9(i, yjeVar, (byte) 2);
    }

    public static mm40 a(mm40 mm40Var, wel welVar, ma80 ma80Var, boolean z, boolean z2, xdr xdrVar, xdr xdrVar2, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            xdrVar = f35535a;
        }
        return mm40Var.e(new sel(welVar, ma80Var, z3, null, z4, xdrVar, xdrVar2, false));
    }

    public static final wel b(Function1 function1, fet fetVar) {
        pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            wtj wtjVar = new wtj(new ca6(pz40VarF, (byte) 29));
            fetVar.o0(wtjVar);
            objP = wtjVar;
        }
        return (wel) objP;
    }

    public static final long c(long j) {
        return wpm0.g(Float.isNaN(g6u0.b(j)) ? 0.0f : g6u0.b(j), Float.isNaN(g6u0.c(j)) ? 0.0f : g6u0.c(j));
    }
}
