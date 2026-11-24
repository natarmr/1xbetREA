package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r9p implements s9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30095a;
    public final int b;

    public r9p(String str, int i) {
        this.f30095a = str;
        this.b = i;
    }

    @Override // a.s9p
    public final String a() {
        return this.f30095a;
    }

    @Override // a.s9p
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9p)) {
            return false;
        }
        r9p r9pVar = (r9p) obj;
        return this.f30095a.equals(r9pVar.f30095a) && this.b == r9pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f30095a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "XGames(headerName=", this.f30095a, ", headerCounter=", Separators.RPAREN);
    }
}
