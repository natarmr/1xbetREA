package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class tnj0 implements vnj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f34238a;

    public tnj0(mdm mdmVar) {
        this.f34238a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnj0) && this.f34238a.equals(((tnj0) obj).f34238a);
    }

    public final int hashCode() {
        return this.f34238a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f34238a, Separators.RPAREN);
    }
}
