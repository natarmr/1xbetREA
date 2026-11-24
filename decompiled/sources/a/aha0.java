package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aha0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f864a;
    public final /* synthetic */ fqj0 b;

    public /* synthetic */ aha0(fqj0 fqj0Var, byte b) {
        this.f864a = b;
        this.b = fqj0Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        fet fetVar;
        byte b = this.f864a;
        jm40 jm40Var = jm40.b;
        fqj0 fqj0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    boolean z = iIntValue % 2 == 0;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 60.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    boolean z2 = fetVar2.S;
                    pcy pcyVar = e7z.u1;
                    if (z2) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    mm40 mm40VarK = s5x0.K(o7k0.c, 12.0f, 10.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    mm40 mm40VarN = o7k0.n(jm40Var2, 40.0f);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar2, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), fqj0Var));
                    mm40 mm40VarN2 = s5x0.N(jm40Var2, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                    zcl zclVar3 = qmk.i;
                    zq8.a(0, fetVar2, xbc.c0(o7k0.e(o7k0.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN2), z ? 128.0f : 96.0f), 16.0f), fqj0Var));
                    fetVar2.r(true);
                    if (iIntValue != 7) {
                        fetVar2.e0(919238034);
                        mbc.o(zfi0.f44303a, jr8.f16991a.b(o7k0.d(s5x0.N(jm40Var2, 60.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), gqw0.i), false, fetVar2, 6, 4);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar2;
                        fetVar.e0(919551878);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    zcl zclVar4 = qmk.l;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    zq8.a(0, fetVar3, xbc.c0(ny9.O(1.5f, o7k0.c(dw9.i(zclVar4, zclVar4, zclVar4, zclVar4, jm40Var), 1.0f), false), fqj0Var));
                } else {
                    fetVar3.X();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 129) != 128)) {
                    zcl zclVar5 = qmk.l;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    zq8.a(0, fetVar4, xbc.c0(ny9.O(1.5f, o7k0.c(dw9.i(zclVar5, zclVar5, zclVar5, zclVar5, jm40Var), 1.0f), false), fqj0Var));
                } else {
                    fetVar4.X();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                fet fetVar5 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 129) != 128)) {
                    zcl zclVar6 = qmk.h;
                    ugg0 ugg0Var4 = vgg0.f37379a;
                    zq8.a(0, fetVar5, o7k0.p(xbc.c0(dw9.i(zclVar6, zclVar6, zclVar6, zclVar6, jm40Var), fqj0Var), 64.0f, 32.0f));
                } else {
                    fetVar5.X();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 129) != 128)) {
                    pz40 pz40Var = s6t0.f31722a;
                    pzw.r(s6t0.b().f33626a.getBackground(), fqj0Var, fetVar6, 0);
                    pzw.r(s6t0.b().f33626a.getBackgroundContent(), fqj0Var, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                fet fetVar7 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 129) != 128)) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    m8x.D(s6t0.b().f33626a.getBackground(), fqj0Var, fetVar7, 0);
                    m8x.D(s6t0.b().f33626a.getBackgroundContent(), fqj0Var, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                fet fetVar8 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 129) != 128)) {
                    zfn zfnVar = zaq0.b;
                    x8x.i(((ThemeColors) fetVar8.k(zfnVar)).getBackground(), fqj0Var, fetVar8, 0);
                    x8x.i(((ThemeColors) fetVar8.k(zfnVar)).getBackgroundContent(), fqj0Var, fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                fet fetVar9 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 129) != 128)) {
                    p7x.h(jm40Var, fqj0Var, fetVar9, 6);
                } else {
                    fetVar9.X();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                fet fetVar10 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 129) != 128)) {
                    zcl zclVar7 = qmk.f28987a;
                    zq8.a(0, fetVar10, o7k0.e(jm40Var, 8.0f));
                    q5x.d(96.0f, fqj0Var, fetVar10, 0);
                    zq8.a(0, fetVar10, o7k0.e(jm40Var, 8.0f));
                    q5x.d(192.0f, fqj0Var, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                break;
            case 9:
                int iIntValue11 = ((Integer) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= fetVar11.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar11.U(iIntValue12 & 1, (iIntValue12 & 145) != 144)) {
                    zcl zclVar8 = qmk.f28987a;
                    k7n0.b(s5x0.N(jm40.b, iIntValue11 == 0 ? 0.0f : 8.0f, 0.0f, 0.0f, 0.0f, 14), fqj0Var, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fet fetVar12 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue13 & 1, (iIntValue13 & 129) != 128)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD2, 20.0f);
                    zcl zclVar10 = qmk.m;
                    ugg0 ugg0Var5 = vgg0.f37379a;
                    qxw.o(fetVar12, xbc.c0(h97.e(zclVar10, zclVar10, zclVar10, zclVar10, mm40VarE), fqj0Var));
                } else {
                    fetVar12.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
