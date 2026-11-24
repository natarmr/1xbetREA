package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pu8 implements su8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27602a;

    public pu8(String str) {
        this.f27602a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu8) && this.f27602a.equals(((pu8) obj).f27602a);
    }

    public final int hashCode() {
        return this.f27602a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(query=", this.f27602a, Separators.RPAREN);
    }
}
