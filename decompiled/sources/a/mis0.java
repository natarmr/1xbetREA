package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mis0 implements pis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21861a;

    public mis0(String str) {
        this.f21861a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mis0) && this.f21861a.equals(((mis0) obj).f21861a);
    }

    public final int hashCode() {
        return this.f21861a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(query=", this.f21861a, Separators.RPAREN);
    }
}
