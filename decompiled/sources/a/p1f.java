package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class p1f {
    public static final m1f Companion = new m1f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f26198a;
    public final String b;
    public final Double c;
    public final Double d;

    public /* synthetic */ p1f(int i, Long l, String str, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.f26198a = null;
        } else {
            this.f26198a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
    }
}
