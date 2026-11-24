package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9521a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ gh00 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ fh00(mm40 mm40Var, gh00 gh00Var, Function1 function1, int i, byte b) {
        this.f9521a = b;
        this.b = mm40Var;
        this.c = gh00Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9521a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x1x.g(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                x1x.b(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
