package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w8d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38717a;
    public final /* synthetic */ k7q0 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ int d;

    public /* synthetic */ w8d(k7q0 k7q0Var, ugd ugdVar, int i, byte b) {
        this.f38717a = b;
        this.b = k7q0Var;
        this.c = ugdVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38717a;
        int i = this.d;
        ugd ugdVar = this.c;
        k7q0 k7q0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                agc.h(k7q0Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
            default:
                dtb.b(k7q0Var, ugdVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
