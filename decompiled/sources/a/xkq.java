package a;

/* JADX INFO: loaded from: classes.dex */
public interface xkq extends j73 {
    @Override // a.j73
    default l5u0 a(lxs0 lxs0Var) {
        return new q5u0(this);
    }

    float b(float f, float f2, float f3, long j);

    default float c(float f, float f2, float f3) {
        return b(f, f2, f3, d(f, f2, f3));
    }

    long d(float f, float f2, float f3);

    float e(float f, float f2, float f3, long j);
}
