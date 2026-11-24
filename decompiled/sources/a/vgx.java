package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vgx implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37404a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ ygx c;

    public /* synthetic */ vgx(xdr xdrVar, ygx ygxVar, byte b) {
        this.f37404a = b;
        this.b = xdrVar;
        this.c = ygxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37404a;
        ygx ygxVar = this.c;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new vgx(xdrVar, ygxVar, (byte) 1)).a();
                break;
            case 1:
                xdrVar.F(Long.valueOf(ygxVar.b), ygxVar.d, Boolean.valueOf(ygxVar.e));
                break;
            case 2:
                fxb.D(ivb0.b, new vgx(xdrVar, ygxVar, (byte) 3)).a();
                break;
            case 3:
                xdrVar.F(Long.valueOf(ygxVar.b), ygxVar.d, Boolean.valueOf(ygxVar.e));
                break;
            case 4:
                fxb.D(ivb0.b, new vgx(xdrVar, ygxVar, (byte) 5)).a();
                break;
            case 5:
                xdrVar.F(Long.valueOf(ygxVar.b), ygxVar.d, Boolean.valueOf(ygxVar.e));
                break;
            case 6:
                fxb.D(ivb0.b, new vgx(xdrVar, ygxVar, (byte) 7)).a();
                break;
            default:
                xdrVar.F(Long.valueOf(ygxVar.b), ygxVar.d, Boolean.valueOf(ygxVar.e));
                break;
        }
        return Unit.f46060a;
    }
}
