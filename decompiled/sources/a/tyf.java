package a;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class tyf {
    public static final syf Companion = new syf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34751a;
    public final String b;
    public final String c;
    public final long d;

    public /* synthetic */ tyf(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, ryf.f31311a.getDescriptor());
            throw null;
        }
        this.f34751a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public tyf(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f34751a = str;
        this.b = "opened";
        this.c = str2;
        this.d = j;
    }
}
