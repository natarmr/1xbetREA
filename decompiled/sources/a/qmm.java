package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qmm implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28990a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cwl c;

    public /* synthetic */ qmm(boolean z, cwl cwlVar, byte b) {
        this.f28990a = b;
        this.b = z;
        this.c = cwlVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f28990a;
        jm40 jm40Var = jm40.b;
        cwl cwlVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                ir8 ir8Var = (ir8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarB = ir8Var.b(jm40Var, gqw0.c);
                    zcl zclVar = qmk.f28987a;
                    tdc.e(cwlVar.f5086a, npe.f23909a, epv0.N(ffb0.Q(mm40VarB, 2.0f, -2.0f), z ? 0.5f : 1.0f), fetVar, 48, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ir8 ir8Var2 = (ir8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir8Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(ir8Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    gpe gpeVar = new gpe(((ThemeColors) fetVar2.k(zaq0.b)).getBackground());
                    mm40 mm40VarB2 = ir8Var2.b(jm40Var, gqw0.c);
                    zcl zclVar2 = qmk.f28987a;
                    tdc.e(cwlVar.f5086a, gpeVar, epv0.N(ffb0.Q(mm40VarB2, 4.0f, -4.0f), z ? 0.5f : 1.0f), fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                ir8 ir8Var3 = (ir8) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir8Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(ir8Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    gpe gpeVar2 = new gpe(((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent());
                    mm40 mm40VarB3 = ir8Var3.b(jm40Var, gqw0.c);
                    zcl zclVar3 = qmk.f28987a;
                    tdc.e(cwlVar.f5086a, gpeVar2, epv0.N(ffb0.Q(mm40VarB3, 4.0f, -4.0f), z ? 0.5f : 1.0f), fetVar3, 0, 0);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                ir8 ir8Var4 = (ir8) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir8Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(ir8Var4) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    gpe gpeVar3 = new gpe(((ThemeColors) fetVar4.k(zaq0.b)).getBackgroundContent());
                    mm40 mm40VarB4 = ir8Var4.b(jm40Var, gqw0.c);
                    zcl zclVar4 = qmk.f28987a;
                    tdc.e(cwlVar.f5086a, gpeVar3, epv0.N(ffb0.Q(mm40VarB4, 4.0f, -4.0f), z ? 0.5f : 1.0f), fetVar4, 0, 0);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
