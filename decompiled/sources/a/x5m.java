package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x5m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40325a;
    public final /* synthetic */ e6m b;

    public /* synthetic */ x5m(e6m e6mVar, int i, byte b) {
        this.f40325a = b;
        this.b = e6mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40325a;
        e6m e6mVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gkb.K(e6mVar, fetVar, x8x.L(1));
                break;
            default:
                ulb.w(e6mVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
