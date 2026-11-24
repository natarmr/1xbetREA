package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rrt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwb0 f31002a;
    public final vby b;
    public final p7m0 c;
    public final p7m0 d;
    public krt0 e;

    public rrt0(vwb0 vwb0Var, vby vbyVar) {
        vwb0Var.getClass();
        vbyVar.getClass();
        this.f31002a = vwb0Var;
        this.b = vbyVar;
        this.c = q7m0.a(new sw00(true, true));
        this.d = q7m0.a(Boolean.FALSE);
    }

    public final krt0 a() {
        krt0 krt0Var = this.e;
        if (krt0Var != null) {
            return krt0Var;
        }
        try {
            String strC = this.f31002a.c("user_json_v_2", "");
            vby vbyVar = this.b;
            vbyVar.getClass();
            krt0 krt0Var2 = (krt0) vbyVar.b(krt0.Companion.serializer(), strC);
            if (krt0Var2.f18785a == -1) {
                throw new j7t0(0);
            }
            this.e = krt0Var2;
            return krt0Var2;
        } catch (Exception unused) {
            throw new j7t0(0);
        }
    }

    public final void b(boolean z) {
        p7m0 p7m0Var = this.c;
        boolean z2 = ((sw00) p7m0Var.getValue()).f32897a;
        if (z2 != z) {
            p7m0Var.o(null, new sw00(z, z2));
        }
    }
}
