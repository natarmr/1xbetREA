package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xy implements az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f41682a;

    public xy(mdm mdmVar) {
        this.f41682a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy) && this.f41682a.equals(((xy) obj).f41682a);
    }

    public final int hashCode() {
        return this.f41682a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfigurator=", this.f41682a, Separators.RPAREN);
    }
}
