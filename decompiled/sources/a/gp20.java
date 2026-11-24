package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gp20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11662a;
    public final /* synthetic */ ip20 b;

    public /* synthetic */ gp20(ip20 ip20Var, int i) {
        this.f11662a = (byte) 5;
        this.b = ip20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11662a;
        ip20 ip20Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    s5x0.d(ip20Var.g, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(ip20Var.b, null, ibc.Y(ip20Var.c, fetVar2), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar2, 0, 0, 131066);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v8q0.a(ip20Var.d, null, ibc.Y(ip20Var.e, fetVar3), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar3, 0, 0, 131066);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    v8q0.a(ip20Var.f15143a, null, ((StaticColors) fetVar4.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar4, 0, 0, 131066);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    v8q0.a(ip20Var.f, null, ((StaticColors) fetVar5.k(m8m0.f21378a)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar5, 0, 0, 131066);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                s5x0.r(ip20Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gp20(ip20 ip20Var, byte b) {
        this.f11662a = b;
        this.b = ip20Var;
    }
}
