package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qym implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29541a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ p6x c;

    public /* synthetic */ qym(mm40 mm40Var, p6x p6xVar, int i, byte b) {
        this.f29541a = b;
        this.b = mm40Var;
        this.c = p6xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29541a;
        p6x p6xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tlb.r(mm40Var, p6xVar, fetVar, x8x.L(1));
                break;
            case 1:
                ntb.x(mm40Var, p6xVar, fetVar, x8x.L(1));
                break;
            default:
                vtb.C(mm40Var, p6xVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
