package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qoi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29075a = 1;
    public final Object b;

    public qoi(mi70 mi70Var, gii0 gii0Var, xv20 xv20Var, knf0 knf0Var) {
        gii0Var.getClass();
        xv20Var.getClass();
        knf0Var.getClass();
        this.b = new qoi(xv20Var);
    }

    public final qta0 a() {
        switch (this.f29075a) {
            case 0:
                break;
        }
        return new qta0();
    }

    public final drc b() {
        byte b = this.f29075a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new drc(new nr00((xv20) obj));
            default:
                return ((qoi) obj).b();
        }
    }

    public qoi(xv20 xv20Var) {
        this.b = xv20Var;
    }
}
