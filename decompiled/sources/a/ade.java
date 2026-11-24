package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ade implements lde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f675a;

    public ade(mdm mdmVar) {
        this.f675a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ade) && this.f675a.equals(((ade) obj).f675a);
    }

    public final int hashCode() {
        return this.f675a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f675a, Separators.RPAREN);
    }
}
