package a;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f28104a;
    public static final float b;

    static {
        zcl zclVar = qmk.f28987a;
        f28104a = 40.0f;
        b = 224.0f;
    }

    public static final void a(t4m t4mVar, j4m j4mVar, boolean z, fet fetVar, int i) {
        fetVar.g0(-1964618157);
        int i2 = (fetVar.g(t4mVar) ? 4 : 2) | i | (fetVar.g(j4mVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, b), j4mVar.f);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new r91((Object) t4mVar, (Object) j4mVar, z, (byte) 9);
                fetVar.o0(objP);
            }
            qxw.o(fetVar, rq8.L(mm40VarS, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm(t4mVar, j4mVar, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    public static final void b(mm40 mm40Var, t4m t4mVar, rah0 rah0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        yfe0 yfe0VarU;
        Function2 iklVar;
        int i2;
        rah0Var.getClass();
        fetVar.g0(987739887);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar.g(t4mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(rah0Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w4m w4mVar = t4mVar.f33327a;
            z4m z4mVar = w4mVar.b;
            a4x a4xVar = w4mVar.f38547a;
            if (w4mVar.f38547a.size() < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    iklVar = new kkl(t4mVar, rah0Var, i);
                }
            } else {
                boolean z = fetVar.k(bmd.n) == k6z.b;
                boolean zG = fetVar.g(w4mVar);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    n0o0 n0o0Var = u4m.f35057a;
                    if (!(z4mVar instanceof y4m) || a4xVar.isEmpty()) {
                        objP = t4mVar;
                    } else {
                        a5m a5mVar = w4mVar.c;
                        if (((v4m) CollectionsKt.U(a4xVar)).f36788a == 0) {
                            objP = t4mVar;
                        } else {
                            int iOrdinal = a5mVar.ordinal();
                            if (iOrdinal == 0) {
                                i2 = 0;
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return;
                                }
                                i2 = 50;
                            }
                            a4x a4xVarO0 = dyb.o0(CollectionsKt.q0(kotlin.collections.a.c(new v4m(0, i2)), a4xVar));
                            a4xVarO0.getClass();
                            objP = new t4m(new w4m(a4xVarO0, z4mVar, a5mVar), t4mVar.b, t4mVar.c);
                        }
                    }
                    fetVar.o0(objP);
                }
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                nnw0.g(o7k0.e(mm40VarD, 244.0f), null, false, u1c.M(740224601, new l4m((t4m) objP, rah0Var, z), fetVar), fetVar, 3072, 6);
                mm40Var2 = jm40Var;
            }
            yfe0VarU.d = iklVar;
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            iklVar = new ikl((Object) mm40Var2, (Object) t4mVar, (Object) rah0Var, i, (byte) 8);
            yfe0VarU.d = iklVar;
        }
    }

    public static final void c(j4m j4mVar, boolean z, fet fetVar, int i) {
        fetVar.g0(1526821363);
        int i2 = (fetVar.g(j4mVar) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), b);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new x9(j4mVar, z, b2);
                fetVar.o0(objP);
            }
            qxw.o(fetVar, rq8.L(mm40VarE, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(j4mVar, z, i, (byte) 6);
        }
    }
}
