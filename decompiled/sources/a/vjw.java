package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vjw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37551a;
    public final /* synthetic */ wjw b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ vjw(wjw wjwVar, Function2 function2, int i, byte b) {
        this.f37551a = b;
        this.b = wjwVar;
        this.c = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37551a;
        int i = this.d;
        Function2 function2 = this.c;
        wjw wjwVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                d5c.t(wjwVar, function2, fetVar, x8x.L(i | 1));
                break;
            default:
                d5c.u(wjwVar, function2, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
