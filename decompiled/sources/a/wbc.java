package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wbc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38870a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ wbc(mm40 mm40Var, Function1 function1, int i, byte b) {
        this.f38870a = b;
        this.b = mm40Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38870a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xbc.c(this.b, this.c, fetVar, x8x.L(49));
                break;
            case 1:
                vbw0.n(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 2:
                yyw.q(this.b, this.c, fetVar, x8x.L(7));
                break;
            default:
                hhm0.f(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
