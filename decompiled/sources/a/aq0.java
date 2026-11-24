package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class aq0 implements bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1274a;

    public aq0(String str) {
        this.f1274a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq0) && this.f1274a.equals(((aq0) obj).f1274a);
    }

    public final int hashCode() {
        return this.f1274a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSortingOptionSelect(sortName=", this.f1274a, Separators.RPAREN);
    }
}
