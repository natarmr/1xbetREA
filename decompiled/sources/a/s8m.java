package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s8m implements u8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f31809a;

    public s8m(n0x n0xVar) {
        this.f31809a = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8m) && this.f31809a.equals(((s8m) obj).f31809a);
    }

    public final int hashCode() {
        return this.f31809a.hashCode();
    }

    public final String toString() {
        return "Team(image=" + this.f31809a + Separators.RPAREN;
    }
}
