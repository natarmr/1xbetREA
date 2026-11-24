package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class r4w implements s4w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29858a;

    public r4w(String str) {
        this.f29858a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4w) && this.f29858a.equals(((r4w) obj).f29858a);
    }

    public final int hashCode() {
        return this.f29858a.hashCode();
    }

    public final String toString() {
        return kng0.l("UnknownError(message=", this.f29858a, Separators.RPAREN);
    }
}
