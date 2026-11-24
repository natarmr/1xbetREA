package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ypi0 {
    public static final wpi0 Companion = new wpi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p300 f43032a;
    public final vkd0 b;

    static {
        tkd0 tkd0Var = vkd0.Companion;
        h300 h300Var = p300.Companion;
    }

    public /* synthetic */ ypi0(int i, p300 p300Var, vkd0 vkd0Var) {
        if ((i & 1) == 0) {
            this.f43032a = null;
        } else {
            this.f43032a = p300Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vkd0Var;
        }
    }
}
