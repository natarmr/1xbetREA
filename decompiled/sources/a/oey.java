package a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class oey implements pg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu00 f25142a;
    public final zm40 b;
    public f6i c;
    public final xg d;

    public oey(eu00 eu00Var, yox yoxVar, zm40 zm40Var) {
        this.f25142a = eu00Var;
        this.b = zm40Var;
        this.d = eu00Var.d(new w0(this, (byte) 2));
    }

    @Override // a.pg80
    public final void a(swq swqVar, ArrayList arrayList) throws Throwable {
        swqVar.getClass();
        Object objInvoke = this.d.invoke(swqVar);
        if (objInvoke != null) {
            arrayList.add(objInvoke);
        }
    }

    @Override // a.pg80
    public final boolean b(swq swqVar) {
        swqVar.getClass();
        xg xgVar = this.d;
        Object obj = ((ConcurrentHashMap) xgVar.c).get(swqVar);
        return ((obj == null || obj == du00.b) ? c(swqVar) : (mg80) xgVar.invoke(swqVar)) == null;
    }

    public final ed9 c(swq swqVar) {
        InputStream inputStreamA;
        swqVar.getClass();
        g950 g950Var = j4m0.k;
        g950Var.getClass();
        if (swqVar.f32934a.h(g950Var)) {
            zc9.m.getClass();
            inputStreamA = gd9.a(zc9.a(swqVar));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA == null) {
            return null;
        }
        Pair pairP = h8x.P(inputStreamA);
        n3d0 n3d0Var = (n3d0) pairP.f46059a;
        ad9 ad9Var = (ad9) pairP.b;
        if (n3d0Var != null) {
            return new ed9(swqVar, this.f25142a, this.b, n3d0Var, ad9Var);
        }
        throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ad9.f + ", actual " + ad9Var + ". Please update Kotlin");
    }

    @Override // a.pg80
    public final Collection n(swq swqVar, Function1 function1) {
        swqVar.getClass();
        return xun.f41520a;
    }
}
