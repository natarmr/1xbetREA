package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qqh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29165a;
    public final /* synthetic */ c280 b;

    public /* synthetic */ qqh(c280 c280Var, int i, byte b) {
        this.f29165a = b;
        this.b = c280Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29165a;
        c280 c280Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                rcb.K(c280Var, fetVar, x8x.L(7));
                break;
            default:
                n6m.h(c280Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
