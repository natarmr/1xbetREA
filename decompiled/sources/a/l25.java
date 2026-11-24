package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l25 extends z8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19291a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public l25(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f19291a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z8f) {
            l25 l25Var = (l25) ((z8f) obj);
            if (this.f19291a == l25Var.f19291a && this.b.equals(l25Var.b) && this.c == l25Var.c && this.d == l25Var.d && this.e == l25Var.e && this.f == l25Var.f && this.g == l25Var.g && this.h.equals(l25Var.h) && this.i.equals(l25Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f19291a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f19291a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return axq.n(sb, this.i, "}");
    }
}
