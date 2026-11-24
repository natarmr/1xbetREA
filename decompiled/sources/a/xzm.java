package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41759a;
    public final d280 b;

    public xzm(String str, d280 d280Var) {
        str.getClass();
        this.f41759a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzm)) {
            return false;
        }
        xzm xzmVar = (xzm) obj;
        return Intrinsics.d(this.f41759a, xzmVar.f41759a) && this.b.equals(xzmVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + twn.e(this.b, this.f41759a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "V3(opponentLabel=" + this.f41759a + ", opponentIcon=" + this.b + ", redCardCounter=0)";
    }
}
