package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jad implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16184a = 0;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ jad(cgk0 cgk0Var, cgk0 cgk0Var2, rah0 rah0Var, pz40 pz40Var, cgk0 cgk0Var3, dk5 dk5Var, d9d0 d9d0Var, gy40 gy40Var, Function0 function0, jh5 jh5Var, pz40 pz40Var2, Function1 function1, pz40 pz40Var3) {
        this.f = cgk0Var;
        this.g = cgk0Var2;
        this.i = rah0Var;
        this.b = pz40Var;
        this.h = cgk0Var3;
        this.j = dk5Var;
        this.k = d9d0Var;
        this.l = gy40Var;
        this.m = function0;
        this.n = jh5Var;
        this.c = pz40Var2;
        this.d = function1;
        this.e = pz40Var3;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        cgk0 cgk0Var;
        t7q0 s7q0Var;
        t7q0 s7q0Var2;
        r7q0 r7q0Var;
        byte b = this.f16184a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.n;
        Object obj5 = this.m;
        Object obj6 = this.l;
        Object obj7 = this.k;
        Object obj8 = this.j;
        Object obj9 = this.i;
        Object obj10 = this.h;
        l7m0 l7m0Var = this.g;
        Object obj11 = this.f;
        l7m0 l7m0Var2 = this.c;
        switch (b) {
            case 0:
                cgk0 cgk0Var2 = (cgk0) obj11;
                cgk0 cgk0Var3 = (cgk0) l7m0Var;
                rah0 rah0Var = (rah0) obj9;
                cgk0 cgk0Var4 = (cgk0) obj10;
                dk5 dk5Var = (dk5) obj8;
                d9d0 d9d0Var = (d9d0) obj7;
                gy40 gy40Var = (gy40) obj6;
                Function0 function0 = (Function0) obj5;
                jh5 jh5Var = (jh5) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean z = cgk0Var2.l() == 0;
                    boolean z2 = cgk0Var3.l() == 1;
                    n0q n0qVar = o7k0.c;
                    l7m0 l7m0Var3 = this.b;
                    boolean z3 = z2;
                    mm40 mm40VarS = o050.S(s5x0.N(wha0.a0(n0qVar, rah0Var, !(((pk5) l7m0Var3.getValue()) instanceof nk5), 12), 0.0f, hh80Var.d(), 0.0f, 0.0f, 13));
                    mw3 mw3Var = uc9.c;
                    xx7 xx7Var = gqw0.m;
                    boolean z4 = z;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                    zcl zclVar = qmk.f28987a;
                    ugg0 ugg0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ugg0VarC);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    mm40 mm40VarW = y860.W(s5x0.N(o7k0.e(o7k0.A(new wkw(gqw0.n), null, 3), 40.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10), gy40Var, null, false, null, function0, 28);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarW);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    jpm0.o(fetVar, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar4);
                    mm40 mm40VarH = dw9.h(1.0f, o7k0.w(jm40Var, null, false, 3), false);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new y2d((byte) 6);
                        fetVar.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    boolean zI = fetVar.i(jh5Var);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new lya(jh5Var, (byte) 26);
                        fetVar.o0(objP2);
                    }
                    dwi0.b(function1, mm40VarH, (Function1) objP2, fetVar, 6, 0);
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar), null, o2e.e0(twn.l(gqw0.k, s5x0.N(o7k0.n(jm40Var, 20.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14)), String.valueOf(R.drawable.ic_glyph_chevron_down_small)), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, 56, 0);
                    fetVar.r(true);
                    gk5 gk5Var = (gk5) l7m0Var2.getValue();
                    boolean zI2 = fetVar.i(dk5Var);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new uj5(dk5Var, (byte) 3);
                        fetVar.o0(objP3);
                    }
                    Function0 function2 = (Function0) objP3;
                    boolean zI3 = fetVar.i(dk5Var);
                    Object objP4 = fetVar.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new uj5(dk5Var, (byte) 4);
                        fetVar.o0(objP4);
                    }
                    Function0 function3 = (Function0) objP4;
                    boolean zI4 = fetVar.i(dk5Var);
                    Object objP5 = fetVar.P();
                    if (zI4 || objP5 == cl5Var) {
                        objP5 = new uj5(dk5Var, (byte) 5);
                        fetVar.o0(objP5);
                    }
                    kpb.b(gy40Var, gk5Var, function2, function3, (Function0) objP5, fetVar, 54);
                    fetVar.r(true);
                    fetVar.r(true);
                    boolean z5 = cgk0Var4.l() == 1;
                    boolean z6 = rah0Var.f30133a.l() == 0;
                    boolean zI5 = fetVar.i(dk5Var);
                    Object objP6 = fetVar.P();
                    if (zI5 || objP6 == cl5Var) {
                        cgk0Var = cgk0Var4;
                        objP6 = new kad(cgk0Var, dk5Var, (byte) 0);
                        fetVar.o0(objP6);
                    } else {
                        cgk0Var = cgk0Var4;
                    }
                    oja0.L(14158848, null, u1c.M(-1003297740, new had(z3, z4, dk5Var, cgk0Var3, cgk0Var2, cgk0Var, this.d, l7m0Var3, this.e), fetVar), u1c.M(389635669, new ab4((Object) cgk0Var, (Object) d9d0Var, (byte) 26), fetVar), fetVar, n0qVar, d9d0Var, (Function0) objP6, z5, z6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                cqq cqqVar = (cqq) obj11;
                wpq wpqVar = (wpq) obj10;
                pkk0 pkk0Var = (pkk0) obj9;
                l7m0 l7m0Var4 = (l7m0) obj8;
                l7m0 l7m0Var5 = (l7m0) obj7;
                l7m0 l7m0Var6 = (l7m0) obj6;
                l7m0 l7m0Var7 = (l7m0) obj5;
                l7m0 l7m0Var8 = (l7m0) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    Object objP7 = fetVar2.P();
                    if (objP7 == cl5Var) {
                        objP7 = new vls((byte) 15);
                        fetVar2.o0(objP7);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP7);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(mm40VarK, 16.0f);
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode5 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM5 = fetVar2.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC4, gqw0.v);
                    mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 18.0f, 7);
                    l7m0 l7m0Var9 = this.b;
                    boolean zG = fetVar2.g((String) l7m0Var9.getValue()) | fetVar2.g((yo80) l7m0Var2.getValue());
                    Object objP8 = fetVar2.P();
                    o6q0 o6q0Var = o6q0.f24750a;
                    r7q0 r7q0Var2 = r7q0.f29989a;
                    e6q0 e6q0Var = e6q0.f7299a;
                    if (zG || objP8 == cl5Var) {
                        String str = (String) l7m0Var9.getValue();
                        if (((yo80) l7m0Var2.getValue()).f42973a) {
                            String str2 = ((yo80) l7m0Var2.getValue()).b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            s7q0Var = new s7q0(str2);
                        } else {
                            s7q0Var = r7q0Var2;
                        }
                        objP8 = new c6q0(str, e6q0Var, o6q0Var, s7q0Var, true, ((yo80) l7m0Var2.getValue()).f42973a, new y5q0(9, new ujj((byte) 0), null, 4), ((ait) l7m0Var7.getValue()).f941a, null, false, 0, null, 261376);
                        fetVar2.o0(objP8);
                    }
                    c6q0 c6q0Var = (c6q0) objP8;
                    Object objP9 = fetVar2.P();
                    if (objP9 == cl5Var) {
                        objP9 = new eht(cqqVar, (byte) 0);
                        fetVar2.o0(objP9);
                    }
                    kly klyVar = new kly(null, (Function1) objP9, null, 59);
                    Function1 function4 = this.d;
                    boolean zG2 = fetVar2.g(function4);
                    Object objP10 = fetVar2.P();
                    if (zG2 || objP10 == cl5Var) {
                        objP10 = new dht(function4, (byte) 2);
                        fetVar2.o0(objP10);
                    }
                    wvb.t(mm40VarN, c6q0Var, 6, klyVar, (Function1) objP10, fetVar2, 384, 0);
                    mm40 mm40VarN2 = s5x0.N(y860.b0(jm40Var2, cqqVar), 0.0f, 12.0f, 0.0f, 18.0f, 5);
                    l7m0 l7m0Var10 = this.e;
                    boolean zG3 = fetVar2.g((String) l7m0Var10.getValue()) | fetVar2.g((yo80) l7m0Var.getValue());
                    Object objP11 = fetVar2.P();
                    if (zG3 || objP11 == cl5Var) {
                        String str3 = (String) l7m0Var10.getValue();
                        if (((yo80) l7m0Var.getValue()).f42973a) {
                            String str4 = ((yo80) l7m0Var.getValue()).b;
                            if (str4 == null) {
                                str4 = "";
                            }
                            s7q0Var2 = new s7q0(str4);
                        } else {
                            s7q0Var2 = r7q0Var2;
                        }
                        objP11 = new c6q0(str3, e6q0Var, o6q0Var, s7q0Var2, true, ((yo80) l7m0Var.getValue()).f42973a, new y5q0(9, new ujj((byte) 0), null, 4), ((ait) l7m0Var7.getValue()).b, null, false, 0, null, 261376);
                        fetVar2.o0(objP11);
                    }
                    c6q0 c6q0Var2 = (c6q0) objP11;
                    boolean zI6 = fetVar2.i(wpqVar) | fetVar2.g(pkk0Var);
                    Object objP12 = fetVar2.P();
                    if (zI6 || objP12 == cl5Var) {
                        objP12 = new f3s(wpqVar, pkk0Var, (byte) 14);
                        fetVar2.o0(objP12);
                    }
                    kly klyVar2 = new kly((Function1) objP12, null, null, 62);
                    boolean zG4 = fetVar2.g(function4);
                    Object objP13 = fetVar2.P();
                    if (zG4 || objP13 == cl5Var) {
                        objP13 = new dht(function4, (byte) 3);
                        fetVar2.o0(objP13);
                    }
                    wvb.t(mm40VarN2, c6q0Var2, 7, klyVar2, (Function1) objP13, fetVar2, 384, 0);
                    mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 18.0f, 5);
                    boolean zG5 = fetVar2.g((String) l7m0Var4.getValue());
                    Object objP14 = fetVar2.P();
                    g6q0 g6q0Var = g6q0.f10780a;
                    if (zG5 || objP14 == cl5Var) {
                        r7q0Var = r7q0Var2;
                        objP14 = new c6q0((String) l7m0Var4.getValue(), e6q0Var, g6q0Var, r7q0Var, true, false, new y5q0(0, null, null, 7), (String) l7m0Var8.getValue(), null, false, 0, null, 261376);
                        fetVar2.o0(objP14);
                    } else {
                        r7q0Var = r7q0Var2;
                    }
                    c6q0 c6q0Var3 = (c6q0) objP14;
                    boolean zG6 = fetVar2.g(function4);
                    Object objP15 = fetVar2.P();
                    if (zG6 || objP15 == cl5Var) {
                        objP15 = new dht(function4, (byte) 4);
                        fetVar2.o0(objP15);
                    }
                    wvb.t(mm40VarN3, c6q0Var3, 0, null, (Function1) objP15, fetVar2, 0, 12);
                    if (((Boolean) l7m0Var5.getValue()).booleanValue()) {
                        fetVar2.e0(-32204850);
                        String strW = rsm0.w(R.string.type_coupon, 0, fetVar2);
                        mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 16.0f, 5);
                        boolean zG7 = fetVar2.g((String) l7m0Var6.getValue());
                        Object objP16 = fetVar2.P();
                        if (zG7 || objP16 == cl5Var) {
                            objP16 = new c6q0((String) l7m0Var6.getValue(), e6q0Var, g6q0Var, r7q0Var, true, false, new y5q0(0, null, null, 7), strW, null, false, 0, null, 261376);
                            fetVar2.o0(objP16);
                        }
                        c6q0 c6q0Var4 = (c6q0) objP16;
                        boolean zG8 = fetVar2.g(function4);
                        Object objP17 = fetVar2.P();
                        if (zG8 || objP17 == cl5Var) {
                            objP17 = new dht(function4, (byte) 5);
                            fetVar2.o0(objP17);
                        }
                        wvb.t(mm40VarN4, c6q0Var4, 0, null, (Function1) objP17, fetVar2, 0, 12);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-30978614);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jad(l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, cqq cqqVar, l7m0 l7m0Var3, l7m0 l7m0Var4, wpq wpqVar, pkk0 pkk0Var, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7, l7m0 l7m0Var8, l7m0 l7m0Var9) {
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = function1;
        this.f = cqqVar;
        this.e = l7m0Var3;
        this.g = l7m0Var4;
        this.h = wpqVar;
        this.i = pkk0Var;
        this.j = l7m0Var5;
        this.k = l7m0Var6;
        this.l = l7m0Var7;
        this.m = l7m0Var8;
        this.n = l7m0Var9;
    }
}
