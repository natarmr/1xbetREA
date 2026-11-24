package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bqq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3045a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ awr0 c;

    public /* synthetic */ bqq0(xdr xdrVar, awr0 awr0Var, byte b) {
        this.f3045a = b;
        this.b = xdrVar;
        this.c = awr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3045a;
        awr0 awr0Var = this.c;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                dyb.Q(new bqq0(xdrVar, awr0Var, (byte) 1));
                return Unit.f46060a;
            default:
                xdrVar.F(awr0Var.h, awr0Var.i, awr0Var.j);
                dyb.u0();
                return Boolean.TRUE;
        }
    }
}
