package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ncd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23287a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ p3w c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ncd(mm40 mm40Var, p3w p3wVar, Function1 function1, int i, byte b) {
        this.f23287a = b;
        this.b = mm40Var;
        this.c = p3wVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23287a;
        int i = this.e;
        Function1 function1 = this.d;
        p3w p3wVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sj3.c(mm40Var, p3wVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                ghm0.i(mm40Var, p3wVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
