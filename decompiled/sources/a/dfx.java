package a;

/* JADX INFO: loaded from: classes.dex */
public final class dfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uz2 f6020a;
    public final b7r b;

    public dfx(uz2 uz2Var, b7r b7rVar) {
        this.f6020a = uz2Var;
        this.b = b7rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dfx) {
            dfx dfxVar = (dfx) obj;
            if (this.f6020a == dfxVar.f6020a && this.b.equals(dfxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6020a.hashCode() * 31);
    }

    public final String toString() {
        return "InputRequest(image=" + this.f6020a + ", frameInfo=" + this.b + ')';
    }
}
