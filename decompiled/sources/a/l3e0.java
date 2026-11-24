package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hee f19354a;

    public l3e0(hee heeVar) {
        this.f19354a = heeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3e0) && this.f19354a == ((l3e0) obj).f19354a;
    }

    public final int hashCode() {
        return this.f19354a.hashCode();
    }

    public final String toString() {
        return "IconCell(iconType=" + this.f19354a + Separators.RPAREN;
    }
}
