package a;

/* JADX INFO: loaded from: classes.dex */
public final class woq {
    public final void a(pj30 pj30Var, pj30 pj30Var2, long j) {
        long jE = bww.E(j, s7z.f31776a);
        if (pj30Var != null) {
            int iL = pj30Var.L(p4e.h(jE));
            new akx(akx.a(iL, pj30Var.D(iL)));
        }
        if (pj30Var2 != null) {
            int iL2 = pj30Var2.L(p4e.h(jE));
            new akx(akx.a(iL2, pj30Var2.D(iL2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woq)) {
            return false;
        }
        voq voqVar = voq.f37778a;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + twn.a(0, voq.f37778a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + voq.f37778a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
