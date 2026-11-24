package a;

/* JADX INFO: loaded from: classes.dex */
public final class fjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9644a;
    public final pnh0 b;
    public final boolean c;
    public final boolean d;

    public fjk(int i, boolean z, boolean z2, boolean z3) {
        pnh0 pnh0Var = pnh0.f27287a;
        this.f9644a = z;
        this.b = pnh0Var;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjk)) {
            return false;
        }
        fjk fjkVar = (fjk) obj;
        return this.f9644a == fjkVar.f9644a && this.b == fjkVar.b && this.c == fjkVar.c && this.d == fjkVar.d;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + brm0.e(Boolean.hashCode(true) * 31, 31, this.f9644a)) * 31, 31, this.c)) * 31) + 2) * 31;
    }
}
