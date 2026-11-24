package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fom implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9888a;
    public final /* synthetic */ wom b;

    public /* synthetic */ fom(wom womVar, byte b) {
        this.f9888a = b;
        this.b = womVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        byte b = this.f9888a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                ir8 ir8Var = (ir8) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ir8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i = (fetVar.g(ir8Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= fetVar.h(zBooleanValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    mom.b(ir8Var.b(jm40Var, gqw0.b), this.b, zBooleanValue, 0L, 0L, 0.0f, fetVar, (i << 3) & 896, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ir8 ir8Var2 = (ir8) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ir8Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = (fetVar2.g(ir8Var2) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= fetVar2.h(zBooleanValue2) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    mm40 mm40VarB = ir8Var2.b(jm40Var, gqw0.b);
                    zfn zfnVar = zaq0.b;
                    mom.b(mm40VarB, this.b, zBooleanValue2, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 0.0f, fetVar2, (i2 << 3) & 896, 32);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ir8 ir8Var3 = (ir8) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ir8Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = (fetVar3.g(ir8Var3) ? 4 : 2) | iIntValue3;
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= fetVar3.h(zBooleanValue3) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    mm40 mm40VarB2 = ir8Var3.b(jm40Var, gqw0.b);
                    zfn zfnVar2 = zaq0.b;
                    mom.b(mm40VarB2, this.b, zBooleanValue3, ((ThemeColors) fetVar3.k(zfnVar2)).getBackgroundContent(), ((ThemeColors) fetVar3.k(zfnVar2)).getSecondary(), 0.0f, fetVar3, (i3 << 3) & 896, 32);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
