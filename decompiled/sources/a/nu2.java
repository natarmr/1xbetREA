package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uts0 f24127a = ro4.m0(0, 0, null, 7);
    public static final xd2 b = new xd2(21);

    static {
        uzb.Y(3);
    }

    public static afk0 a(rv2 rv2Var, Function1 function1, uts0 uts0Var, fet fetVar, int i) {
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zG = fetVar.g(w6kVar) | ((((i & 14) ^ 6) > 4 && fetVar.g(rv2Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && fetVar.g(function1)) || (i & 48) == 32) | fetVar.g(uts0Var);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new afk0(new pu2(rv2Var, function1, new nc((Object) w6kVar, (byte) 29)), dv2.b, uts0Var);
            fetVar.o0(objP);
        }
        return (afk0) objP;
    }
}
