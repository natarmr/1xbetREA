package a;

/* JADX INFO: loaded from: classes2.dex */
public final class cvt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5047a;
    public final Integer b;
    public final Integer c;
    public final Double d;
    public final boolean e;

    public cvt0(String str, Integer num, Integer num2, Double d, boolean z) {
        this.f5047a = str;
        this.b = num;
        this.c = num2;
        this.d = d;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvt0)) {
            return false;
        }
        cvt0 cvt0Var = (cvt0) obj;
        return this.f5047a.equals(cvt0Var.f5047a) && this.b.equals(cvt0Var.b) && this.c.equals(cvt0Var.c) && this.d.equals(cvt0Var.d) && this.e == cvt0Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5047a.hashCode() * 31)) * 31)) * 31)) * 31;
        boolean z = this.e;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Captcha(img=");
        sb.append(this.f5047a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", ratio=");
        sb.append(this.d);
        sb.append(", isRefreshEnabled=");
        return brm0.o(sb, this.e, ')');
    }
}
