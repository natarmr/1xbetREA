package a;

/* JADX INFO: loaded from: classes.dex */
public final class jvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17203a;
    public p5u0 b;
    public boolean c;
    public float d;
    public final p73 e = new p73(0.0f);
    public p73 f;
    public long g;
    public long h;

    public final String toString() {
        long j = this.f17203a;
        p5u0 p5u0Var = this.b;
        boolean z = this.c;
        float f = this.d;
        p73 p73Var = this.f;
        long j2 = this.g;
        long j3 = this.h;
        StringBuilder sb = new StringBuilder("progress nanos: ");
        sb.append(j);
        sb.append(", animationSpec: ");
        sb.append(p5u0Var);
        sb.append(", isComplete: ");
        sb.append(z);
        sb.append(", value: ");
        sb.append(f);
        sb.append(", start: ");
        sb.append(this.e);
        sb.append(", initialVelocity: ");
        sb.append(p73Var);
        kng0.A(sb, ", durationNanos: ", j2, ", animationSpecDuration: ");
        sb.append(j3);
        return sb.toString();
    }
}
