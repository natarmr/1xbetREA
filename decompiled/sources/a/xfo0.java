package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xfo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40800a;
    public final /* synthetic */ fho0 b;

    public /* synthetic */ xfo0(fho0 fho0Var, byte b) {
        this.f40800a = b;
        this.b = fho0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40800a;
        fho0 fho0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                fho0Var.D0.f(new cgo0(pek0.f26859a, str));
                break;
            default:
                th.getClass();
                str.getClass();
                fho0Var.D0.f(new cgo0(rek0.b, str));
                th.printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
