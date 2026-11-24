package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fou0 extends gou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f9901a;

    public fou0(mdm mdmVar) {
        this.f9901a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fou0) && this.f9901a.equals(((fou0) obj).f9901a);
    }

    public final int hashCode() {
        return this.f9901a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f9901a, Separators.RPAREN);
    }
}
