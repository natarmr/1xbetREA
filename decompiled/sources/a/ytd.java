package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ytd implements aud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43212a;
    public final q4f b;

    public ytd(int i, q4f q4fVar) {
        this.f43212a = i;
        this.b = q4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytd)) {
            return false;
        }
        ytd ytdVar = (ytd) obj;
        return this.f43212a == ytdVar.f43212a && this.b == ytdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f43212a) * 31);
    }

    public final String toString() {
        return "MaxLimit(limit=" + this.f43212a + ", couponTypeModel=" + this.b + Separators.RPAREN;
    }
}
