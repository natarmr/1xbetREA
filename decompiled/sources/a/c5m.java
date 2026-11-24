package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c5m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3778a;
    public final /* synthetic */ o0x b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ c5m(o0x o0xVar, Function0 function0, int i, byte b) {
        this.f3778a = b;
        this.b = o0xVar;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3778a;
        int i = this.d;
        Function0 function0 = this.c;
        o0x o0xVar = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                ahb.o(o0xVar, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                num.intValue();
                ahb.p(o0xVar, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
