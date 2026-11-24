package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mam implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21464a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ mam(mm40 mm40Var, l7m0 l7m0Var, Function0 function0, int i, byte b) {
        this.f21464a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21464a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                nam.a(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                x4d0.X(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
