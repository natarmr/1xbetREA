package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v49 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36765a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ v49(int i, Function0 function0, int i2, byte b) {
        this.f36765a = b;
        this.b = i;
        this.c = function0;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36765a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                jd8.s(this.b, x8x.L(this.d | 1), fetVar, this.c);
                break;
            case 1:
                rq8.k(this.b, x8x.L(this.d | 1), fetVar, this.c);
                break;
            case 2:
                xvw.r(this.b, x8x.L(this.d | 1), fetVar, this.c);
                break;
            default:
                hp4.s(this.b, x8x.L(this.d | 1), fetVar, this.c);
                break;
        }
        return Unit.f46060a;
    }
}
