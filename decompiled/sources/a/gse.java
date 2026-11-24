package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gse implements ise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11826a;

    public final boolean equals(Object obj) {
        if (obj instanceof gse) {
            return this.f11826a.equals(((gse) obj).f11826a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11826a.hashCode();
    }

    public final String toString() {
        return kng0.l("TitleText(value=", this.f11826a, Separators.RPAREN);
    }
}
