package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tdh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33769a;

    public final boolean equals(Object obj) {
        if (obj instanceof tdh0) {
            return this.f33769a.equals(((tdh0) obj).f33769a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33769a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchDescription(value=", this.f33769a, Separators.RPAREN);
    }
}
