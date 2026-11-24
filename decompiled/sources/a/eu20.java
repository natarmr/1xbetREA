package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eu20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8398a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ uv20 c;

    public /* synthetic */ eu20(byte b, xdr xdrVar, uv20 uv20Var) {
        this.f8398a = b;
        this.b = xdrVar;
        this.c = uv20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8398a;
        uv20 uv20Var = this.c;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new eu20((byte) 1, xdrVar, uv20Var)).a();
                break;
            case 1:
                xdrVar.F(Long.valueOf(uv20Var.f36327a), uv20Var.b, Boolean.valueOf(uv20Var.d));
                break;
            case 2:
                fxb.D(ivb0.b, new eu20((byte) 3, xdrVar, uv20Var)).a();
                break;
            case 3:
                xdrVar.F(Long.valueOf(uv20Var.f36327a), uv20Var.b, Boolean.valueOf(uv20Var.d));
                break;
            case 4:
                fxb.D(ivb0.b, new eu20((byte) 5, xdrVar, uv20Var)).a();
                break;
            case 5:
                xdrVar.F(Long.valueOf(uv20Var.f36327a), uv20Var.b, Boolean.valueOf(uv20Var.d));
                break;
            case 6:
                fxb.D(ivb0.b, new eu20((byte) 7, xdrVar, uv20Var)).a();
                break;
            case 7:
                xdrVar.F(Long.valueOf(uv20Var.f36327a), uv20Var.b, Boolean.valueOf(uv20Var.d));
                break;
            case 8:
                fxb.D(ivb0.b, new eu20((byte) 9, xdrVar, uv20Var)).a();
                break;
            default:
                xdrVar.F(Long.valueOf(uv20Var.f36327a), uv20Var.b, Boolean.valueOf(uv20Var.d));
                break;
        }
        return Unit.f46060a;
    }
}
