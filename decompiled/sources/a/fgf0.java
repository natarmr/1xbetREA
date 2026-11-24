package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fgf0 implements hgf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9490a;

    public fgf0(String str) {
        this.f9490a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgf0) && this.f9490a.equals(((fgf0) obj).f9490a);
    }

    public final int hashCode() {
        return this.f9490a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChange(query=", this.f9490a, Separators.RPAREN);
    }
}
