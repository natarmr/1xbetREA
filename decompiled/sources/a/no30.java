package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class no30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23850a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ip00 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ no30(mm40 mm40Var, ip00 ip00Var, Function0 function0, int i, byte b) {
        this.f23850a = b;
        this.b = mm40Var;
        this.c = ip00Var;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23850a;
        Function0 function0 = this.d;
        ip00 ip00Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                e9x.g(mm40Var, ip00Var, function0, fetVar, x8x.L(7));
                break;
            case 1:
                e9x.e(mm40Var, ip00Var, function0, fetVar, x8x.L(7));
                break;
            case 2:
                e9x.h(mm40Var, ip00Var, function0, fetVar, x8x.L(7));
                break;
            case 3:
                e9x.d(mm40Var, ip00Var, function0, fetVar, x8x.L(7));
                break;
            default:
                e9x.f(mm40Var, ip00Var, function0, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
