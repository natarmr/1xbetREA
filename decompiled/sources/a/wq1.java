package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wq1 {
    public static final vq1 Companion = new vq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39568a;
    public final xp1 b;
    public final zq1 c;
    public final rq1 d;

    public /* synthetic */ wq1(int i, Long l, xp1 xp1Var, zq1 zq1Var, rq1 rq1Var) {
        if ((i & 1) == 0) {
            this.f39568a = null;
        } else {
            this.f39568a = l;
        }
        if ((i & 2) == 0) {
            this.b = new xp1();
        } else {
            this.b = xp1Var;
        }
        if ((i & 4) == 0) {
            this.c = new zq1();
        } else {
            this.c = zq1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rq1Var;
        }
    }
}
