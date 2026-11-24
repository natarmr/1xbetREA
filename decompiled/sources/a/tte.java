package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34507a;

    public final boolean equals(Object obj) {
        if (obj instanceof tte) {
            return this.f34507a.equals(((tte) obj).f34507a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34507a.hashCode();
    }

    public final String toString() {
        return kng0.l("TitleText(value=", this.f34507a, Separators.RPAREN);
    }
}
