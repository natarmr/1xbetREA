package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iu20 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15379a;
    public final /* synthetic */ uv20 b;
    public final /* synthetic */ xdr c;

    public /* synthetic */ iu20(byte b, xdr xdrVar, uv20 uv20Var) {
        this.f15379a = b;
        this.b = uv20Var;
        this.c = xdrVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        zfn zfnVar;
        long background;
        long jM121getTransparent0d7_KjU;
        zfn zfnVar2;
        long background2;
        byte b = this.f15379a;
        cl5 cl5Var = ukd.f35823a;
        uv20 uv20Var = this.b;
        switch (b) {
            case 0:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 20.0f);
                    long j = uv20Var.f36327a;
                    String str = uv20Var.b;
                    boolean z = uv20Var.c;
                    zfn zfnVar3 = zaq0.b;
                    c3x.e(yhg0Var, mm40VarN, j, str, z, ((ThemeColors) fetVar.k(zfnVar3)).getPrimary(), ((ThemeColors) fetVar.k(zfnVar3)).getSecondary60(), this.c, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    if (uv20Var.c) {
                        fetVar2.e0(-1731203969);
                        zfnVar = zaq0.b;
                        background = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1731141380);
                        zfnVar = zaq0.b;
                        background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
                        fetVar2.r(false);
                    }
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 30.0f);
                    boolean zF = fetVar2.f(background);
                    Object objP = fetVar2.P();
                    if (zF || objP == cl5Var) {
                        objP = new dls((byte) 17, background);
                        fetVar2.o0(objP);
                    }
                    c3x.e(yhg0Var2, s5x0.J(rq8.K(mm40VarN2, (Function1) objP), 6.0f), uv20Var.f36327a, uv20Var.b, uv20Var.c, ((ThemeColors) fetVar2.k(zfnVar)).getPrimaryForeground(), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), this.c, fetVar2, iIntValue2 & 14);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                yhg0 yhg0Var3 = (yhg0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yhg0Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(yhg0Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f);
                    long j2 = uv20Var.f36327a;
                    String str2 = uv20Var.b;
                    boolean z2 = uv20Var.c;
                    zfn zfnVar4 = zaq0.b;
                    c3x.e(yhg0Var3, mm40VarN3, j2, str2, z2, ((ThemeColors) fetVar3.k(zfnVar4)).getPrimary(), y3d.c(0.5f, ((ThemeColors) fetVar3.k(zfnVar4)).getSecondary()), this.c, fetVar3, iIntValue3 & 14);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                yhg0 yhg0Var4 = (yhg0) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                yhg0Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(yhg0Var4) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    if (uv20Var.c) {
                        fetVar4.e0(-1079558785);
                        jM121getTransparent0d7_KjU = ((ThemeColors) fetVar4.k(zaq0.b)).getPrimary();
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1079495979);
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar4.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                        fetVar4.r(false);
                    }
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN4 = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 28.0f);
                    boolean zF2 = fetVar4.f(jM121getTransparent0d7_KjU);
                    Object objP2 = fetVar4.P();
                    if (zF2 || objP2 == cl5Var) {
                        objP2 = new dls((byte) 19, jM121getTransparent0d7_KjU);
                        fetVar4.o0(objP2);
                    }
                    mm40 mm40VarJ = s5x0.J(rq8.K(mm40VarN4, (Function1) objP2), 6.0f);
                    long j3 = uv20Var.f36327a;
                    String str3 = uv20Var.b;
                    boolean z3 = uv20Var.c;
                    zfn zfnVar5 = zaq0.b;
                    c3x.e(yhg0Var4, mm40VarJ, j3, str3, z3, ((ThemeColors) fetVar4.k(zfnVar5)).getPrimaryForeground(), ((ThemeColors) fetVar4.k(zfnVar5)).getSecondary(), this.c, fetVar4, iIntValue4 & 14);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                yhg0 yhg0Var5 = (yhg0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                yhg0Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(yhg0Var5) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    if (uv20Var.c) {
                        fetVar5.e0(742797181);
                        zfnVar2 = zaq0.b;
                        background2 = ((ThemeColors) fetVar5.k(zfnVar2)).getPrimary();
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(742859770);
                        zfnVar2 = zaq0.b;
                        background2 = ((ThemeColors) fetVar5.k(zfnVar2)).getBackground();
                        fetVar5.r(false);
                    }
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN5 = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 28.0f);
                    boolean zF3 = fetVar5.f(background2);
                    Object objP3 = fetVar5.P();
                    if (zF3 || objP3 == cl5Var) {
                        objP3 = new dls((byte) 22, background2);
                        fetVar5.o0(objP3);
                    }
                    c3x.e(yhg0Var5, s5x0.J(rq8.K(mm40VarN5, (Function1) objP3), 6.0f), uv20Var.f36327a, uv20Var.b, uv20Var.c, ((ThemeColors) fetVar5.k(zfnVar2)).getPrimaryForeground(), ((ThemeColors) fetVar5.k(zfnVar2)).getSecondary(), this.c, fetVar5, iIntValue5 & 14);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
