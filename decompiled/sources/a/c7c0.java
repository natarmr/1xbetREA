package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c7c0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3856a;
    public final /* synthetic */ g7c0 b;

    public /* synthetic */ c7c0(g7c0 g7c0Var, byte b) {
        this.f3856a = b;
        this.b = g7c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3856a;
        g7c0 g7c0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                b1j.z(str, th);
                if (th instanceof zhi0) {
                    g7c0Var.z.f(((zhi0) th).c == i2o.BetExistsError ? new i6c0(str) : new k6c0(str));
                } else if (hic.C(th)) {
                    ol60 ol60Var = g7c0Var.z;
                    ctf0 ctf0Var = g7c0Var.i;
                    ol60Var.f(new m6c0(new xdk0(pek0.f26859a, ctf0Var.f(R.string.no_connection_title_with_hyphen, new Object[0]), ctf0Var.f(R.string.no_connection_description, new Object[0]), null, null, null, 120)));
                } else {
                    g7c0Var.z.f(new k6c0(str));
                }
                break;
            default:
                th.getClass();
                str.getClass();
                g7c0Var.z.f(new k6c0(str));
                break;
        }
        return Unit.f46060a;
    }
}
