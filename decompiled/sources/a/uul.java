package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uul implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36306a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ oe9 d;

    public /* synthetic */ uul(mm40 mm40Var, int i, oe9 oe9Var, int i2, byte b) {
        this.f36306a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = oe9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36306a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qzb.A(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                qzb.z(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
