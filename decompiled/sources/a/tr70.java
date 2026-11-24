package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tr70 {
    public static final sr70 Companion = new sr70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34411a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ tr70(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f34411a = null;
        } else {
            this.f34411a = num;
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
