package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f9z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q8z f9179a;

    static {
        e9z e9zVar = new e9z((byte) 0);
        iun iunVar = iun.f15405a;
        ma80 ma80Var = ma80.f21447a;
        f9179a = new q8z(null, 0, false, 0.0f, e9zVar, 0.0f, false, d5c.a(kotlin.coroutines.g.f46065a), hic.g(), 0, new z8z((byte) 1), new z8z((byte) 2), 0, iunVar, 0, 0, 0, ma80Var, 0, 0);
    }

    public static final d9z a(fet fetVar) {
        Object[] objArr = new Object[0];
        v0h0 v0h0Var = d9z.w;
        boolean zE = fetVar.e(0) | fetVar.e(0);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            objP = new pcy((byte) 19);
            fetVar.o0(objP);
        }
        return (d9z) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
    }
}
