package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11574a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gn8(mm40 mm40Var, ugd ugdVar, int i, byte b) {
        this.f11574a = b;
        this.b = mm40Var;
        this.c = ugdVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11574a;
        byte b2 = this.d;
        ugd ugdVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gq80.k(mm40Var, ugdVar, fetVar, x8x.L(b2 | 1));
                break;
            case 1:
                wha0.h(mm40Var, ugdVar, fetVar, x8x.L(b2 | 1));
                break;
            case 2:
                xia0.k(mm40Var, ugdVar, fetVar, x8x.L(b2 | 1));
                break;
            case 3:
                r8x.m(mm40Var, ugdVar, fetVar, x8x.L(b2 | 1));
                break;
            case 4:
                x8x.d(mm40Var, ugdVar, fetVar, x8x.L(b2 | 1));
                break;
            default:
                c9x.c(mm40Var, ugdVar, fetVar, x8x.L(b2 | 1));
                break;
        }
        return Unit.f46060a;
    }
}
