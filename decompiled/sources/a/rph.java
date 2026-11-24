package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rph implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30886a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ int e;

    public /* synthetic */ rph(mm40 mm40Var, a4x a4xVar, ugd ugdVar, int i, byte b) {
        this.f30886a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = ugdVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30886a;
        int i = this.e;
        ugd ugdVar = this.d;
        a4x a4xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qbc.e(mm40Var, a4xVar, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                qbc.e(mm40Var, a4xVar, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                vbc.o(mm40Var, a4xVar, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 3:
                vbc.o(mm40Var, a4xVar, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 4:
                qcc.c(mm40Var, a4xVar, ugdVar, fetVar, x8x.L(i | 1));
                break;
            default:
                qcc.c(mm40Var, a4xVar, ugdVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
