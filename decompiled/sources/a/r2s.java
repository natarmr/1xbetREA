package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r2s implements y2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29751a;

    public r2s(int i) {
        this.f29751a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2s) && this.f29751a == ((r2s) obj).f29751a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29751a);
    }

    public final String toString() {
        return ua80.e(this.f29751a, "ShowErrorMessage(messageId=", Separators.RPAREN);
    }
}
