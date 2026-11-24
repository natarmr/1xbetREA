package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20031a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ nh0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ lh0(mm40 mm40Var, nh0 nh0Var, Function1 function1, int i, byte b) {
        this.f20031a = b;
        this.b = mm40Var;
        this.c = nh0Var;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20031a;
        int i = this.e;
        Function1 function1 = this.d;
        nh0 nh0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                mh0.b(mm40Var, nh0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                zgc.b(mm40Var, nh0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                j2e.b(mm40Var, nh0Var, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                o2e.b(mm40Var, nh0Var, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                tke.b(mm40Var, nh0Var, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
