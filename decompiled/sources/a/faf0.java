package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class faf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9205a;
    public final /* synthetic */ iaf0 b;

    public /* synthetic */ faf0(iaf0 iaf0Var, byte b) {
        this.f9205a = b;
        this.b = iaf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9205a;
        iaf0 iaf0Var = this.b;
        switch (b) {
            case 0:
                s9f0 s9f0Var = (s9f0) obj;
                zie0 zie0Var = iaf0.Z1;
                s9f0Var.getClass();
                iaf0Var.H0().x(s9f0Var);
                break;
            case 1:
                iqt0 iqt0Var = (iqt0) obj;
                zie0 zie0Var2 = iaf0.Z1;
                iqt0Var.getClass();
                iaf0Var.H0().x(new x8f0(iqt0Var));
                break;
            default:
                zie0 zie0Var3 = iaf0.Z1;
                iaf0Var.H0().x(new m9f0((ghk0) obj));
                break;
        }
        return Unit.f46060a;
    }
}
