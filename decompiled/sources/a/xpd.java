package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xpd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41263a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ tsq c;

    public /* synthetic */ xpd(mm40 mm40Var, tsq tsqVar, byte b) {
        this.f41263a = b;
        this.b = mm40Var;
        this.c = tsqVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f41263a;
        mm40 mm40Var = this.b;
        byte b2 = 4;
        tsq tsqVar = this.c;
        byte b3 = 1;
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
                    j83 j83Var = tsqVar.f34472a;
                    j83 j83Var2 = tsqVar.b;
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0 y9q0VarD = g1t0.d();
                    mm40 mm40Var2 = this.b;
                    uvw.n(y5dVar, mm40Var2, j83Var, j83Var2, y9q0VarD, u1c.M(-954218897, new xpd(mm40Var2, tsqVar, (byte) 5), fetVar), fetVar, (iIntValue & 14) | 196656);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dyb.z(tsqVar.c, fetVar2, mm40Var);
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
                    j83 j83Var3 = tsqVar.f34472a;
                    j83 j83Var4 = tsqVar.b;
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    y9q0 y9q0VarD2 = g1t0.d();
                    mm40 mm40Var3 = this.b;
                    uvw.n(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarD2, u1c.M(-1088801586, new xpd(mm40Var3, tsqVar, b3), fetVar3), fetVar3, (iIntValue3 & 14) | 196656);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                y5d y5dVar3 = (y5d) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                y5dVar3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(y5dVar3) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    j83 j83Var5 = tsqVar.f34472a;
                    j83 j83Var6 = tsqVar.b;
                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                    y9q0 y9q0VarD3 = g1t0.d();
                    mm40 mm40Var4 = this.b;
                    uvw.n(y5dVar3, mm40Var4, j83Var5, j83Var6, y9q0VarD3, u1c.M(-1223384275, new xpd(mm40Var4, tsqVar, b2), fetVar4), fetVar4, (iIntValue4 & 14) | 196656);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dyb.z(tsqVar.c, fetVar5, mm40Var);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    dyb.z(tsqVar.c, fetVar6, mm40Var);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
