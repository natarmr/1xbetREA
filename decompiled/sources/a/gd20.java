package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gd20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11086a;
    public final /* synthetic */ rg20 b;

    public /* synthetic */ gd20(rg20 rg20Var, byte b) {
        this.f11086a = b;
        this.b = rg20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11086a;
        rg20 rg20Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                b1j.z(str, (Throwable) obj);
                p7m0 p7m0Var = rg20Var.K;
                sd20 sd20Var = new sd20(str);
                p7m0Var.getClass();
                p7m0Var.o(null, sd20Var);
                rg20Var.y(str);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                String str2 = (String) obj2;
                th.getClass();
                str2.getClass();
                th.printStackTrace();
                rg20Var.y(str2);
                p7m0 p7m0Var2 = rg20Var.K;
                pd20 pd20Var = new pd20(str2);
                p7m0Var2.getClass();
                p7m0Var2.o(null, pd20Var);
                break;
            case 2:
                p7m0 p7m0Var3 = rg20Var.K;
                Throwable th2 = (Throwable) obj;
                String str3 = (String) obj2;
                b1j.z(str3, th2);
                if (th2 instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th2;
                    ctf0 ctf0Var = rg20Var.g;
                    ol60 ol60Var = rg20Var.M;
                    kuw kuwVar = zhi0Var.c;
                    if (kuwVar == i2o.q) {
                        ol60Var.f(new d1o(str3));
                        td20 td20Var = new td20(str3);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, td20Var);
                    } else if (kuwVar == i2o.BetExistsError) {
                        ol60Var.f(new c1o(str3));
                        qd20 qd20Var = new qd20(str3);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, qd20Var);
                    } else if (hic.C(zhi0Var)) {
                        ol60Var.f(new e1o(new xdk0(pek0.f26859a, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
                    } else {
                        rg20Var.y(str3);
                        ud20 ud20Var = new ud20(str3);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, ud20Var);
                    }
                } else {
                    rg20Var.y(str3);
                    ud20 ud20Var2 = new ud20(str3);
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, ud20Var2);
                }
                break;
            case 3:
                ((Throwable) obj).printStackTrace();
                p7m0 p7m0Var4 = rg20Var.G;
                p7m0Var4.getClass();
                p7m0Var4.o(null, ld20.f19829a);
                break;
            case 4:
                String str4 = (String) obj2;
                ((Throwable) obj).printStackTrace();
                p7m0 p7m0Var5 = rg20Var.K;
                sd20 sd20Var2 = new sd20(str4);
                p7m0Var5.getClass();
                p7m0Var5.o(null, sd20Var2);
                rg20Var.y(str4);
                break;
            default:
                String str5 = (String) obj2;
                ((Throwable) obj).printStackTrace();
                rg20Var.y(str5);
                p7m0 p7m0Var6 = rg20Var.K;
                sd20 sd20Var3 = new sd20(str5);
                p7m0Var6.getClass();
                p7m0Var6.o(null, sd20Var3);
                break;
        }
        return Unit.f46060a;
    }
}
