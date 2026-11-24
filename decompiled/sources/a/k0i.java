package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k0i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17468a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ vpl c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ k0i(mm40 mm40Var, vpl vplVar, Function2 function2, int i, byte b) {
        this.f17468a = b;
        this.b = mm40Var;
        this.c = vplVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17468a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x4d0.u(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                fre0.u(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
