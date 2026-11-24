package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gf30 {
    public static final ff30 Companion = new ff30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11188a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ gf30(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f11188a = null;
        } else {
            this.f11188a = num;
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
