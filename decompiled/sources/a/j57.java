package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j57 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15920a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ z77 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ j57(mm40 mm40Var, z77 z77Var, Function1 function1, int i, byte b) {
        this.f15920a = b;
        this.b = mm40Var;
        this.c = z77Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15920a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                dwi0.f(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            case 1:
                hkb.b(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            case 2:
                q7x.g(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            case 3:
                nnw0.y(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            default:
                idm0.c(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
