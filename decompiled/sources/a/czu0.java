package a;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class czu0 {
    public static final bzu0 Companion = new bzu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f5241a;
    public final String b;
    public final Double c;

    public /* synthetic */ czu0(int i, Double d, Double d2, String str) {
        if ((i & 1) == 0) {
            this.f5241a = null;
        } else {
            this.f5241a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
    }
}
