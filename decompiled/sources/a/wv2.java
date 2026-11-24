package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wv2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39819a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ wv2(l7m0 l7m0Var, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f39819a = b;
        this.b = l7m0Var;
        this.c = ugdVar;
        this.d = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39819a;
        ugd ugdVar = this.d;
        ugd ugdVar2 = this.c;
        l7m0 l7m0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kc5.K(l7m0Var, ugdVar2, ugdVar, fetVar, x8x.L(1));
                break;
            default:
                j47.I(l7m0Var, ugdVar2, ugdVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
