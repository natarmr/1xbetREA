package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class en80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8081a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ en80(float f, Function2 function2, Function2 function3, xdr xdrVar, l7m0 l7m0Var) {
        this.f8081a = (byte) 3;
        this.b = f;
        this.c = function2;
        this.d = function3;
        this.e = xdrVar;
        this.f = l7m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0298  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r4;
        mm40 mm40VarW;
        boolean zG;
        Object objP;
        boolean zG2;
        Object objP2;
        boolean z;
        byte b = this.f8081a;
        cl5 cl5Var = ukd.f35823a;
        float f = this.b;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        int i = 3;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i2 = 6;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj6;
                ycl yclVar = (ycl) obj5;
                wcp0 wcp0Var = (wcp0) obj4;
                w6n w6nVar = (w6n) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
                    thg0 thg0VarA = shg0.a(new qw3(f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
                    pcp0 pcp0Var = (pcp0) wcp0Var;
                    b8k0.k(pcp0Var.f26771a, pcp0Var.b, w6nVar, fetVar);
                    fetVar.r(true);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    if (yclVar != null) {
                        mm40VarW = o7k0.e(jm40Var, yclVar.f42389a);
                        r4 = 0;
                    } else {
                        r4 = 0;
                        mm40VarW = o7k0.w(jm40Var, null, false, 3);
                    }
                    fgp0.a(r4, fetVar, mm40VarD.e(mm40VarW), pcp0Var.c);
                    fetVar.e0(1455144873);
                    fetVar.r(r4);
                    fetVar.e0(1455392161);
                    zq8.a(r4, fetVar, o7k0.e(jm40Var, 14.0f));
                    fetVar.r(r4);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                List list = (List) obj6;
                List list2 = (List) obj5;
                xdr xdrVar = (xdr) obj4;
                Function2 function2 = (Function2) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "WHEEL_ROW");
                    zcl zclVar2 = qmk.f28987a;
                    thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                    cl5 cl5Var2 = cl5Var;
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, gqw0.v);
                    fetVar2.e0(-454275991);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue3 = ((Number) it.next()).intValue();
                        t9v0 t9v0Var = (t9v0) list2.get(iIntValue3);
                        int iOrdinal = t9v0Var.f33588a.ordinal();
                        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != i && iOrdinal != 4) {
                            boolean z2 = iOrdinal == i2;
                            x7z x7zVar = new x7z(1.0f, true);
                            SnapshotStateList snapshotStateList = t9v0Var.b;
                            boolean z3 = t9v0Var.g;
                            int i3 = t9v0Var.f;
                            okt0 okt0Var = t9v0Var.d;
                            zG = fetVar2.g(xdrVar) | fetVar2.e(iIntValue3);
                            objP = fetVar2.P();
                            cl5 cl5Var3 = cl5Var2;
                            if (zG || objP == cl5Var3) {
                                objP = new nb50(xdrVar, iIntValue3, (byte) 9);
                                fetVar2.o0(objP);
                            }
                            Function2 function3 = (Function2) objP;
                            zG2 = fetVar2.g(function2) | fetVar2.e(iIntValue3);
                            objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var3) {
                                objP2 = new ran(function2, iIntValue3, (byte) 1);
                                fetVar2.o0(objP2);
                            }
                            ys90.a(x7zVar, snapshotStateList, z3, this.b, i3, null, okt0Var, z2, function3, (Function1) objP2, fetVar2, 2097152);
                            cl5Var2 = cl5Var3;
                            i = 3;
                            i2 = 6;
                        }
                        x7z x7zVar2 = new x7z(1.0f, true);
                        SnapshotStateList snapshotStateList2 = t9v0Var.b;
                        boolean z4 = t9v0Var.g;
                        int i4 = t9v0Var.f;
                        okt0 okt0Var2 = t9v0Var.d;
                        zG = fetVar2.g(xdrVar) | fetVar2.e(iIntValue3);
                        objP = fetVar2.P();
                        cl5 cl5Var4 = cl5Var2;
                        if (zG) {
                            objP = new nb50(xdrVar, iIntValue3, (byte) 9);
                            fetVar2.o0(objP);
                        } else {
                            objP = new nb50(xdrVar, iIntValue3, (byte) 9);
                            fetVar2.o0(objP);
                        }
                        Function2 function4 = (Function2) objP;
                        zG2 = fetVar2.g(function2) | fetVar2.e(iIntValue3);
                        objP2 = fetVar2.P();
                        if (zG2) {
                            objP2 = new ran(function2, iIntValue3, (byte) 1);
                            fetVar2.o0(objP2);
                        } else {
                            objP2 = new ran(function2, iIntValue3, (byte) 1);
                            fetVar2.o0(objP2);
                        }
                        ys90.a(x7zVar2, snapshotStateList2, z4, this.b, i4, null, okt0Var2, z2, function4, (Function1) objP2, fetVar2, 2097152);
                        cl5Var2 = cl5Var4;
                        i = 3;
                        i2 = 6;
                    }
                    fetVar2.r(false);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ro4.R((mm40) obj6, (hqq0) obj5, (vj50) obj4, this.b, (xcz) obj3, (fet) obj, x8x.L(1));
                break;
            case 3:
                Function2 function5 = (Function2) obj6;
                Function2 function6 = (Function2) obj5;
                xdr xdrVar2 = (xdr) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zD = fetVar3.d(f);
                    Object objP3 = fetVar3.P();
                    if (zD || objP3 == cl5Var) {
                        objP3 = new e63(f, function5, l7m0Var, (byte) 1);
                        fetVar3.o0(objP3);
                    }
                    tj30 tj30Var = (tj30) objP3;
                    int iHashCode4 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM4 = fetVar3.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar3, jm40Var);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar3, tj30Var, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar3, bh90VarM4, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar3, numValueOf2, shdVar7);
                    jpm0.n(fetVar3);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar3, mm40VarC3, shdVar8);
                    zx7 zx7Var = gqw0.f11754a;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode5 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM5 = fetVar3.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar3, jm40Var);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC, shdVar5);
                    jpm0.o(fetVar3, bh90VarM5, shdVar6);
                    vqd.u(iHashCode5, fetVar3, shdVar7, fetVar3);
                    jpm0.o(fetVar3, mm40VarC4, shdVar8);
                    function6.invoke(fetVar3, 6);
                    fetVar3.r(true);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode6 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM6 = fetVar3.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar3, jm40Var);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, shdVar5);
                    jpm0.o(fetVar3, bh90VarM6, shdVar6);
                    vqd.u(iHashCode6, fetVar3, shdVar7, fetVar3);
                    jpm0.o(fetVar3, mm40VarC5, shdVar8);
                    xdrVar2.F(s5x0.u(0.0f, 0.0f, 0.0f, 0.0f, 13), fetVar3, 54);
                    fetVar3.r(true);
                    if (function5 != null) {
                        fetVar3.e0(883627624);
                        tj30 tj30VarC3 = zq8.c(zx7Var, false);
                        int iHashCode7 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM7 = fetVar3.m();
                        mm40 mm40VarC6 = kbc.c0(fetVar3, jm40Var);
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC3, shdVar5);
                        jpm0.o(fetVar3, bh90VarM7, shdVar6);
                        vqd.u(iHashCode7, fetVar3, shdVar7, fetVar3);
                        jpm0.o(fetVar3, mm40VarC6, shdVar8);
                        function5.invoke(fetVar3, 6);
                        z = true;
                        fetVar3.r(true);
                        fetVar3.r(false);
                    } else {
                        z = true;
                        fetVar3.e0(883760242);
                        fetVar3.r(false);
                    }
                    fetVar3.r(z);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jtm0.a((mm40) obj6, (woh) obj5, (l7m0) obj4, this.b, (lh80) obj3, (fet) obj, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ en80(mm40 mm40Var, float f, ycl yclVar, wcp0 wcp0Var, w6n w6nVar) {
        this.f8081a = (byte) 0;
        this.c = mm40Var;
        this.b = f;
        this.d = yclVar;
        this.e = wcp0Var;
        this.f = w6nVar;
    }

    public /* synthetic */ en80(mm40 mm40Var, Object obj, Object obj2, float f, Object obj3, int i, byte b) {
        this.f8081a = b;
        this.c = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.b = f;
        this.f = obj3;
    }

    public /* synthetic */ en80(List list, List list2, float f, xdr xdrVar, Function2 function2) {
        this.f8081a = (byte) 1;
        this.c = list;
        this.d = list2;
        this.b = f;
        this.e = xdrVar;
        this.f = function2;
    }
}
