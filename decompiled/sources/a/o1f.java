package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class o1f {
    public static final l1f Companion = new l1f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24476a;
    public final Double b;
    public final Double c;

    public /* synthetic */ o1f(int i, Double d, Double d2, String str) {
        if ((i & 1) == 0) {
            this.f24476a = null;
        } else {
            this.f24476a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
    }
}
