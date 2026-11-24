package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17989a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4k c;

    public /* synthetic */ kb(g4k g4kVar, Function1 function1, int i) {
        this.c = g4kVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17989a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wb.k(x8x.L(1), this.c, fetVar, this.b);
                break;
            default:
                dwi0.l(x8x.L(1), this.c, fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kb(Function1 function1, g4k g4kVar, int i) {
        this.b = function1;
        this.c = g4kVar;
    }
}
