package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ng90 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23474a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ ng90(List list, xdr xdrVar, ugd ugdVar, byte b) {
        this.f23474a = b;
        this.b = list;
        this.c = xdrVar;
        this.d = ugdVar;
    }

    /* JADX WARN: Failed to calculate best type for var: r2v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v27 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v27 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v27 a.fet, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        byte b = this.f23474a;
        ugd ugdVar = this.d;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        List list = this.b;
        xdr xdrVar = this.c;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    xd90 xd90Var = (xd90) list.get(iIntValue);
                    fetVar.e0(-1691197502);
                    mm40 mm40VarA = g9zVar.a(jm40Var, ro4.m0(250, 50, null, 4), ro4.g0(0.5f, 200.0f, null, 4), ro4.m0(100, 50, null, 4));
                    xx7 xx7Var = gqw0.n;
                    zcl zclVar = qmk.f28987a;
                    x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    if (xdrVar == null) {
                        fetVar.e0(-1070580478);
                        z = false;
                    } else {
                        z = false;
                        fetVar.e0(1212391135);
                        xdrVar.F(xd90Var.c, fetVar, 0);
                    }
                    fetVar.r(z);
                    ugdVar.j(xd90Var.f40683a, xd90Var.b, fetVar, 0);
                    fetVar.r(true);
                    fetVar.r(z);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    yd90 yd90Var = (yd90) list.get(iIntValue3);
                    fetVar2.e0(-1054590982);
                    mm40 mm40VarA2 = g9zVar2.a(jm40Var, ro4.m0(250, 50, null, 4), ro4.g0(0.5f, 200.0f, null, 4), ro4.m0(100, 50, null, 4));
                    xx7 xx7Var2 = gqw0.n;
                    zcl zclVar2 = qmk.f28987a;
                    x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var2, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    if (xdrVar == null) {
                        fetVar2.e0(2113607454);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar2.e0(1592201539);
                        xdrVar.F(yd90Var.c, fetVar2, 0);
                    }
                    fetVar2.r(z2);
                    ugdVar.j(yd90Var.f42423a, yd90Var.b, fetVar2, 0);
                    fetVar2.r(true);
                    fetVar2.r(z2);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    wd90 wd90Var = (wd90) list.get(iIntValue5);
                    fetVar3.e0(-1446222812);
                    mm40 mm40VarA3 = g9zVar3.a(jm40Var, ro4.m0(250, 50, null, 4), ro4.g0(0.5f, 200.0f, null, 4), ro4.m0(100, 50, null, 4));
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.n, fetVar3, 48);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarA3);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    if (xdrVar == null) {
                        fetVar3.e0(613743941);
                        z3 = false;
                        fetVar3.r(false);
                    } else {
                        z3 = false;
                        fetVar3.e0(613743942);
                        xdrVar.F(wd90Var.c, fetVar3, 0);
                        fetVar3.r(false);
                    }
                    ugdVar.j(wd90Var.f38963a, wd90Var.b, fetVar3, 0);
                    fetVar3.r(true);
                    fetVar3.r(z3);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar4.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    ae90 ae90Var = (ae90) list.get(iIntValue7);
                    fetVar4.e0(-1046906110);
                    mm40 mm40VarA4 = g9zVar4.a(jm40Var, ro4.m0(250, 50, null, 4), ro4.g0(0.5f, 200.0f, null, 4), ro4.m0(100, 50, null, 4));
                    xx7 xx7Var3 = gqw0.n;
                    zcl zclVar3 = qmk.f28987a;
                    x5d x5dVarA4 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var3, fetVar4, 48);
                    int iHashCode4 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM4 = fetVar4.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarA4);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA4, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC3, gqw0.v);
                    if (ae90Var != null) {
                        if (ae90Var instanceof ud90) {
                            fetVar4.e0(1176254332);
                            if (xdrVar == null) {
                                fetVar4.e0(1176283812);
                                z4 = false;
                            } else {
                                z4 = false;
                                fetVar4.e0(2116154621);
                                xdrVar.F(null, fetVar4, 0);
                            }
                            fetVar4.r(z4);
                            ugdVar.j(null, null, fetVar4, 0);
                            fetVar4.r(z4);
                        } else {
                            z4 = false;
                            if (ae90Var instanceof vd90) {
                                fetVar4.e0(2116160697);
                                vd90 vd90Var = (vd90) ae90Var;
                                ugdVar.j(vd90Var.f37221a, vd90Var.b, fetVar4, 0);
                                fetVar4.r(false);
                            }
                        }
                        fetVar4.r(true);
                        fetVar4.r(z4);
                    } else {
                        z4 = false;
                    }
                    throw b1j.f(2116151632, fetVar4, z4);
                }
                fetVar4.X();
                return Unit.f46060a;
            default:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar5.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                int i6 = i5;
                if (fetVar5.U(i6 & 1, (i6 & 147) != 146)) {
                    zd90 zd90Var = (zd90) list.get(iIntValue9);
                    fetVar5.e0(-1523555691);
                    mm40 mm40VarA5 = g9zVar5.a(jm40Var, ro4.m0(250, 50, null, 4), ro4.g0(0.5f, 200.0f, null, 4), ro4.m0(100, 50, null, 4));
                    xx7 xx7Var4 = gqw0.n;
                    zcl zclVar4 = qmk.f28987a;
                    x5d x5dVarA5 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var4, fetVar5, 48);
                    int iHashCode5 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM5 = fetVar5.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar5, mm40VarA5);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA5, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC4, gqw0.v);
                    if (xdrVar == null) {
                        fetVar5.e0(530758997);
                    } else {
                        fetVar5.e0(-2061088724);
                        xdrVar.F(zd90Var.c, fetVar5, 0);
                    }
                    fetVar5.r(r18);
                    ugdVar.j(zd90Var.f44202a, zd90Var.b, fetVar5, 0);
                    fetVar5.r(true);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
        }
    }
}
