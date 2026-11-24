package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13041a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nn20 c;

    public /* synthetic */ hh20(boolean z, nn20 nn20Var, byte b) {
        this.f13041a = b;
        this.b = z;
        this.c = nn20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13041a;
        nn20 nn20Var = this.c;
        switch (b) {
            case 0:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                rvj0 rvj0Var = b820Var.d;
                gx4 gx4Var = b820Var.f;
                kwo0 kwo0Var = rvj0Var.c;
                boolean z = this.b;
                rvj0 rvj0VarA = rvj0.a(rvj0Var, null, mnb0.a(rvj0Var.b, false, nn20Var.h0(rvj0Var.f31171a.b.p), null, 5), kwo0.a(kwo0Var, z, false, 0.0d, null, 62), null, null, 25);
                czc0 czc0Var = b820Var.e;
                return b820.a(b820Var, null, null, null, rvj0VarA, czc0Var != null ? czc0.a(czc0Var, null, qlc0.a(czc0Var.c, 0.0d, null, null, 0.0d, 0.0d, !z, false, false, 223), false, false, 27) : null, gx4Var != null ? gx4.a(gx4Var, null, null, null, kwo0.a(gx4Var.d, z, false, 0.0d, null, 62), mnb0.a(gx4Var.e, false, nn20Var.h0(false), null, 5), 7) : null, null, false, false, false, false, false, 8135);
            default:
                b820 b820Var2 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var2.getClass();
                rvj0 rvj0Var2 = b820Var2.d;
                dx6 dx6Var = rvj0Var2.f31171a;
                vw6 vw6Var = dx6Var.b;
                boolean z2 = this.b;
                return b820.a(b820Var2, null, null, null, rvj0.a(rvj0Var2, dx6.a(dx6Var, null, vw6.a(vw6Var, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, z2, 32767), 1), mnb0.a(rvj0Var2.b, false, nn20Var.h0(z2), null, 5), null, null, null, 28), null, null, null, false, false, false, false, false, 8183);
        }
    }
}
