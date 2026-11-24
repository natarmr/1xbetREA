package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f231a;
    public final e4m b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public a4m(long j, e4m e4mVar) {
        this.f231a = (int) j;
        this.b = e4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4m)) {
            return false;
        }
        a4m a4mVar = (a4m) obj;
        return ((long) this.f231a) == ((long) a4mVar.f231a) && this.b.equals(a4mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f231a) * 31);
    }

    public final String toString() {
        return "DsCyberChipModel(id=" + this.f231a + ", type=" + this.b + Separators.RPAREN;
    }
}
