package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43388a;
    public final int b;
    public final d280 c;

    public yws0(int i, d280 d280Var, String str) {
        str.getClass();
        this.f43388a = str;
        this.b = i;
        this.c = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yws0)) {
            return false;
        }
        yws0 yws0Var = (yws0) obj;
        return Intrinsics.d(this.f43388a, yws0Var.f43388a) && this.b == yws0Var.b && this.c.equals(yws0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f43388a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V4(opponentLabel=", this.f43388a, ", redCardCounter=", ", opponentIcon=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
