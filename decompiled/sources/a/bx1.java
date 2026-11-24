package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bx1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3354a;
    public final /* synthetic */ yrl b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ bx1(yrl yrlVar, Function0 function0, byte b) {
        this.f3354a = b;
        this.b = yrlVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3354a;
        yrl yrlVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    fx1.d(0, yrlVar.f, fetVar, yrlVar.b, this.c);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    j120.F(0, yrlVar.f, fetVar2, yrlVar.b, this.c);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    ix1.b(0, yrlVar.f, fetVar3, yrlVar.b, this.c);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kx1.b(yrlVar.b, yrlVar.c, yrlVar.d, yrlVar.e, yrlVar.f, this.c, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
