package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ni90 implements pi90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23573a;

    public ni90(int i) {
        this.f23573a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni90) && this.f23573a == ((ni90) obj).f23573a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23573a);
    }

    public final String toString() {
        return ua80.e(this.f23573a, "Header(titleTextRes=", Separators.RPAREN);
    }
}
