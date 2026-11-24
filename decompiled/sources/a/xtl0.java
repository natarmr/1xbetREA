package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xtl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41469a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;

    public /* synthetic */ xtl0(xdr xdrVar, xdr xdrVar2, pz40 pz40Var, float f, boolean z, long j, byte b) {
        this.f41469a = b;
        this.b = xdrVar;
        this.c = xdrVar2;
        this.d = pz40Var;
        this.e = f;
        this.f = z;
        this.g = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41469a;
        long j = this.g;
        boolean z = this.f;
        float f = this.e;
        pz40 pz40Var = this.d;
        xdr xdrVar = this.c;
        xdr xdrVar2 = this.b;
        mm40 mm40VarL = jm40.b;
        switch (b) {
            case 0:
                if (xdrVar2 != null || xdrVar != null || pz40Var.getValue() != null) {
                    mm40 mm40VarL2 = rq8.L(mm40VarL, new gbc(z, j, (byte) 5));
                    zcl zclVar = qmk.f28987a;
                    mm40VarL = s5x0.L(mm40VarL2, 4.0f, 0.0f, 2);
                }
                return mrv.k0(o7k0.s(mm40VarL, f), "TOTAL_CONTENT_ID");
            default:
                if (xdrVar2 != null || xdrVar != null || pz40Var.getValue() != null) {
                    mm40 mm40VarL3 = rq8.L(mm40VarL, new gbc(z, j, (byte) 6));
                    zcl zclVar2 = qmk.f28987a;
                    mm40VarL = s5x0.L(mm40VarL3, 8.0f, 0.0f, 2);
                }
                return mrv.k0(o7k0.s(mm40VarL, f), "TOTAL_CONTENT_ID");
        }
    }
}
