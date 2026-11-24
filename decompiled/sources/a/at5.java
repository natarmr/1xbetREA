package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class at5 {
    public static final zs5 Companion = new zs5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1419a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ at5(int i, Integer num, String str, String str2, String str3, String str4, Boolean bool) {
        if ((i & 1) == 0) {
            this.f1419a = null;
        } else {
            this.f1419a = num;
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
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
    }
}
