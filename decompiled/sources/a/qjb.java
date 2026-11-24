package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qjb implements sjb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pjb f28829a;

    public qjb(pjb pjbVar) {
        this.f28829a = pjbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjb) && this.f28829a.equals(((qjb) obj).f28829a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f28829a.f27081a);
    }

    public final int hashCode() {
        return this.f28829a.hashCode();
    }

    public final String toString() {
        return "Card(item=" + this.f28829a + Separators.RPAREN;
    }
}
