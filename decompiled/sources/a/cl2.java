package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cl2 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4535a;
    public final /* synthetic */ int b;

    public /* synthetic */ cl2(int i, byte b) {
        this.f4535a = b;
        this.b = i;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        mm40 mm40VarE;
        fqj0 fqj0VarD0;
        byte b = this.f4535a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        int i = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                p6t0 p6t0Var = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var.getClass();
                long jE = ((p6t0Var instanceof bds0) || (p6t0Var instanceof hds0)) ? q8x.e(i) : q8x.e(1);
                return new pgv(jE);
            case 1:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarQ, 8.0f, 0.0f, 2);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    mm40 mm40VarE2 = o7k0.e(jm40Var, 36.0f);
                    zx7 zx7Var = gqw0.e;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 16.0f), i % 2 != 0 ? 128.0f : 80.0f);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
                    mm40 mm40VarE3 = o7k0.e(jm40Var, 48.0f);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    agc.t(null, f4n.f8923a, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), null, null, fetVar, 48, 25);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).intValue();
                e5p e5pVar = (e5p) obj3;
                ((x8z) obj).getClass();
                e5pVar.getClass();
                return new pgv(e5pVar instanceof g4p ? q8x.e(1) : q8x.e(i));
            case 3:
                ((Integer) obj2).intValue();
                e5p e5pVar2 = (e5p) obj3;
                ((x8z) obj).getClass();
                e5pVar2.getClass();
                return new pgv(e5pVar2 instanceof g4p ? q8x.e(1) : q8x.e(i));
            case 4:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (i == 0) {
                        fetVar2.e0(-743256867);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 160.0f), 1.0f);
                        zcl zclVar4 = qmk.k;
                        ugg0 ugg0Var2 = vgg0.f37379a;
                        mm40VarE = h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarD);
                        fqj0VarD0 = vbc.d0(vqm.d, fetVar2, 6, 0);
                    } else {
                        fetVar2.e0(-742725155);
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 224.0f), 1.0f);
                        zcl zclVar6 = qmk.k;
                        ugg0 ugg0Var3 = vgg0.f37379a;
                        mm40VarE = h97.e(zclVar6, zclVar6, zclVar6, zclVar6, mm40VarD2);
                        fqj0VarD0 = vbc.d0(vqm.d, fetVar2, 6, 0);
                    }
                    dw9.x(mm40VarE, fqj0VarD0, fetVar2, 0, false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 5:
                y5d y5dVar = (y5d) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                sqt sqtVar = vzv.p2;
                y5dVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(y5dVar) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar7 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(i, 0, fetVar3), 0L, 0, 0L, fetVar3, 0, 28);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode4 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM4 = fetVar4.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar4, jm40Var);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar4, x5dVarA2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar4, bh90VarM4, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar4, numValueOf2, shdVar7);
                    jpm0.n(fetVar4);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar4, mm40VarC3, shdVar8);
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarS2 = o7k0.s(o7k0.e(s5x0.L(jm40Var, 0.0f, 14.0f, 1), 16.0f), i % 2 != 0 ? 128.0f : 80.0f);
                    zcl zclVar9 = qmk.i;
                    ugg0 ugg0Var4 = vgg0.f37379a;
                    zq8.a(0, fetVar4, xbc.c0(h97.e(zclVar9, zclVar9, zclVar9, zclVar9, mm40VarS2), vbc.d0(null, fetVar4, 0, 1)));
                    mm40 mm40VarE4 = o7k0.e(jm40Var, 48.0f);
                    tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                    int iHashCode5 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM5 = fetVar4.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar4, mm40VarE4);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC3, shdVar5);
                    jpm0.o(fetVar4, bh90VarM5, shdVar6);
                    vqd.u(iHashCode5, fetVar4, shdVar7, fetVar4);
                    jpm0.o(fetVar4, mm40VarC4, shdVar8);
                    agc.t(null, h4n.f12441a, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), null, null, fetVar4, 48, 25);
                    fetVar4.r(true);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).intValue();
                p6t0 p6t0Var2 = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var2.getClass();
                return new pgv(p6t0Var2 instanceof mbo ? q8x.e(1) : q8x.e(i));
            default:
                ((Integer) obj2).intValue();
                p6t0 p6t0Var3 = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var3.getClass();
                return new pgv(p6t0Var3 instanceof dee0 ? q8x.e(1) : q8x.e(i));
        }
    }
}
