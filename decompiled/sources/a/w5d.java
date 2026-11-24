package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class w5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5d f38577a = new x5d(uc9.c, gqw0.m);

    public static final x5d a(sw3 sw3Var, xx7 xx7Var, fet fetVar, int i) {
        if (Intrinsics.d(sw3Var, uc9.c) && Intrinsics.d(xx7Var, gqw0.m)) {
            fetVar.e0(-1446604504);
            fetVar.r(false);
            return f38577a;
        }
        fetVar.e0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && fetVar.g(sw3Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !fetVar.g(xx7Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP = fetVar.P();
        if (z3 || objP == ukd.f35823a) {
            objP = new x5d(sw3Var, xx7Var);
            fetVar.o0(objP);
        }
        x5d x5dVar = (x5d) objP;
        fetVar.r(false);
        return x5dVar;
    }
}
