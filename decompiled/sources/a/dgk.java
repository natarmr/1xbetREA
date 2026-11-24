package a;

/* JADX INFO: loaded from: classes.dex */
public final class dgk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivn f6047a;

    public dgk(ivn ivnVar) {
        this.f6047a = ivnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    public final Object a(boolean z, bnn0 bnn0Var) {
        zri zriVar = (zri) this.f6047a.f15453a;
        n5a n5aVar = new n5a(1, pnx.b(bnn0Var));
        n5aVar.r();
        vwb0 vwb0Var = (vwb0) zriVar.c;
        if (z) {
            new Thread(new a4e(new chf0((us00) zriVar.b), new ctl(System.currentTimeMillis(), vwb0Var, n5aVar), (byte) 29)).start();
        } else {
            vwb0Var.getClass();
            if (vwb0Var.b().contains("PREF_IS_EMULATOR")) {
                e0g0 e0g0Var = j0g0.b;
                n5aVar.resumeWith(Boolean.valueOf(vwb0Var.b().getBoolean("PREF_IS_EMULATOR", false)));
            } else {
                new Thread(new a4e(new chf0((us00) zriVar.b), new ctl(System.currentTimeMillis(), vwb0Var, n5aVar), (byte) 29)).start();
            }
        }
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }
}
