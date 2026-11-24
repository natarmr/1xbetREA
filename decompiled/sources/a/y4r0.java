package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y4r0 implements z4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f42018a;

    public y4r0(mdm mdmVar) {
        this.f42018a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4r0) && this.f42018a.equals(((y4r0) obj).f42018a);
    }

    public final int hashCode() {
        return this.f42018a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f42018a, Separators.RPAREN);
    }
}
