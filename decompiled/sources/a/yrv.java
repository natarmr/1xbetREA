package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yrv implements asv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43140a;

    public final boolean equals(Object obj) {
        if (obj instanceof yrv) {
            return this.f43140a.equals(((yrv) obj).f43140a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43140a.hashCode();
    }

    public final String toString() {
        return kng0.l("Subtitle(value=", this.f43140a, Separators.RPAREN);
    }
}
