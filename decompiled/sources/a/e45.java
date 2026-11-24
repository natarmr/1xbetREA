package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7166a;
    public final String b;

    public e45(String str, String str2) {
        this.f7166a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            hny.u("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e45)) {
            return false;
        }
        e45 e45Var = (e45) obj;
        return this.f7166a.equals(e45Var.f7166a) && this.b.equals(e45Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f7166a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f7166a);
        sb.append(", version=");
        return axq.n(sb, this.b, "}");
    }
}
