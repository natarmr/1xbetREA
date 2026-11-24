package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class e5n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7241a;
    public final /* synthetic */ u2e b;
    public final /* synthetic */ u2e c;

    public /* synthetic */ e5n(u2e u2eVar, u2e u2eVar2, byte b) {
        this.f7241a = b;
        this.b = u2eVar;
        this.c = u2eVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7241a;
        u2e u2eVar = this.c;
        u2e u2eVar2 = this.b;
        switch (b) {
            case 0:
                t2e t2eVar = (t2e) obj;
                t2eVar.getClass();
                xr.o(t2eVar.e, u2eVar2.g, 0.0f, 6);
                xr.o(t2eVar.h, u2eVar.d, 0.0f, 6);
                yzn0 yzn0Var = t2eVar.f;
                u2e u2eVar3 = t2eVar.c;
                yzn0.p(yzn0Var, u2eVar3.e, 0.0f, 6);
                yzn0.p(t2eVar.i, u2eVar3.h, 0.0f, 6);
                t2eVar.e(new wmk(null, "spread"));
                t2eVar.c(new wmk(null, "wrap"));
                break;
            case 1:
                t2e t2eVar2 = (t2e) obj;
                t2eVar2.getClass();
                t2eVar2.e(new wmk(null, "spread"));
                t2eVar2.c(new wmk(null, "spread"));
                xr.o(t2eVar2.d, u2eVar2.c, 0.0f, 6);
                xr.o(t2eVar2.g, u2eVar.f, 0.0f, 6);
                yzn0.p(t2eVar2.f, u2eVar2.e, 0.0f, 6);
                yzn0.p(t2eVar2.i, u2eVar2.h, 0.0f, 6);
                break;
            case 2:
                t2e t2eVar3 = (t2e) obj;
                t2eVar3.getClass();
                xr.o(t2eVar3.d, u2eVar2.c, 0.0f, 6);
                xr.o(t2eVar3.g, u2eVar2.f, 0.0f, 6);
                yzn0.p(t2eVar3.f, u2eVar.h, 0.0f, 6);
                yzn0.p(t2eVar3.i, t2eVar3.c.h, 0.0f, 6);
                break;
            case 3:
                t2e t2eVar4 = (t2e) obj;
                t2eVar4.getClass();
                t2eVar4.e(new wmk(null, "spread"));
                yzn0.p(t2eVar4.f, u2eVar2.e, 0.0f, 6);
                yzn0.p(t2eVar4.i, u2eVar2.h, 0.0f, 6);
                xr xrVar = t2eVar4.d;
                c3e c3eVar = u2eVar.f;
                zcl zclVar = qmk.f28987a;
                xr.o(xrVar, c3eVar, 14.0f, 4);
                xr.o(t2eVar4.g, t2eVar4.c.f, 0.0f, 6);
                break;
            default:
                t2e t2eVar5 = (t2e) obj;
                t2eVar5.getClass();
                t2eVar5.e(new wmk(null, "spread"));
                yzn0.p(t2eVar5.f, u2eVar2.e, 0.0f, 6);
                yzn0.p(t2eVar5.i, u2eVar2.h, 0.0f, 6);
                xr xrVar2 = t2eVar5.g;
                c3e c3eVar2 = u2eVar.c;
                zcl zclVar2 = qmk.f28987a;
                xr.o(xrVar2, c3eVar2, 14.0f, 4);
                xr.o(t2eVar5.d, t2eVar5.c.c, 0.0f, 6);
                break;
        }
        return Unit.f46060a;
    }
}
