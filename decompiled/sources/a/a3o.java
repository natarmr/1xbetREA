package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a3o implements g3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181a;

    public a3o(String str) {
        this.f181a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3o) && this.f181a.equals(((a3o) obj).f181a);
    }

    public final int hashCode() {
        return this.f181a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(query=", this.f181a, Separators.RPAREN);
    }
}
