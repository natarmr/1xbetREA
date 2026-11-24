package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ww80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39877a = 0;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ zw80 c;

    public /* synthetic */ ww80(zw80 zw80Var, Function2 function2) {
        this.c = zw80Var;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39877a;
        zw80 zw80Var = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, ((xw80) zw80Var).c.size(), null, null, new ugd(1559870004, true, new d2s(zw80Var, function2, (byte) 18)), 6);
                break;
            default:
                Long l = (Long) obj;
                l.getClass();
                function2.invoke(((xw80) zw80Var).f41598a, l);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ww80(Function2 function2, zw80 zw80Var) {
        this.b = function2;
        this.c = zw80Var;
    }
}
