package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40027a;
    public final d280 b;
    public final String c;

    public wzm(String str, d280 d280Var, String str2) {
        str.getClass();
        str2.getClass();
        this.f40027a = str;
        this.b = d280Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzm)) {
            return false;
        }
        wzm wzmVar = (wzm) obj;
        return Intrinsics.d(this.f40027a, wzmVar.f40027a) && Intrinsics.d(this.b, wzmVar.b) && Intrinsics.d(this.c, wzmVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f40027a.hashCode() * 31;
        d280 d280Var = this.b;
        return Integer.hashCode(0) + ua80.b((iHashCode + (d280Var == null ? 0 : d280Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V2(opponentLabel=");
        sb.append(this.f40027a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", score=");
        return axq.n(sb, this.c, ", redCardCounter=0)");
    }
}
