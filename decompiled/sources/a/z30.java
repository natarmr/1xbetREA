package a;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z30 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43695a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z30(int i, Object obj, byte b) {
        this.f43695a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.jmy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [a.ukf0] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        ams0 ams0Var;
        Object objF0;
        byte b = this.f43695a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b2 = 4;
        int i = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                kie0 kie0Var = (kie0) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fetVar.X();
                } else if (i % 2 != 0) {
                    fetVar.e0(-1120754545);
                    zcl zclVar = qmk.f28987a;
                    jcb.v(null, 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60(), fetVar, 0, 1);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1120498857);
                    kie0Var.f18333a++;
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
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
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var2, 8.0f, 8.0f, 0.0f, 0.0f, 12), 18.0f), kie0Var.f18333a % 2 != 0 ? 64.0f : 128.0f);
                    zcl zclVar3 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
                    mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 8.0f, 5);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    mm40 mm40VarE = o7k0.e(jm40Var2, 40.0f);
                    zhg0 zhg0Var = zhg0.f44392a;
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, zhg0Var.a(1.0f, mm40VarE, true)), vbc.d0(null, fetVar, 0, 1)));
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, zhg0Var.a(1.0f, o7k0.e(s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f), true)), vbc.d0(null, fetVar, 0, 1)));
                    dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, zhg0Var.a(1.0f, o7k0.e(s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f), true)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
                    fetVar.r(true);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                qao0 qao0Var = (qao0) obj4;
                odo0 odo0Var = (odo0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                odo0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? fetVar2.g(odo0Var) : fetVar2.i(odo0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    jdk0 jdk0Var = jdk0.c;
                    jbo0 jbo0Var = new jbo0(odo0Var.f25085a, i, false, odo0Var.b);
                    zcl zclVar4 = qmk.f28987a;
                    jdk0Var.b(jbo0Var, 56.0f, 2.0f, qao0Var.f28407a, vgg0.b(360.0f, 360.0f, 0.0f, 0.0f), fetVar2, 196608, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                dit ditVar = (dit) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                xak xakVar = dit.m2;
                ((y5d) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                    mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                    boolean zI = fetVar3.i(ditVar) | fetVar3.e(i);
                    Object objP = fetVar3.P();
                    if (zI || objP == cl5Var) {
                        objP = new z08(ditVar, i, b2);
                        fetVar3.o0(objP);
                    }
                    b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar3, 0, 508);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fit fitVar = (fit) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ddk ddkVar = fit.m2;
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    xcz xczVarA2 = ddz.a(0, 0, fetVar4, 0, 3);
                    mm40 mm40VarV2 = cjx.V(jm40Var, a8k0.G(xczVarA2, fetVar4), null);
                    boolean zI2 = fetVar4.i(fitVar) | fetVar4.e(i);
                    Object objP2 = fetVar4.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new z08((Object) fitVar, i, (byte) 5);
                        fetVar4.o0(objP2);
                    }
                    b8k0.e(mm40VarV2, xczVarA2, null, null, null, null, false, null, (Function1) objP2, fetVar4, 0, 508);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ugd ugdVar = (ugd) obj4;
                g9z g9zVar = (g9z) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(g9zVar) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    ugdVar.j(g9zVar, Integer.valueOf(i), fetVar5, Integer.valueOf(iIntValue5 & 14));
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                ams0 ams0Var2 = (ams0) obj;
                fet fetVar6 = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar6.e0(431650961);
                ArrayList arrayList2 = ((o0d0) obj4).f24419a;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    boq0 boq0Var = (boq0) arrayList2.get(i2);
                    Integer numValueOf2 = Integer.valueOf(boq0Var.f2948a);
                    int i3 = boq0Var.b;
                    p0d0 p0d0Var = boq0Var.e;
                    if (p0d0Var instanceof t0d0) {
                        imy imyVar = new imy();
                        imyVar.f15048a = i3;
                        ArrayList arrayList4 = ((t0d0) p0d0Var).b;
                        int size2 = arrayList4.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            dmy dmyVar = (dmy) arrayList4.get(i4);
                            imyVar.a((int) (dmyVar.f6340a * i3), dmyVar.b).b = dmyVar.c;
                            i4++;
                            ams0Var2 = ams0Var2;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        ams0Var = ams0Var2;
                        objF0 = new jmy(imyVar);
                    } else {
                        arrayList = arrayList2;
                        ams0Var = ams0Var2;
                        if (!(p0d0Var instanceof s0d0)) {
                            e9d0.r(p0d0Var, "Unexpected value type: ");
                            return null;
                        }
                        imy imyVar2 = new imy();
                        imyVar2.f15048a = i3;
                        ArrayList arrayList5 = ((s0d0) p0d0Var).b;
                        int size3 = arrayList5.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            dmy dmyVar2 = (dmy) arrayList5.get(i5);
                            imyVar2.a((int) (i3 * dmyVar2.f6340a), dmyVar2.b).b = dmyVar2.c;
                            i5++;
                            arrayList5 = arrayList5;
                        }
                        objF0 = new jmy(imyVar2);
                    }
                    int i6 = boq0Var.c;
                    if (i6 != 0) {
                        objF0 = ro4.f0(i6 == -1 ? Integer.MAX_VALUE : i6 + 1, objF0, boq0Var.d, 8);
                    }
                    arrayList3.add(new Pair(numValueOf2, objF0));
                    i2++;
                    ams0Var2 = ams0Var;
                    arrayList2 = arrayList;
                }
                j7d j7dVar = new j7d(arrayList3);
                Object zag0Var = ((Boolean) ams0Var2.b()).booleanValue() ? j7dVar : new zag0(j7dVar, i);
                fetVar6.r(false);
                return zag0Var;
        }
    }

    public /* synthetic */ z30(Object obj, int i, byte b) {
        this.f43695a = b;
        this.c = obj;
        this.b = i;
    }
}
