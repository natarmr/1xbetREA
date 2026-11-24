package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class tj00 {
    public static final sj00 Companion = new sj00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34030a;
    public final jaa0 b;
    public final Double c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final Double g;

    public /* synthetic */ tj00(int i, Integer num, jaa0 jaa0Var, Double d, String str, Boolean bool, Boolean bool2, Double d2) {
        if ((i & 1) == 0) {
            this.f34030a = null;
        } else {
            this.f34030a = num;
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
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d2;
        }
    }
}
