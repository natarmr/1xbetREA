package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final we50 f7029a;

    public e190(we50 we50Var) {
        this.f7029a = we50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e190) && this.f7029a == ((e190) obj).f7029a;
    }

    public final int hashCode() {
        return (this.f7029a.hashCode() * 31) - 645362243;
    }

    public final String toString() {
        return "RestorePassword(navigation=" + this.f7029a + ", requestCode=REQUEST_CODE)";
    }
}
