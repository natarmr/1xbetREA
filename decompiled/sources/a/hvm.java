package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13732a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;

    public hvm(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.f13732a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvm)) {
            return false;
        }
        hvm hvmVar = (hvm) obj;
        return Intrinsics.d(this.f13732a, hvmVar.f13732a) && this.b == hvmVar.b && this.c == hvmVar.c && this.d.equals(hvmVar.d) && Intrinsics.d(this.e, hvmVar.e) && this.f == hvmVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(twn.a(this.c, twn.a(this.b, this.f13732a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V1(opponentName=", this.f13732a, ", firstCard=", ", secondCard=");
        kng0.w(this.c, ", combination=", this.d, ", resultScore=", sbP);
        return defpackage.c.c(this.e, ", isScoreChanged=", Separators.RPAREN, sbP, this.f);
    }
}
