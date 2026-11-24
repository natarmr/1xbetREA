package a;

/* JADX INFO: loaded from: classes2.dex */
public final class a25 extends q8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107a;
    public final String b;
    public final String c;

    public a25(String str, String str2, String str3) {
        this.f107a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q8f) {
            a25 a25Var = (a25) ((q8f) obj);
            if (this.f107a.equals(a25Var.f107a) && this.b.equals(a25Var.b) && this.c.equals(a25Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f107a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f107a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return axq.n(sb, this.c, "}");
    }
}
