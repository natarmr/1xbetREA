package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fty implements Comparable {
    public static final ety e = new ety(null);
    public static final fty f = new fty(2, 4, 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f10138a;
    public final byte b;
    public final byte c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public fty(int i, int i2, int i3) {
        this.f10138a = i;
        this.b = i2;
        this.c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fty ftyVar = (fty) obj;
        ftyVar.getClass();
        return this.d - ftyVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        fty ftyVar = obj instanceof fty ? (fty) obj : null;
        return ftyVar != null && this.d == ftyVar.d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.f10138a);
        sb.append('.');
        sb.append((int) this.b);
        sb.append('.');
        sb.append((int) this.c);
        return sb.toString();
    }
}
