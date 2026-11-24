package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ud20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35459a;

    public ud20(String str) {
        this.f35459a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud20) && this.f35459a.equals(((ud20) obj).f35459a);
    }

    public final int hashCode() {
        return this.f35459a.hashCode();
    }

    public final String toString() {
        return kng0.l("MakeBetError(errorMessage=", this.f35459a, Separators.RPAREN);
    }
}
