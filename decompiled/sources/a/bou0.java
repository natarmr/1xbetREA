package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bou0 implements cou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2952a;

    public final boolean equals(Object obj) {
        if (obj instanceof bou0) {
            return this.f2952a.equals(((bou0) obj).f2952a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2952a.hashCode();
    }

    public final String toString() {
        return kng0.l("SearchTextChanged(searchText=", this.f2952a, Separators.RPAREN);
    }
}
