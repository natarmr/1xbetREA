package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zu implements iv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44986a;

    public zu(String str) {
        this.f44986a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu) && this.f44986a.equals(((zu) obj).f44986a);
    }

    public final int hashCode() {
        return this.f44986a.hashCode();
    }

    public final String toString() {
        return kng0.l("ActivatedSuccessfully(resetHashSecretKey=", this.f44986a, Separators.RPAREN);
    }
}
