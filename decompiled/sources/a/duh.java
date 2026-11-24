package a;

/* JADX INFO: loaded from: classes6.dex */
public final class duh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkd0 f6696a;
    public final boolean b;

    public duh(jkd0 jkd0Var, boolean z) {
        this.f6696a = jkd0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duh) {
            duh duhVar = (duh) obj;
            if (duhVar.f6696a.equals(this.f6696a) && duhVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.f6696a.hashCode() ^ 1000003) * 1000003);
    }
}
