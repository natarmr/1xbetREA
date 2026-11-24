package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class my6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md5 f22590a;
    public final j580 b;
    public final kur c;

    public my6(md5 md5Var, j580 j580Var, kur kurVar) {
        this.f22590a = md5Var;
        this.b = j580Var;
        this.c = kurVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my6)) {
            return false;
        }
        my6 my6Var = (my6) obj;
        return this.f22590a.equals(my6Var.f22590a) && this.b.equals(my6Var.b) && this.c.equals(my6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f22590a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BetGameInfoStateModel(backgroundStateModel=" + this.f22590a + ", opponentsStateModel=" + this.b + ", gameCardStateModel=" + this.c + Separators.RPAREN;
    }
}
