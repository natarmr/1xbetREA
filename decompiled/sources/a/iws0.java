package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iws0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15507a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ n5l0 c;

    public /* synthetic */ iws0(mm40 mm40Var, n5l0 n5l0Var, int i, byte b) {
        this.f15507a = b;
        this.b = mm40Var;
        this.c = n5l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15507a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                afn0.c(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                ghm0.d(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
