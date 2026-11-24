package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cx1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5103a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ yrl c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ cx1(mm40 mm40Var, yrl yrlVar, Function0 function0, int i, byte b) {
        this.f5103a = b;
        this.b = mm40Var;
        this.c = yrlVar;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5103a;
        int i = this.e;
        Function0 function0 = this.d;
        yrl yrlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fx1.e(mm40Var, yrlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 1:
                j120.I(mm40Var, yrlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 2:
                ix1.c(mm40Var, yrlVar, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                kx1.c(mm40Var, yrlVar, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
