package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class p380 {
    public static final o380 Companion = new o380();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f26288a;
    public final String b;
    public final String c;
    public final Integer d;

    public /* synthetic */ p380(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f26288a = null;
        } else {
            this.f26288a = l;
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
            this.d = num;
        }
    }
}
