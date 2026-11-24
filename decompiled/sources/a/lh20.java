package a;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20035a;
    public final /* synthetic */ on20 b;

    public /* synthetic */ lh20(on20 on20Var, byte b) {
        this.f20035a = b;
        this.b = on20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        byte b = this.f20035a;
        byte b2 = 3;
        byte b3 = 2;
        yje yjeVar = null;
        on20 on20Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                b1j.z(str, th);
                if (th instanceof zhi0) {
                    i3t0.K(on20Var, null, null, new ffd(on20Var, th, yjeVar, (byte) 22), 3);
                    on20Var.m0(((zhi0) th).c, str, false);
                } else if (hic.C(th)) {
                    on20Var.C0();
                } else {
                    on20Var.G(new pc20(new xdk0(rek0.b, str, null, null, null, null, 124)));
                }
                return Unit.f46060a;
            case 1:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                pvj0 pvj0Var = a820Var.e;
                return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, null, null, iwo0.a(pvj0Var.c, on20Var.U(), false, 0.0d, iun.f15405a, 20), null, null, false, 59), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 2:
                a820 a820Var2 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var2.getClass();
                txe txeVar = a820Var2.b;
                ctf0 ctf0Var = on20Var.D;
                int iOrdinal = on20Var.O.a().ordinal();
                if (iOrdinal == 0) {
                    i = R.string.to_confirm;
                } else if (iOrdinal == 1) {
                    i = R.string.to_any_accept;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    i = R.string.to_up_accept;
                }
                return a820.a(a820Var2, txe.a(txeVar, 0L, 0, null, null, ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)), false, null, 111), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                on20Var.H(new ei20(b3));
                return Unit.f46060a;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                if (th2 instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th2.printStackTrace();
                on20Var.H(new lh20(on20Var, (byte) 10));
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                String str2 = (String) obj2;
                th3.getClass();
                str2.getClass();
                th3.printStackTrace();
                on20Var.G(new pc20(new xdk0(rek0.b, str2, null, null, null, null, 124)));
                return Unit.f46060a;
            case 6:
                a820 a820Var3 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var3.getClass();
                pvj0 pvj0Var2 = a820Var3.e;
                pvj0 pvj0VarA = pvj0.a(pvj0Var2, null, knb0.b(pvj0Var2.b, false, on20Var.h0(pvj0Var2.f27665a.b.p, null), 1), null, null, null, false, 61);
                hx4 hx4Var = a820Var3.g;
                return a820.a(a820Var3, null, null, null, pvj0VarA, null, hx4.a(hx4Var, null, null, null, null, knb0.b(hx4Var.e, false, on20Var.h0(false, null), 1), false, 47), null, false, null, 0.0f, false, null, 0, false, false, false, 262063);
            case 7:
                a820 a820Var4 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var4.getClass();
                txe txeVar2 = a820Var4.b;
                m0d m0dVar = txeVar2.d;
                azc azcVarG = on20Var.V.g(0.0d, 0.0d, false);
                azc azcVar = azc.f1709a;
                return a820.a(a820Var4, txe.a(txeVar2, 0L, 0, null, m0d.a(m0dVar, azcVarG, null, 67), null, false, null, 119), null, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262141);
            case 8:
                a820 a820Var5 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var5.getClass();
                return a820.a(a820Var5, null, null, xm5.a(a820Var5.d, null, false, null, new h40(-1.0d, on20Var.v.a().f32117a.f12063a.b ? f40.b : f40.f8887a), 7), null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262135);
            case 9:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((String) obj2).getClass();
                if (th4 instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th4.printStackTrace();
                on20Var.H(new ei20(b2));
                return Unit.f46060a;
            default:
                a820 a820Var6 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var6.getClass();
                pvj0 pvj0Var3 = a820Var6.e;
                return a820.a(a820Var6, null, null, null, pvj0.a(pvj0Var3, null, knb0.b(pvj0Var3.b, on20Var.r0(), null, 2), null, null, null, false, 61), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
        }
    }
}
