package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l6w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19528a;
    public final b8l0 b;
    public final n3l0 c;
    public final boolean d;

    public l6w(long j, b8l0 b8l0Var, n3l0 n3l0Var, boolean z) {
        this.f19528a = j;
        this.b = b8l0Var;
        this.c = n3l0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6w)) {
            return false;
        }
        l6w l6wVar = (l6w) obj;
        return this.f19528a == l6wVar.f19528a && this.b.equals(l6wVar.b) && this.c.equals(l6wVar.c) && this.d == l6wVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f19528a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HistoryResultUiItem(id=" + this.f19528a + ", style=" + this.b + ", shape=" + this.c + ", enabled=" + this.d + Separators.RPAREN;
    }
}
