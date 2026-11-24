package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j1y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15758a;
    public final /* synthetic */ t1y b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ j1y(t1y t1yVar, Function1 function1, int i, byte b) {
        this.f15758a = b;
        this.b = t1yVar;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15758a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                r8x.h(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                r8x.j(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                r8x.d(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
