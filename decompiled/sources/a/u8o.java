package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u8o implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35240a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ u8o(Function1 function1, qdz qdzVar, Function1 function2) {
        this.f35240a = (byte) 1;
        this.b = function1;
        this.c = qdzVar;
        this.d = function2;
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
        byte b = this.f35240a;
        cl5 cl5Var = ukd.f35823a;
        qdz qdzVar = this.c;
        Function1 function1 = this.b;
        byte b2 = 18;
        boolean z = true;
        byte b3 = 2;
        byte b4 = 0;
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
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean z2 = p6t0Var instanceof n8o;
                    jm40 jm40Var = jm40.b;
                    if (z2) {
                        fetVar.e0(-139317647);
                        mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2);
                        n8o n8oVar = (n8o) p6t0Var;
                        Object objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new urn((byte) 8);
                            fetVar.o0(objP);
                        }
                        kkb.s(mm40VarL, n8oVar, (Function0) objP, fetVar, ((iIntValue << 3) & 112) | 384);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof kok) {
                        fetVar.e0(-138980336);
                        hyl hylVar = ((kok) p6t0Var).b;
                        vxl vxlVar = vxl.f38204a;
                        boolean zG = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG || objP2 == cl5Var) {
                            objP2 = new btm(function1, (byte) 23);
                            fetVar.o0(objP2);
                        }
                        ebc.r(null, hylVar, vxlVar, (Function1) objP2, null, fetVar, 384, 41);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof g8o) {
                        fetVar.e0(-138633632);
                        g8o g8oVar = (g8o) p6t0Var;
                        boolean zG2 = fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG2 || objP3 == cl5Var) {
                            objP3 = new btm(function1, (byte) 24);
                            fetVar.o0(objP3);
                        }
                        gkb.o(null, g8oVar, (Function1) objP3, fetVar, (iIntValue << 3) & 112);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof m8o) {
                        fetVar.e0(-138363591);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 8.0f, 5);
                        m8o m8oVar = (m8o) p6t0Var;
                        qdzVar.getClass();
                        Function1 function2 = this.d;
                        function2.getClass();
                        zvw.k(mm40VarN, m8oVar.b, false, qdzVar.b(m8oVar.f21381a, new x6o((byte) 3), fetVar, 0), s5x0.t(xfn.a(fetVar).c, 0.0f, 2), function2, fetVar, 384, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof p8o) {
                        fetVar.e0(-137999434);
                        p8o p8oVar = (p8o) p6t0Var;
                        boolean zG3 = fetVar.g(function1);
                        Object objP4 = fetVar.P();
                        if (zG3 || objP4 == cl5Var) {
                            objP4 = new btm(function1, (byte) 25);
                            fetVar.o0(objP4);
                        }
                        bkb.l(p8oVar, (Function1) objP4, fetVar, iIntValue & 14);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof o5s0) {
                        fetVar.e0(-137693061);
                        o5s0 o5s0Var = (o5s0) p6t0Var;
                        int i = iIntValue & 14;
                        boolean zG4 = fetVar.g(function1) | (i == 4);
                        Object objP5 = fetVar.P();
                        if (zG4 || objP5 == cl5Var) {
                            objP5 = new v8o(function1, p6t0Var, (byte) 0);
                            fetVar.o0(objP5);
                        }
                        Function1 function3 = (Function1) objP5;
                        function3.getClass();
                        mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar).c, 0.0f, 2);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN2 = s5x0.N(mm40VarL2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        rqm rqmVar = new rqm((vui0) new tui0(o5s0Var.f24704a, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary())), (pui0) new oui0(Integer.valueOf(R.drawable.ic_globe_gray), (y3d) null, new n0x(o5s0Var.b), (y3d) null, 26), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
                        boolean zG5 = fetVar.g(function3) | (((i ^ 6) > 4 && fetVar.g(o5s0Var)) || (iIntValue & 6) == 4);
                        Object objP6 = fetVar.P();
                        if (zG5 || objP6 == cl5Var) {
                            objP6 = new gnm(function3, o5s0Var, (byte) 24);
                            fetVar.o0(objP6);
                        }
                        obc.q(mm40VarN2, rqmVar, false, null, (Function0) objP6, null, null, null, fetVar, 0, 236);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-137437125);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
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
                    boolean z3 = p6t0Var2 instanceof m9p0;
                    jm40 jm40Var2 = jm40.b;
                    if (z3) {
                        fetVar2.e0(-921143734);
                        m9p0 m9p0Var = (m9p0) p6t0Var2;
                        int i2 = iIntValue2 << 3;
                        function1.getClass();
                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarN3 = s5x0.N(mm40VarD, xfn.a(fetVar2).e, 8.0f, xfn.a(fetVar2).e, 0.0f, 8);
                        jjm jjmVar = m9p0Var.b;
                        kjm kjmVar = kjm.f18392a;
                        boolean zG6 = fetVar2.g(function1) | ((((i2 & 112) ^ 48) > 32 && fetVar2.g(m9p0Var)) || (i2 & 48) == 32);
                        Object objP7 = fetVar2.P();
                        if (zG6 || objP7 == cl5Var) {
                            objP7 = new o0k0((Object) function1, (Object) m9p0Var, (byte) 28);
                            fetVar2.o0(objP7);
                        }
                        nkb.h(mm40VarN3, jjmVar, kjmVar, null, (Function0) objP7, null, fetVar2, 384, 40);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof j9p0) {
                        fetVar2.e0(-920953704);
                        j9p0 j9p0Var = (j9p0) p6t0Var2;
                        qdzVar.getClass();
                        Function1 function4 = this.d;
                        function4.getClass();
                        zcl zclVar4 = qmk.f28987a;
                        zvw.k(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), j9p0Var.b, false, qdzVar.b(j9p0Var.f16149a, new ofo0((byte) 22), fetVar2, 0), s5x0.t(xfn.a(fetVar2).c, 0.0f, 2), function4, fetVar2, 384, 0);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof r8p0) {
                        fetVar2.e0(-920681989);
                        cpm cpmVar = ((r8p0) p6t0Var2).b;
                        boolean zG7 = fetVar2.g(function1);
                        Object objP8 = fetVar2.P();
                        if (zG7 || objP8 == cl5Var) {
                            objP8 = new coo0(function1, (byte) 8);
                            fetVar2.o0(objP8);
                        }
                        u1c.i(null, cpmVar, (Function1) objP8, fetVar2, 0, 5);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof dap0) {
                        fetVar2.e0(-920316995);
                        dap0 dap0Var = (dap0) p6t0Var2;
                        boolean zG8 = fetVar2.g(function1);
                        Object objP9 = fetVar2.P();
                        if (zG8 || objP9 == cl5Var) {
                            objP9 = new coo0(function1, (byte) 9);
                            fetVar2.o0(objP9);
                        }
                        wgm0.j(dap0Var, qdzVar, (Function1) objP9, fetVar2, (iIntValue2 << 3) & 112);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof n9p0) {
                        fetVar2.e0(-919894899);
                        float f = xfn.a(fetVar2).c;
                        float f2 = xfn.a(fetVar2).c;
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarN4 = s5x0.N(jm40Var2, f, 0.0f, f2, 8.0f, 2);
                        fhh fhhVar = ((n9p0) p6t0Var2).b;
                        if (fhhVar instanceof dhh) {
                            fetVar2.e0(-1871658041);
                            feb.e(mm40VarN4, (dhh) fhhVar, fetVar2, 0);
                            fetVar2.r(false);
                        } else {
                            if (!(fhhVar instanceof ehh)) {
                                throw b1j.f(909453130, fetVar2, false);
                            }
                            fetVar2.e0(-1871487820);
                            feb.F(0, fetVar2, mm40VarN4);
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof x9p0) {
                        fetVar2.e0(-919423234);
                        float f3 = xfn.a(fetVar2).c;
                        float f4 = xfn.a(fetVar2).c;
                        zcl zclVar6 = qmk.f28987a;
                        ibc.m(s5x0.N(jm40Var2, f3, 0.0f, f4, 8.0f, 2), ((x9p0) p6t0Var2).b, null, fetVar2, 4);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof rbp0) {
                        fetVar2.e0(-918968340);
                        float f5 = xfn.a(fetVar2).c;
                        float f6 = xfn.a(fetVar2).c;
                        zcl zclVar7 = qmk.f28987a;
                        mm40 mm40VarN5 = s5x0.N(jm40Var2, f5, 0.0f, f6, 8.0f, 2);
                        edm edmVar = ((rbp0) p6t0Var2).b;
                        boolean zG9 = fetVar2.g(function1);
                        Object objP10 = fetVar2.P();
                        if (zG9 || objP10 == cl5Var) {
                            objP10 = new nc40(function1, b2);
                            fetVar2.o0(objP10);
                        }
                        xdr xdrVar = (xdr) objP10;
                        boolean zG10 = fetVar2.g(function1);
                        Object objP11 = fetVar2.P();
                        if (zG10 || objP11 == cl5Var) {
                            objP11 = new coo0(function1, (byte) 10);
                            fetVar2.o0(objP11);
                        }
                        Function1 function5 = (Function1) objP11;
                        xdrVar.getClass();
                        function5.getClass();
                        agc.q(mm40VarN5, edmVar, xdrVar, function5, fetVar2, 0);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof nbp0) {
                        fetVar2.e0(-918171392);
                        float f7 = xfn.a(fetVar2).c;
                        float f8 = xfn.a(fetVar2).c;
                        zcl zclVar8 = qmk.f28987a;
                        mm40 mm40VarN6 = s5x0.N(jm40Var2, f7, 0.0f, f8, 8.0f, 2);
                        bhh bhhVar = ((nbp0) p6t0Var2).b;
                        boolean zG11 = fetVar2.g(function1);
                        Object objP12 = fetVar2.P();
                        if (zG11 || objP12 == cl5Var) {
                            objP12 = new coo0(function1, (byte) 11);
                            fetVar2.o0(objP12);
                        }
                        rcb.m(mm40VarN6, bhhVar, (Function1) objP12, fetVar2, 0);
                        fetVar2.r(false);
                    } else if (p6t0Var2 instanceof q7p0) {
                        fetVar2.e0(-917562769);
                        float f9 = xfn.a(fetVar2).c;
                        float f10 = xfn.a(fetVar2).c;
                        zcl zclVar9 = qmk.f28987a;
                        ozb.l(s5x0.N(jm40Var2, f9, 0.0f, f10, 8.0f, 2), ((q7p0) p6t0Var2).b, null, fetVar2, 0, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-917143463);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                p6t0 p6t0Var3 = (p6t0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                p6t0Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(p6t0Var3) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean z4 = p6t0Var3 instanceof l9t0;
                    jm40 jm40Var3 = jm40.b;
                    if (z4) {
                        fetVar3.e0(-627290530);
                        l9t0 l9t0Var = (l9t0) p6t0Var3;
                        int i3 = iIntValue3 << 3;
                        function1.getClass();
                        mm40 mm40VarD2 = o7k0.d(jm40Var3, 1.0f);
                        zcl zclVar10 = qmk.f28987a;
                        mm40 mm40VarN7 = s5x0.N(mm40VarD2, xfn.a(fetVar3).e, 8.0f, xfn.a(fetVar3).e, 0.0f, 8);
                        jjm jjmVar2 = l9t0Var.b;
                        kjm kjmVar2 = kjm.f18392a;
                        boolean zG12 = fetVar3.g(function1);
                        if ((((i3 & 112) ^ 48) <= 32 || !fetVar3.g(l9t0Var)) && (i3 & 48) != 32) {
                            z = false;
                        }
                        boolean z5 = zG12 | z;
                        Object objP13 = fetVar3.P();
                        if (z5 || objP13 == cl5Var) {
                            objP13 = new yip0(function1, l9t0Var, (byte) 27);
                            fetVar3.o0(objP13);
                        }
                        nkb.h(mm40VarN7, jjmVar2, kjmVar2, null, (Function0) objP13, null, fetVar3, 384, 40);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof j9t0) {
                        fetVar3.e0(-627094548);
                        j9t0 j9t0Var = (j9t0) p6t0Var3;
                        qdzVar.getClass();
                        Function1 function6 = this.d;
                        function6.getClass();
                        zcl zclVar11 = qmk.f28987a;
                        zvw.k(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), j9t0Var.b, false, qdzVar.b(j9t0Var.f16157a, new i9t0(b4), fetVar3, 0), s5x0.t(xfn.a(fetVar3).c, 0.0f, 2), function6, fetVar3, 384, 0);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof z8t0) {
                        fetVar3.e0(-626816850);
                        z8t0 z8t0Var = (z8t0) p6t0Var3;
                        boolean zG13 = fetVar3.g(function1);
                        Object objP14 = fetVar3.P();
                        if (zG13 || objP14 == cl5Var) {
                            objP14 = new sbt0(function1, b3);
                            fetVar3.o0(objP14);
                        }
                        idm0.i(null, z8t0Var, (Function1) objP14, fetVar3, (iIntValue3 << 3) & 112, 1);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof zat0) {
                        fetVar3.e0(-626444850);
                        zat0 zat0Var = (zat0) p6t0Var3;
                        boolean zG14 = fetVar3.g(function1);
                        Object objP15 = fetVar3.P();
                        if (zG14 || objP15 == cl5Var) {
                            objP15 = new sbt0(function1, b5);
                            fetVar3.o0(objP15);
                        }
                        fem0.e(zat0Var, qdzVar, (Function1) objP15, fetVar3, (iIntValue3 << 3) & 112);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof w8t0) {
                        fetVar3.e0(-626022692);
                        function1.getClass();
                        zcl zclVar12 = qmk.f28987a;
                        mm40 mm40VarN8 = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        a4x a4xVar = ((w8t0) p6t0Var3).f38741a;
                        boolean zG15 = fetVar3.g(function1);
                        Object objP16 = fetVar3.P();
                        if (zG15 || objP16 == cl5Var) {
                            objP16 = new ru80(function1, (byte) 22);
                            fetVar3.o0(objP16);
                        }
                        etl.e(mm40VarN8, a4xVar, cq5.f4775a, false, null, 0.0f, 0, null, (Function2) objP16, fetVar3, 384, 248);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof bat0) {
                        fetVar3.e0(-625824044);
                        float f11 = xfn.a(fetVar3).c;
                        float f12 = xfn.a(fetVar3).c;
                        zcl zclVar13 = qmk.f28987a;
                        vtb.h(s5x0.N(jm40Var3, f11, 0.0f, f12, 8.0f, 2), ((bat0) p6t0Var3).b, fetVar3, 0);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof bdt0) {
                        fetVar3.e0(-625394291);
                        float f13 = xfn.a(fetVar3).c;
                        float f14 = xfn.a(fetVar3).c;
                        zcl zclVar14 = qmk.f28987a;
                        mm40 mm40VarN9 = s5x0.N(jm40Var3, f13, 0.0f, f14, 8.0f, 2);
                        bdt0 bdt0Var = (bdt0) p6t0Var3;
                        boolean zG16 = fetVar3.g(function1);
                        Object objP17 = fetVar3.P();
                        if (zG16 || objP17 == cl5Var) {
                            objP17 = new zbt0(function1, (byte) 1);
                            fetVar3.o0(objP17);
                        }
                        wgm0.q(mm40VarN9, bdt0Var, (Function0) objP17, fetVar3, (iIntValue3 << 3) & 112);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof ddt0) {
                        fetVar3.e0(-624836694);
                        zcl zclVar15 = qmk.f28987a;
                        mm40 mm40VarN10 = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        d9m d9mVar = ((ddt0) p6t0Var3).f5913a;
                        boolean zG17 = fetVar3.g(function1);
                        Object objP18 = fetVar3.P();
                        if (zG17 || objP18 == cl5Var) {
                            objP18 = new sbt0(function1, (byte) 4);
                            fetVar3.o0(objP18);
                        }
                        d5c.k(mm40VarN10, d9mVar, null, 0L, (Function1) objP18, fetVar3, 0, 28);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof a9t0) {
                        fetVar3.e0(-624245431);
                        mm40 mm40VarL3 = s5x0.L(o7k0.d(jm40Var3, 1.0f), xfn.a(fetVar3).f39080a, 0.0f, 2);
                        fyl fylVar = ((a9t0) p6t0Var3).f494a;
                        vxl vxlVar2 = vxl.f38204a;
                        boolean zG18 = fetVar3.g(function1);
                        Object objP19 = fetVar3.P();
                        if (zG18 || objP19 == cl5Var) {
                            objP19 = new sbt0(function1, (byte) 5);
                            fetVar3.o0(objP19);
                        }
                        ebc.r(mm40VarL3, fylVar, vxlVar2, (Function1) objP19, null, fetVar3, 384, 40);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof kdt0) {
                        fetVar3.e0(-623657733);
                        float f15 = xfn.a(fetVar3).c;
                        float f16 = xfn.a(fetVar3).c;
                        zcl zclVar16 = qmk.f28987a;
                        ibc.m(s5x0.N(jm40Var3, f15, 0.0f, f16, 8.0f, 2), ((kdt0) p6t0Var3).b, null, fetVar3, 4);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof hat0) {
                        fetVar3.e0(-623244410);
                        zcl zclVar17 = qmk.f28987a;
                        dub.k(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((hat0) p6t0Var3).f12741a, null, 0.0f, fetVar3, 0);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof yct0) {
                        fetVar3.e0(-622986025);
                        zcl zclVar18 = qmk.f28987a;
                        mm40 mm40VarN11 = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        g9m g9mVar = ((yct0) p6t0Var3).f42399a;
                        boolean zG19 = fetVar3.g(function1);
                        Object objP20 = fetVar3.P();
                        if (zG19 || objP20 == cl5Var) {
                            objP20 = new sbt0(function1, (byte) 6);
                            fetVar3.o0(objP20);
                        }
                        d5c.k(mm40VarN11, g9mVar, null, 0L, (Function1) objP20, fetVar3, 0, 28);
                        fetVar3.r(false);
                    } else if (p6t0Var3 instanceof fat0) {
                        fetVar3.e0(-622534448);
                        zcl zclVar19 = qmk.f28987a;
                        qzb.h(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((fat0) p6t0Var3).f9226a, null, 0.0f, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-622340016);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ u8o(Function1 function1, qdz qdzVar, Function1 function2, byte b) {
        this.f35240a = b;
        this.b = function1;
        this.c = qdzVar;
        this.d = function2;
    }
}
