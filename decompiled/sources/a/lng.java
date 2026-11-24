package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20343a;

    public final boolean equals(Object obj) {
        if (obj instanceof lng) {
            return this.f20343a.equals(((lng) obj).f20343a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20343a.hashCode();
    }

    public final String toString() {
        return kng0.l("CountStepTitle(value=", this.f20343a, Separators.RPAREN);
    }
}
