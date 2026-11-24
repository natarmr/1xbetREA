package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yod0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42980a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ epd0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ yod0(mm40 mm40Var, epd0 epd0Var, Function1 function1, int i, byte b) {
        this.f42980a = b;
        this.b = mm40Var;
        this.c = epd0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42980a;
        Function1 function1 = this.d;
        epd0 epd0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xvw.o(mm40Var, epd0Var, function1, fetVar, x8x.L(1));
                break;
            case 1:
                zvw.s(mm40Var, epd0Var, function1, fetVar, x8x.L(1));
                break;
            default:
                bww.r(mm40Var, epd0Var, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
