package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a7o0 implements b7o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f381a;

    public a7o0(mdm mdmVar) {
        this.f381a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7o0) && this.f381a.equals(((a7o0) obj).f381a);
    }

    public final int hashCode() {
        return this.f381a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f381a, Separators.RPAREN);
    }
}
