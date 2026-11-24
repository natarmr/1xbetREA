package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xji0 f28841a;
    public final bs3 b;

    public qji0(xji0 xji0Var, bs3 bs3Var) {
        uho uhoVar = uho.SESSION_START;
        this.f28841a = xji0Var;
        this.b = bs3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qji0)) {
            return false;
        }
        qji0 qji0Var = (qji0) obj;
        uho uhoVar = uho.SESSION_START;
        return this.f28841a.equals(qji0Var.f28841a) && this.b.equals(qji0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f28841a.hashCode() + (uho.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + uho.SESSION_START + ", sessionData=" + this.f28841a + ", applicationInfo=" + this.b + ')';
    }
}
