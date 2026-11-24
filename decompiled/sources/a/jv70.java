package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class jv70 {
    public static final iv70 Companion = new iv70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17195a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ jv70(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f17195a = null;
        } else {
            this.f17195a = str;
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
