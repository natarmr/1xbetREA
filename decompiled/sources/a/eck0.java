package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class eck0 {
    public static final qbk0 Companion = new qbk0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new hwi0(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwp0 f7571a;
    public final dck0 b;

    public /* synthetic */ eck0(int i, vwp0 vwp0Var, dck0 dck0Var) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, pbk0.f26713a.getDescriptor());
            throw null;
        }
        this.f7571a = vwp0Var;
        if ((i & 2) == 0) {
            this.b = sbk0.INSTANCE;
        } else {
            this.b = dck0Var;
        }
    }

    public eck0(vwp0 vwp0Var, dck0 dck0Var) {
        dck0Var.getClass();
        this.f7571a = vwp0Var;
        this.b = dck0Var;
    }

    public /* synthetic */ eck0(vwp0 vwp0Var) {
        this(vwp0Var, sbk0.INSTANCE);
    }
}
