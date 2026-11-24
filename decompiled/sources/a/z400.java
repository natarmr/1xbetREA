package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z400 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43744a;
    public final /* synthetic */ g500 b;

    public /* synthetic */ z400(g500 g500Var, byte b) {
        this.f43744a = b;
        this.b = g500Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f43744a;
        byte b2 = 27;
        yje yjeVar = null;
        byte b3 = 23;
        byte b4 = 3;
        g500 g500Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                p7m0 p7m0Var = g500Var.m;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new c500(sa10.b(g500Var.c, pb10.g, R.string.data_retrieval_error, 0, null, 28))));
                g500Var.j.b(th, new kyz(b4));
                break;
            case 1:
                th.getClass();
                g500Var.j.b(th, new kyz(b4));
                sac.V(jiu0.a(g500Var), new z8z(b3), null, null, new cin(g500Var, yjeVar, b2), 14);
                break;
            default:
                th.getClass();
                g500Var.j.b(th, new kyz(b4));
                sac.V(jiu0.a(g500Var), new z8z(b3), null, null, new cin(g500Var, yjeVar, b2), 14);
                break;
        }
        return Unit.f46060a;
    }
}
