package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cwg0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5079a;
    public final /* synthetic */ cxg0 b;

    public /* synthetic */ cwg0(cxg0 cxg0Var, byte b) {
        this.f5079a = b;
        this.b = cxg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5079a;
        cxg0 cxg0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                if ((th instanceof alx) || (th instanceof zhi0)) {
                    cxg0Var.A.g(new jwg0(str));
                }
                break;
            default:
                th.getClass();
                str.getClass();
                cxg0Var.A.g(new jwg0(str));
                break;
        }
        return Unit.f46060a;
    }
}
