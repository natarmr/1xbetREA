package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vfh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37332a;
    public final /* synthetic */ xfh0 b;

    public /* synthetic */ vfh0(xfh0 xfh0Var, byte b) {
        this.f37332a = b;
        this.b = xfh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37332a;
        xfh0 xfh0Var = this.b;
        switch (b) {
            case 0:
                uid uidVar = (uid) obj;
                cge0 cge0Var = xfh0.V1;
                uidVar.getClass();
                xfh0Var.G0().x(new teh0(uidVar));
                break;
            default:
                String str = (String) obj;
                cge0 cge0Var2 = xfh0.V1;
                str.getClass();
                xfh0Var.G0().x(new weh0(str));
                break;
        }
        return Unit.f46060a;
    }
}
