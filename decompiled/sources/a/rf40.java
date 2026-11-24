package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0i f30368a;

    public rf40(h0i h0iVar) {
        this.f30368a = h0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf40) && this.f30368a.equals(((rf40) obj).f30368a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(rf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f30368a.hashCode();
    }

    public final String toString() {
        return "TournamentsMonth(model=" + this.f30368a + Separators.RPAREN;
    }
}
