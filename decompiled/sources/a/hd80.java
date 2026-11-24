package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hd80 implements kd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f12858a;

    public hd80(mdm mdmVar) {
        this.f12858a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd80) && this.f12858a.equals(((hd80) obj).f12858a);
    }

    public final int hashCode() {
        return this.f12858a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f12858a, Separators.RPAREN);
    }
}
