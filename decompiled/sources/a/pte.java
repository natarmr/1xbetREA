package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class pte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27560a;

    public final boolean equals(Object obj) {
        if (obj instanceof pte) {
            return this.f27560a.equals(((pte) obj).f27560a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27560a.hashCode();
    }

    public final String toString() {
        return kng0.l("SubtitleText(value=", this.f27560a, Separators.RPAREN);
    }
}
