package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wz10 implements zz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39999a;

    public wz10(String str) {
        this.f39999a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz10) && this.f39999a.equals(((wz10) obj).f39999a);
    }

    public final int hashCode() {
        return this.f39999a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBarError(message=", this.f39999a, Separators.RPAREN);
    }
}
