package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zqv implements brv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8m f44826a;

    public zqv(b8m b8mVar) {
        this.f44826a = b8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqv) && this.f44826a.equals(((zqv) obj).f44826a);
    }

    public final int hashCode() {
        return this.f44826a.hashCode();
    }

    public final String toString() {
        return "Content(dsModel=" + this.f44826a + Separators.RPAREN;
    }
}
