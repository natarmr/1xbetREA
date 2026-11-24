package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uoh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36014a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ woh c;

    public /* synthetic */ uoh(mm40 mm40Var, woh wohVar, int i, byte b) {
        this.f36014a = b;
        this.b = mm40Var;
        this.c = wohVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36014a;
        woh wohVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                e3c.c(mm40Var, wohVar, fetVar, x8x.L(1));
                break;
            default:
                jtm0.h(mm40Var, wohVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
