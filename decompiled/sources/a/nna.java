package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nna implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23812a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ona c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ nna(mm40 mm40Var, ona onaVar, Function1 function1, int i, byte b) {
        this.f23812a = b;
        this.b = mm40Var;
        this.c = onaVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23812a;
        int i = this.e;
        Function1 function1 = this.d;
        ona onaVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qjj.f(mm40Var, onaVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                mrv.r(mm40Var, onaVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
