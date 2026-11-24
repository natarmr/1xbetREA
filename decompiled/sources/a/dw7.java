package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dw7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6784a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ dw7(mm40 mm40Var, pz40 pz40Var, Function0 function0, int i, byte b) {
        this.f6784a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6784a;
        int i = this.e;
        Function0 function0 = this.d;
        pz40 pz40Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ohq0.M(mm40Var, pz40Var, function0, fetVar, x8x.L(i | 1));
                break;
            case 1:
                jiq0.P(mm40Var, pz40Var, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                k7x.p(mm40Var, pz40Var, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
