package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xts0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41479a;
    public final /* synthetic */ aus0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xts0(aus0 aus0Var, int i, byte b) {
        this.f41479a = b;
        this.b = aus0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41479a;
        int i = this.c;
        aus0 aus0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                iym0.i(aus0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                iym0.a(aus0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
