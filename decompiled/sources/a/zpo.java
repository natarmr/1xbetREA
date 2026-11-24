package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zpo implements hqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qhj f44769a;

    public zpo(qhj qhjVar) {
        this.f44769a = qhjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpo) && this.f44769a.equals(((zpo) obj).f44769a);
    }

    public final int hashCode() {
        return this.f44769a.hashCode();
    }

    public final String toString() {
        return "OnExpressEventClick(model=" + this.f44769a + Separators.RPAREN;
    }
}
