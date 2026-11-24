package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yd0 implements ae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f42408a;

    public yd0(mdm mdmVar) {
        this.f42408a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd0) && this.f42408a.equals(((yd0) obj).f42408a);
    }

    public final int hashCode() {
        return this.f42408a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f42408a, Separators.RPAREN);
    }
}
