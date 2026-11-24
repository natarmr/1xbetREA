package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mnc0 implements onc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22083a;

    public mnc0(String str) {
        this.f22083a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnc0) && this.f22083a.equals(((mnc0) obj).f22083a);
    }

    public final int hashCode() {
        return this.f22083a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f22083a, Separators.RPAREN);
    }
}
