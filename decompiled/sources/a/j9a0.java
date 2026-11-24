package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class j9a0 {
    public static final i9a0 Companion = new i9a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16129a;
    public final String b;
    public final String c;

    public /* synthetic */ j9a0(int i, String str, int i2, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, h9a0.f12664a.getDescriptor());
            throw null;
        }
        this.f16129a = i2;
        this.b = str;
        this.c = str2;
    }

    public j9a0(int i, String str, String str2) {
        str2.getClass();
        this.f16129a = i;
        this.b = str;
        this.c = str2;
    }
}
