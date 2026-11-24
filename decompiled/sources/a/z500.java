package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class z500 {
    public static final y500 Companion = new y500();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f43797a;
    public final jaa0 b;
    public final Double c;
    public final String d;
    public final Double e;

    public /* synthetic */ z500(int i, Integer num, jaa0 jaa0Var, Double d, String str, Double d2) {
        if ((i & 1) == 0) {
            this.f43797a = null;
        } else {
            this.f43797a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = jaa0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
    }
}
