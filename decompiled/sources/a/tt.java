package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tt {
    public static final st Companion = new st();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34486a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public /* synthetic */ tt(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, rt.f31055a.getDescriptor());
            throw null;
        }
        this.f34486a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
    }

    public tt(int i, String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f34486a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }
}
