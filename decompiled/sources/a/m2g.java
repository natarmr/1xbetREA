package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m2g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21057a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;

    public m2g(int i, int i2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f21057a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2g)) {
            return false;
        }
        m2g m2gVar = (m2g) obj;
        return Intrinsics.d(this.f21057a, m2gVar.f21057a) && this.b == m2gVar.b && this.c == m2gVar.c && Intrinsics.d(this.d, m2gVar.d) && this.e == m2gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, twn.a(this.b, this.f21057a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V1(opponentName=", this.f21057a, ", totalCount=", ", winCount=");
        kng0.w(this.c, ", scoreResult=", this.d, ", isScoreChanged=", sbP);
        return rw2.p(sbP, this.e, Separators.RPAREN);
    }
}
