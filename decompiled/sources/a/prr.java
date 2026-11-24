package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class prr implements asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27479a;

    public final boolean equals(Object obj) {
        if (obj instanceof prr) {
            return this.f27479a.equals(((prr) obj).f27479a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27479a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(value=", this.f27479a, Separators.RPAREN);
    }
}
