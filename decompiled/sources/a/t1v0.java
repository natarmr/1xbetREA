package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class t1v0 {
    public static final s1v0 Companion = new s1v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33187a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ t1v0(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f33187a = null;
        } else {
            this.f33187a = str;
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
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }
}
