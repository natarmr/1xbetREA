package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f29779a;

    public r3b(n0x n0xVar) {
        this.f29779a = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3b) && this.f29779a.equals(((r3b) obj).f29779a);
    }

    public final int hashCode() {
        return this.f29779a.hashCode();
    }

    public final String toString() {
        return "PictureChanged(picture=" + this.f29779a + Separators.RPAREN;
    }
}
