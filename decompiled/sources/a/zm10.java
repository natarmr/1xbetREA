package a;

import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zm10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44603a;
    public final /* synthetic */ pn10 b;

    public /* synthetic */ zm10(pn10 pn10Var, byte b) {
        this.f44603a = b;
        this.b = pn10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44603a;
        pn10 pn10Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                pn10Var.O(th);
                break;
            case 1:
                th.getClass();
                pn10Var.O(th);
                break;
            case 2:
                th.getClass();
                if (!(th instanceof UnknownHostException)) {
                    pn10Var.O(th);
                }
                break;
            case 3:
                th.getClass();
                pn10Var.O(th);
                break;
            case 4:
                th.getClass();
                pn10Var.O(th);
                break;
            case 5:
                th.getClass();
                if (!(th instanceof UnknownHostException)) {
                    pn10Var.O(th);
                }
                break;
            case 6:
                th.getClass();
                pn10Var.Q(((tm10) pn10Var.D()).f34172a == io10.c ? jo10.b : jo10.f16836a, true, true);
                pn10Var.O(th);
                break;
            case 7:
                th.getClass();
                pn10Var.O(th);
                break;
            default:
                th.getClass();
                pn10Var.Q(((tm10) pn10Var.D()).f34172a == io10.c ? jo10.b : jo10.f16836a, true, true);
                pn10Var.O(th);
                break;
        }
        return Unit.f46060a;
    }
}
