package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x1i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40123a;
    public final /* synthetic */ u1i b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ u1i d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ x1i(u1i u1iVar, u1i u1iVar2, Function0 function0, Function0 function1) {
        this.f40123a = (byte) 2;
        this.b = u1iVar;
        this.d = u1iVar2;
        this.c = function0;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gzl gzlVar;
        gzl gzlVar2;
        gzl gzlVar3;
        gzl gzlVar4;
        gzl gzlVar5;
        gzl gzlVar6;
        byte b = this.f40123a;
        cl5 cl5Var = ukd.f35823a;
        u1i u1iVar = this.d;
        u1i u1iVar2 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    String strA = u1iVar2.a();
                    boolean zG = fetVar.g(u1iVar2);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        if (u1iVar2 instanceof r1i) {
                            gzlVar = gzl.f12184a;
                        } else if (u1iVar2 instanceof s1i) {
                            gzlVar = gzl.b;
                        } else {
                            if (!(u1iVar2 instanceof t1i)) {
                                t9f.b();
                                return null;
                            }
                            gzlVar = gzl.c;
                        }
                        objP = gzlVar;
                        fetVar.o0(objP);
                    }
                    obc.o(mm40VarN, strA, (gzl) objP, gqw0.m, this.c, fetVar, 3072);
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    String strA2 = u1iVar.a();
                    boolean zG2 = fetVar.g(u1iVar);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        if (u1iVar instanceof r1i) {
                            gzlVar2 = gzl.f12184a;
                        } else if (u1iVar instanceof s1i) {
                            gzlVar2 = gzl.b;
                        } else {
                            if (!(u1iVar instanceof t1i)) {
                                t9f.b();
                                return null;
                            }
                            gzlVar2 = gzl.c;
                        }
                        objP2 = gzlVar2;
                        fetVar.o0(objP2);
                    }
                    obc.o(mm40VarN2, strA2, (gzl) objP2, gqw0.o, this.e, fetVar, 3072);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    String strA3 = u1iVar2.a();
                    boolean zG3 = fetVar2.g(u1iVar2);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        if (u1iVar2 instanceof r1i) {
                            gzlVar3 = gzl.f12184a;
                        } else if (u1iVar2 instanceof s1i) {
                            gzlVar3 = gzl.b;
                        } else {
                            if (!(u1iVar2 instanceof t1i)) {
                                t9f.b();
                                return null;
                            }
                            gzlVar3 = gzl.c;
                        }
                        objP3 = gzlVar3;
                        fetVar2.o0(objP3);
                    }
                    obc.o(mm40VarN3, strA3, (gzl) objP3, gqw0.m, this.c, fetVar2, 3072);
                    mm40 mm40VarN4 = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    String strA4 = u1iVar.a();
                    boolean zG4 = fetVar2.g(u1iVar);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        if (u1iVar instanceof r1i) {
                            gzlVar4 = gzl.f12184a;
                        } else if (u1iVar instanceof s1i) {
                            gzlVar4 = gzl.b;
                        } else {
                            if (!(u1iVar instanceof t1i)) {
                                t9f.b();
                                return null;
                            }
                            gzlVar4 = gzl.c;
                        }
                        objP4 = gzlVar4;
                        fetVar2.o0(objP4);
                    }
                    obc.o(mm40VarN4, strA4, (gzl) objP4, gqw0.o, this.e, fetVar2, 3072);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v3c.g(this.b, this.d, this.c, this.e, fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarN5 = s5x0.N(jm40Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    String strA5 = u1iVar2.a();
                    boolean zG5 = fetVar4.g(u1iVar2);
                    Object objP5 = fetVar4.P();
                    if (zG5 || objP5 == cl5Var) {
                        if (u1iVar2 instanceof r1i) {
                            gzlVar5 = gzl.f12184a;
                        } else if (u1iVar2 instanceof s1i) {
                            gzlVar5 = gzl.b;
                        } else {
                            if (!(u1iVar2 instanceof t1i)) {
                                t9f.b();
                                return null;
                            }
                            gzlVar5 = gzl.c;
                        }
                        objP5 = gzlVar5;
                        fetVar4.o0(objP5);
                    }
                    obc.o(mm40VarN5, strA5, (gzl) objP5, gqw0.m, this.c, fetVar4, 3072);
                    mm40 mm40VarN6 = s5x0.N(jm40Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    String strA6 = u1iVar.a();
                    boolean zG6 = fetVar4.g(u1iVar);
                    Object objP6 = fetVar4.P();
                    if (zG6 || objP6 == cl5Var) {
                        if (u1iVar instanceof r1i) {
                            gzlVar6 = gzl.f12184a;
                        } else if (u1iVar instanceof s1i) {
                            gzlVar6 = gzl.b;
                        } else {
                            if (!(u1iVar instanceof t1i)) {
                                t9f.b();
                                return null;
                            }
                            gzlVar6 = gzl.c;
                        }
                        objP6 = gzlVar6;
                        fetVar4.o0(objP6);
                    }
                    obc.o(mm40VarN6, strA6, (gzl) objP6, gqw0.o, this.e, fetVar4, 3072);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                v3c.g(this.b, this.d, this.c, this.e, (fet) obj, x8x.L(7));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ x1i(u1i u1iVar, u1i u1iVar2, Function0 function0, Function0 function1, int i) {
        this.f40123a = (byte) 4;
        this.b = u1iVar;
        this.d = u1iVar2;
        this.c = function0;
        this.e = function1;
    }

    public /* synthetic */ x1i(u1i u1iVar, Function0 function0, u1i u1iVar2, Function0 function1, byte b) {
        this.f40123a = b;
        this.b = u1iVar;
        this.c = function0;
        this.d = u1iVar2;
        this.e = function1;
    }
}
