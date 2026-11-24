package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ecv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7586a;
    public final jjm b;
    public final a4x c;

    public ecv0(int i, hjm hjmVar, i4 i4Var) {
        i4Var.getClass();
        this.f7586a = i;
        this.b = hjmVar;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecv0)) {
            return false;
        }
        ecv0 ecv0Var = (ecv0) obj;
        return this.f7586a == ecv0Var.f7586a && Intrinsics.d(this.b, ecv0Var.b) && Intrinsics.d(this.c, ecv0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f7586a) * 31;
        jjm jjmVar = this.b;
        return this.c.hashCode() + ((iHashCode + (jjmVar == null ? 0 : jjmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhoWinGroupUiModel(key=");
        sb.append(this.f7586a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", opponents=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
