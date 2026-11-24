package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class s3c {
    public static final r3c Companion = new r3c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31550a;
    public final String b;

    public /* synthetic */ s3c(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, q3c.f28046a.getDescriptor());
            throw null;
        }
        this.f31550a = j;
        this.b = str;
    }

    public s3c(long j, String str) {
        str.getClass();
        this.f31550a = j;
        this.b = str;
    }
}
