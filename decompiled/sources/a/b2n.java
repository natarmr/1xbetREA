package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b2n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1860a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ j2n c;

    public /* synthetic */ b2n(mm40 mm40Var, j2n j2nVar, int i, byte b) {
        this.f1860a = b;
        this.b = mm40Var;
        this.c = j2nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1860a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ibc.F(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 1:
                mbc.G(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 2:
                obc.D(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 3:
                qbc.B(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                vbc.N(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
