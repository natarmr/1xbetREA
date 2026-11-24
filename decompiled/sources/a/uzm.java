package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36542a;
    public final d280 b;

    public uzm(String str, d280 d280Var) {
        str.getClass();
        this.f36542a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzm)) {
            return false;
        }
        uzm uzmVar = (uzm) obj;
        return Intrinsics.d(this.f36542a, uzmVar.f36542a) && Intrinsics.d(this.b, uzmVar.b);
    }

    public final int hashCode() {
        int iA = twn.a(0, this.f36542a.hashCode() * 31, 31);
        d280 d280Var = this.b;
        return iA + (d280Var != null ? d280Var.hashCode() : 0);
    }

    public final String toString() {
        return "Default(opponentLabel=" + this.f36542a + ", redCardCounter=0, opponentIcon=" + this.b + Separators.RPAREN;
    }
}
