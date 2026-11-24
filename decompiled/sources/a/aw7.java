package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aw7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1559a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ aw7(mm40 mm40Var, pz40 pz40Var, pz40 pz40Var2, Function0 function0, Function0 function1, Function0 function2, int i, byte b) {
        this.f1559a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = pz40Var2;
        this.e = function0;
        this.f = function1;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1559a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ohq0.k(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                jiq0.d(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                jar0.h(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
