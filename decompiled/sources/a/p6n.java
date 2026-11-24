package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p6n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26464a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ q6n c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ p6n(mm40 mm40Var, q6n q6nVar, Function1 function1, int i, byte b) {
        this.f26464a = b;
        this.b = mm40Var;
        this.c = q6nVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26464a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ntb.c(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                ntb.t(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
