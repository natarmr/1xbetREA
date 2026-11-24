package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t8p0 implements u8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f33522a;

    public t8p0(mdm mdmVar) {
        this.f33522a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8p0) && this.f33522a.equals(((t8p0) obj).f33522a);
    }

    public final int hashCode() {
        return this.f33522a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f33522a, Separators.RPAREN);
    }
}
