package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class se30 {
    public static final re30 Companion = new re30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32058a;
    public final String b;
    public final String c;
    public final Integer d;

    public /* synthetic */ se30(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f32058a = null;
        } else {
            this.f32058a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }
}
