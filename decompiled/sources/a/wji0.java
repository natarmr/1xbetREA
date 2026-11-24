package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wji0 implements m5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39264a;
    public final m5d0 b;
    public final m5d0 c;

    public /* synthetic */ wji0(m5d0 m5d0Var, m5d0 m5d0Var2, byte b) {
        this.f39264a = b;
        this.b = m5d0Var;
        this.c = m5d0Var2;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f39264a;
        m5d0 m5d0Var = this.c;
        m5d0 m5d0Var2 = this.b;
        switch (b) {
            case 0:
                return new vji0((olq0) m5d0Var2.get(), (out0) m5d0Var.get());
            default:
                return new xmi0((w6j0) m5d0Var2.get(), (w6j0) m5d0Var.get());
        }
    }
}
