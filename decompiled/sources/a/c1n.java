package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3580a;
    public final int b;
    public final d280 c;

    public c1n(int i, d280 d280Var, String str) {
        str.getClass();
        this.f3580a = str;
        this.b = i;
        this.c = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1n)) {
            return false;
        }
        c1n c1nVar = (c1n) obj;
        return Intrinsics.d(this.f3580a, c1nVar.f3580a) && this.b == c1nVar.b && this.c.equals(c1nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f3580a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V4(opponentLabel=", this.f3580a, ", redCardCounter=", ", opponentIcon=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
