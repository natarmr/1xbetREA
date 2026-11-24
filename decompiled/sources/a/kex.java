package a;

/* JADX INFO: loaded from: classes.dex */
public final class kex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18170a;
    public final int b;
    public final int c;

    public kex(int i, int i2, int i3) {
        this.f18170a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kex)) {
            return false;
        }
        kex kexVar = (kex) obj;
        return this.f18170a == kexVar.f18170a && this.b == kexVar.b && this.c == kexVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f18170a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.f18170a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", format=");
        return brm0.n(sb, this.c, ')');
    }
}
