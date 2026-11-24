package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gzv0 implements hzv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f12202a;

    public gzv0(mdm mdmVar) {
        this.f12202a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzv0) && this.f12202a.equals(((gzv0) obj).f12202a);
    }

    public final int hashCode() {
        return this.f12202a.hashCode();
    }

    public final String toString() {
        return b1j.j("UnderMaintenance(config=", this.f12202a, Separators.RPAREN);
    }
}
