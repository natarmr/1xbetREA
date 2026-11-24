package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h2f0 {
    public static final g2f0 Companion = new g2f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12330a;
    public final String b;
    public final String c;

    public /* synthetic */ h2f0(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f12330a = null;
        } else {
            this.f12330a = str;
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
    }
}
