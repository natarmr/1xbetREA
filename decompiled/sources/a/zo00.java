package a;

/* JADX INFO: loaded from: classes.dex */
public final class zo00 extends mva {
    public final Throwable b;

    public zo00(Throwable th) {
        super(false);
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zo00)) {
            return false;
        }
        zo00 zo00Var = (zo00) obj;
        return this.f22447a == zo00Var.f22447a && this.b.equals(zo00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + Boolean.hashCode(this.f22447a);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f22447a + ", error=" + this.b + ')';
    }
}
