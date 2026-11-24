package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xxr implements yxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41672a;
    public final ah30 b;

    public xxr(String str, ah30 ah30Var) {
        str.getClass();
        this.f41672a = str;
        this.b = ah30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxr)) {
            return false;
        }
        xxr xxrVar = (xxr) obj;
        return Intrinsics.d(this.f41672a, xxrVar.f41672a) && this.b.equals(xxrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41672a.hashCode() * 31);
    }

    public final String toString() {
        return "SecondTeam(playerName=" + this.f41672a + ", playerCards=" + this.b + Separators.RPAREN;
    }
}
