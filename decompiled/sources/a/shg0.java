package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class shg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final thg0 f32210a = new thg0(uc9.f35418a, gqw0.j);

    public static final thg0 a(ow3 ow3Var, yx7 yx7Var, fet fetVar, int i) {
        if (Intrinsics.d(ow3Var, uc9.f35418a) && Intrinsics.d(yx7Var, gqw0.j)) {
            fetVar.e0(-1073830487);
            fetVar.r(false);
            return f32210a;
        }
        fetVar.e0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && fetVar.g(ow3Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !fetVar.g(yx7Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP = fetVar.P();
        if (z3 || objP == ukd.f35823a) {
            objP = new thg0(ow3Var, yx7Var);
            fetVar.o0(objP);
        }
        thg0 thg0Var = (thg0) objP;
        fetVar.r(false);
        return thg0Var;
    }
}
