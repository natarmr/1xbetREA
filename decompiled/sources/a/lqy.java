package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20503a;
    public final int b;
    public final int c;

    public lqy(int i, int i2, int i3) {
        this.f20503a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqy)) {
            return false;
        }
        lqy lqyVar = (lqy) obj;
        return this.f20503a == lqyVar.f20503a && this.b == lqyVar.b && this.c == lqyVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f20503a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20503a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
