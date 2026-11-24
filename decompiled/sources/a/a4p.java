package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a4p implements d4p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f235a;

    public a4p(mdm mdmVar) {
        this.f235a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4p) && this.f235a.equals(((a4p) obj).f235a);
    }

    public final int hashCode() {
        return this.f235a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f235a, Separators.RPAREN);
    }
}
