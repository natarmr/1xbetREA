package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21020a;

    public m1q(String str) {
        this.f21020a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1q) && this.f21020a.equals(((m1q) obj).f21020a);
    }

    public final int hashCode() {
        return this.f21020a.hashCode();
    }

    public final String toString() {
        return kng0.l("MediaSourceId(id=", this.f21020a, Separators.RPAREN);
    }
}
