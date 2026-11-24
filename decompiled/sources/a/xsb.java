package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xsb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41407a;
    public final /* synthetic */ zsb b;

    public /* synthetic */ xsb(zsb zsbVar, byte b) {
        this.f41407a = b;
        this.b = zsbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41407a;
        zsb zsbVar = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = zsb.n2;
                zsbVar.P0().x(usb.f36202a);
                return Unit.f46060a;
            case 1:
                yk5 yk5Var2 = zsb.n2;
                zsbVar.P0().x(psb.f27508a);
                return Unit.f46060a;
            case 2:
                yk5 yk5Var3 = zsb.n2;
                fiu0 fiu0Var = zsbVar.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                yk5 yk5Var4 = zsb.n2;
                zsbVar.P0().x(new qsb(true));
                return Unit.f46060a;
            case 4:
                yk5 yk5Var5 = zsb.n2;
                zsbVar.P0().x(new qsb(false));
                return Unit.f46060a;
            default:
                yk5 yk5Var6 = zsb.n2;
                zsbVar.P0().x(tsb.f34453a);
                return Unit.f46060a;
        }
    }
}
