package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kuy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f18934a;
    public String b;
    public String c;

    public kuy(us00 us00Var, q7d0 q7d0Var) {
        q7d0Var.getClass();
        this.f18934a = q7d0Var;
    }

    public final String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String strC = q7d0.c(this.f18934a, "ISO_CODE_KEY");
        return strC == null ? "" : strC;
    }
}
