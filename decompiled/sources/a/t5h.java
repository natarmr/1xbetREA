package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33369a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ t5h(boolean z, Function0 function0, int i, byte b) {
        this.f33369a = b;
        this.b = z;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33369a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                uzb.e(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                nkb.t(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                nkb.t(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                nkb.u(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 4:
                l8x.r(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                l8x.F(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
