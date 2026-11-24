package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q8u0 implements s8u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f28317a;

    public q8u0(mdm mdmVar) {
        this.f28317a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8u0) && this.f28317a.equals(((q8u0) obj).f28317a);
    }

    public final int hashCode() {
        return this.f28317a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f28317a, Separators.RPAREN);
    }
}
