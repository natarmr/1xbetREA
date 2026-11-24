package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class it0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15330a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ st0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ it0(mm40 mm40Var, st0 st0Var, Function1 function1, Function1 function2, int i, byte b) {
        this.f15330a = b;
        this.b = mm40Var;
        this.c = st0Var;
        this.d = function1;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15330a) {
            case 0:
                ((Integer) obj2).getClass();
                lt0.c(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ro4.f(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                o2e.e(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                tke.f(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ohq0.d(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
        }
        return Unit.f46060a;
    }
}
