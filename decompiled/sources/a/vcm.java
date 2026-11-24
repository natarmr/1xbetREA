package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vcm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37193a;
    public final /* synthetic */ xdr b;
    public final /* synthetic */ ucm c;

    public /* synthetic */ vcm(xdr xdrVar, ucm ucmVar, byte b) {
        this.f37193a = b;
        this.b = xdrVar;
        this.c = ucmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37193a;
        ucm ucmVar = this.c;
        xdr xdrVar = this.b;
        switch (b) {
            case 0:
                xdrVar.F(Long.valueOf(ucmVar.f35437a), ucmVar.c, Boolean.valueOf(ucmVar.e));
                break;
            default:
                xdrVar.F(Long.valueOf(ucmVar.f35437a), ucmVar.c, Boolean.valueOf(ucmVar.e));
                break;
        }
        return Unit.f46060a;
    }
}
