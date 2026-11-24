package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39848a;
    public final String b;

    public wvp(long j, String str) {
        this.f39848a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvp)) {
            return false;
        }
        wvp wvpVar = (wvp) obj;
        return this.f39848a == wvpVar.f39848a && this.b.equals(wvpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f39848a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39848a, "FighterImageModel(feedId=", ", imageS3=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
