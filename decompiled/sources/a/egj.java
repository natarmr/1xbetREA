package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class egj implements ggj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bhj f7769a;

    public egj(bhj bhjVar) {
        this.f7769a = bhjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egj) && this.f7769a.equals(((egj) obj).f7769a);
    }

    public final int hashCode() {
        return this.f7769a.hashCode();
    }

    public final String toString() {
        return "ShowDayExpressDetailDialog(expressEvent=" + this.f7769a + Separators.RPAREN;
    }
}
