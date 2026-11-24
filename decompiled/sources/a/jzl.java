package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jzl implements mzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17419a;
    public final boolean b;
    public final uzl c;

    public jzl(long j, boolean z, uzl uzlVar) {
        this.f17419a = j;
        this.b = z;
        this.c = uzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzl)) {
            return false;
        }
        jzl jzlVar = (jzl) obj;
        return this.f17419a == jzlVar.f17419a && this.b == jzlVar.b && this.c == jzlVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Long.hashCode(this.f17419a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f17419a, "OnFavoriteBtnClicked(gameId=", ", isLive=", this.b);
        sbR.append(", buttonState=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
