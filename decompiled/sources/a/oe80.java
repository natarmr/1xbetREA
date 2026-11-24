package a;

/* JADX INFO: loaded from: classes.dex */
public final class oe80 extends x1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jge0 f25111a;

    public oe80(jge0 jge0Var) {
        this.f25111a = jge0Var;
    }

    @Override // a.x1x
    public final jge0 C() {
        return this.f25111a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oe80) {
            return this.f25111a.equals(((oe80) obj).f25111a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25111a.hashCode();
    }
}
