package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s9o implements y9o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bhj f31855a;

    public s9o(bhj bhjVar) {
        this.f31855a = bhjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9o) && this.f31855a.equals(((s9o) obj).f31855a);
    }

    public final int hashCode() {
        return this.f31855a.hashCode();
    }

    public final String toString() {
        return "ShowDayExpressDetailDialog(expressEvent=" + this.f31855a + Separators.RPAREN;
    }
}
