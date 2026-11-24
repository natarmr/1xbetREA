package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sdb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32025a;
    public final /* synthetic */ hn8 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ sdb(hn8 hn8Var, Function1 function1, int i, byte b) {
        this.f32025a = b;
        this.b = hn8Var;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32025a;
        int i = this.d;
        Function1 function1 = this.c;
        hn8 hn8Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                saj.i(hn8Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                j120.r(hn8Var, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                ahy.R(hn8Var, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
