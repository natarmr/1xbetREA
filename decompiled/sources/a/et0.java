package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class et0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8352a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ra0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ et0(mm40 mm40Var, ra0 ra0Var, int i, byte b) {
        this.f8352a = b;
        this.b = mm40Var;
        this.c = ra0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8352a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                lt0.b(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                ro4.e(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                o2e.d(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                tke.e(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                ohq0.c(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
