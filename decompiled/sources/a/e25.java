package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e25 extends w8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f25 f7068a;

    public e25(f25 f25Var) {
        this.f7068a = f25Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w8f)) {
            return false;
        }
        return this.f7068a.equals(((e25) ((w8f) obj)).f7068a);
    }

    public final int hashCode() {
        return this.f7068a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.f7068a + "}";
    }
}
