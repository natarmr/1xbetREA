package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tmf0 implements wmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f34192a;

    public tmf0(mdm mdmVar) {
        this.f34192a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmf0) && this.f34192a.equals(((tmf0) obj).f34192a);
    }

    public final int hashCode() {
        return this.f34192a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f34192a, Separators.RPAREN);
    }
}
