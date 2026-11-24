package a;

/* JADX INFO: loaded from: classes5.dex */
public final class n5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd30 f22937a;

    public /* synthetic */ n5c(kd30 kd30Var) {
        this.f22937a = kd30Var;
    }

    public Object a(swp0 swp0Var, obk0 obk0Var, int i, boolean z, String str, zje zjeVar) {
        obk0 obk0Var2 = obk0.VOICE_SMS;
        kd30 kd30Var = this.f22937a;
        if (obk0Var == obk0Var2) {
            return kd30Var.e0(swp0Var, zjeVar);
        }
        if (obk0Var == obk0.FLASH_CALL) {
            return kd30Var.T(swp0Var, zjeVar);
        }
        if (obk0Var == obk0.TELEGRAM) {
            return kd30Var.U(swp0Var, zjeVar);
        }
        if (z) {
            return kd30Var.X(zjeVar, swp0Var, str);
        }
        return kd30Var.W(zjeVar, swp0Var, str, (i == 4 || i == 24) ? false : true);
    }
}
