package a;

/* JADX INFO: loaded from: classes.dex */
public final class s15 extends ytc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k15 f31438a;

    public s15(k15 k15Var) {
        this.f31438a = k15Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ytc)) {
            return false;
        }
        ytc ytcVar = (ytc) obj;
        Object obj2 = xtc.f41459a;
        if (obj2.equals(obj2)) {
            return this.f31438a.equals(((s15) ytcVar).f31438a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31438a.hashCode() ^ ((xtc.f41459a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + xtc.f41459a + ", androidClientInfo=" + this.f31438a + "}";
    }
}
