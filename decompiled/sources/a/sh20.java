package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32190a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sh20(Object obj, double d, double d2, byte b) {
        this.f32190a = b;
        this.d = obj;
        this.b = d;
        this.c = d2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vtb0 vtb0Var;
        byte b = this.f32190a;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                pvj0 pvj0Var = (pvj0) obj3;
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                bx6 bx6Var = pvj0Var.f27665a;
                pvj0 pvj0VarA = pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(bx6Var.b, this.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 65534), false, 5), null, null, null, null, false, 62);
                vtb0 vtb0Var2 = a820Var.h;
                double d = this.c;
                if (vtb0Var2 != null) {
                    g920 g920Var = g920.FAST;
                    vtb0Var = vtb0.a(vtb0Var2, d, 188);
                } else {
                    vtb0Var = new vtb0(d, true, false, false, null, null, g920.FAST, false);
                }
                return a820.a(a820Var, null, null, null, pvj0VarA, null, null, vtb0Var, false, null, 0.0f, false, null, 0, false, false, false, 261999);
            default:
                rvj0 rvj0Var = (rvj0) obj3;
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                dx6 dx6Var = rvj0Var.f31171a;
                rvj0 rvj0VarA = rvj0.a(rvj0Var, dx6.a(dx6Var, null, vw6.a(dx6Var.b, this.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 65534), 1), null, null, null, null, 30);
                wtb0 wtb0Var = b820Var.g;
                double d2 = this.c;
                return b820.a(b820Var, null, null, null, rvj0VarA, null, null, wtb0Var != null ? wtb0.a(wtb0Var, d2, 60) : new wtb0(d2, true, false, false, null, null), false, false, false, false, false, 8119);
        }
    }
}
