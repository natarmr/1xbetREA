package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h9t {
    public static final g9t Companion = new g9t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12693a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ h9t(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f12693a = null;
        } else {
            this.f12693a = str;
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
            this.d = str4;
        }
    }
}
