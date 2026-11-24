package a;

/* JADX INFO: loaded from: classes.dex */
public final class o4a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f24624a;

    public /* synthetic */ o4a(g45 g45Var) {
        this.f24624a = g45Var;
    }

    public int a(q4f q4fVar) {
        q4fVar.getClass();
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return 20;
        }
        if (iOrdinal == 6) {
            return 50;
        }
        switch (iOrdinal) {
            case 8:
            case 9:
                return 8;
            case 10:
                return 30;
            case 11:
                return 15;
            default:
                vwb0 vwb0Var = (vwb0) this.f24624a.e;
                vwb0Var.getClass();
                return vwb0Var.b().getInt("max_coupon_size_key", 50);
        }
    }

    public String b() {
        String strC = q7d0.c((q7d0) this.f24624a.f, "COUPON_KEY_PREFERENCE");
        return strC == null ? "" : strC;
    }
}
