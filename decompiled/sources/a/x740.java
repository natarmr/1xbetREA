package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x740 implements z740 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f40396a;

    public x740(mdm mdmVar) {
        this.f40396a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x740) && this.f40396a.equals(((x740) obj).f40396a);
    }

    public final int hashCode() {
        return this.f40396a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f40396a, Separators.RPAREN);
    }
}
