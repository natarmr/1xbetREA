package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mx90 {
    public static final lx90 Companion = new lx90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22543a;
    public final String b;
    public final int c;

    public /* synthetic */ mx90(String str, int i, int i2, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, kx90.f19043a.getDescriptor());
            throw null;
        }
        this.f22543a = j;
        this.b = str;
        this.c = i2;
    }

    public mx90(long j, String str) {
        this.f22543a = j;
        this.b = str;
        this.c = 22;
    }
}
