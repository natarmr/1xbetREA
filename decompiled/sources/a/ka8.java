package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ka8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17952a;

    public final boolean equals(Object obj) {
        if (obj instanceof ka8) {
            return this.f17952a.equals(((ka8) obj).f17952a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17952a.hashCode();
    }

    public final String toString() {
        return kng0.l("BlockBetText(value=", this.f17952a, Separators.RPAREN);
    }
}
