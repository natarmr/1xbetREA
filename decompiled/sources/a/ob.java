package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ob implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24952a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ b8j0 c;

    public /* synthetic */ ob(b8j0 b8j0Var, Function1 function1, int i) {
        this.c = b8j0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24952a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wb.x(x8x.L(1), fetVar, this.c, this.b);
                break;
            default:
                dwi0.B(x8x.L(1), fetVar, this.c, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ob(Function1 function1, b8j0 b8j0Var, int i) {
        this.b = function1;
        this.c = b8j0Var;
    }
}
