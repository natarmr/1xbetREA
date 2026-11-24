package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cvn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5038a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ra10 c;

    public /* synthetic */ cvn(mm40 mm40Var, ra10 ra10Var, int i, byte b) {
        this.f5038a = b;
        this.b = mm40Var;
        this.c = ra10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5038a;
        ra10 ra10Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                bfb.u(mm40Var, ra10Var, fetVar, x8x.L(1));
                break;
            case 1:
                ro4.K(mm40Var, ra10Var, fetVar, x8x.L(1));
                break;
            default:
                ibm0.c(mm40Var, ra10Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
