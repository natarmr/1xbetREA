package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wbu0 {
    public static final wbu0 d = new wbu0(256, 256, 256);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38897a;
    public final int b;
    public final int c;

    public wbu0(int i, int i2, int i3) {
        this.f38897a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbu0)) {
            return false;
        }
        wbu0 wbu0Var = (wbu0) obj;
        return this.f38897a == wbu0Var.f38897a && this.b == wbu0Var.b && this.c == wbu0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f38897a) * 31, 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.f38897a;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i2);
        return sb2.toString();
    }
}
