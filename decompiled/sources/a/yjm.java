package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yjm implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42746a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yjm(y3d y3dVar, float f, l7m0 l7m0Var) {
        this.f42746a = (byte) 0;
        this.c = y3dVar;
        this.b = f;
        this.d = l7m0Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long primary;
        int i;
        byte b = this.f42746a;
        jm40 jm40Var = jm40.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                y3d y3dVar = (y3d) obj6;
                l7m0 l7m0Var = (l7m0) obj5;
                ((Boolean) obj2).getClass();
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_ring, 0, fetVar);
                    fetVar.e0(-1773099076);
                    long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                    fetVar.r(false);
                    j0x.b(pm80VarF, null, null, null, null, 0.0f, new m78(jM123getWhite0d7_KjU, 5), fetVar, 56, 60);
                    pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_check_android, 0, fetVar);
                    zfn zfnVar = zaq0.b;
                    long primaryForeground = ((ThemeColors) fetVar.k(zfnVar)).getPrimaryForeground();
                    mm40 mm40VarN = o7k0.n(jm40Var, ((ycl) l7m0Var.getValue()).f42389a);
                    if (y3dVar == null) {
                        fetVar.e0(-1773085602);
                        primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1773086749);
                        fetVar.r(false);
                        primary = y3dVar.f41946a;
                    }
                    mm40 mm40VarQ = i120.Q(mm40VarN, primary, vgg0.f37379a);
                    float f = this.b;
                    dww.c(pm80VarF2, null, i4w0.U(mm40VarQ, f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572), primaryForeground, fetVar, 56, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                kz20 kz20Var = (kz20) obj6;
                Function1 function1 = (Function1) obj5;
                mm40 mm40Var = (mm40) obj;
                qym0 qym0Var = (qym0) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                mm40Var.getClass();
                qym0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = (fetVar2.g(mm40Var) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= (iIntValue2 & 64) == 0 ? fetVar2.g(qym0Var) : fetVar2.i(qym0Var) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    mm40 mm40VarN2 = s5x0.N(mm40Var, this.b, 0.0f, 0.0f, 0.0f, 14);
                    pz40 pz40Var = s6t0.f31722a;
                    iym0.b(mm40VarN2, qym0Var, s6t0.b().f33626a.getSecondary(), kz20Var.k, false, false, function1, fetVar2, 64 | (i & 112), 48);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ugg0 ugg0Var = (ugg0) obj6;
                fqj0 fqj0Var = (fqj0) obj5;
                ((Integer) obj2).getClass();
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((k8z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    zq8.a(0, fetVar3, xbc.c0(lgb.J(ny9.O(1.5f, o7k0.s(jm40Var, this.b), false), ugg0Var), fqj0Var));
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ yjm(float f, Object obj, Object obj2, byte b) {
        this.f42746a = b;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }
}
