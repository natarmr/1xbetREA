package a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yxg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43419a;
    public final long b;
    public final int c;

    public /* synthetic */ yxg(int i, int i2, long j) {
        this((i2 & 4) != 0 ? 2 : i, (i2 & 1) != 0 ? -1L : 50L, (i2 & 2) != 0 ? -1L : j);
    }

    public yxg(int i, long j, long j2) {
        this.f43419a = j;
        this.b = j2;
        this.c = i;
    }
}
