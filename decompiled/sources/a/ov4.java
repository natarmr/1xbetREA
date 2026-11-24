package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ov4 {
    public static final mv4 Companion = new mv4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25908a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ ov4(int i, long j, long j2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, kv4.f18937a.getDescriptor());
            throw null;
        }
        this.f25908a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = str2;
        } else {
            this.f = str4;
        }
    }

    public ov4(long j, long j2, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f25908a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str2;
    }
}
