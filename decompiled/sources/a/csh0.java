package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class csh0 {
    public static final yrh0 Companion = new yrh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4888a;
    public final bsh0 b;

    public /* synthetic */ csh0(int i, String str, bsh0 bsh0Var) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, xrh0.f41370a.getDescriptor());
            throw null;
        }
        this.f4888a = str;
        this.b = bsh0Var;
    }

    public csh0(String str, int i, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        bsh0 bsh0Var = new bsh0(Integer.valueOf(i), str2, str3);
        this.f4888a = str;
        this.b = bsh0Var;
    }
}
