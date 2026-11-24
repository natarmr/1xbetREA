package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class swy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32947a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fql0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ swy(mm40 mm40Var, fql0 fql0Var, Function1 function1, int i, byte b) {
        this.f32947a = b;
        this.b = mm40Var;
        this.c = fql0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32947a;
        Function1 function1 = this.d;
        fql0 fql0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                saj.R(mm40Var, fql0Var, function1, fetVar, x8x.L(1));
                break;
            case 1:
                j47.n0(mm40Var, fql0Var, function1, fetVar, x8x.L(1));
                break;
            case 2:
                rq8.B(mm40Var, fql0Var, function1, fetVar, x8x.L(1));
                break;
            default:
                jd8.T(mm40Var, fql0Var, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
