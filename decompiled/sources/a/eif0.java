package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eif0 implements fif0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7857a;

    public eif0(String str) {
        this.f7857a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eif0) && this.f7857a.equals(((eif0) obj).f7857a);
    }

    public final int hashCode() {
        return this.f7857a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowShackBar(message=", this.f7857a, Separators.RPAREN);
    }
}
