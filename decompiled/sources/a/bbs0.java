package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bbs0 implements dbs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f2323a;

    public bbs0(mdm mdmVar) {
        this.f2323a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbs0) && this.f2323a.equals(((bbs0) obj).f2323a);
    }

    public final int hashCode() {
        return this.f2323a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f2323a, Separators.RPAREN);
    }
}
