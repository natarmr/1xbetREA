package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class i380 {
    public static final x280 Companion = new x280();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14085a;
    public final String b;
    public final String c;

    public /* synthetic */ i380(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f14085a = null;
        } else {
            this.f14085a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
