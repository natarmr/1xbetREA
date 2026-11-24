package a;

/* JADX INFO: loaded from: classes2.dex */
public final class khx0 implements lgx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lgx0 f18311a;
    public final Object b;

    public khx0(lgx0 lgx0Var, Object obj) {
        fem0.p(lgx0Var, "log site key");
        this.f18311a = lgx0Var;
        fem0.p(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof khx0)) {
            return false;
        }
        khx0 khx0Var = (khx0) obj;
        return this.f18311a.equals(khx0Var.f18311a) && this.b.equals(khx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.f18311a.hashCode();
    }

    public final String toString() {
        String string = this.f18311a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 3);
        f140.v(sb, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb.append("' }");
        return sb.toString();
    }
}
