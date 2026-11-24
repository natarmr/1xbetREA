package a;

/* JADX INFO: loaded from: classes.dex */
public final class x3a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40208a;
    public final boolean b;

    public x3a(boolean z, boolean z2) {
        this.f40208a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3a)) {
            return false;
        }
        x3a x3aVar = (x3a) obj;
        return this.f40208a == x3aVar.f40208a && this.b == x3aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f40208a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationCriteria(checkBack=");
        sb.append(this.f40208a);
        sb.append(", checkFront=");
        return brm0.o(sb, this.b, ')');
    }
}
