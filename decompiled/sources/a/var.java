package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class var implements xar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37105a;

    public var(mdm mdmVar) {
        this.f37105a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof var) && this.f37105a.equals(((var) obj).f37105a);
    }

    public final int hashCode() {
        return this.f37105a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f37105a, Separators.RPAREN);
    }
}
