package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tye implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34750a;
    public final /* synthetic */ xye b;

    public /* synthetic */ tye(xye xyeVar, byte b) {
        this.f34750a = b;
        this.b = xyeVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34750a;
        xye xyeVar = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = xyeVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nwd nwdVar = xye.U1;
                return new jt6(xyeVar, (byte) 2);
            case 2:
                nwd nwdVar2 = xye.U1;
                xyeVar.H0().y(String.valueOf(xyeVar.G0().c.getText()), true);
                return Unit.f46060a;
            default:
                nwd nwdVar3 = xye.U1;
                x920 x920VarH0 = xyeVar.H0();
                sac.V(jiu0.a(x920VarH0), w920.f38756a, null, x920VarH0.b.f22085a, new kv(x920VarH0, null, (byte) 14), 10);
                return Unit.f46060a;
        }
    }
}
