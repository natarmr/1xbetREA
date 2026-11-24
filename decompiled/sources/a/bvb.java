package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bvb extends yub {
    public static final avb d = new avb(null);

    static {
        new bvb((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bvb)) {
            return false;
        }
        if (isEmpty() && ((bvb) obj).isEmpty()) {
            return true;
        }
        bvb bvbVar = (bvb) obj;
        return this.f43260a == bvbVar.f43260a && this.b == bvbVar.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f43260a * 31) + this.b;
    }

    public final boolean isEmpty() {
        return this.f43260a > this.b;
    }

    public final String toString() {
        return this.f43260a + ".." + this.b;
    }
}
