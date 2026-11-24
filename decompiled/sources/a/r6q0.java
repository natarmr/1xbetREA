package a;

import android.gov.nist.core.Separators;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class r6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29947a = kotlin.text.c.q(10, "H");

    public static long a(y9q0 y9q0Var, w6k w6kVar, mrq mrqVar) {
        s03 s03VarB = b(y9q0Var, w6kVar, mrqVar, 1, false);
        return (((long) jtm0.j(s03VarB.f31393a.f())) << 32) | (((long) jtm0.j(s03VarB.f)) & 4294967295L);
    }

    public static final s03 b(y9q0 y9q0Var, w6k w6kVar, mrq mrqVar, int i, boolean z) {
        String strB0 = CollectionsKt.b0(l1e0.o(0, i), Separators.RETURN, null, null, new meo0((byte) 29), 30);
        iun iunVar = iun.f15405a;
        return new s03(new v03(strB0, y9q0Var, iunVar, iunVar, mrqVar, w6kVar, z), i, 1, r4e.b(0, 0, 0, 0, 15));
    }
}
