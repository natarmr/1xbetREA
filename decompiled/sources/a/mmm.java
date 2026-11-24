package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mmm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22045a = 1;
    public final /* synthetic */ xk80 b;
    public final /* synthetic */ omm c;
    public final /* synthetic */ float d;

    public /* synthetic */ mmm(xk80 xk80Var, omm ommVar, float f) {
        this.b = xk80Var;
        this.c = ommVar;
        this.d = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22045a;
        float f = this.d;
        omm ommVar = this.c;
        xk80 xk80Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                dub.J(xk80Var, ommVar, f, fetVar, x8x.L(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dub.J(xk80Var, ommVar, f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mmm(xk80 xk80Var, omm ommVar, float f, int i) {
        this.b = xk80Var;
        this.c = ommVar;
        this.d = f;
    }
}
