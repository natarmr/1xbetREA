package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ux0 {
    public static final tx0 Companion = new tx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx0 f36417a;
    public final int b;
    public final String c;

    static {
        gx0 gx0Var = hx0.Companion;
    }

    public /* synthetic */ ux0(int i, hx0 hx0Var, int i2, String str) {
        if ((i & 1) == 0) {
            this.f36417a = null;
        } else {
            this.f36417a = hx0Var;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }
}
