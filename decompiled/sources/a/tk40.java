package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tk40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34077a;

    public tk40(int i) {
        this.f34077a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk40) && this.f34077a == ((tk40) obj).f34077a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34077a);
    }

    public final String toString() {
        return ua80.e(this.f34077a, "ShowSnackbar(message=", Separators.RPAREN);
    }
}
