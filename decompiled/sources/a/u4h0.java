package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class u4h0 {
    public static final t4h0 Companion = new t4h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f35049a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ u4h0(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f35049a = null;
        } else {
            this.f35049a = num;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }
}
