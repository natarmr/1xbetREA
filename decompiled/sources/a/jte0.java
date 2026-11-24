package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jte0 {
    public static final ite0 Companion = new ite0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17096a;
    public final int b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;

    public /* synthetic */ jte0(int i, String str, int i2, String str2, Boolean bool, String str3, String str4) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, hte0.f13630a.getDescriptor());
            throw null;
        }
        this.f17096a = str;
        this.b = i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public jte0(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        this.f17096a = str;
        this.b = i;
        this.c = str2;
        this.d = null;
        this.e = str3;
        this.f = str4;
    }
}
