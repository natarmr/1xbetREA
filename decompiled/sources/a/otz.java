package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class otz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25851a;
    public final /* synthetic */ ra10 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ otz(ra10 ra10Var, Function1 function1, int i, byte b) {
        this.f25851a = b;
        this.b = ra10Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25851a;
        Function1 function1 = this.c;
        ra10 ra10Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                oja0.h(ra10Var, function1, fetVar, x8x.L(1));
                break;
            case 1:
                ffb0.g(ra10Var, function1, fetVar, x8x.L(1));
                break;
            default:
                x4d0.i(ra10Var, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
