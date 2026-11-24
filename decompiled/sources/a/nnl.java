package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nnl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23828a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pnl c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ nnl(mm40 mm40Var, pnl pnlVar, Function0 function0, int i, byte b) {
        this.f23828a = b;
        this.b = mm40Var;
        this.c = pnlVar;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23828a;
        int i = this.e;
        Function0 function0 = this.d;
        pnl pnlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tlb.h(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 1:
                tlb.i(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 2:
                ulb.g(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 3:
                ulb.h(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 4:
                f7k.f(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 5:
                f7k.g(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 6:
                kpb.f(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                kpb.g(mm40Var, pnlVar, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
