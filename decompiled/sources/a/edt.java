package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class edt implements pdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f7634a;

    public edt(Throwable th) {
        this.f7634a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edt) && this.f7634a.equals(((edt) obj).f7634a);
    }

    public final int hashCode() {
        return this.f7634a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f7634a);
    }
}
