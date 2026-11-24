package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xk {
    public static final tk Companion = new tk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk f41009a;
    public final String b;
    public final String c;

    public /* synthetic */ xk(int i, wk wkVar, String str, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, sk.f32323a.getDescriptor());
            throw null;
        }
        this.f41009a = wkVar;
        this.b = str;
        this.c = str2;
    }

    public xk(String str, int i, String str2, String str3) {
        str.getClass();
        this.f41009a = new wk(str, i);
        this.b = str2;
        this.c = str3;
    }
}
