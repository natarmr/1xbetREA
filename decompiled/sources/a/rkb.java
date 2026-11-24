package a;

import android.content.res.Configuration;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rkb implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30640a;
    public final /* synthetic */ qdz b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ rkb(qdz qdzVar, Function1 function1, byte b) {
        this.f30640a = b;
        this.b = qdzVar;
        this.c = function1;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        float f;
        p6t0 p6t0Var = (p6t0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        p6t0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(p6t0Var) ? 4 : 2;
        }
        if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            fetVar.X();
        } else if (p6t0Var instanceof psv) {
            fetVar.e0(-994969263);
            ozb.z((psv) p6t0Var, null, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else {
            boolean z = p6t0Var instanceof ti40;
            jm40 jm40Var = jm40.b;
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(-994838226);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                m7m m7mVar = ((ti40) p6t0Var).f33991a;
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j = ijg.J0;
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new o240((byte) 8);
                    fetVar.o0(objP);
                }
                Function2 function2 = (Function2) objP;
                boolean zG = fetVar.g(function1);
                Object objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    objP2 = new x6s(function1, (byte) 17);
                    fetVar.o0(objP2);
                }
                wvb.p(mm40VarN, m7mVar, true, j, function2, (Function2) objP2, fetVar, 24960);
                fetVar.r(false);
            } else if (p6t0Var instanceof si40) {
                fetVar.e0(-994294393);
                bdx.l(null, (si40) p6t0Var, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else if (p6t0Var instanceof ii40) {
                fetVar.e0(-994186885);
                if (pkd.d(fetVar)) {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    f = 8.0f;
                }
                x9x.n(o7k0.d(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), (ii40) p6t0Var, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else {
                boolean z2 = p6t0Var instanceof gj40;
                qdz qdzVar = this.b;
                if (z2) {
                    fetVar.e0(-993884821);
                    wdx.p(null, (gj40) p6t0Var, qdzVar.b("PICK_BAN", new o240((byte) 9), fetVar, 0), fetVar, (iIntValue << 3) & 112);
                    fetVar.r(false);
                } else {
                    byte b = 10;
                    if (p6t0Var instanceof boo0) {
                        fetVar.e0(-993636821);
                        boo0 boo0Var = (boo0) p6t0Var;
                        boolean zG2 = fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG2 || objP3 == cl5Var) {
                            objP3 = new rp30(function1, (byte) 10);
                            fetVar.o0(objP3);
                        }
                        cem0.g(null, boo0Var, (Function1) objP3, fetVar, (iIntValue << 3) & 112, 1);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof wj40) {
                        fetVar.e0(-993407421);
                        xdx.e(null, (wj40) p6t0Var, fetVar, (iIntValue << 3) & 112);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof xk40) {
                        fetVar.e0(-993292876);
                        zcl zclVar4 = qmk.f28987a;
                        n6m.b(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), ((xk40) p6t0Var).b, fetVar, 0, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof ui40) {
                        fetVar.e0(-993012698);
                        bfb.p(null, ((ui40) p6t0Var).f35712a, qdzVar.c("GOLD_CHART", new o240(b), fetVar, 0), fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-992786553);
                        fetVar.r(false);
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        p6t0 p6t0Var = (p6t0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        p6t0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(p6t0Var) ? 4 : 2;
        }
        if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            fetVar.X();
        } else if (p6t0Var instanceof psv) {
            fetVar.e0(1707087427);
            ozb.z((psv) p6t0Var, null, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else {
            boolean z = p6t0Var instanceof boo0;
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1707165857);
                boo0 boo0Var = (boo0) p6t0Var;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new dvd0(function1, (byte) 2);
                    fetVar.o0(objP);
                }
                cem0.g(null, boo0Var, (Function1) objP, fetVar, (iIntValue << 3) & 112, 1);
                fetVar.r(false);
            } else if (p6t0Var instanceof ifa0) {
                fetVar.e0(1707386484);
                ifa0 ifa0Var = (ifa0) p6t0Var;
                boolean zG2 = fetVar.g(function1);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new nmf(function1, (byte) 3);
                    fetVar.o0(objP2);
                }
                cww.i(null, ifa0Var, (x0a0) objP2, false, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else if (p6t0Var instanceof jlo0) {
                fetVar.e0(1707709101);
                n8n0.c(null, (jlo0) p6t0Var, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else {
                boolean z2 = p6t0Var instanceof hgg0;
                qdz qdzVar = this.b;
                if (z2) {
                    fetVar.e0(1707817694);
                    hgg0 hgg0Var = (hgg0) p6t0Var;
                    boolean zG3 = fetVar.g(function1);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new dvd0(function1, (byte) 3);
                        fetVar.o0(objP3);
                    }
                    e9x.x(null, hgg0Var, qdzVar, (Function1) objP3, fetVar, (iIntValue << 3) & 112, 1);
                    fetVar.r(false);
                } else if (p6t0Var instanceof kbm0) {
                    fetVar.e0(1708152370);
                    ibm0.a(null, (kbm0) p6t0Var, fetVar, (iIntValue << 3) & 112);
                    fetVar.r(false);
                } else if (p6t0Var instanceof qud0) {
                    fetVar.e0(1708253523);
                    wb.s((qud0) p6t0Var, qdzVar, fetVar, iIntValue & 14);
                    fetVar.r(false);
                } else if (p6t0Var instanceof m2z) {
                    fetVar.e0(1708453194);
                    m2z m2zVar = (m2z) p6t0Var;
                    boolean zG4 = fetVar.g(function1);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new dvd0(function1, (byte) 4);
                        fetVar.o0(objP4);
                    }
                    Function1 function2 = (Function1) objP4;
                    boolean zG5 = fetVar.g(function1);
                    Object objP5 = fetVar.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new evd0(function1, (byte) 0);
                        fetVar.o0(objP5);
                    }
                    c3x.c(m2zVar, function2, (Function0) objP5, fetVar, iIntValue & 14);
                    fetVar.r(false);
                } else if (p6t0Var instanceof wy) {
                    fetVar.e0(1708885954);
                    Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
                    a4x a4xVar = ((wy) p6t0Var).b;
                    boolean zI = fetVar.i(configuration) | fetVar.g(function1);
                    Object objP6 = fetVar.P();
                    if (zI || objP6 == cl5Var) {
                        objP6 = new oac0(configuration, function1, (byte) 15);
                        fetVar.o0(objP6);
                    }
                    ay3.c(a4xVar, (Function1) objP6, fetVar, 8);
                    fetVar.r(false);
                } else if (p6t0Var instanceof up20) {
                    fetVar.e0(1709492221);
                    t9x.g((up20) p6t0Var, fetVar, iIntValue & 14);
                    fetVar.r(false);
                } else if (p6t0Var instanceof bdd) {
                    fetVar.e0(1709584601);
                    wvb.e((bdd) p6t0Var, fetVar, iIntValue & 14);
                    fetVar.r(false);
                } else if (p6t0Var instanceof add) {
                    fetVar.e0(1709682871);
                    dub.h((add) p6t0Var, fetVar, iIntValue & 14);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1709746607);
                    fetVar.r(false);
                }
            }
        }
        return Unit.f46060a;
    }

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
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        cl5 cl5Var;
        byte b = this.f30640a;
        byte b2 = 10;
        jm40 jm40Var = jm40.b;
        byte b3 = 5;
        qdz qdzVar = this.b;
        Function1 function1 = this.c;
        cl5 cl5Var2 = ukd.f35823a;
        byte b4 = 4;
        byte b5 = 3;
        switch (b) {
            case 0:
                p6t0 p6t0Var = (p6t0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                p6t0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(p6t0Var) ? 4 : 2;
                }
                if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar.X();
                } else if (p6t0Var instanceof akb) {
                    fetVar.e0(613792499);
                    akb akbVar = (akb) p6t0Var;
                    int i = iIntValue << 3;
                    qdzVar.getClass();
                    function1.getClass();
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10);
                    jjm jjmVar = akbVar.b;
                    kjm kjmVar = kjm.f18392a;
                    boolean zG = ((((i & 112) ^ 48) > 32 && fetVar.g(akbVar)) || (i & 48) == 32) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var2) {
                        objP = new yw9(function1, akbVar, (byte) 6);
                        fetVar.o0(objP);
                    }
                    nkb.h(mm40VarN, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    vb90 vb90Var = akbVar.c;
                    xcz xczVarB = qdzVar.b(akbVar.f1014a, new pua((byte) 21), fetVar, 0);
                    lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var2) {
                        objP2 = new xz8(function1, (byte) 28);
                        fetVar.o0(objP2);
                    }
                    zvw.k(mm40VarD2, vb90Var, false, xczVarB, lh80VarT, (Function1) objP2, fetVar, 390, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                } else if (p6t0Var instanceof ikb) {
                    fetVar.e0(614044653);
                    gkb.b(null, (ikb) p6t0Var, function1, fetVar, (iIntValue << 3) & 112);
                    fetVar.r(false);
                } else if (p6t0Var instanceof ykb) {
                    fetVar.e0(614240821);
                    xkb.e(null, (ykb) p6t0Var, fetVar, (iIntValue << 3) & 112);
                    fetVar.r(false);
                } else if (p6t0Var instanceof dkb) {
                    fetVar.e0(614399820);
                    ckb.d(null, (dkb) p6t0Var, function1, fetVar, (iIntValue << 3) & 112);
                    fetVar.r(false);
                } else {
                    fetVar.e0(614553890);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                p6t0 p6t0Var2 = (p6t0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                p6t0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(p6t0Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean z = p6t0Var2 instanceof jeg;
                    jm40 jm40Var2 = jm40.b;
                    if (z) {
                        fetVar2.e0(1087091719);
                        mm40 mm40VarL = s5x0.L(jm40Var2, xfn.a(fetVar2).e, 0.0f, 2);
                        jeg jegVar = (jeg) p6t0Var2;
                        Object objP3 = fetVar2.P();
                        if (objP3 == cl5Var2) {
                            objP3 = new jcg((byte) 10);
                            fetVar2.o0(objP3);
                        }
                        hic.d(mm40VarL, jegVar, (Function0) objP3, fetVar2, ((iIntValue2 << 3) & 112) | 384);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof ieg) {
                        fetVar2.e0(1087448033);
                        ieg iegVar = (ieg) p6t0Var2;
                        qdzVar.getClass();
                        Function1 function2 = this.c;
                        function2.getClass();
                        zvw.k(jm40Var2, iegVar.b, false, qdzVar.b(iegVar.f14632a, new jyf((byte) 17), fetVar2, 0), s5x0.t(xfn.a(fetVar2).c, 0.0f, 2), function2, fetVar2, 390, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1087724150);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                p6t0 p6t0Var3 = (p6t0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                p6t0Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(p6t0Var3) ? 4 : 2;
                }
                if (!fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    fetVar3.X();
                } else if (p6t0Var3 instanceof vvp) {
                    fetVar3.e0(757241097);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarD3, xfn.a(fetVar3).e, 8.0f, xfn.a(fetVar3).e, 0.0f, 8);
                    hjm hjmVar = ((vvp) p6t0Var3).b;
                    kjm kjmVar2 = kjm.b;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP4 = fetVar3.P();
                    if (zG3 || objP4 == cl5Var2) {
                        objP4 = new mfp(function1, (byte) 23);
                        fetVar3.o0(objP4);
                    }
                    nkb.h(mm40VarN2, hjmVar, kjmVar2, null, (Function0) objP4, null, fetVar3, 384, 40);
                    fetVar3.r(false);
                } else if (p6t0Var3 instanceof q4t0) {
                    fetVar3.e0(757874241);
                    q4t0 q4t0Var = (q4t0) p6t0Var3;
                    xcz xczVarB2 = qdzVar.b(q4t0Var.f28118a, new jbp((byte) 13), fetVar3, 0);
                    lh80 lh80VarT2 = s5x0.t(xfn.a(fetVar3).c, 0.0f, 2);
                    boolean zG4 = fetVar3.g(function1);
                    Object objP5 = fetVar3.P();
                    if (zG4 || objP5 == cl5Var2) {
                        objP5 = new qyo(function1, (byte) 24);
                        fetVar3.o0(objP5);
                    }
                    j5n0.q(null, q4t0Var, xczVarB2, lh80VarT2, (Function1) objP5, fetVar3, ((iIntValue3 << 3) & 112) | 384, 1);
                    fetVar3.r(false);
                } else if (p6t0Var3 instanceof nvp) {
                    fetVar3.e0(758439774);
                    fyl fylVar = ((nvp) p6t0Var3).f24198a;
                    vxl vxlVar = vxl.c;
                    boolean zG5 = fetVar3.g(function1);
                    Object objP6 = fetVar3.P();
                    if (zG5 || objP6 == cl5Var2) {
                        objP6 = new qyo(function1, (byte) 25);
                        fetVar3.o0(objP6);
                    }
                    ebc.r(null, fylVar, vxlVar, (Function1) objP6, null, fetVar3, 3456, 33);
                    fetVar3.r(false);
                } else if (p6t0Var3 instanceof ayp) {
                    fetVar3.e0(758765491);
                    obc.i(s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2), ((ayp) p6t0Var3).f1679a, fetVar3, 0);
                    fetVar3.r(false);
                } else if (p6t0Var3 instanceof mvp) {
                    fetVar3.e0(759070965);
                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                    h3m h3mVar = ((mvp) p6t0Var3).f22469a;
                    fetVar3.e0(953061331);
                    ieb.o(mm40VarL2, h3mVar.f12392a, fetVar3, 48);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else if (p6t0Var3 instanceof nwp) {
                    fetVar3.e0(759374889);
                    mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar3).c, 0.0f, 2);
                    a4x a4xVar = ((nwp) p6t0Var3).f24245a;
                    boolean zG6 = fetVar3.g(function1);
                    Object objP7 = fetVar3.P();
                    if (zG6 || objP7 == cl5Var2) {
                        objP7 = new qyo(function1, (byte) 26);
                        fetVar3.o0(objP7);
                    }
                    vzb.b(mm40VarL3, a4xVar, false, (Function1) objP7, fetVar3, 0, 4);
                    fetVar3.r(false);
                } else {
                    fetVar3.e0(759741340);
                    fetVar3.r(false);
                }
                return Unit.f46060a;
            case 3:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                p6t0 p6t0Var4 = (p6t0) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                p6t0Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(p6t0Var4) ? 4 : 2;
                }
                if (!fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    fetVar4.X();
                } else if (p6t0Var4 instanceof uiw) {
                    fetVar4.e0(-986842980);
                    uiw uiwVar = (uiw) p6t0Var4;
                    function1.getClass();
                    mm40 mm40VarL4 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar4).c, 0.0f, 2);
                    grh grhVar = uiwVar.f35753a;
                    boolean z2 = uiwVar.b;
                    boolean zG7 = fetVar4.g(function1);
                    Object objP8 = fetVar4.P();
                    if (zG7 || objP8 == cl5Var2) {
                        objP8 = new dht(function1, (byte) 20);
                        fetVar4.o0(objP8);
                    }
                    feb.h(mm40VarL4, grhVar, z2, (Function1) objP8, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    boolean z3 = p6t0Var4 instanceof biw;
                    pcy pcyVar = e7z.u1;
                    if (z3) {
                        fetVar4.e0(-986648207);
                        mm40 mm40VarL5 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar4).c, 0.0f, 2);
                        hdm hdmVar = ((biw) p6t0Var4).f2676a;
                        boolean zG8 = fetVar4.g(function1);
                        Object objP9 = fetVar4.P();
                        if (zG8 || objP9 == cl5Var2) {
                            objP9 = new dht(function1, (byte) 21);
                            fetVar4.o0(objP9);
                        }
                        Function1 function3 = (Function1) objP9;
                        a4x a4xVar2 = hdmVar.f12876a;
                        function3.getClass();
                        fetVar4.e0(352986570);
                        if (a4xVar2.isEmpty()) {
                            fetVar4.r(false);
                        } else {
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarE = o7k0.e(mm40VarL5, 114.0f);
                            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar4, 0);
                            int iHashCode2 = Long.hashCode(fetVar4.T);
                            bh90 bh90VarM2 = fetVar4.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarE);
                            mkd.c0.getClass();
                            fetVar4.i0();
                            if (fetVar4.S) {
                                fetVar4.l(pcyVar);
                            } else {
                                fetVar4.r0();
                            }
                            jpm0.o(fetVar4, thg0VarA, shdVar4);
                            jpm0.o(fetVar4, bh90VarM2, shdVar3);
                            vqd.u(iHashCode2, fetVar4, shdVar2, fetVar4);
                            Iterator itO = h97.o(fetVar4, mm40VarC1, shdVar, -703807126, a4xVar2);
                            while (itO.hasNext()) {
                                fdm fdmVar = (fdm) itO.next();
                                x7z x7zVar = new x7z(1.0f, true);
                                boolean zG9 = fetVar4.g(function3) | fetVar4.g(fdmVar);
                                Object objP10 = fetVar4.P();
                                if (zG9 || objP10 == cl5Var2) {
                                    objP10 = new lrk(function3, fdmVar, (byte) 25);
                                    fetVar4.o0(objP10);
                                }
                                plc.c(x7zVar, fdmVar, (Function0) objP10, fetVar4, 0);
                            }
                            ohs0.x(fetVar4, false, true, false);
                        }
                        fetVar4.r(false);
                    } else if (p6t0Var4 instanceof siw) {
                        fetVar4.e0(-986181471);
                        siw siwVar = (siw) p6t0Var4;
                        int i2 = iIntValue4 << 3;
                        qdzVar.getClass();
                        function1.getClass();
                        mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                        x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                        int iHashCode3 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM3 = fetVar4.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarD4);
                        mkd.c0.getClass();
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, x5dVarA2, shdVar4);
                        jpm0.o(fetVar4, bh90VarM3, shdVar3);
                        vqd.u(iHashCode3, fetVar4, shdVar2, fetVar4);
                        jpm0.o(fetVar4, mm40VarC2, shdVar);
                        riw riwVar = siwVar.b;
                        if (riwVar == null) {
                            fetVar4.e0(1837714702);
                            fetVar4.r(false);
                            cl5Var = cl5Var2;
                        } else {
                            fetVar4.e0(1837714703);
                            mm40 mm40VarN3 = s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar4).e, 0.0f, xfn.a(fetVar4).e, 0.0f, 10);
                            hjm hjmVar2 = riwVar.f30562a;
                            kjm kjmVar3 = kjm.f18392a;
                            boolean zG10 = fetVar4.g(function1);
                            Object objP11 = fetVar4.P();
                            if (zG10) {
                                cl5Var = cl5Var2;
                            } else {
                                cl5Var = cl5Var2;
                                if (objP11 == cl5Var) {
                                }
                                nkb.h(mm40VarN3, hjmVar2, kjmVar3, null, (Function0) objP11, null, fetVar4, 384, 40);
                                fetVar4.r(false);
                            }
                            objP11 = new i8v(function1, (byte) 15);
                            fetVar4.o0(objP11);
                            nkb.h(mm40VarN3, hjmVar2, kjmVar3, null, (Function0) objP11, null, fetVar4, 384, 40);
                            fetVar4.r(false);
                        }
                        mm40 mm40VarL6 = s5x0.L(jm40Var, xfn.a(fetVar4).c, 0.0f, 2);
                        n0x n0xVar = siwVar.c.b;
                        boolean zG11 = fetVar4.g(function1) | ((((i2 & 112) ^ 48) > 32 && fetVar4.g(siwVar)) || (i2 & 48) == 32);
                        Object objP12 = fetVar4.P();
                        if (zG11 || objP12 == cl5Var) {
                            objP12 = new wqv(function1, siwVar, (byte) 8);
                            fetVar4.o0(objP12);
                        }
                        wwb.e(mm40VarL6, n0xVar, (Function0) objP12, fetVar4, 0);
                        mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                        q4t0 q4t0Var2 = siwVar.d;
                        xcz xczVarB3 = qdzVar.b(siwVar.f32281a, new x2w((byte) 14), fetVar4, 0);
                        lh80 lh80VarT3 = s5x0.t(xfn.a(fetVar4).c, 0.0f, 2);
                        boolean zG12 = fetVar4.g(function1);
                        Object objP13 = fetVar4.P();
                        if (zG12 || objP13 == cl5Var) {
                            objP13 = new dht(function1, (byte) 19);
                            fetVar4.o0(objP13);
                        }
                        j5n0.q(mm40VarD5, q4t0Var2, xczVarB3, lh80VarT3, (Function1) objP13, fetVar4, 390, 0);
                        fetVar4.r(true);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-985980312);
                        fetVar4.r(false);
                    }
                }
                return Unit.f46060a;
            case 4:
                p6t0 p6t0Var5 = (p6t0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                p6t0Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(p6t0Var5) ? 4 : 2;
                }
                if (!fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    fetVar5.X();
                } else if (p6t0Var5 instanceof psv) {
                    fetVar5.e0(1245261817);
                    ozb.z((psv) p6t0Var5, null, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof ylp0) {
                    fetVar5.e0(1245394125);
                    xcm0.c((ylp0) p6t0Var5, null, false, fetVar5, (iIntValue5 & 14) | 384, 2);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof tlp0) {
                    fetVar5.e0(1245573739);
                    zcm0.b((tlp0) p6t0Var5, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof j3m0) {
                    fetVar5.e0(1245710170);
                    u7x.t((j3m0) p6t0Var5, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof gc6) {
                    fetVar5.e0(1245839533);
                    gc6 gc6Var = (gc6) p6t0Var5;
                    int i3 = iIntValue5 & 14;
                    boolean zG13 = (i3 == 4) | fetVar5.g(function1);
                    Object objP14 = fetVar5.P();
                    if (zG13 || objP14 == cl5Var2) {
                        objP14 = new vwj(function1, p6t0Var5, (byte) 5);
                        fetVar5.o0(objP14);
                    }
                    jd8.j(gc6Var, null, (Function0) objP14, fetVar5, i3);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof bdd) {
                    fetVar5.e0(1246108303);
                    wvb.e((bdd) p6t0Var5, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof add) {
                    fetVar5.e0(1246254189);
                    dub.h((add) p6t0Var5, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof lo5) {
                    fetVar5.e0(1246397905);
                    lo5 lo5Var = (lo5) p6t0Var5;
                    boolean zG14 = fetVar5.g(function1);
                    Object objP15 = fetVar5.P();
                    if (zG14 || objP15 == cl5Var2) {
                        objP15 = new lj00(function1, b5);
                        fetVar5.o0(objP15);
                    }
                    rsr0.e(null, lo5Var, this.b, (Function1) objP15, fetVar5, (iIntValue5 << 3) & 112, 1);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof liq) {
                    fetVar5.e0(1148595298);
                    feb.w((liq) p6t0Var5, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof hvb0) {
                    fetVar5.e0(1246797867);
                    hvb0 hvb0Var = (hvb0) p6t0Var5;
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN4 = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    Object objP16 = fetVar5.P();
                    if (objP16 == cl5Var2) {
                        objP16 = new w800((byte) 26);
                        fetVar5.o0(objP16);
                    }
                    b5x.n(mm40VarN4, hvb0Var, (Function1) objP16, fetVar5, ((iIntValue5 << 3) & 112) | 384, 0);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof pls) {
                    fetVar5.e0(1247011736);
                    hic.r((pls) p6t0Var5, null, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof ifa0) {
                    fetVar5.e0(1247154398);
                    ifa0 ifa0Var = (ifa0) p6t0Var5;
                    boolean zG15 = fetVar5.g(function1);
                    Object objP17 = fetVar5.P();
                    if (zG15 || objP17 == cl5Var2) {
                        objP17 = new nmf(function1, (byte) 2);
                        fetVar5.o0(objP17);
                    }
                    cww.i(null, ifa0Var, (x0a0) objP17, false, fetVar5, (iIntValue5 << 3) & 112);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof boo0) {
                    fetVar5.e0(1247459903);
                    boo0 boo0Var = (boo0) p6t0Var5;
                    boolean zG16 = fetVar5.g(function1);
                    Object objP18 = fetVar5.P();
                    if (zG16 || objP18 == cl5Var2) {
                        objP18 = new lj00(function1, b4);
                        fetVar5.o0(objP18);
                    }
                    cem0.g(null, boo0Var, (Function1) objP18, fetVar5, (iIntValue5 << 3) & 112, 1);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof m2z) {
                    fetVar5.e0(1247715312);
                    m2z m2zVar = (m2z) p6t0Var5;
                    boolean zG17 = fetVar5.g(function1);
                    Object objP19 = fetVar5.P();
                    if (zG17 || objP19 == cl5Var2) {
                        objP19 = new lj00(function1, b3);
                        fetVar5.o0(objP19);
                    }
                    Function1 function4 = (Function1) objP19;
                    boolean zG18 = fetVar5.g(function1);
                    Object objP20 = fetVar5.P();
                    if (zG18 || objP20 == cl5Var2) {
                        objP20 = new dg00(function1, (byte) 19);
                        fetVar5.o0(objP20);
                    }
                    c3x.c(m2zVar, function4, (Function0) objP20, fetVar5, iIntValue5 & 14);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof wy) {
                    fetVar5.e0(1248147638);
                    rhv0 rhv0Var = (rhv0) fetVar5.k(bmd.u);
                    a4x a4xVar3 = ((wy) p6t0Var5).b;
                    boolean zG19 = fetVar5.g(rhv0Var) | fetVar5.g(function1);
                    Object objP21 = fetVar5.P();
                    if (zG19 || objP21 == cl5Var2) {
                        objP21 = new pmf(rhv0Var, function1, (byte) 2);
                        fetVar5.o0(objP21);
                    }
                    ay3.c(a4xVar3, (Function1) objP21, fetVar5, 8);
                    fetVar5.r(false);
                } else if (p6t0Var5 instanceof jlo0) {
                    fetVar5.e0(1248752045);
                    n8n0.c(null, (jlo0) p6t0Var5, fetVar5, (iIntValue5 << 3) & 112);
                    fetVar5.r(false);
                } else {
                    fetVar5.e0(1248861909);
                    fetVar5.r(false);
                }
                return Unit.f46060a;
            case 5:
                return a(obj, obj2, obj3);
            case 6:
                return b(obj, obj2, obj3);
            case 7:
                p6t0 p6t0Var6 = (p6t0) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                p6t0Var6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(p6t0Var6) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    fetVar6.X();
                } else if (p6t0Var6 instanceof dap0) {
                    fetVar6.e0(-1393449452);
                    dap0 dap0Var = (dap0) p6t0Var6;
                    boolean zG20 = fetVar6.g(function1);
                    Object objP22 = fetVar6.P();
                    if (zG20 || objP22 == cl5Var2) {
                        objP22 = new coo0(function1, b3);
                        fetVar6.o0(objP22);
                    }
                    wgm0.j(dap0Var, qdzVar, (Function1) objP22, fetVar6, (iIntValue6 << 3) & 112);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(-1393067625);
                    fetVar6.r(false);
                }
                return Unit.f46060a;
            case 8:
                p6t0 p6t0Var7 = (p6t0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                p6t0Var7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar7.g(p6t0Var7) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    fetVar7.X();
                } else if (p6t0Var7 instanceof zat0) {
                    fetVar7.e0(1054828444);
                    zat0 zat0Var = (zat0) p6t0Var7;
                    boolean zG21 = fetVar7.g(function1);
                    Object objP23 = fetVar7.P();
                    if (zG21 || objP23 == cl5Var2) {
                        objP23 = new xar0(function1, (byte) 29);
                        fetVar7.o0(objP23);
                    }
                    fem0.e(zat0Var, qdzVar, (Function1) objP23, fetVar7, (iIntValue7 << 3) & 112);
                    fetVar7.r(false);
                } else {
                    fetVar7.e0(1055216037);
                    fetVar7.r(false);
                }
                return Unit.f46060a;
            default:
                p6t0 p6t0Var8 = (p6t0) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                p6t0Var8.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(p6t0Var8) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    fetVar8.X();
                } else if (p6t0Var8 instanceof psv) {
                    fetVar8.e0(747168869);
                    ozb.z((psv) p6t0Var8, null, fetVar8, iIntValue8 & 14);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof boo0) {
                    fetVar8.e0(747294822);
                    boo0 boo0Var2 = (boo0) p6t0Var8;
                    boolean zG22 = fetVar8.g(function1);
                    Object objP24 = fetVar8.P();
                    if (zG22 || objP24 == cl5Var2) {
                        objP24 = new sbt0(function1, (byte) 9);
                        fetVar8.o0(objP24);
                    }
                    cem0.g(null, boo0Var2, (Function1) objP24, fetVar8, (iIntValue8 << 3) & 112, 1);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof ifa0) {
                    fetVar8.e0(747558725);
                    ifa0 ifa0Var2 = (ifa0) p6t0Var8;
                    boolean zG23 = fetVar8.g(function1);
                    Object objP25 = fetVar8.P();
                    if (zG23 || objP25 == cl5Var2) {
                        objP25 = new nmf(function1, (byte) 7);
                        fetVar8.o0(objP25);
                    }
                    cww.i(null, ifa0Var2, (x0a0) objP25, false, fetVar8, (iIntValue8 << 3) & 112);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof up20) {
                    fetVar8.e0(747871887);
                    t9x.g((up20) p6t0Var8, fetVar8, iIntValue8 & 14);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof jlo0) {
                    fetVar8.e0(747970591);
                    n8n0.c(null, (jlo0) p6t0Var8, fetVar8, (iIntValue8 << 3) & 112);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof fhm0) {
                    fetVar8.e0(748071620);
                    afn0.e(null, (fhm0) p6t0Var8, fetVar8, (iIntValue8 << 3) & 112);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof ogg0) {
                    fetVar8.e0(748180678);
                    ogg0 ogg0Var = (ogg0) p6t0Var8;
                    boolean zG24 = fetVar8.g(function1);
                    Object objP26 = fetVar8.P();
                    if (zG24 || objP26 == cl5Var2) {
                        objP26 = new sbt0(function1, b2);
                        fetVar8.o0(objP26);
                    }
                    w9x.r(ogg0Var, qdzVar, (Function1) objP26, fetVar8, iIntValue8 & 14);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof m2z) {
                    fetVar8.e0(748533458);
                    m2z m2zVar2 = (m2z) p6t0Var8;
                    boolean zG25 = fetVar8.g(function1);
                    Object objP27 = fetVar8.P();
                    if (zG25 || objP27 == cl5Var2) {
                        objP27 = new sbt0(function1, (byte) 11);
                        fetVar8.o0(objP27);
                    }
                    Function1 function5 = (Function1) objP27;
                    boolean zG26 = fetVar8.g(function1);
                    Object objP28 = fetVar8.P();
                    if (zG26 || objP28 == cl5Var2) {
                        objP28 = new zbt0(function1, (byte) 5);
                        fetVar8.o0(objP28);
                    }
                    c3x.c(m2zVar2, function5, (Function0) objP28, fetVar8, iIntValue8 & 14);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof aq20) {
                    fetVar8.e0(748958468);
                    kcx.h((aq20) p6t0Var8, fetVar8, iIntValue8 & 14);
                    fetVar8.r(false);
                } else if (p6t0Var8 instanceof wy) {
                    fetVar8.e0(749075741);
                    rhv0 rhv0Var2 = (rhv0) fetVar8.k(bmd.u);
                    a4x a4xVar4 = ((wy) p6t0Var8).b;
                    boolean zG27 = fetVar8.g(rhv0Var2) | fetVar8.g(function1);
                    Object objP29 = fetVar8.P();
                    if (zG27 || objP29 == cl5Var2) {
                        objP29 = new pmf(rhv0Var2, function1, (byte) 3);
                        fetVar8.o0(objP29);
                    }
                    ay3.c(a4xVar4, (Function1) objP29, fetVar8, 8);
                    fetVar8.r(false);
                } else {
                    fetVar8.e0(749643041);
                    fetVar8.r(false);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ rkb(Function1 function1, qdz qdzVar, byte b) {
        this.f30640a = b;
        this.c = function1;
        this.b = qdzVar;
    }
}
