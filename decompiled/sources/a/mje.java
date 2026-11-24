package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mje extends p4 implements vde0 {
    public final /* synthetic */ byte c = 1;
    public final g950 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mje(kp9 kp9Var, wsy wsyVar, g950 g950Var) {
        super(wsyVar);
        kp9Var.getClass();
        wsyVar.getClass();
        this.e = kp9Var;
        this.d = g950Var;
    }

    public final g950 n1() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // a.p4
    public final String toString() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return getType() + ": Ctx { " + ((wm40) obj) + " }";
            default:
                return "Cxt { " + ((kp9) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mje(wm40 wm40Var, wsy wsyVar, g950 g950Var) {
        super(wsyVar);
        wsyVar.getClass();
        this.e = wm40Var;
        this.d = g950Var;
    }
}
