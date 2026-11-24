package a;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class wbl implements chi0 {
    public static final vbl Companion = new vbl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f38884a;

    public /* synthetic */ wbl(double d, int i) {
        if (1 == (i & 1)) {
            this.f38884a = d;
        } else {
            m2x.I(i, 1, ubl.f35386a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbl) && Double.compare(this.f38884a, ((wbl) obj).f38884a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f38884a);
    }

    public final String toString() {
        return "DoubleValue(value=" + this.f38884a + ')';
    }

    public wbl(double d) {
        this.f38884a = d;
    }
}
