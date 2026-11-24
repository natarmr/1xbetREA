package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wtr implements ytr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39755a;

    public wtr(String str) {
        this.f39755a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtr) && this.f39755a.equals(((wtr) obj).f39755a);
    }

    public final int hashCode() {
        return this.f39755a.hashCode();
    }

    public final String toString() {
        return kng0.l("Default(sportIconUrl=", this.f39755a, Separators.RPAREN);
    }
}
