package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yi60 implements zi60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk60 f42672a;

    public final boolean equals(Object obj) {
        if (obj instanceof yi60) {
            return this.f42672a.equals(((yi60) obj).f42672a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42672a.hashCode();
    }

    public final String toString() {
        return "OnOnboardingSectionClick(sectionModel=" + this.f42672a + Separators.RPAREN;
    }
}
