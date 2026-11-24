package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dpd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6461a;
    public final /* synthetic */ g9q0 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ w6k g;

    public /* synthetic */ dpd0(g9q0 g9q0Var, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, w6k w6kVar, byte b) {
        this.f6461a = b;
        this.b = g9q0Var;
        this.c = pz40Var;
        this.d = pz40Var2;
        this.e = pz40Var3;
        this.f = pz40Var4;
        this.g = w6kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6461a;
        w6k w6kVar = this.g;
        pz40 pz40Var = this.f;
        pz40 pz40Var2 = this.e;
        pz40 pz40Var3 = this.d;
        pz40 pz40Var4 = this.c;
        switch (b) {
            case 0:
                j83 j83Var = new j83((String) pz40Var4.getValue());
                y9q0 y9q0VarM = g1t0.m();
                g9q0 g9q0Var = this.b;
                float fR0 = w6kVar.r0(idd.c(new int[]{(int) (g9q0.b(g9q0Var, new j83((String) pz40Var3.getValue()), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32), (int) (g9q0.b(g9q0Var, new j83((String) pz40Var2.getValue()), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32), (int) (g9q0.b(g9q0Var, new j83((String) pz40Var.getValue()), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32)}, (int) (g9q0.b(g9q0Var, j83Var, y9q0VarM, 0, false, 1, 0L, null, null, null, 2028).c >> 32)));
                zcl zclVar = qmk.f28987a;
                return new ycl(((fR0 + 2.0f + 24.0f) * 4.0f) + 12.0f + 32.0f);
            default:
                j83 j83Var2 = new j83((String) pz40Var4.getValue());
                y9q0 y9q0VarM2 = g1t0.m();
                g9q0 g9q0Var2 = this.b;
                float fR1 = w6kVar.r0(idd.c(new int[]{(int) (g9q0.b(g9q0Var2, new j83((String) pz40Var3.getValue()), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32), (int) (g9q0.b(g9q0Var2, new j83((String) pz40Var2.getValue()), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32), (int) (g9q0.b(g9q0Var2, new j83((String) pz40Var.getValue()), g1t0.m(), 0, false, 1, 0L, null, null, null, 2028).c >> 32)}, (int) (g9q0.b(g9q0Var2, j83Var2, y9q0VarM2, 0, false, 1, 0L, null, null, null, 2028).c >> 32)));
                zcl zclVar2 = qmk.f28987a;
                return new ycl(((fR1 + 2.0f + 24.0f) * 4.0f) + 12.0f + 32.0f);
        }
    }
}
