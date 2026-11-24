package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class jq {
    public static final iq Companion = new iq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16925a;
    public final String b;
    public final int c;

    public /* synthetic */ jq(String str, int i, int i2, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, hq.f13463a.getDescriptor());
            throw null;
        }
        this.f16925a = j;
        this.b = str;
        this.c = i2;
    }

    public jq(String str, int i, long j) {
        str.getClass();
        this.f16925a = j;
        this.b = str;
        this.c = i;
    }
}
