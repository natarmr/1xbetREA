package a;

/* JADX INFO: loaded from: classes4.dex */
public final class aby {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f601a;
    public final boolean b;

    public aby(double d, boolean z) {
        this.f601a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aby)) {
            return false;
        }
        aby abyVar = (aby) obj;
        return Double.compare(this.f601a, abyVar.f601a) == 0 && this.b == abyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + brm0.d(this.f601a, Integer.hashCode(100000) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilerResult(iterations=100000, averageTimeNs=");
        sb.append(this.f601a);
        sb.append(", isHookSuspected=");
        return brm0.o(sb, this.b, ')');
    }
}
