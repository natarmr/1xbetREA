package a;

/* JADX INFO: loaded from: classes4.dex */
public final class p44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26332a;
    public final int b;
    public final int c;
    public final int d;

    public p44(int i, int i2, int i3, int i4) {
        this.f26332a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p44)) {
            return false;
        }
        p44 p44Var = (p44) obj;
        return this.f26332a == p44Var.f26332a && this.b == p44Var.b && this.c == p44Var.c && this.d == p44Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f26332a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfile(sharingMode=");
        sb.append(this.f26332a);
        sb.append(", framesPerBurst=");
        sb.append(this.b);
        sb.append(", bufferCapacity=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        return brm0.n(sb, this.d, ')');
    }
}
