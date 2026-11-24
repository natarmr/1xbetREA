package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yv1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43297a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xv1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ yv1(mm40 mm40Var, int i, xv1 xv1Var, int i2, byte b) {
        this.f43297a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = xv1Var;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43297a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                mrv.h(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                knx.d(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
