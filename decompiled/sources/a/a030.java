package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a030 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ gy20 c;

    public /* synthetic */ a030(ugd ugdVar, gy20 gy20Var, byte b) {
        this.f7a = b;
        this.b = ugdVar;
        this.c = gy20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7a;
        gy20 gy20Var = this.c;
        ugd ugdVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugdVar.F(((fv20) gy20Var).f10194a, fetVar, 8);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ugdVar.F(((or20) gy20Var).f25717a, fetVar2, 8);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
