package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jwe0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17247a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ jwe0(mm40 mm40Var, l7m0 l7m0Var, ugd ugdVar, int i, byte b) {
        this.f17247a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17247a;
        ugd ugdVar = this.d;
        l7m0 l7m0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                z1x.i(mm40Var, l7m0Var, ugdVar, fetVar, x8x.L(385));
                break;
            default:
                d7x.l(mm40Var, l7m0Var, ugdVar, fetVar, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }
}
