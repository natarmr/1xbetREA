package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class un8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35949a;
    public final /* synthetic */ mom0 b;
    public final /* synthetic */ mm40 c;

    public /* synthetic */ un8(mom0 mom0Var, mm40 mm40Var, int i, byte b) {
        this.f35949a = b;
        this.b = mom0Var;
        this.c = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35949a;
        mm40 mm40Var = this.c;
        mom0 mom0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ro4.l(mom0Var, mm40Var, fetVar, x8x.L(1));
                break;
            default:
                x4d0.k(mom0Var, mm40Var, fetVar, x8x.L(49));
                break;
        }
        return Unit.f46060a;
    }
}
