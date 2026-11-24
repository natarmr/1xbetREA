package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qmr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28999a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ qmr0(mm40 mm40Var, l7m0 l7m0Var, Function0 function0, Function0 function1, int i) {
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = function0;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28999a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                pvm0.h(x8x.L(i | 1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                dem0.g(x8x.L(i | 1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qmr0(l7m0 l7m0Var, Function0 function0, Function0 function1, mm40 mm40Var, int i) {
        this.c = l7m0Var;
        this.d = function0;
        this.e = function1;
        this.b = mm40Var;
        this.f = i;
    }
}
