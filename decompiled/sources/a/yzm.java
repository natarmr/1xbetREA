package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43520a;
    public final d280 b;

    public yzm(String str, d280 d280Var) {
        str.getClass();
        this.f43520a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzm)) {
            return false;
        }
        yzm yzmVar = (yzm) obj;
        return Intrinsics.d(this.f43520a, yzmVar.f43520a) && this.b.equals(yzmVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + twn.e(this.b, this.f43520a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "V4(opponentLabel=" + this.f43520a + ", opponentIcon=" + this.b + ", redCardCounter=0)";
    }
}
