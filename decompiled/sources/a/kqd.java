package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kqd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18718a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ r5h0 c;

    public /* synthetic */ kqd(mm40 mm40Var, r5h0 r5h0Var, byte b) {
        this.f18718a = b;
        this.b = mm40Var;
        this.c = r5h0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f18718a;
        mm40 mm40Var = this.b;
        r5h0 r5h0Var = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                y5d y5dVar = (y5d) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ggr0 ggr0Var = r5h0Var.c;
                    j83 j83Var = ggr0Var.f11265a;
                    j83 j83Var2 = ggr0Var.b;
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0 y9q0VarM = g1t0.m();
                    mm40 mm40Var2 = this.b;
                    uvw.n(y5dVar, mm40Var2, j83Var, j83Var2, y9q0VarM, u1c.M(-2144881974, new kqd(mm40Var2, r5h0Var, b2), fetVar), fetVar, (iIntValue & 14) | 196656);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 18.0f);
                    String str = r5h0Var.c.c;
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    sj3.u(0, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar2, mm40VarE, g1t0.g(), str);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                y5d y5dVar2 = (y5d) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y5dVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(y5dVar2) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ggr0 ggr0Var2 = r5h0Var.c;
                    j83 j83Var3 = ggr0Var2.f11265a;
                    j83 j83Var4 = ggr0Var2.b;
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    y9q0 y9q0VarM2 = g1t0.m();
                    mm40 mm40Var3 = this.b;
                    ufx.q(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarM2, u1c.M(1683595637, new kqd(mm40Var3, r5h0Var, (byte) 3), fetVar3), fetVar3, (iIntValue3 & 14) | 196656);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40Var, 22.0f);
                    String str2 = r5h0Var.c.c;
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    sj3.u(0, ((StaticColors) fetVar4.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar4, mm40VarE2, g1t0.g(), str2);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
