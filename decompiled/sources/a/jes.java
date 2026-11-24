package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jes extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16390a;

    public jes(String str) {
        this.f16390a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jes) && this.f16390a.equals(((jes) obj).f16390a);
    }

    public final int hashCode() {
        return this.f16390a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoFirstPlayerLogoUrlChanged(url=", this.f16390a, Separators.RPAREN);
    }
}
