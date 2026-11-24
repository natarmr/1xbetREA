package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gmz {
    public static final bmz Companion = new bmz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f11563a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public /* synthetic */ gmz(int i, Integer num, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f11563a = null;
        } else {
            this.f11563a = l;
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
            this.e = num;
        }
    }
}
