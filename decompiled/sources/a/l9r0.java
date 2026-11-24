package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l9r0 implements n9r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19671a;

    public l9r0(String str) {
        this.f19671a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9r0) && this.f19671a.equals(((l9r0) obj).f19671a);
    }

    public final int hashCode() {
        return this.f19671a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChange(query=", this.f19671a, Separators.RPAREN);
    }
}
