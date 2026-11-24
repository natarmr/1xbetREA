package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class c93 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3942a;
    public final ary b;

    public /* synthetic */ c93(ary aryVar, byte b) {
        this.f3942a = b;
        this.b = aryVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3942a;
        ary aryVar = this.b;
        switch (b) {
            case 0:
                ym40 ym40Var = (ym40) obj;
                ym40Var.getClass();
                ary aryVarC = ym40Var.c();
                t3u0 t3u0Var = t3u0.c;
                return aryVarC.h(aryVar.v());
            default:
                g950 g950Var = (g950) obj;
                zm40 zm40VarL = aryVar.l();
                swq swqVar = j4m0.l;
                mdz mdzVar = zm40VarL.c0(swqVar).h;
                if (mdzVar == null) {
                    ary.a(11);
                    throw null;
                }
                foc focVarD = mdzVar.d(g950Var, ux50.f36425a);
                if (focVarD == null) {
                    hny.m(swqVar.a(g950Var), " is not found", "Built-in class ");
                    return null;
                }
                if (focVarD instanceof wm40) {
                    return (wm40) focVarD;
                }
                throw new AssertionError("Must be a class descriptor " + g950Var + ", but was " + focVarD);
        }
    }
}
