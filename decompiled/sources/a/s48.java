package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s48 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31593a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ s48(int i, int i2, mm40 mm40Var) {
        this.f31593a = (byte) 4;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31593a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                unh0.V(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 1:
                fre0.k(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 2:
                ibc.g(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            case 3:
                km10.j(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                ucx.d(this.c, x8x.L(this.d | 1), fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ s48(mm40 mm40Var, int i, int i2, int i3, byte b) {
        this.f31593a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
    }
}
