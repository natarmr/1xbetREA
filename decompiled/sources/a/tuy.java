package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tuy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwb0 f34573a;
    public final vby b;
    public final p7m0 c;

    public tuy(vwb0 vwb0Var, vby vbyVar) {
        vwb0Var.getClass();
        vbyVar.getClass();
        this.f34573a = vwb0Var;
        this.b = vbyVar;
        String strC = vwb0Var.c("BLOCK_MODEL_KEY", "");
        suy suyVar = null;
        if (strC.length() != 0) {
            try {
                suyVar = (suy) vbyVar.b(suy.Companion.serializer(), strC);
            } catch (Exception unused) {
            }
        }
        this.c = q7m0.a(suyVar == null ? new suy(wuy.f39812a, false, 0L, 300000L, false) : suyVar);
    }
}
