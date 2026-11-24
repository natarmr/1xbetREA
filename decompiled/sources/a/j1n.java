package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15744a;
    public final d280 b;
    public final String c;

    public j1n(String str, c280 c280Var, String str2) {
        str.getClass();
        str2.getClass();
        this.f15744a = str;
        this.b = c280Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1n)) {
            return false;
        }
        j1n j1nVar = (j1n) obj;
        return Intrinsics.d(this.f15744a, j1nVar.f15744a) && Intrinsics.d(this.b, j1nVar.b) && Intrinsics.d(this.c, j1nVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f15744a.hashCode() * 31;
        d280 d280Var = this.b;
        return Boolean.hashCode(false) + brm0.e(brm0.e(ua80.b((iHashCode + (d280Var == null ? 0 : d280Var.hashCode())) * 29791, 31, this.c), 31, false), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V2(opponentLabel=");
        sb.append(this.f15744a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", gameScore=, setScore=, resultScore=");
        return axq.n(sb, this.c, ", resultScoreChanged=false, gameScoreChanged=false, setScoreChanged=false)");
    }
}
