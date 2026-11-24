package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sxf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32975a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ sxf(int i, Function0 function0, int i2) {
        this.f32975a = (byte) 1;
        this.b = i;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (this.f32975a) {
            case 0:
                num.intValue();
                j2e.q(x8x.L(this.b | 1), fetVar, this.c);
                break;
            case 1:
                num.getClass();
                n2x.c(this.b, x8x.L(1), fetVar, this.c);
                break;
            default:
                num.intValue();
                zgc.A(x8x.L(this.b | 1), fetVar, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ sxf(byte b, int i, Function0 function0) {
        this.f32975a = b;
        this.c = function0;
        this.b = i;
    }
}
