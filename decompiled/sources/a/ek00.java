package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ek00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7932a;
    public final b8l0 b;
    public final n3l0 c;
    public final boolean d;

    public ek00(long j, b8l0 b8l0Var, n3l0 n3l0Var, boolean z) {
        this.f7932a = j;
        this.b = b8l0Var;
        this.c = n3l0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek00)) {
            return false;
        }
        ek00 ek00Var = (ek00) obj;
        return this.f7932a == ek00Var.f7932a && this.b.equals(ek00Var.b) && this.c.equals(ek00Var.c) && this.d == ek00Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f7932a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LiveResultUiItem(id=" + this.f7932a + ", style=" + this.b + ", shape=" + this.c + ", enabled=" + this.d + Separators.RPAREN;
    }
}
