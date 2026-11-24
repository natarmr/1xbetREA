package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class drl implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6565a;
    public final /* synthetic */ irl b;

    public /* synthetic */ drl(irl irlVar, byte b) {
        this.f6565a = b;
        this.b = irlVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f6565a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        irl irlVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(mm40VarD, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3));
                    zfn zfnVar = zaq0.b;
                    mm40 mm40VarN = s5x0.N(i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), 12.0f, 0.0f, 12.0f, 12.0f, 2);
                    tj30 tj30VarC = zq8.c(gqw0.d, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    String str = irlVar.b;
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    v8q0.a(str, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131066);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ2 = lgb.J(mm40VarD2, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3));
                    zfn zfnVar2 = zaq0.b;
                    mm40 mm40VarN2 = s5x0.N(i120.Q(mm40VarJ2, ((ThemeColors) fetVar2.k(zfnVar2)).getBackgroundContent(), jd8.n), 12.0f, 0.0f, 12.0f, 12.0f, 2);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    String str2 = irlVar.b;
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, 0, 0, 131066);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
