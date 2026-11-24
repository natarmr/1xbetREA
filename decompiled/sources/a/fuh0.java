package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fuh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10163a;
    public final /* synthetic */ zuh0 b;

    public /* synthetic */ fuh0(zuh0 zuh0Var, byte b) {
        this.f10163a = b;
        this.b = zuh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10163a;
        zuh0 zuh0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                th.printStackTrace();
                zuh0Var.w(jiu0.a(zuh0Var), new yuh0(zuh0Var, str, null, (byte) 1));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                th2.getClass();
                str2.getClass();
                th2.printStackTrace();
                zuh0 zuh0Var2 = this.b;
                zuh0Var2.w(jiu0.a(zuh0Var2), new qkb0(th2, zuh0Var2, str2, null, (byte) 14));
                break;
            default:
                ((Throwable) obj).printStackTrace();
                zuh0Var.w(jiu0.a(zuh0Var), new yuh0(zuh0Var, (String) obj2, null, (byte) 0));
                break;
        }
        return Unit.f46060a;
    }
}
