package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42517a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ya0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ yf0(mm40 mm40Var, ya0 ya0Var, Function1 function1, int i, byte b) {
        this.f42517a = b;
        this.b = mm40Var;
        this.c = ya0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42517a;
        Function1 function1 = this.d;
        ya0 ya0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                q8a.I(mm40Var, ya0Var, function1, fetVar, x8x.L(7));
                break;
            default:
                ccq0.N(mm40Var, ya0Var, function1, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
