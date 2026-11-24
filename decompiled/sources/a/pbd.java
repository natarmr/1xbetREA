package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pbd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26700a;
    public final /* synthetic */ e900 b;

    public /* synthetic */ pbd(e900 e900Var, int i, byte b) {
        this.f26700a = b;
        this.b = e900Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26700a;
        e900 e900Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ffb0.h(e900Var, fetVar, x8x.L(1));
                break;
            default:
                epv0.t(e900Var, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
