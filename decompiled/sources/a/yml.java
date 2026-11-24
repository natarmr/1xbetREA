package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yml implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42895a;
    public final /* synthetic */ uzh b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ yml(uzh uzhVar, Function0 function0, int i, byte b) {
        this.f42895a = b;
        this.b = uzhVar;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42895a;
        int i = this.d;
        Function0 function0 = this.c;
        uzh uzhVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                eeq.c(uzhVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 1:
                kkb.b(uzhVar, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                ntr.d(uzhVar, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
