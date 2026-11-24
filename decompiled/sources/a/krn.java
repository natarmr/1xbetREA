package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class krn implements mrn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18774a;

    public krn(String str) {
        this.f18774a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krn) && this.f18774a.equals(((krn) obj).f18774a);
    }

    public final int hashCode() {
        return this.f18774a.hashCode();
    }

    public final String toString() {
        return kng0.l("SetHelperText(message=", this.f18774a, Separators.RPAREN);
    }
}
