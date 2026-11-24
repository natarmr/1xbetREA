package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qqh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29166a;
    public final /* synthetic */ irh0 b;

    public /* synthetic */ qqh0(irh0 irh0Var, byte b) {
        this.f29166a = b;
        this.b = irh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29166a;
        yje yjeVar = null;
        irh0 irh0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                th.printStackTrace();
                irh0 irh0Var2 = this.b;
                irh0Var2.w(jiu0.a(irh0Var2), new qkb0(th, irh0Var2, str, null, (byte) 13));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                th2.getClass();
                str2.getClass();
                th2.printStackTrace();
                irh0Var.w(jiu0.a(irh0Var), new grh0(irh0Var, str2, yjeVar, (byte) 1));
                break;
            default:
                ((Throwable) obj).printStackTrace();
                irh0Var.w(jiu0.a(irh0Var), new grh0(irh0Var, (String) obj2, yjeVar, (byte) 0));
                break;
        }
        return Unit.f46060a;
    }
}
