package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f6b implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9000a;
    public final /* synthetic */ long b;
    public final /* synthetic */ w6b c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ f6b(long j, w6b w6bVar, Function1 function1, byte b) {
        this.f9000a = b;
        this.b = j;
        this.c = w6bVar;
        this.d = function1;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0260  */
    /* JADX WARN: Code duplicated, block: B:151:0x0286  */
    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        float f;
        float f2;
        boolean z;
        int i2;
        float f3;
        byte b = this.f9000a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.d;
        w6b w6bVar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                int i3 = 2;
                m3b m3bVar = (m3b) obj;
                a4x a4xVar = (a4x) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fet fetVar = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                m3bVar.getClass();
                a4xVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (fetVar.g(m3bVar)) {
                        i3 = 4;
                    }
                    i = i3 | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.g(a4xVar) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar.e(iIntValue) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1171) != 1170)) {
                    mm40 mm40VarQ = i120.Q(jm40Var, j, jd8.n);
                    y2b y2bVar = (y2b) CollectionsKt.W(iIntValue - 1, a4xVar);
                    if (y2bVar == null) {
                        zcl zclVar = qmk.f28987a;
                        f = 0.0f;
                    } else if (y2bVar instanceof m3b) {
                        zcl zclVar2 = qmk.f28987a;
                        f = 6.0f;
                    } else if (y2bVar instanceof x5b) {
                        zcl zclVar3 = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                        f = 0.0f;
                    }
                    y2b y2bVar2 = (y2b) CollectionsKt.W(iIntValue + 1, a4xVar);
                    if (y2bVar2 == null) {
                        f2 = 0.0f;
                    } else if (y2bVar2 instanceof m3b) {
                        f2 = 2.0f;
                    } else if (y2bVar2 instanceof x5b) {
                        f2 = 12.0f;
                    } else if (y2bVar2 instanceof d4b) {
                        f2 = 8.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, f, 0.0f, f2, 5);
                    d4n d4nVar = m3bVar.f21106a;
                    boolean zA = w6bVar.a();
                    int i4 = i & 14;
                    boolean zG = fetVar.g(function1) | (i4 == 4);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        z = false;
                        objP = new h6b(function1, m3bVar, (byte) 0);
                        fetVar.o0(objP);
                    } else {
                        z = false;
                    }
                    Function1 function2 = (Function1) objP;
                    boolean zG2 = fetVar.g(function1) | (i4 == 4 ? true : z);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new h6b(function1, m3bVar, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    agc.t(mm40VarN, d4nVar, zA, function2, (Function1) objP2, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                m3b m3bVar2 = (m3b) obj;
                a4x a4xVar2 = (a4x) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fet fetVar2 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                m3bVar2.getClass();
                a4xVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(m3bVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.g(a4xVar2) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 256 : 128;
                }
                int i5 = i2;
                if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
                    int i6 = iIntValue3 + 1;
                    mm40 mm40VarI = jm40Var;
                    if (((y2b) CollectionsKt.W(i6, a4xVar2)) instanceof d4b) {
                        zcl zclVar5 = qmk.f28987a;
                        zcl zclVar6 = qmk.i;
                        mm40VarI = dw9.i(zclVar5, zclVar5, zclVar6, zclVar6, jm40Var);
                    }
                    mm40 mm40VarQ2 = i120.Q(mm40VarI, j, jd8.n);
                    if (((y2b) CollectionsKt.W(iIntValue3 - 1, a4xVar2)) instanceof x5b) {
                        zcl zclVar7 = qmk.f28987a;
                        f3 = 2.0f;
                    } else {
                        zcl zclVar8 = qmk.f28987a;
                        f3 = 0.0f;
                    }
                    y2b y2bVar3 = (y2b) CollectionsKt.W(i6, a4xVar2);
                    mm40 mm40VarM = s5x0.M(mm40VarQ2, 8.0f, f3, 8.0f, (y2bVar3 != null && ((y2bVar3 instanceof x5b) || (y2bVar3 instanceof d4b))) ? 2.0f : 0.0f);
                    d4n d4nVar2 = m3bVar2.f21106a;
                    boolean zA2 = w6bVar.a();
                    int i7 = i5 & 14;
                    boolean zG3 = fetVar2.g(function1) | (i7 == 4);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new h6b(function1, m3bVar2, (byte) 3);
                        fetVar2.o0(objP3);
                    }
                    Function1 function3 = (Function1) objP3;
                    boolean zG4 = fetVar2.g(function1) | (i7 == 4);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new h6b(function1, m3bVar2, (byte) 2);
                        fetVar2.o0(objP4);
                    }
                    agc.t(mm40VarM, d4nVar2, zA2, function3, (Function1) objP4, fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                m3b m3bVar3 = (m3b) obj;
                ((Integer) obj3).getClass();
                fet fetVar3 = (fet) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                m3bVar3.getClass();
                ((a4x) obj2).getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar3.g(m3bVar3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue5 & 1, (iIntValue5 & 1027) != 1026)) {
                    mm40 mm40VarQ3 = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarQ3, 8.0f, 0.0f, 2);
                    d4n d4nVar3 = m3bVar3.f21106a;
                    boolean zA3 = w6bVar.a();
                    int i8 = iIntValue5 & 14;
                    boolean zG5 = fetVar3.g(function1) | (i8 == 4);
                    Object objP5 = fetVar3.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new h6b(function1, m3bVar3, (byte) 4);
                        fetVar3.o0(objP5);
                    }
                    Function1 function4 = (Function1) objP5;
                    boolean zG6 = fetVar3.g(function1) | (i8 == 4);
                    Object objP6 = fetVar3.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new h6b(function1, m3bVar3, (byte) 5);
                        fetVar3.o0(objP6);
                    }
                    agc.t(mm40VarL, d4nVar3, zA3, function4, (Function1) objP6, fetVar3, 0, 0);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
