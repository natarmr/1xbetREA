package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class des extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5964a;

    public des(String str) {
        this.f5964a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof des) && this.f5964a.equals(((des) obj).f5964a);
    }

    public final int hashCode() {
        return this.f5964a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneSecondPlayerLogoUrlChanged(url=", this.f5964a, Separators.RPAREN);
    }
}
