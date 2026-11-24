package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zyd implements dzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45201a;

    public zyd(String str) {
        this.f45201a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyd) && this.f45201a.equals(((zyd) obj).f45201a);
    }

    public final int hashCode() {
        return this.f45201a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnack(text=", this.f45201a, Separators.RPAREN);
    }
}
