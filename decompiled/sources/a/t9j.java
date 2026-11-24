package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t9j implements u9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33565a;

    public final boolean equals(Object obj) {
        if (obj instanceof t9j) {
            return this.f33565a.equals(((t9j) obj).f33565a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33565a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlaysHolderPip(description=", this.f33565a, Separators.RPAREN);
    }
}
