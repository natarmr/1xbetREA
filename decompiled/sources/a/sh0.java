package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class sh0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32185a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ sh0(ArrayList arrayList, Function1 function1, byte b) {
        this.f32185a = b;
        this.b = arrayList;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0281  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        fet fetVar;
        int i7;
        int i8;
        int i9;
        int i10;
        fet fetVar2;
        int i11;
        fet fetVar3;
        byte b = this.f32185a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                k8z k8zVar = (k8z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                k8zVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar4.g(k8zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar4.e(iIntValue) ? 32 : 16;
                }
                if (fetVar4.U(i & 1, (i & 147) != 146)) {
                    ph0 ph0Var = (ph0) arrayList.get(iIntValue);
                    fetVar4.e0(-940765514);
                    mh0.a(null, ph0Var, function1, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar5.g(g9zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar5.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                    bh8 bh8Var = (bh8) arrayList.get(iIntValue3);
                    fetVar5.e0(1489299581);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarP = o7k0.p(jm40Var, 240.0f, 104.0f);
                    bh8Var.getClass();
                    Object objP = fetVar5.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar5);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zG = fetVar5.g(function1) | fetVar5.g(bh8Var);
                    Object objP2 = fetVar5.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new h5((Object) function1, (Object) bh8Var, (byte) 10);
                        fetVar5.o0(objP2);
                    }
                    y9a.i(y860.W(mm40VarP, gy40Var, null, true, null, (Function0) objP2, 24), bh8Var, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar6.g(g9zVar2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar6.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar6.U(i3 & 1, (i3 & 147) != 146)) {
                    o8w o8wVar = (o8w) arrayList.get(iIntValue5);
                    fetVar6.e0(1317516571);
                    if (o8wVar instanceof cuo) {
                        fetVar6.e0(1317570386);
                        cuo cuoVar = (cuo) o8wVar;
                        boolean zG2 = fetVar6.g(function1);
                        Object objP3 = fetVar6.P();
                        if (zG2 || objP3 == cl5Var) {
                            objP3 = new qr0(function1, (byte) 26);
                            fetVar6.o0(objP3);
                        }
                        ebc.x(null, cuoVar, (Function1) objP3, fetVar6, 0);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(1320224668);
                        fetVar6.r(false);
                    }
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 3:
                zdz zdzVar = (zdz) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar7.g(zdzVar) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar7.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar7.U(i4 & 1, (i4 & 147) != 146)) {
                    nz30 nz30Var = (nz30) arrayList.get(iIntValue7);
                    fetVar7.e0(1662781444);
                    dtb.o(nz30Var, this.c, null, fetVar7, 0, 4);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar8.g(g9zVar3) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar8.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar8.U(i5 & 1, (i5 & 147) != 146)) {
                    wnk wnkVar = (wnk) arrayList.get(iIntValue9);
                    fetVar8.e0(-890961584);
                    boolean zG3 = fetVar8.g(function1) | fetVar8.g(wnkVar);
                    Object objP4 = fetVar8.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new ctl(function1, wnkVar, (byte) 25);
                        fetVar8.o0(objP4);
                    }
                    ckb.o(wnkVar, (Function1) objP4, fetVar8, 0);
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar9.g(g9zVar4) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar9.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar9.U(i6 & 1, (i6 & 147) != 146)) {
                    o8w o8wVar2 = (o8w) arrayList.get(iIntValue11);
                    fetVar9.e0(802365452);
                    if (o8wVar2 instanceof fak0) {
                        fetVar9.e0(802414462);
                        fak0 fak0Var = (fak0) o8wVar2;
                        boolean zG4 = fetVar9.g(function1);
                        Object objP5 = fetVar9.P();
                        if (zG4 || objP5 == cl5Var) {
                            objP5 = new w8v(function1, (byte) 18);
                            fetVar9.o0(objP5);
                        }
                        x8x.j(null, fak0Var, true, (Function1) objP5, fetVar9, 384);
                        fetVar = fetVar9;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar9;
                        fetVar.e0(804715096);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar10.g(g9zVar5) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar10.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar10.U(i7 & 1, (i7 & 147) != 146)) {
                    yrc0 yrc0Var = (yrc0) arrayList.get(iIntValue13);
                    fetVar10.e0(148241869);
                    mm40 mm40VarE0 = o2e.e0(jm40Var, "promoCode " + yrc0Var.getId());
                    boolean zG5 = fetVar10.g(function1) | fetVar10.i(yrc0Var);
                    Object objP6 = fetVar10.P();
                    if (zG5 || objP6 == cl5Var) {
                        objP6 = new ha30(function1, yrc0Var, (byte) 28);
                        fetVar10.o0(objP6);
                    }
                    vbw0.D(mm40VarE0, yrc0Var, (Function0) objP6, fetVar10, 0);
                    fetVar10.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar11.g(g9zVar6) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar11.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar11.U(i8 & 1, (i8 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) arrayList.get(iIntValue15);
                    fetVar11.e0(-1119798949);
                    if (p6t0Var == null) {
                        fetVar11.e0(-1119327099);
                        fetVar11.r(false);
                    } else if (p6t0Var instanceof hh8) {
                        fetVar11.e0(-1283046601);
                        hh8 hh8Var = (hh8) p6t0Var;
                        boolean zG6 = fetVar11.g(function1);
                        Object objP7 = fetVar11.P();
                        if (zG6 || objP7 == cl5Var) {
                            objP7 = new v6a0(function1, (byte) 12);
                            fetVar11.o0(objP7);
                        }
                        x0x.n(null, hh8Var, (Function1) objP7, fetVar11, 0);
                        fetVar11.r(false);
                    } else if (p6t0Var instanceof qng0) {
                        fetVar11.e0(-1283035654);
                        s0x.r(null, (qng0) p6t0Var, fetVar11, 0);
                        fetVar11.r(false);
                    } else {
                        fetVar11.e0(-1119327099);
                        fetVar11.r(false);
                    }
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar12.g(g9zVar7) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar12.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar12.U(i9 & 1, (i9 & 147) != 146)) {
                    pg8 pg8Var = (pg8) arrayList.get(iIntValue17);
                    fetVar12.e0(-1856250804);
                    if (pg8Var != null) {
                        if (pg8Var instanceof ng8) {
                            fetVar12.e0(1325596636);
                            ng8 ng8Var = (ng8) pg8Var;
                            boolean zG7 = fetVar12.g(function1);
                            Object objP8 = fetVar12.P();
                            if (zG7 || objP8 == cl5Var) {
                                objP8 = new v6a0(function1, (byte) 13);
                                fetVar12.o0(objP8);
                            }
                            q0x.w(null, ng8Var, (Function1) objP8, fetVar12, 0);
                            fetVar12.r(false);
                        } else if (pg8Var instanceof og8) {
                            fetVar12.e0(1325615112);
                            zcl zclVar2 = qmk.f28987a;
                            j0x.k(s5x0.K(jm40Var, 16.0f, 12.0f), (og8) pg8Var, fetVar12, 0);
                            fetVar12.r(false);
                        }
                        fetVar12.r(false);
                    }
                    throw b1j.f(1325594263, fetVar12, false);
                }
                fetVar12.X();
                return Unit.f46060a;
            case 9:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar13.g(g9zVar8) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar13.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar13.U(i10 & 1, (i10 & 147) != 146)) {
                    o8w o8wVar3 = (o8w) arrayList.get(iIntValue19);
                    fetVar13.e0(399569795);
                    if (o8wVar3 instanceof p3w) {
                        fetVar13.e0(399614000);
                        p3w p3wVar = (p3w) o8wVar3;
                        boolean zG8 = fetVar13.g(function1);
                        Object objP9 = fetVar13.P();
                        if (zG8 || objP9 == cl5Var) {
                            objP9 = new v6a0(function1, (byte) 17);
                            fetVar13.o0(objP9);
                        }
                        obb.A(null, p3wVar, (Function1) objP9, fetVar13, 0, 1);
                        fetVar2 = fetVar13;
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar13;
                        fetVar2.e0(401859857);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar14.g(g9zVar9) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar14.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar14.U(i11 & 1, (i11 & 147) != 146)) {
                    o8w o8wVar4 = (o8w) arrayList.get(iIntValue21);
                    fetVar14.e0(752103819);
                    if (o8wVar4 instanceof p3w) {
                        fetVar14.e0(752148024);
                        p3w p3wVar2 = (p3w) o8wVar4;
                        boolean zG9 = fetVar14.g(function1);
                        Object objP10 = fetVar14.P();
                        if (zG9 || objP10 == cl5Var) {
                            objP10 = new dpl0(function1, (byte) 5);
                            fetVar14.o0(objP10);
                        }
                        obb.A(null, p3wVar2, (Function1) objP10, fetVar14, 0, 1);
                        fetVar3 = fetVar14;
                        fetVar3.r(false);
                    } else {
                        fetVar3 = fetVar14;
                        fetVar3.e0(754399647);
                        fetVar3.r(false);
                    }
                    fetVar3.r(false);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
        }
    }
}
