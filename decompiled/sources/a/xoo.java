package a;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class xoo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f41231a;
    public final float b;
    public final Random c = new Random(System.currentTimeMillis());
    public volatile long d = 1000;
    public volatile int e;

    /* JADX WARN: Type inference failed for: r2v1, types: [char, int] */
    public xoo(float f, long j) {
        this.f41231a = (int) j;
        this.b = f;
    }

    public final void a() {
        this.d = (long) Math.min(this.d * this.b, this.f41231a);
        this.d += (long) (this.c.nextGaussian() * ((double) (this.d * 0.1f)));
        this.e++;
    }
}
