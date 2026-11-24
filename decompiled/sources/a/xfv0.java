package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xfv0 implements yfv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40813a;

    public xfv0(String str) {
        this.f40813a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfv0) && this.f40813a.equals(((xfv0) obj).f40813a);
    }

    public final int hashCode() {
        return this.f40813a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChange(query=", this.f40813a, Separators.RPAREN);
    }
}
