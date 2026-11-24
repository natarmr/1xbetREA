package a;

/* JADX INFO: loaded from: classes.dex */
public final class xbk {
    public static final xbk c = new xbk(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40604a;
    public final long b;

    public xbk(long j, long j2) {
        this.f40604a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xbk) {
            xbk xbkVar = (xbk) obj;
            return qkx.a(this.f40604a, xbkVar.f40604a) && this.b == xbkVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f40604a) * 31);
    }
}
