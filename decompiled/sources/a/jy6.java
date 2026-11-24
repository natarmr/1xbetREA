package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jy6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17345a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ wy6 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ jy6(mm40 mm40Var, wy6 wy6Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, byte b) {
        this.f17345a = b;
        this.b = mm40Var;
        this.c = wy6Var;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17345a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                hmw0.h(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                x1x.p(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
