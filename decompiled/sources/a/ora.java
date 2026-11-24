package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ora implements qra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25726a;

    public ora(String str) {
        this.f25726a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ora) && this.f25726a.equals(((ora) obj).f25726a);
    }

    public final int hashCode() {
        return this.f25726a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(value=", this.f25726a, Separators.RPAREN);
    }
}
