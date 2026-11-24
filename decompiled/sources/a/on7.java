package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class on7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25533a;
    public final /* synthetic */ fqj0 b;

    public /* synthetic */ on7(fqj0 fqj0Var) {
        this.f25533a = (byte) 17;
        this.b = fqj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25533a;
        fqj0 fqj0Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                i120.k(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i120.M(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                qcc.B(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                xbc.s(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                yyw.v(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                yyw.g(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                pzw.v(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                pzw.d(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                pzw.c(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                pzw.o(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                pzw.t(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                q5x.c(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                pzw.b(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                g8x.d(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                m8x.e(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                x8x.a(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                b34.u(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 17:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iB = 0;
                    while (iB < 6) {
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = o7k0.n(jm40.b, 56.0f);
                        zcl zclVar2 = qmk.i;
                        ugg0 ugg0Var = vgg0.f37379a;
                        iB = h97.b(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), this.b, fetVar, 0, iB, 1);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                n2x.i(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                n2x.j(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                wha0.r(fqj0Var, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                k7n0.e(fqj0Var, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                tke.z(fqj0Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ on7(byte b, int i, fqj0 fqj0Var) {
        this.f25533a = b;
        this.b = fqj0Var;
    }
}
