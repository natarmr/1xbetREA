package a;

import kotlin.time.TimeMark;

/* JADX INFO: loaded from: classes2.dex */
public final class rq40 implements rlq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rq40 f30914a = new rq40();
    public static final long b = System.nanoTime();

    public static long b() {
        return System.nanoTime() - b;
    }

    @Override // a.rlq0
    public final TimeMark a() {
        return new plq0(b());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
