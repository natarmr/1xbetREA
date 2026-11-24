package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bgm0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2562a = 0;
    public final /* synthetic */ zdm0 b;
    public final /* synthetic */ j9m0 c;

    public /* synthetic */ bgm0(j9m0 j9m0Var, zdm0 zdm0Var) {
        this.b = zdm0Var;
        this.c = j9m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2562a;
        j9m0 j9m0Var = this.c;
        zdm0 zdm0Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (zdm0Var.a() == eme.f8041a || zdm0Var.a() == eme.b) {
                    fetVar.e0(892694493);
                    ffb0.C(zdm0Var, j9m0Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(892883810);
                    fetVar.r(false);
                }
                break;
            default:
                num.getClass();
                ffb0.C(zdm0Var, j9m0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bgm0(zdm0 zdm0Var, j9m0 j9m0Var, int i) {
        this.b = zdm0Var;
        this.c = j9m0Var;
    }
}
