package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34558a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;

    public tum(int i, int i2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f34558a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tum)) {
            return false;
        }
        tum tumVar = (tum) obj;
        return Intrinsics.d(this.f34558a, tumVar.f34558a) && this.b == tumVar.b && this.c == tumVar.c && Intrinsics.d(this.d, tumVar.d) && this.e == tumVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, twn.a(this.b, this.f34558a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V1(opponentName=", this.f34558a, ", totalCount=", ", winCount=");
        kng0.w(this.c, ", scoreResult=", this.d, ", isScoreChanged=", sbP);
        return rw2.p(sbP, this.e, Separators.RPAREN);
    }
}
