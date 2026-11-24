package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v9j implements x9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37037a;

    public final boolean equals(Object obj) {
        if (obj instanceof v9j) {
            return this.f37037a.equals(((v9j) obj).f37037a);
        }
        return false;
    }

    @Override // a.x9j
    public final String getDescription() {
        return this.f37037a;
    }

    public final int hashCode() {
        return this.f37037a.hashCode();
    }

    public final String toString() {
        return kng0.l("Video(description=", this.f37037a, Separators.RPAREN);
    }
}
