package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iw7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15474a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ iw7(pz40 pz40Var, Function0 function0, int i, byte b) {
        this.f15474a = b;
        this.b = pz40Var;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15474a;
        int i = this.d;
        Function0 function0 = this.c;
        pz40 pz40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jiq0.Q(pz40Var, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                ohq0.N(pz40Var, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
