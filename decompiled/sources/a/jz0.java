package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jz0 implements lz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f17384a;

    public jz0(mdm mdmVar) {
        this.f17384a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz0) && this.f17384a.equals(((jz0) obj).f17384a);
    }

    public final int hashCode() {
        return this.f17384a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f17384a, Separators.RPAREN);
    }
}
