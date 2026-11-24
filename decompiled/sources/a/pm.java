package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pm implements qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27208a;

    public final boolean equals(Object obj) {
        if (obj instanceof pm) {
            return this.f27208a.equals(((pm) obj).f27208a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27208a.hashCode();
    }

    public final String toString() {
        return kng0.l("SearchTextChanged(searchText=", this.f27208a, Separators.RPAREN);
    }
}
