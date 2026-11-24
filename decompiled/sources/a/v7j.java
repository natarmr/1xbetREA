package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class v7j {
    public static final u7j Companion = new u7j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36927a;
    public final String b;
    public final int c;

    public /* synthetic */ v7j(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, t7j.f33469a.getDescriptor());
            throw null;
        }
        this.f36927a = i2;
        this.b = str;
        this.c = i3;
    }

    public v7j(String str) {
        this.f36927a = 1;
        this.b = str;
        this.c = 22;
    }
}
