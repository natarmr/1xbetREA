package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c7e0 implements d7e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f3858a;

    public c7e0(mdm mdmVar) {
        this.f3858a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7e0) && this.f3858a.equals(((c7e0) obj).f3858a);
    }

    public final int hashCode() {
        return this.f3858a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f3858a, Separators.RPAREN);
    }
}
