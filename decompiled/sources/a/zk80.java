package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class zk80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yk80 f44518a;
    public static final pk80 b;

    static {
        yk80 yk80Var = new yk80((byte) 0);
        f44518a = yk80Var;
        iun iunVar = iun.f15405a;
        ma80 ma80Var = ma80.f21447a;
        b = new pk80(iunVar, 0, 0, 0, 0, 0, 0, hfk0.b, new e9z((byte) 3), d5c.a(kotlin.coroutines.g.f46065a), yk80Var, r4e.b(0, 0, 0, 0, 15));
    }

    public static final long a(pk80 pk80Var, int i) {
        int i2 = pk80Var.c;
        int i3 = pk80Var.b;
        long j = ((long) i) * ((long) (i2 + i3));
        int i4 = -pk80Var.f;
        int i5 = pk80Var.d;
        long j2 = ((j + ((long) i4)) + ((long) i5)) - ((long) i2);
        int iH = (int) (pk80Var.e == ma80.b ? pk80Var.h() >> 32 : pk80Var.h() & 4294967295L);
        long jD = j2 - ((long) (iH - l1e0.d(pk80Var.n.a(iH, i3, i4, i5), 0, iH)));
        if (jD < 0) {
            return 0L;
        }
        return jD;
    }

    public static final kwj b(int i, Function0 function0, fet fetVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        v0h0 v0h0Var = kwj.I;
        boolean z = ((((i2 & 896) ^ 384) > 256 && fetVar.g(function0)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && fetVar.e(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && fetVar.d(0.0f)) || (i2 & 48) == 32);
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new he10((byte) 1, i, function0);
            fetVar.o0(objP);
        }
        kwj kwjVar = (kwj) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
        ((hgk0) kwjVar.H).setValue(function0);
        return kwjVar;
    }
}
