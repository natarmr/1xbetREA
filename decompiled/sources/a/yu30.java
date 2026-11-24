package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yu30 implements cv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43250a;

    public yu30(int i) {
        this.f43250a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu30) && this.f43250a == ((yu30) obj).f43250a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43250a);
    }

    public final String toString() {
        return ua80.e(this.f43250a, "OnTabSelected(position=", Separators.RPAREN);
    }
}
