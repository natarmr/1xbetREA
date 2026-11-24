package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class d5n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5515a;
    public final /* synthetic */ u2e b;
    public final /* synthetic */ xgm c;

    public /* synthetic */ d5n(u2e u2eVar, xgm xgmVar, byte b) {
        this.f5515a = b;
        this.b = u2eVar;
        this.c = xgmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5515a;
        xgm xgmVar = this.c;
        u2e u2eVar = this.b;
        switch (b) {
            case 0:
                t2e t2eVar = (t2e) obj;
                t2eVar.getClass();
                xr xrVar = t2eVar.e;
                u2e u2eVar2 = t2eVar.c;
                xr.o(xrVar, u2eVar2.d, 0.0f, 6);
                xr.o(t2eVar.h, u2eVar.d, 0.0f, 6);
                yzn0.p(t2eVar.f, u2eVar2.e, 0.0f, 6);
                if (ycl.b(xgmVar.a(), Float.NaN)) {
                    yzn0.p(t2eVar.i, u2eVar2.h, 0.0f, 6);
                }
                t2eVar.e(new wmk(null, "wrap"));
                t2eVar.c(ycl.b(xgmVar.a(), Float.NaN) ? new wmk(null, "spread") : new wmk(null, "wrap"));
                break;
            default:
                t2e t2eVar2 = (t2e) obj;
                t2eVar2.getClass();
                xr.o(t2eVar2.e, u2eVar.g, 0.0f, 6);
                xr xrVar2 = t2eVar2.h;
                u2e u2eVar3 = t2eVar2.c;
                xr.o(xrVar2, u2eVar3.g, 0.0f, 6);
                yzn0.p(t2eVar2.f, u2eVar3.e, 0.0f, 6);
                if (ycl.b(xgmVar.a(), Float.NaN)) {
                    yzn0.p(t2eVar2.i, u2eVar3.h, 0.0f, 6);
                }
                t2eVar2.e(new wmk(null, "wrap"));
                t2eVar2.c(ycl.b(xgmVar.a(), Float.NaN) ? new wmk(null, "spread") : new wmk(null, "wrap"));
                break;
        }
        return Unit.f46060a;
    }
}
