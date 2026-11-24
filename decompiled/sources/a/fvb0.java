package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fvb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10207a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xls c;

    public /* synthetic */ fvb0(xls xlsVar, mm40 mm40Var, int i) {
        this.c = xlsVar;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10207a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                unh0.Y(x8x.L(1), this.c, fetVar, this.b);
                break;
            default:
                unh0.Z(x8x.L(1), this.c, fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fvb0(mm40 mm40Var, xls xlsVar, int i) {
        this.b = mm40Var;
        this.c = xlsVar;
    }
}
