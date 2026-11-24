package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45031a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zv(ugd ugdVar, l7m0 l7m0Var, float f) {
        this.f45031a = (byte) 2;
        this.c = ugdVar;
        this.d = l7m0Var;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45031a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b2 = 2;
        Object obj3 = this.d;
        float f = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ow owVar = (ow) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (owVar instanceof mw) {
                    fetVar.e0(1693742383);
                    mm40 mm40VarR = a8k0.R(f, null, 23);
                    mtl mtlVar = ((mw) owVar).h;
                    ma80 ma80Var = ma80.f21447a;
                    boolean zG = fetVar.g(function1) | fetVar.g(owVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new bw(function1, owVar);
                        fetVar.o0(objP);
                    }
                    bkb.f(mm40VarR, mtlVar, ma80Var, false, null, (Function1) objP, fetVar, 384, 24);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1694267089);
                    fetVar.r(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                kc5.Q((String) obj4, f, (mm40) obj3, (fet) obj, x8x.L(1));
                break;
            case 2:
                ugd ugdVar = (ugd) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ugdVar.j(l7m0Var, new ycl(f), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                oja0.v((jkm) obj4, f, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jiq0.c((mm40) obj4, (kiz) obj3, f, (fet) obj, x8x.L(1));
                break;
            case 5:
                bzl bzlVar = (bzl) obj4;
                ugd ugdVar2 = (ugd) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mbc.L(o7k0.g(lgb.K(jm40Var), 0.0f, f, 1), bzlVar.f3474a.c.l(), ugdVar2, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                mbc.L((mm40) obj4, f, (ugd) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                e2d e2dVar = (e2d) obj4;
                ugd ugdVar3 = (ugd) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarG = o7k0.g(lgb.K(jm40Var), 0.0f, f, 1);
                    boolean zG2 = fetVar4.g(e2dVar);
                    Object objP2 = fetVar4.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new kip(e2dVar);
                        fetVar4.o0(objP2);
                    }
                    nip.b(mm40VarG, (kip) objP2, ugdVar3, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 8:
                e2d e2dVar2 = (e2d) obj4;
                lim limVar = (lim) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG3 = fetVar5.g(e2dVar2);
                    Object objP3 = fetVar5.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = jgk0.b(new c2d(e2dVar2, (byte) 7));
                        fetVar5.o0(objP3);
                    }
                    l7m0 l7m0Var2 = (l7m0) objP3;
                    mm40 mm40VarE = o7k0.e(jm40Var, f);
                    boolean zG4 = fetVar5.g(l7m0Var2);
                    Object objP4 = fetVar5.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new ufp(l7m0Var2, b2);
                        fetVar5.o0(objP4);
                    }
                    j2e.v(0, fetVar5, i4w0.T(mm40VarE, (Function1) objP4), limVar.f20114a, limVar.i);
                } else {
                    fetVar5.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                feb.x((mm40) obj4, f, (djv) obj3, (fet) obj, x8x.L(49));
                break;
            case 10:
                final ac70 ac70Var = (ac70) obj4;
                a970 a970Var = ac70Var.c;
                final Function1 function2 = (Function1) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fetVar6.X();
                } else if (a970Var.b) {
                    fetVar6.e0(-1211986312);
                    mm40 mm40VarN = epv0.N(jm40Var, f);
                    boolean z = a970Var.c;
                    sd sdVar = a970Var.d;
                    r2v0 r2v0Var = a970Var.e;
                    boolean zG5 = fetVar6.g(ac70Var) | fetVar6.g(function2);
                    Object objP5 = fetVar6.P();
                    if (zG5 || objP5 == cl5Var) {
                        final byte b3 = 0;
                        objP5 = new Function0() { // from class: a.ja70
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b3;
                                Function1 function3 = function2;
                                ac70 ac70Var2 = ac70Var;
                                switch (b4) {
                                    case 0:
                                        if (ac70Var2.c.f463a) {
                                            function3.invoke(s770.f31737a);
                                        }
                                        break;
                                    default:
                                        if (ac70Var2.c.f463a) {
                                            function3.invoke(e770.f7319a);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar6.o0(objP5);
                    }
                    Function0 function0 = (Function0) objP5;
                    boolean zG6 = fetVar6.g(ac70Var) | fetVar6.g(function2);
                    Object objP6 = fetVar6.P();
                    if (zG6 || objP6 == cl5Var) {
                        final byte b4 = 1;
                        objP6 = new Function0() { // from class: a.ja70
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b5 = b4;
                                Function1 function3 = function2;
                                ac70 ac70Var2 = ac70Var;
                                switch (b5) {
                                    case 0:
                                        if (ac70Var2.c.f463a) {
                                            function3.invoke(s770.f31737a);
                                        }
                                        break;
                                    default:
                                        if (ac70Var2.c.f463a) {
                                            function3.invoke(e770.f7319a);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar6.o0(objP6);
                    }
                    ozb.w(mm40VarN, z, sdVar, r2v0Var, function0, (Function0) objP6, fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(-1211189643);
                    fetVar6.r(false);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                xvw.p((mm40) obj4, (ojg0) obj3, f, (fet) obj, x8x.L(1));
                break;
            default:
                sqm sqmVar = (sqm) obj4;
                ugd ugdVar4 = (ugd) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar7, 0);
                    int iHashCode = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM = fetVar7.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar7, jm40Var);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    boolean z2 = fetVar7.S;
                    pcy pcyVar = e7z.u1;
                    if (z2) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar7, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar7, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar7, numValueOf, shdVar3);
                    jpm0.n(fetVar7);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar7, mm40VarC0, shdVar4);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarG2 = o7k0.g(o7k0.s(qbc.c0(s5x0.L(jm40Var, 16.0f, 0.0f, 2), sqmVar), 256.0f), 0.0f, f, 1);
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(mm40VarG2, s6t0.b().f33626a.getBackgroundContent(), vgg0.a(10.0f));
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM2 = fetVar7.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar7, mm40VarQ);
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC, shdVar);
                    jpm0.o(fetVar7, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar7, shdVar3, fetVar7);
                    jpm0.o(fetVar7, mm40VarC1, shdVar4);
                    twn.v(0, ugdVar4, fetVar7, true);
                    u4n0.b(0, s6t0.b().f33626a.getBackgroundContent(), fetVar7, qbc.c0(s5x0.N(new wkw(gqw0.o), 0.0f, 0.0f, 32.0f, 0.0f, 11), sqmVar));
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zv(float f, Object obj, ugd ugdVar, byte b) {
        this.f45031a = b;
        this.b = f;
        this.c = obj;
        this.d = ugdVar;
    }

    public /* synthetic */ zv(mm40 mm40Var, Object obj, float f, int i, byte b) {
        this.f45031a = b;
        this.c = mm40Var;
        this.d = obj;
        this.b = f;
    }

    public /* synthetic */ zv(Object obj, float f, Object obj2, byte b) {
        this.f45031a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    public /* synthetic */ zv(Object obj, float f, Object obj2, int i, byte b) {
        this.f45031a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }
}
