package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6652a;

    public final boolean equals(Object obj) {
        if (obj instanceof dte) {
            return this.f6652a.equals(((dte) obj).f6652a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6652a.hashCode();
    }

    public final String toString() {
        return kng0.l("CaptionText(value=", this.f6652a, Separators.RPAREN);
    }
}
