package a;

/* JADX INFO: loaded from: classes2.dex */
public final class x25 extends g9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40150a;
    public final int b;
    public final int c;
    public final boolean d;

    public x25(int i, int i2, String str, boolean z) {
        this.f40150a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g9f) {
            x25 x25Var = (x25) ((g9f) obj);
            if (this.f40150a.equals(x25Var.f40150a) && this.b == x25Var.b && this.c == x25Var.c && this.d == x25Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.f40150a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.f40150a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return rw2.p(sb, this.d, "}");
    }
}
