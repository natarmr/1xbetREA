package a;

/* JADX INFO: loaded from: classes3.dex */
@lbk
@ahi0
public final class m16 {
    public static final l16 Companion = new l16();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20990a;
    public final int b;

    public /* synthetic */ m16(int i, int i2, String str) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, k16.f17504a.getDescriptor());
            throw null;
        }
        this.f20990a = str;
        this.b = i2;
    }

    public m16(String str) {
        this.f20990a = str;
        this.b = 22;
    }
}
