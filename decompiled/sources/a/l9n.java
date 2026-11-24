package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l9n implements m9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19662a;
    public final x9n b;
    public final j9n c;

    public l9n(long j, x9n x9nVar, j9n j9nVar) {
        this.f19662a = j;
        this.b = x9nVar;
        this.c = j9nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9n)) {
            return false;
        }
        l9n l9nVar = (l9n) obj;
        return this.f19662a == l9nVar.f19662a && this.b.equals(l9nVar.b) && this.c.equals(l9nVar.c);
    }

    @Override // a.m9n
    public final long getId() {
        return this.f19662a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f19662a) * 31)) * 31);
    }

    public final String toString() {
        return "Default(id=" + this.f19662a + ", top=" + this.b + ", bottom=" + this.c + Separators.RPAREN;
    }
}
