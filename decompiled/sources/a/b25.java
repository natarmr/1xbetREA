package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b25 extends s8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1839a;
    public final String b;

    public b25(String str, String str2) {
        this.f1839a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s8f)) {
            return false;
        }
        b25 b25Var = (b25) ((s8f) obj);
        return this.f1839a.equals(b25Var.f1839a) && this.b.equals(b25Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f1839a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f1839a);
        sb.append(", value=");
        return axq.n(sb, this.b, "}");
    }
}
