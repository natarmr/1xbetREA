package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n390 {
    public static final m390 Companion = new m390();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22840a;
    public final boolean b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;

    public /* synthetic */ n390(int i, int i2, int i3, long j, long j2, String str, boolean z) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, l390.f19348a.getDescriptor());
            throw null;
        }
        this.f22840a = i2;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = i3;
    }

    public n390(int i, long j, long j2, String str, boolean z) {
        this.f22840a = i;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = 22;
    }
}
