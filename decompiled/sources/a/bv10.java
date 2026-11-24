package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class bv10 {
    public static final av10 Companion = new av10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3261a;
    public final String b;
    public final String c;
    public final Integer d;

    public /* synthetic */ bv10(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f3261a = null;
        } else {
            this.f3261a = l;
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
