package a;

/* JADX INFO: loaded from: classes.dex */
public interface j39 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i39 f15819a = i39.f14086a;

    default float a(float f, float f2, float f3) {
        f15819a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
