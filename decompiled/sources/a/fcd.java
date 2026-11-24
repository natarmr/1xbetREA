package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9307a;
    public final /* synthetic */ fak0 b;

    public /* synthetic */ fcd(fak0 fak0Var, byte b) {
        this.f9307a = b;
        this.b = fak0Var;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0544  */
    /* JADX WARN: Code duplicated, block: B:77:0x02c6  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        byte b = this.f9307a;
        jm40 jm40Var = jm40.b;
        fak0 fak0Var = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    tnq0.e(0, 0, fetVar, fak0Var.b, s5x0.L(jm40Var, 12.0f, 0.0f, 2));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i = 0;
                    for (Object obj3 : fak0Var.j) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        h3w h3wVar = (h3w) obj3;
                        fetVar2.b0(-1575180430, fak0Var.c + "key" + i);
                        if (h3wVar == null) {
                            fetVar2.e0(-1582737287);
                            fetVar2.r(false);
                        } else {
                            boolean z = h3wVar instanceof g3w;
                            jm40 jm40Var2 = jm40.b;
                            if (z) {
                                fetVar2.e0(-1585883632);
                                zcl zclVar2 = qmk.f28987a;
                                vdb.k(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), (g3w) h3wVar, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (h3wVar instanceof szv) {
                                fetVar2.e0(-1585342713);
                                zcl zclVar3 = qmk.f28987a;
                                ibc.f(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), (szv) h3wVar, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (h3wVar instanceof bfj) {
                                fetVar2.e0(-1584817852);
                                zcl zclVar4 = qmk.f28987a;
                                kpb.e(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 8.0f, 2), (bfj) h3wVar, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (h3wVar instanceof duy) {
                                fetVar2.e0(-1584288899);
                                zcl zclVar5 = qmk.f28987a;
                                ydx.d(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), (duy) h3wVar, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (h3wVar instanceof f3w) {
                                fetVar2.e0(-1583753002);
                                zcl zclVar6 = qmk.f28987a;
                                jcb.a(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), (f3w) h3wVar, fetVar2, 0, 0);
                                fetVar2.r(false);
                            } else if (h3wVar instanceof np2) {
                                fetVar2.e0(-1583213788);
                                zcl zclVar7 = qmk.f28987a;
                                b34.c(s5x0.N(jm40Var2, 12.0f, 0.0f, 12.0f, 4.0f, 2), (np2) h3wVar, fetVar2, 0);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(-1582737287);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                        i = i2;
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar8 = qmk.f28987a;
                    e9x.p(s5x0.N(jm40.b, 12.0f, 0.0f, 12.0f, 8.0f, 2), fak0Var.k, false, fetVar3, 384);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar9 = qmk.f28987a;
                    tnq0.e(0, 0, fetVar4, fak0Var.b, s5x0.L(jm40Var, 12.0f, 0.0f, 2));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar10 = qmk.f28987a;
                    v8q0.a(fak0Var.l, s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 4.0f, 2), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar5), fetVar5, 0, 24960, 109564);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-766466284, new fcd(fak0Var, b2), fetVar6), fetVar6, 56);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    zcl zclVar11 = qmk.f28987a;
                    p7x.d(0, fetVar7, s5x0.N(jm40.b, 12.0f, 0.0f, 12.0f, 8.0f, 2), fak0Var.m, fak0Var.n, fak0Var.o);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    a4x a4xVar = fak0Var.j;
                    int i3 = 0;
                    for (Object obj4 : a4xVar) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        h3w h3wVar2 = (h3w) obj4;
                        h3w h3wVar3 = (h3w) CollectionsKt.W(i4, a4xVar);
                        if (h3wVar3 == null || (h3wVar3 instanceof bfj) || (h3wVar3 instanceof l3w)) {
                            zcl zclVar12 = qmk.f28987a;
                            f = 0.0f;
                        } else {
                            zcl zclVar13 = qmk.f28987a;
                            f = 4.0f;
                        }
                        fetVar8.b0(-799668273, fak0Var.c + "key" + i3);
                        if (h3wVar2 == null) {
                            fetVar8.e0(984174727);
                            fetVar8.r(false);
                        } else {
                            boolean z2 = h3wVar2 instanceof szv;
                            jm40 jm40Var3 = jm40.b;
                            if (z2) {
                                fetVar8.e0(980120206);
                                ibc.f(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, f, 2), (szv) h3wVar2, fetVar8, 0);
                                fetVar8.r(false);
                            } else if (h3wVar2 instanceof g3w) {
                                fetVar8.e0(980654615);
                                vdb.k(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, f, 2), (g3w) h3wVar2, fetVar8, 0);
                                fetVar8.r(false);
                            } else if (h3wVar2 instanceof duy) {
                                fetVar8.e0(981209732);
                                ydx.d(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, f, 2), (duy) h3wVar2, fetVar8, 0);
                                fetVar8.r(false);
                            } else if (h3wVar2 instanceof f3w) {
                                fetVar8.e0(981752573);
                                jcb.a(s5x0.N(jm40Var3, 12.0f, 0.0f, 12.0f, f, 2), (f3w) h3wVar2, fetVar8, 0, 0);
                                fetVar8.r(false);
                            } else if (h3wVar2 instanceof l3w) {
                                fetVar8.e0(982300622);
                                h8x.f(s5x0.N(jm40Var3, 6.0f, 8.0f, 6.0f, 0.0f, 8), (l3w) h3wVar2, fetVar8, 0, 0);
                                fetVar8.r(false);
                            } else if (h3wVar2 instanceof k3w) {
                                fetVar8.e0(982841107);
                                vic.l(s5x0.N(jm40Var3, 6.0f, 0.0f, 6.0f, f, 2), (k3w) h3wVar2, fetVar8, 0);
                                fetVar8.r(false);
                            } else if (h3wVar2 instanceof bfj) {
                                fetVar8.e0(983408004);
                                kpb.e(s5x0.M(jm40Var3, 12.0f, a4xVar.size() == 1 ? 0.0f : 8.0f, 12.0f, 8.0f), (bfj) h3wVar2, fetVar8, 0);
                                fetVar8.r(false);
                            } else {
                                fetVar8.e0(984174727);
                                fetVar8.r(false);
                            }
                        }
                        fetVar8.r(false);
                        i3 = i4;
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar9, 0);
                    int iHashCode = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM = fetVar9.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar9, jm40Var);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(e7z.u1);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, thg0VarA, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar9);
                    x7z x7zVarI = ohs0.i(fetVar9, mm40VarC0, gqw0.v, 1.0f, false);
                    zcl zclVar14 = qmk.f28987a;
                    v8q0.a(kng0.k("\u200e", fak0Var.d), s5x0.N(x7zVarI, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar9), fetVar9, 0, 24960, 110588);
                    dww.c(a8k0.F(R.drawable.ic_glyph_copy, 0, fetVar9), null, o7k0.n(jm40Var, 12.0f), ((ThemeColors) fetVar9.k(zaq0.b)).getPrimary(), fetVar9, 56, 0);
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zcl zclVar15 = qmk.f28987a;
                    v8q0.a(fak0Var.d, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar10), fetVar10, 0, 24960, 110588);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
        }
    }
}
