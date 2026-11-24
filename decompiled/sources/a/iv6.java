package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class iv6 {
    public static final hv6 Companion = new hv6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15431a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final long f;

    public /* synthetic */ iv6(int i, String str, long j, int i2, String str2, int i3, long j2) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, gv6.f11962a.getDescriptor());
            throw null;
        }
        this.f15431a = str;
        this.b = j;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = j2;
    }

    public iv6(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f15431a = str;
        this.b = 0L;
        this.c = 3;
        this.d = str2;
        this.e = 0;
        this.f = j;
    }
}
