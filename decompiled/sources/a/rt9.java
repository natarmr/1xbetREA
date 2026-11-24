package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rt9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31067a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ rt9(boolean z, Function1 function1, int i, byte b) {
        this.f31067a = b;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31067a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vbw0.B(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 1:
                cjx.k(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 2:
                gq80.l(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 3:
                wha0.i(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 4:
                nia0.p(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 5:
                xia0.l(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 6:
                g7x.g(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                vbw0.r(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
