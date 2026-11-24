package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class sge implements fie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f32156a;

    public sge(mdm mdmVar) {
        this.f32156a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sge) && this.f32156a.equals(((sge) obj).f32156a);
    }

    public final int hashCode() {
        return this.f32156a.hashCode();
    }

    public final String toString() {
        return b1j.j("ConnectionError(config=", this.f32156a, Separators.RPAREN);
    }
}
