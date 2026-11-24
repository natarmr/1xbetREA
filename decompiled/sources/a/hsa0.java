package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hsa0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13572a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ hsa0(l7m0 l7m0Var, Function0 function0, Function1 function1, int i) {
        this.b = l7m0Var;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13572a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                o050.B(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            default:
                unh0.q(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hsa0(l7m0 l7m0Var, Function1 function1, Function0 function0, int i) {
        this.b = l7m0Var;
        this.d = function1;
        this.c = function0;
    }
}
