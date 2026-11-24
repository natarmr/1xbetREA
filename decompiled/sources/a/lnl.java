package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lnl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20350a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ short f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ wdr i;
    public final /* synthetic */ wdr j;
    public final /* synthetic */ wdr k;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lnl(mm40 mm40Var, wzh wzhVar, hnl hnlVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, int i, int i2) {
        this.b = mm40Var;
        this.g = wzhVar;
        this.h = hnlVar;
        this.c = function0;
        this.d = function1;
        this.e = function2;
        this.i = function3;
        this.j = function4;
        this.k = function5;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20350a;
        wdr wdrVar = this.k;
        wdr wdrVar2 = this.j;
        wdr wdrVar3 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                slb.k(this.b, (wzh) obj4, (hnl) obj3, this.c, this.d, this.e, (Function0) wdrVar3, (Function0) wdrVar2, (Function0) wdrVar, (fet) obj, iL, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                j5m.a(this.b, (o5m) obj4, (h5m) obj3, (Function1) wdrVar3, this.c, this.d, this.e, (Function1) wdrVar2, (Function1) wdrVar, (fet) obj, iL2, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lnl(mm40 mm40Var, o5m o5mVar, h5m h5mVar, Function1 function1, Function0 function0, Function0 function2, Function0 function3, Function1 function4, Function1 function5, int i, int i2) {
        this.b = mm40Var;
        this.g = o5mVar;
        this.h = h5mVar;
        this.i = function1;
        this.c = function0;
        this.d = function2;
        this.e = function3;
        this.j = function4;
        this.k = function5;
        this.f = i2;
    }
}
