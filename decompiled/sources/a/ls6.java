package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ls6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20563a;
    public final /* synthetic */ dt6 b;

    public /* synthetic */ ls6(dt6 dt6Var, byte b) {
        this.f20563a = b;
        this.b = dt6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        c820 c820Var;
        svj0 svj0Var;
        byte b = this.f20563a;
        dt6 dt6Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                th.printStackTrace();
                dt6Var.G(new rc20(new xdk0(rek0.b, str, null, null, null, null, 124)));
                return Unit.f46060a;
            case 1:
                c820 c820Var2 = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var2.getClass();
                svj0 svj0Var2 = c820Var2.d;
                return c820.a(c820Var2, null, null, null, svj0.a(svj0Var2, null, null, lwo0.a(svj0Var2.c, dt6Var.M(), false, 0.0d, iun.f15405a, 20), 11), null, null, false, false, false, false, null, 8183);
            case 2:
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                b1j.z(str2, th2);
                if (th2 instanceof zhi0) {
                    dt6Var.getClass();
                    kuw kuwVar = ((zhi0) th2).c;
                    if (kuwVar == i2o.q) {
                        dt6Var.G(new dc20(str2));
                    } else if (kuwVar == i2o.BetExistsError) {
                        dt6Var.G(new ub20(str2));
                    } else {
                        dt6Var.W(str2);
                    }
                } else if (hic.C(th2)) {
                    dt6Var.V();
                } else {
                    dt6Var.W(str2);
                }
                return Unit.f46060a;
            case 3:
                c820 c820Var3 = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var3.getClass();
                svj0 svj0Var3 = c820Var3.d;
                return c820.a(c820Var3, null, null, null, svj0.a(svj0Var3, null, nnb0.a(svj0Var3.b, false, dt6Var.O(), "", 1), null, 13), null, null, false, false, false, false, null, 8183);
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                if (th3 instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th3.printStackTrace();
                p7m0 p7m0Var = dt6Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    c820Var = (c820) value;
                    dt6Var.f.getClass();
                    svj0Var = c820Var.d;
                } while (!p7m0Var.m(value, c820.a(c820Var, null, null, null, svj0.a(svj0Var, null, nnb0.a(svj0Var.b, false, null, "", 2), null, 13), null, null, false, false, false, false, null, 8183)));
                return Unit.f46060a;
            default:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((String) obj2).getClass();
                if (th4 instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th4.printStackTrace();
                dt6Var.H(new gh5((byte) 29));
                return Unit.f46060a;
        }
    }
}
