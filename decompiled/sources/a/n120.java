package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n120 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22728a;
    public final /* synthetic */ w220 b;

    public /* synthetic */ n120(w220 w220Var, byte b) {
        this.f22728a = b;
        this.b = w220Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22728a;
        w220 w220Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                sac.V(jiu0.a(w220Var), o220.f24510a, null, w220Var.C.f22085a, new xr10(w220Var, str, null, (byte) 3), 10);
                break;
            case 1:
                w220Var.i.a(th);
                break;
            case 2:
                w220Var.i.a(th);
                break;
            case 3:
                w220Var.i.a(th);
                break;
            default:
                w220Var.i.a(th);
                break;
        }
        return Unit.f46060a;
    }
}
