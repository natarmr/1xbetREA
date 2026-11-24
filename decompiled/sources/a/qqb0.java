package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qqb0 implements uqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29159a;

    public final boolean equals(Object obj) {
        if (obj instanceof qqb0) {
            return this.f29159a.equals(((qqb0) obj).f29159a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29159a.hashCode();
    }

    public final String toString() {
        return kng0.l("Description(value=", this.f29159a, Separators.RPAREN);
    }
}
