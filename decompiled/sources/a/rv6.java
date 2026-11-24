package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rv6 {
    public static final mv6 Companion = new mv6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f31156a;
    public final Double b;
    public final Boolean c;
    public final Long d;
    public final String e;
    public final pv6 f;

    public /* synthetic */ rv6(int i, Double d, Double d2, Boolean bool, Long l, String str, pv6 pv6Var) {
        if ((i & 1) == 0) {
            this.f31156a = null;
        } else {
            this.f31156a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = pv6Var;
        }
    }
}
