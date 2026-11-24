package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mhl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21800a;
    public final /* synthetic */ ir8 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ int d;

    public /* synthetic */ mhl0(ir8 ir8Var, ugd ugdVar, int i, byte b) {
        this.f21800a = b;
        this.b = ir8Var;
        this.c = ugdVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21800a;
        int i = this.d;
        ugd ugdVar = this.c;
        ir8 ir8Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                h8x.c(ir8Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                m8x.c(ir8Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            default:
                r8x.c(ir8Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
