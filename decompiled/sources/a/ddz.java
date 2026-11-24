package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ddz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mcz f5921a = new mcz(null, 0, false, 0.0f, new e9z((byte) 1), 0.0f, false, d5c.a(kotlin.coroutines.g.f46065a), hic.g(), r4e.b(0, 0, 0, 0, 15), 0, iun.f15405a, 0, 0, 0, false, ma80.f21447a, 0, 0);

    public static final xcz a(final int i, final int i2, fet fetVar, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        v0h0 v0h0Var = xcz.y;
        boolean zE = ((((i3 & 14) ^ 6) > 4 && fetVar.e(i)) || (i3 & 6) == 4) | fetVar.e(i2);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            objP = new Function0() { // from class: a.cdz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new xcz(i, i2);
                }
            };
            fetVar.o0(objP);
        }
        return (xcz) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
    }

    public static final xcz b(uwq uwqVar, fet fetVar) {
        Object[] objArr = {uwqVar};
        v0h0 v0h0Var = xcz.y;
        v0h0 v0h0VarL = qxw.L(new ebz(uwqVar, (byte) 4), new hvy((byte) 12));
        boolean zG = fetVar.g(uwqVar) | fetVar.e(0) | fetVar.e(0);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new rcz(uwqVar, (byte) 2);
            fetVar.o0(objP);
        }
        return (xcz) e9x.R(objArr, v0h0VarL, (Function0) objP, fetVar, 0);
    }
}
