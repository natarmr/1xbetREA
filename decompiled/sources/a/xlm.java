package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xlm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41080a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ cmm c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ xlm(mm40 mm40Var, cmm cmmVar, Function1 function1, Function1 function2, int i, byte b) {
        this.f41080a = b;
        this.b = mm40Var;
        this.c = cmmVar;
        this.d = function1;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41080a) {
            case 0:
                ((Integer) obj2).getClass();
                unh0.N(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                unh0.M(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                unh0.L(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
        }
        return Unit.f46060a;
    }
}
