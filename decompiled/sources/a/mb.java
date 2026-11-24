package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21480a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ mv00 c;

    public /* synthetic */ mb(mv00 mv00Var, Function1 function1, int i) {
        this.c = mv00Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21480a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wb.n(x8x.L(1), fetVar, this.c, this.b);
                break;
            default:
                dwi0.t(x8x.L(1), fetVar, this.c, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mb(Function1 function1, mv00 mv00Var, int i) {
        this.b = function1;
        this.c = mv00Var;
    }
}
