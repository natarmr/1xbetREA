package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bll implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2799a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ cll c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ bll(mm40 mm40Var, cll cllVar, Function1 function1, int i, byte b) {
        this.f2799a = b;
        this.b = mm40Var;
        this.c = cllVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2799a;
        int i = this.e;
        Function1 function1 = this.d;
        cll cllVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x8f.x(mm40Var, cllVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                x8f.y(mm40Var, cllVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
