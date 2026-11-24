package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class de80 implements ee80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5937a;
    public final boolean b;
    public final int c;
    public final long d;

    public de80(int i, long j, String str, boolean z) {
        str.getClass();
        this.f5937a = str;
        this.b = z;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de80)) {
            return false;
        }
        de80 de80Var = (de80) obj;
        return Intrinsics.d(this.f5937a, de80Var.f5937a) && this.b == de80Var.b && this.c == de80Var.c && this.d == de80Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + twn.a(this.c, brm0.e(this.f5937a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("UnlimitedOutcomesChoiceUiModel(text=", this.f5937a, ", isChosen=", this.b, ", gameId=");
        sbU.append(this.c);
        sbU.append(", sportId=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
