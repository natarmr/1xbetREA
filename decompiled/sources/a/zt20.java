package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zt20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44936a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ ym6 c;
    public final /* synthetic */ eao d;

    public /* synthetic */ zt20(xdr xdrVar, ym6 ym6Var, eao eaoVar, byte b) {
        this.f44936a = b;
        this.b = xdrVar;
        this.c = ym6Var;
        this.d = eaoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44936a;
        eao eaoVar = this.d;
        ym6 ym6Var = this.c;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new zt20(xdrVar, ym6Var, eaoVar, (byte) 1)).a();
                break;
            default:
                xdrVar.F(Long.valueOf(ym6Var.f42872a), Long.valueOf(eaoVar.e), Double.valueOf(ym6Var.b));
                break;
        }
        return Unit.f46060a;
    }
}
