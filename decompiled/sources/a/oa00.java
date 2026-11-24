package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oa00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24906a;
    public final /* synthetic */ bb00 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ oa00(bb00 bb00Var, Function1 function1, int i, byte b) {
        this.f24906a = b;
        this.b = bb00Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24906a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wdx.l(this.b, this.c, fetVar, x8x.L(1));
                break;
            case 1:
                q7x.h(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                hmw0.W(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
