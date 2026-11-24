package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sce implements mde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thp0 f31982a;

    public sce(thp0 thp0Var) {
        this.f31982a = thp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sce) && this.f31982a.equals(((sce) obj).f31982a);
    }

    public final int hashCode() {
        return this.f31982a.hashCode();
    }

    public final String toString() {
        return "Empty(item=" + this.f31982a + Separators.RPAREN;
    }
}
