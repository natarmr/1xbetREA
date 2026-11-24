package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w9j implements x9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38783a;

    public final boolean equals(Object obj) {
        if (obj instanceof w9j) {
            return this.f38783a.equals(((w9j) obj).f38783a);
        }
        return false;
    }

    @Override // a.x9j
    public final String getDescription() {
        return this.f38783a;
    }

    public final int hashCode() {
        return this.f38783a.hashCode();
    }

    public final String toString() {
        return kng0.l("Zone(description=", this.f38783a, Separators.RPAREN);
    }
}
