package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t9d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33555a;
    public final char b;
    public final int c;

    public t9d(char c, int i, int i2) {
        this.f33555a = i;
        this.b = c;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9d)) {
            return false;
        }
        t9d t9dVar = (t9d) obj;
        return this.f33555a == t9dVar.f33555a && this.b == t9dVar.b && this.c == t9dVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Character.hashCode(this.b) + (Integer.hashCode(this.f33555a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListMarkerInfo(markerLength=");
        sb.append(this.f33555a);
        sb.append(", markerType=");
        sb.append(this.b);
        sb.append(", markerIndent=");
        return brm0.n(sb, this.c, ')');
    }
}
