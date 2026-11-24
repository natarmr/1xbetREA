package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class q2w0 {
    public static final p2w0 Companion = new p2w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28022a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ q2w0(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f28022a = "";
        } else {
            this.f28022a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
    }
}
