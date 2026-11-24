package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class t0f0 {
    public static final s0f0 Companion = new s0f0();
    public static final a8z[] e = {maz.a(wez.f39042a, new o6e0(26)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0f0 f33116a;
    public final Boolean b;
    public final Boolean c;
    public final ang0 d;

    public /* synthetic */ t0f0(int i, w0f0 w0f0Var, Boolean bool, Boolean bool2, ang0 ang0Var) {
        if ((i & 1) == 0) {
            this.f33116a = null;
        } else {
            this.f33116a = w0f0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = ang0Var;
        }
    }
}
