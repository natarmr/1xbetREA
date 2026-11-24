package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ax1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1601a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ asl c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ax1(mm40 mm40Var, asl aslVar, Function0 function0, int i, byte b) {
        this.f1601a = b;
        this.b = mm40Var;
        this.c = aslVar;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1601a;
        int i = this.e;
        Function0 function0 = this.d;
        asl aslVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fx1.a(mm40Var, aslVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 1:
                j120.e(mm40Var, aslVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 2:
                ix1.a(mm40Var, aslVar, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                kx1.a(mm40Var, aslVar, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
