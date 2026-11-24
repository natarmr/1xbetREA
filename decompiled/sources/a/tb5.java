package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tb5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33646a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tb5(int i, int i2, mm40 mm40Var, boolean z) {
        this.e = mm40Var;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33646a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.c | 1);
                knx.i(this.b, (Function0) this.e, (fet) obj, iL, this.d ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.c | 1);
                d7x.p((mm40) this.e, this.b, (fet) obj, iL2, this.d ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tb5(boolean z, Function0 function0, int i, int i2) {
        this.b = z;
        this.e = function0;
        this.c = i;
        this.d = i2;
    }
}
