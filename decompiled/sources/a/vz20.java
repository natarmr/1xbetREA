package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vz20 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38279a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ vz20(xdr xdrVar, xdr xdrVar2, Function1 function1, byte b) {
        this.f38279a = b;
        this.b = xdrVar;
        this.c = xdrVar2;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ugg0 ugg0Var;
        byte b = this.f38279a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                boolean z = false;
                uv20 uv20Var = (uv20) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                uv20Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(uv20Var) : fetVar.i(uv20Var) ? 4 : 2;
                }
                if ((iIntValue & 19) != 18) {
                    z = true;
                }
                if (fetVar.U(iIntValue & 1, z)) {
                    j0x.f(null, uv20Var, this.b, this.c, this.d, fetVar, 64 | ((iIntValue << 3) & 112));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                boolean z2 = false;
                uv20 uv20Var2 = (uv20) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                uv20Var2.getClass();
                boolean z3 = uv20Var2.d;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? fetVar2.g(uv20Var2) : fetVar2.i(uv20Var2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    z2 = true;
                }
                if (fetVar2.U(iIntValue2 & 1, z2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    if (z3) {
                        zcl zclVar = qmk.i;
                        zcl zclVar2 = qmk.f28987a;
                        ugg0Var = new ugg0(zclVar, zclVar, zclVar2, zclVar2);
                    } else {
                        zcl zclVar3 = qmk.i;
                        ugg0 ugg0Var2 = vgg0.f37379a;
                        ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
                    }
                    q0x.k(s5x0.I(i120.Q(lgb.J(mm40VarD, ugg0Var), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), new lh80(8.0f, 8.0f, 8.0f, z3 ? 2.0f : 8.0f)), uv20Var2, this.b, this.c, this.d, fetVar2, 64 | ((iIntValue2 << 3) & 112));
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                boolean z4 = false;
                uv20 uv20Var3 = (uv20) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                uv20Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? fetVar3.g(uv20Var3) : fetVar3.i(uv20Var3) ? 4 : 2;
                }
                if ((iIntValue3 & 19) != 18) {
                    z4 = true;
                }
                if (fetVar3.U(iIntValue3 & 1, z4)) {
                    mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar4 = qmk.f28987a;
                    s0x.k(s5x0.I(mm40VarQ, new lh80(8.0f, 12.0f, 8.0f, uv20Var3.d ? 0.0f : 12.0f)), uv20Var3, this.b, this.c, this.d, fetVar3, 64 | ((iIntValue3 << 3) & 112));
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                uv20 uv20Var4 = (uv20) obj;
                boolean z5 = false;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                uv20Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? fetVar4.g(uv20Var4) : fetVar4.i(uv20Var4) ? 4 : 2;
                }
                if ((iIntValue4 & 19) != 18) {
                    z5 = true;
                }
                if (fetVar4.U(iIntValue4 & 1, z5)) {
                    g1x.c(null, uv20Var4, this.b, this.c, this.d, fetVar4, 64 | ((iIntValue4 << 3) & 112));
                } else {
                    fetVar4.X();
                }
                break;
            default:
                uv20 uv20Var5 = (uv20) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                uv20Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? fetVar5.g(uv20Var5) : fetVar5.i(uv20Var5) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1x.h(null, uv20Var5, this.b, this.c, this.d, fetVar5, 64 | ((iIntValue5 << 3) & 112));
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
