package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27523a;
    public final int b;

    public pso(Object obj, int i) {
        this.f27523a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pso)) {
            return false;
        }
        pso psoVar = (pso) obj;
        return this.f27523a == psoVar.f27523a && this.b == psoVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f27523a) * 65535) + this.b;
    }
}
