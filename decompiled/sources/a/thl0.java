package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class thl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33967a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ahl0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ thl0(mm40 mm40Var, ahl0 ahl0Var, Function0 function0, int i, byte b) {
        this.f33967a = b;
        this.b = mm40Var;
        this.c = ahl0Var;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33967a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                l8x.D(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 1:
                m8x.o(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                r8x.o(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
