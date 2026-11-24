package a;

/* JADX INFO: loaded from: classes.dex */
public final class ch9 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4348a;
    public final String b;

    public ch9(String str, xg9 xg9Var) {
        super(str);
        this.f4348a = str;
        if (xg9Var != null) {
            this.b = xg9Var.g();
        } else {
            this.b = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.f4348a + " (" + this.b + " at line 0)");
        return sb.toString();
    }
}
