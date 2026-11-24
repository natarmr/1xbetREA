package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class v9g implements x9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37033a;

    public v9g(mdm mdmVar) {
        this.f37033a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9g) && this.f37033a.equals(((v9g) obj).f37033a);
    }

    public final int hashCode() {
        return this.f37033a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f37033a, Separators.RPAREN);
    }
}
