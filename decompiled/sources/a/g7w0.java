package a;

/* JADX INFO: loaded from: classes4.dex */
public final class g7w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10837a;
    public final String b;

    public g7w0(String str, String str2) {
        this.f10837a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7w0)) {
            return false;
        }
        g7w0 g7w0Var = (g7w0) obj;
        return this.f10837a.equals(g7w0Var.f10837a) && this.b.equals(g7w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10837a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FingerprintParameter(key=");
        sb.append(this.f10837a);
        sb.append(", value=");
        return axq.m(sb, this.b, ')');
    }
}
