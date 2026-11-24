package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wbd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38871a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pl7 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ wbd(mm40 mm40Var, pl7 pl7Var, Function1 function1, int i, byte b) {
        this.f38871a = b;
        this.b = mm40Var;
        this.c = pl7Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38871a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kkb.e(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            case 1:
                r7x.e(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            case 2:
                l7x.y(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            default:
                aem0.h(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
