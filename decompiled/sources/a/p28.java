package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class p28 {
    public static final l28 Companion = new l28();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o28 f26238a;
    public final String b;
    public final String c;

    public /* synthetic */ p28(int i, o28 o28Var, String str, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, k28.f17560a.getDescriptor());
            throw null;
        }
        this.f26238a = o28Var;
        this.b = str;
        this.c = str2;
    }

    public p28(String str, String str2, String str3) {
        str3.getClass();
        this.f26238a = new o28(str3);
        this.b = str;
        this.c = str2;
    }
}
