package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.make_bet_settings.impl.navigation.SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33316a;
    public final /* synthetic */ r7f b;

    public /* synthetic */ t4f(r7f r7fVar, byte b) {
        this.f33316a = b;
        this.b = r7fVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0134  */
    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f33316a;
        r7f r7fVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                r7fVar.f0(th);
                break;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                if (r7fVar.k1.a() != jLongValue) {
                    r7fVar.A(jLongValue);
                } else {
                    p7m0 p7m0Var = r7fVar.Z1;
                    ni9 ni9Var = r7fVar.z;
                    if (jLongValue != 0) {
                        g45 g45Var = r7fVar.h0.f16131a;
                        if (!(((ave) g45Var.c).f1521a != q4f.m ? ((lye) g45Var.f10647a).b.equals(knm0.j()) : ((m0f) g45Var.b).b.isEmpty()) && ni9Var.c() && ((p7m0Var.getValue() instanceof aje) || (p7m0Var.getValue() instanceof eje))) {
                            r7fVar.Z();
                        } else if (!ni9Var.c()) {
                            r7fVar.A(jLongValue);
                        }
                    } else if (!ni9Var.c()) {
                        r7fVar.A(jLongValue);
                    }
                }
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                r7fVar.f0(th2);
                r7fVar.e0();
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                r7fVar.o0(false, m2a.m);
                th3.printStackTrace();
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                r7fVar.o0(false, m2a.m);
                th4.printStackTrace();
                break;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                r7fVar.U0.b(th5, new bqd((byte) 22));
                break;
            case 6:
                long jLongValue2 = ((Long) obj).longValue();
                if (jLongValue2 != 0) {
                    v3c.N(r7fVar.F1);
                }
                r7fVar.A(jLongValue2);
                break;
            case 7:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                y3j0 y3j0Var = r7fVar.H0;
                bm5 bm5Var = bm5.i;
                y3j0Var.getClass();
                k0w0Var.h(new SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1(bm5Var));
                break;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                r7fVar.o0(false, m2a.m);
                th6.printStackTrace();
                break;
            default:
                long jLongValue3 = ((Long) obj).longValue();
                p7m0 p7m0Var2 = r7fVar.W1;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, n9h0.a((n9h0) value, false, false, jLongValue3 == 0, "", r7fVar.L(), false, false, false, false, false, 1987)));
                r7fVar.r0();
                break;
        }
        return Unit.f46060a;
    }
}
