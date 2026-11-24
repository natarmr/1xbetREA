package a;

/* JADX INFO: loaded from: classes4.dex */
public final class iyg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uuy f15588a;

    public iyg0(uuy uuyVar) {
        uuyVar.getClass();
        this.f15588a = uuyVar;
    }

    public final void a() {
        Object value;
        tuy tuyVar = this.f15588a.f36323a;
        p7m0 p7m0Var = tuyVar.c;
        if (((suy) p7m0Var.getValue()).f32841a == wuy.d) {
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, suy.a((suy) value, null, 0L, 0L, true, 15)));
            vwb0 vwb0Var = tuyVar.f34573a;
            vby vbyVar = tuyVar.b;
            Object value2 = p7m0Var.getValue();
            vbyVar.getClass();
            vwb0Var.h("BLOCK_MODEL_KEY", vbyVar.d(suy.Companion.serializer(), value2));
        }
    }
}
