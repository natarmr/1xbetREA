package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g49 implements i49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10653a;

    public final boolean equals(Object obj) {
        if (obj instanceof g49) {
            return this.f10653a.equals(((g49) obj).f10653a);
        }
        return false;
    }

    @Override // a.i49
    public final String getDescription() {
        return this.f10653a;
    }

    public final int hashCode() {
        return this.f10653a.hashCode();
    }

    public final String toString() {
        return kng0.l("Video(description=", this.f10653a, Separators.RPAREN);
    }
}
