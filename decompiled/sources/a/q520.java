package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q520 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28129a;
    public final /* synthetic */ h620 b;

    public /* synthetic */ q520(h620 h620Var, byte b) {
        this.f28129a = b;
        this.b = h620Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28129a;
        h620 h620Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                String str = (String) obj2;
                b1j.z(str, th);
                h620Var.f0.f(new gw4(new xdk0(rek0.b, str, null, null, null, null, 124)));
                break;
            case 1:
                String str2 = (String) obj2;
                b1j.z(str2, th);
                if (th instanceof zhi0) {
                    h620Var.B(((zhi0) th).c, str2);
                } else if (hic.C(th)) {
                    ol60 ol60Var = h620Var.f0;
                    ctf0 ctf0Var = h620Var.i;
                    ol60Var.f(new gw4(new xdk0(pek0.f26859a, ctf0Var.f(R.string.no_connection_title_with_hyphen, new Object[0]), ctf0Var.f(R.string.no_connection_description, new Object[0]), null, null, null, 120)));
                } else {
                    h620Var.f0.f(new gw4(new xdk0(rek0.b, str2, null, null, null, null, 124)));
                }
                break;
            default:
                th.printStackTrace();
                p7m0 p7m0Var = h620Var.W;
                p7m0Var.getClass();
                p7m0Var.o(null, gm5.f11525a);
                break;
        }
        return Unit.f46060a;
    }
}
