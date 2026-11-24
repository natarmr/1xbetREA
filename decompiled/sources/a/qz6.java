package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f29566a;

    public qz6(Throwable th) {
        this.f29566a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz6) && this.f29566a.equals(((qz6) obj).f29566a);
    }

    public final int hashCode() {
        return this.f29566a.hashCode();
    }

    public final String toString() {
        return ohs0.q("ShowBaseErrorDialog(throwable=", Separators.RPAREN, this.f29566a);
    }
}
