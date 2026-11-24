package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f6a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8999a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ h6a0 c;

    public /* synthetic */ f6a0(xdr xdrVar, h6a0 h6a0Var, byte b) {
        this.f8999a = b;
        this.b = xdrVar;
        this.c = h6a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8999a;
        h6a0 h6a0Var = this.c;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                xdrVar.F(Long.valueOf(h6a0Var.f12521a), h6a0Var.b, Boolean.valueOf(h6a0Var.c));
                break;
            default:
                fxb.D(ivb0.b, new f6a0(xdrVar, h6a0Var, (byte) 0)).a();
                break;
        }
        return Unit.f46060a;
    }
}
