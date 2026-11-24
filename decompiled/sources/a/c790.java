package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c790 implements d790 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f3851a;

    public c790(mdm mdmVar) {
        this.f3851a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c790) && this.f3851a.equals(((c790) obj).f3851a);
    }

    public final int hashCode() {
        return this.f3851a.hashCode();
    }

    public final String toString() {
        return b1j.j("PageNotFound(lottieConfig=", this.f3851a, Separators.RPAREN);
    }
}
