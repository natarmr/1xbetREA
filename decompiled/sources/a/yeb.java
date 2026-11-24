package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yeb implements afb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f42477a;

    public yeb(mdm mdmVar) {
        this.f42477a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yeb) && this.f42477a.equals(((yeb) obj).f42477a);
    }

    public final int hashCode() {
        return this.f42477a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f42477a, Separators.RPAREN);
    }
}
