package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wll implements yll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0s f39359a;

    public wll(p0s p0sVar) {
        this.f39359a = p0sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wll) && this.f39359a.equals(((wll) obj).f39359a);
    }

    public final int hashCode() {
        return this.f39359a.hashCode();
    }

    public final String toString() {
        return "Horizontal(scrollType=" + this.f39359a + Separators.RPAREN;
    }
}
