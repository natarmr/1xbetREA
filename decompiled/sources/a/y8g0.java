package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class y8g0 {
    public static final w8g0 Companion = new w8g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42193a;
    public final sko0 b;

    static {
        oko0 oko0Var = sko0.Companion;
    }

    public /* synthetic */ y8g0(int i, String str, sko0 sko0Var) {
        if ((i & 1) == 0) {
            this.f42193a = null;
        } else {
            this.f42193a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sko0Var;
        }
    }
}
