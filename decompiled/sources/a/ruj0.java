package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ruj0 implements xuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31132a;

    public ruj0(String str) {
        this.f31132a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruj0) && this.f31132a.equals(((ruj0) obj).f31132a);
    }

    public final int hashCode() {
        return this.f31132a.hashCode();
    }

    public final String toString() {
        return kng0.l("MultiBetError(errorMessage=", this.f31132a, Separators.RPAREN);
    }
}
