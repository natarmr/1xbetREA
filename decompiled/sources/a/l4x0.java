package a;

/* JADX INFO: loaded from: classes.dex */
public final class l4x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3x0 f19432a;
    public final un00 b;

    public l4x0(q3x0 q3x0Var, un00 un00Var) {
        this.f19432a = q3x0Var;
        this.b = un00Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l4x0) {
            l4x0 l4x0Var = (l4x0) obj;
            q3x0 q3x0Var = l4x0Var.f19432a;
            q3x0 q3x0Var2 = this.f19432a;
            if (q3x0Var2 != null ? q3x0Var2 == q3x0Var : q3x0Var == null) {
                return this.b == l4x0Var.b;
            }
        }
        return false;
    }

    public final int hashCode() {
        q3x0 q3x0Var = this.f19432a;
        return this.b.hashCode() ^ (((q3x0Var == null ? 0 : q3x0Var.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19432a);
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        f140.v(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
