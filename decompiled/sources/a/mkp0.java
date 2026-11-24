package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mkp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21955a;
    public final /* synthetic */ tkp0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ mkp0(tkp0 tkp0Var, Function1 function1, int i, byte b) {
        this.f21955a = b;
        this.b = tkp0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21955a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ny9.z(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 1:
                ny9.r(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                ny9.g(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
