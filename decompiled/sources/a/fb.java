package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9232a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ nzi0 c;

    public /* synthetic */ fb(nzi0 nzi0Var, Function1 function1, int i) {
        this.c = nzi0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9232a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wb.e(x8x.L(1), fetVar, this.c, this.b);
                break;
            default:
                dwi0.d(x8x.L(1), fetVar, this.c, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fb(Function1 function1, nzi0 nzi0Var, int i) {
        this.b = function1;
        this.c = nzi0Var;
    }
}
