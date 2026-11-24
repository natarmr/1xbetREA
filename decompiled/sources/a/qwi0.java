package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qwi0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29437a;
    public final /* synthetic */ swi0 b;

    public /* synthetic */ qwi0(swi0 swi0Var, byte b) {
        this.f29437a = b;
        this.b = swi0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29437a;
        swi0 swi0Var = this.b;
        switch (b) {
            case 0:
                gne0 gne0Var = swi0.X1;
                swi0Var.H0().x(byi0.f3420a);
                return Unit.f46060a;
            case 1:
                gne0 gne0Var2 = swi0.X1;
                swi0Var.H0().x(yyi0.f43468a);
                return Unit.f46060a;
            case 2:
                gne0 gne0Var3 = swi0.X1;
                swi0Var.H0().x(kyi0.f19106a);
                return Unit.f46060a;
            case 3:
                gne0 gne0Var4 = swi0.X1;
                swi0Var.H0().x(iyi0.f15591a);
                return Unit.f46060a;
            case 4:
                gne0 gne0Var5 = swi0.X1;
                fiu0 fiu0Var = swi0Var.R1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 5:
                gne0 gne0Var6 = swi0.X1;
                swi0Var.H0().x(lyi0.f20863a);
                return Unit.f46060a;
            case 6:
                gne0 gne0Var7 = swi0.X1;
                swi0Var.H0().x(uyi0.f36491a);
                return Unit.f46060a;
            case 7:
                gne0 gne0Var8 = swi0.X1;
                swi0Var.H0().x(zyi0.f45208a);
                return Unit.f46060a;
            case 8:
                gne0 gne0Var9 = swi0.X1;
                swi0Var.H0().x(azi0.f1719a);
                return Unit.f46060a;
            default:
                gne0 gne0Var10 = swi0.X1;
                swi0Var.H0().x(eyi0.f8631a);
                return Unit.f46060a;
        }
    }
}
