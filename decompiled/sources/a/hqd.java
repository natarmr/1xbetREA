package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hqd implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13480a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ w0s c;

    public /* synthetic */ hqd(mm40 mm40Var, w0s w0sVar, byte b) {
        this.f13480a = b;
        this.b = mm40Var;
        this.c = w0sVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f13480a;
        mm40 mm40Var = this.b;
        w0s w0sVar = this.c;
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
                    j83 j83Var = w0sVar.f38366a;
                    j83 j83Var2 = w0sVar.b;
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    y9q0 y9q0VarG = g1t0.g();
                    mm40 mm40Var2 = this.b;
                    uvw.n(y5dVar, mm40Var2, j83Var, j83Var2, y9q0VarG, u1c.M(905369426, new hqd(mm40Var2, w0sVar, b2), fetVar), fetVar, (iIntValue & 14) | 196656);
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
                    String str = w0sVar.c;
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
                    j83 j83Var3 = w0sVar.f38366a;
                    j83 j83Var4 = w0sVar.b;
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    y9q0 y9q0VarG2 = g1t0.g();
                    mm40 mm40Var3 = this.b;
                    ufx.q(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarG2, u1c.M(2044584957, new hqd(mm40Var3, w0sVar, (byte) 3), fetVar3), fetVar3, (iIntValue3 & 14) | 196656);
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
                    String str2 = w0sVar.c;
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
