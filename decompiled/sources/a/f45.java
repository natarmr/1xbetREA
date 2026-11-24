package a;

/* JADX INFO: loaded from: classes.dex */
public final class f45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8896a;
    public final h0a b;

    public f45(int i, h0a h0aVar) {
        this.f8896a = i;
        this.b = h0aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f45)) {
            return false;
        }
        f45 f45Var = (f45) obj;
        return this.f8896a == f45Var.f8896a && this.b.equals(f45Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f8896a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.f8896a + ", cameraIdentifier=" + this.b + "}";
    }
}
