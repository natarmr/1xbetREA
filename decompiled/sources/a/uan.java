package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uan implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35338a;
    public final /* synthetic */ bjm b;
    public final /* synthetic */ w2v0 c;

    public /* synthetic */ uan(bjm bjmVar, w2v0 w2v0Var, byte b) {
        this.f35338a = b;
        this.b = bjmVar;
        this.c = w2v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35338a;
        w2v0 w2v0Var = this.c;
        bjm bjmVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Integer num = ((zim) bjmVar).e;
                    v2v0 v2v0Var = w2v0Var.f38470a;
                    mrv.b0(num, v2v0Var.b, v2v0Var.c, kca.e, fetVar, 24576);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Integer num2 = ((ajm) bjmVar).e;
                    g3v0 g3v0Var = w2v0Var.c;
                    mrv.b0(num2, g3v0Var.d, g3v0Var.e, kca.e, fetVar2, 24576);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Integer num3 = ((zim) bjmVar).e;
                    v2v0 v2v0Var2 = w2v0Var.f38470a;
                    epv0.M(num3, v2v0Var2.b, v2v0Var2.c, cla.c, fetVar3, 24576);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Integer num4 = ((ajm) bjmVar).e;
                    g3v0 g3v0Var2 = w2v0Var.c;
                    epv0.M(num4, g3v0Var2.d, g3v0Var2.e, cla.c, fetVar4, 24576);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Integer num5 = ((zim) bjmVar).e;
                    v2v0 v2v0Var3 = w2v0Var.f38470a;
                    mrv.b0(num5, v2v0Var3.b, v2v0Var3.c, kna.c, fetVar5, 24576);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Integer num6 = ((ajm) bjmVar).e;
                    g3v0 g3v0Var3 = w2v0Var.c;
                    mrv.b0(num6, g3v0Var3.d, g3v0Var3.e, kna.c, fetVar6, 24576);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Integer num7 = ((zim) bjmVar).e;
                    v2v0 v2v0Var4 = w2v0Var.f38470a;
                    mrv.b0(num7, v2v0Var4.b, v2v0Var4.c, lna.c, fetVar7, 24576);
                } else {
                    fetVar7.X();
                }
                break;
            default:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Integer num8 = ((ajm) bjmVar).e;
                    g3v0 g3v0Var4 = w2v0Var.c;
                    mrv.b0(num8, g3v0Var4.d, g3v0Var4.e, lna.c, fetVar8, 24576);
                } else {
                    fetVar8.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
