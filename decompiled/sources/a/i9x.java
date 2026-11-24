package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i9x implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14410a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ i9x(wom womVar, w2d w2dVar, Function1 function1, l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6) {
        this.f14410a = (byte) 0;
        this.d = womVar;
        this.e = w2dVar;
        this.f = function1;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.k = xczVar;
        this.g = l7m0Var3;
        this.h = l7m0Var4;
        this.i = l7m0Var5;
        this.j = l7m0Var6;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean z;
        byte b = this.f14410a;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.k;
        Object obj5 = this.i;
        Object obj6 = this.j;
        Object obj7 = this.h;
        Object obj8 = this.f;
        Object obj9 = this.g;
        Object obj10 = this.e;
        l7m0 l7m0Var = this.c;
        Object obj11 = this.d;
        l7m0 l7m0Var2 = this.b;
        switch (b) {
            case 0:
                boolean z2 = false;
                wom womVar = (wom) obj11;
                w2d w2dVar = (w2d) obj10;
                Function1 function1 = (Function1) obj8;
                xcz xczVar = (xcz) obj4;
                l7m0 l7m0Var3 = (l7m0) obj9;
                l7m0 l7m0Var4 = (l7m0) obj7;
                l7m0 l7m0Var5 = (l7m0) obj5;
                l7m0 l7m0Var6 = (l7m0) obj6;
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
                }
                if ((iIntValue & 19) != 18) {
                    z2 = true;
                }
                if (fetVar.U(iIntValue & 1, z2)) {
                    boolean zBooleanValue = ((Boolean) ((l7m0) l7m0Var2.getValue()).getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) ((l7m0) l7m0Var.getValue()).getValue()).booleanValue();
                    mm40 mm40VarI = s5x0.I(o7k0.c, hh80Var);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new i8v(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    bdx.B(mm40VarI, zBooleanValue, zBooleanValue2, womVar, w2dVar, null, (Function0) objP, null, u1c.M(-244563634, new s49(function1, xczVar, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, (byte) 6), fetVar), fetVar, 100696064);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ujv0 ujv0Var = (ujv0) obj11;
                rv2 rv2Var = (rv2) obj10;
                xdr xdrVar = (xdr) obj8;
                xdr xdrVar2 = (xdr) obj9;
                ugd ugdVar = (ugd) obj7;
                ugd ugdVar2 = (ugd) obj5;
                xdr xdrVar3 = (xdr) obj6;
                ugd ugdVar3 = (ugd) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    boolean z3 = fetVar2.S;
                    pcy pcyVar = e7z.u1;
                    if (z3) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    mm40 mm40VarD = o7k0.d(jr8.f16991a.b(jm40Var, gqw0.e), qem0.o(ujv0Var));
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new mf4(rv2Var, (byte) 0);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarD, (Function1) objP2);
                    Unit unit = Unit.f46060a;
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = i54.d;
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarA = fnn0.a(mm40VarT, unit, (PointerInputEventHandler) objP3);
                    boolean z4 = !((tly) l7m0Var2.getValue()).f34169a && ((Boolean) l7m0Var.getValue()).booleanValue();
                    ma80 ma80Var = ma80.f21447a;
                    uts0 uts0Var = nu2.f24127a;
                    Object objP4 = fetVar2.P();
                    if (objP4 == cl5Var) {
                        objP4 = new or3((byte) 20);
                        fetVar2.o0(objP4);
                    }
                    mm40 mm40VarA2 = dv2.a(mm40VarA, rv2Var, z4, null, nu2.a(rv2Var, (Function1) objP4, ro4.m0(300, 0, null, 6), fetVar2, 3510), 24);
                    boolean zF = fetVar2.f(backgroundContent);
                    Object objP5 = fetVar2.P();
                    if (zF || objP5 == cl5Var) {
                        objP5 = new bx((byte) 5, backgroundContent);
                        fetVar2.o0(objP5);
                    }
                    mm40 mm40VarL = rq8.L(mm40VarA2, (Function1) objP5);
                    xx7 xx7Var = gqw0.n;
                    mw3 mw3Var = uc9.c;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    mm40 mm40VarR = a8k0.R(0.0f, l7m0Var2, 14);
                    Object objP6 = fetVar2.P();
                    if (objP6 == cl5Var) {
                        objP6 = i54.e;
                        fetVar2.o0(objP6);
                    }
                    mm40 mm40VarA3 = fnn0.a(mm40VarR, unit, (PointerInputEventHandler) objP6);
                    long separator = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator();
                    long backgroundContent2 = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
                    zcl zclVar = qmk.f28987a;
                    mm40VarA3.getClass();
                    mm40 mm40VarN = s5x0.N(mm40VarA3.e(rq8.L(jm40Var, new lf4((byte) 4, backgroundContent2, separator))), 0.0f, 28.0f, 0.0f, 0.0f, 13);
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    ugdVar.F(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 8.0f, 2), 1.0f), fetVar2, 0);
                    ugdVar2.F(s5x0.N(jm40Var, 16.0f, 8.0f, 16.0f, 0.0f, 8), fetVar2, 0);
                    if (xdrVar3 == null) {
                        fetVar2.e0(-1626357799);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1299389144);
                        xdrVar3.F(s5x0.K(jm40Var, 16.0f, 8.0f), fetVar2, 0);
                        fetVar2.r(false);
                    }
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), false, fetVar2, 6, 4);
                    fetVar2.r(true);
                    if (xdrVar == null) {
                        fetVar2.e0(-164642669);
                        z = false;
                    } else {
                        z = false;
                        fetVar2.e0(-143858386);
                        xdrVar.F(s5x0.L(jm40Var, 0.0f, 16.0f, 1), fetVar2, 0);
                    }
                    fetVar2.r(z);
                    if (xdrVar2 == null) {
                        fetVar2.e0(-164546662);
                        fetVar2.r(z);
                    } else {
                        fetVar2.e0(-143855289);
                        xdrVar2.F(o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f), fetVar2, 0);
                        fetVar2.r(z);
                    }
                    fetVar2.r(true);
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1412461807, new w(ugdVar3, (byte) 3), fetVar2), fetVar2, 56);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                z0m z0mVar = (z0m) obj11;
                n1m n1mVar = (n1m) obj10;
                l7m0 l7m0Var7 = (l7m0) obj9;
                h1m h1mVar = (h1m) obj8;
                l7m0 l7m0Var8 = (l7m0) obj7;
                tsl tslVar = (tsl) obj6;
                l7m0 l7m0Var9 = (l7m0) obj5;
                usl uslVar = (usl) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object value = l7m0Var2.getValue();
                    k0d k0dVar = k0d.b;
                    if (value == k0dVar) {
                        fetVar3.e0(222827334);
                        if (l7m0Var2.getValue() == k0dVar) {
                            fetVar3.e0(222905454);
                            agc.p(null, z0mVar, fetVar3, 0, 1);
                            fetVar3.r(false);
                        } else {
                            fetVar3.e0(223003476);
                            fetVar3.r(false);
                        }
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(223025300);
                        fetVar3.r(false);
                    }
                    if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                        fetVar3.e0(223069878);
                        agc.p(null, n1mVar, fetVar3, 0, 1);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(223160212);
                        fetVar3.r(false);
                    }
                    if (((Boolean) l7m0Var7.getValue()).booleanValue()) {
                        fetVar3.e0(223204790);
                        agc.p(null, h1mVar, fetVar3, 0, 1);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(223295124);
                        fetVar3.r(false);
                    }
                    if (((Boolean) l7m0Var8.getValue()).booleanValue()) {
                        fetVar3.e0(223341686);
                        lgb.j(null, tslVar, fetVar3, 0, 1);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(223432020);
                        fetVar3.r(false);
                    }
                    if (((Boolean) l7m0Var9.getValue()).booleanValue()) {
                        fetVar3.e0(223480628);
                        lgb.j(null, uslVar, fetVar3, 0, 1);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(223572884);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                a1m a1mVar = (a1m) obj11;
                p1m p1mVar = (p1m) obj10;
                l7m0 l7m0Var10 = (l7m0) obj9;
                j1m j1mVar = (j1m) obj8;
                l7m0 l7m0Var11 = (l7m0) obj7;
                tsl tslVar2 = (tsl) obj6;
                l7m0 l7m0Var12 = (l7m0) obj5;
                usl uslVar2 = (usl) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    if (l7m0Var2.getValue() == k0d.b) {
                        fetVar4.e0(1390857334);
                        agc.p(null, a1mVar, fetVar4, 0, 1);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1390947668);
                        fetVar4.r(false);
                    }
                    if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                        fetVar4.e0(1390992246);
                        agc.p(null, p1mVar, fetVar4, 0, 1);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1391082580);
                        fetVar4.r(false);
                    }
                    if (((Boolean) l7m0Var10.getValue()).booleanValue()) {
                        fetVar4.e0(1391127158);
                        agc.p(null, j1mVar, fetVar4, 0, 1);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1391217492);
                        fetVar4.r(false);
                    }
                    if (((Boolean) l7m0Var11.getValue()).booleanValue()) {
                        fetVar4.e0(1391264054);
                        lgb.j(null, tslVar2, fetVar4, 0, 1);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1391354388);
                        fetVar4.r(false);
                    }
                    if (((Boolean) l7m0Var12.getValue()).booleanValue()) {
                        fetVar4.e0(1391402996);
                        lgb.j(null, uslVar2, fetVar4, 0, 1);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1391495252);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                break;
            default:
                c1m c1mVar = (c1m) obj11;
                r1m r1mVar = (r1m) obj10;
                l7m0 l7m0Var13 = (l7m0) obj9;
                l1m l1mVar = (l1m) obj8;
                l7m0 l7m0Var14 = (l7m0) obj7;
                tsl tslVar3 = (tsl) obj6;
                l7m0 l7m0Var15 = (l7m0) obj5;
                usl uslVar3 = (usl) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    if (l7m0Var2.getValue() == k0d.b) {
                        fetVar5.e0(-2037020009);
                        agc.p(null, c1mVar, fetVar5, 0, 1);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-2036929675);
                        fetVar5.r(false);
                    }
                    if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                        fetVar5.e0(-2036885097);
                        agc.p(null, r1mVar, fetVar5, 0, 1);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-2036794763);
                        fetVar5.r(false);
                    }
                    if (((Boolean) l7m0Var13.getValue()).booleanValue()) {
                        fetVar5.e0(-2036750185);
                        agc.p(null, l1mVar, fetVar5, 0, 1);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-2036659851);
                        fetVar5.r(false);
                    }
                    if (((Boolean) l7m0Var14.getValue()).booleanValue()) {
                        fetVar5.e0(-2036613289);
                        lgb.j(null, tslVar3, fetVar5, 0, 1);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-2036522955);
                        fetVar5.r(false);
                    }
                    if (((Boolean) l7m0Var15.getValue()).booleanValue()) {
                        fetVar5.e0(-2036474347);
                        lgb.j(null, uslVar3, fetVar5, 0, 1);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-2036382091);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ i9x(l7m0 l7m0Var, d1m d1mVar, l7m0 l7m0Var2, s1m s1mVar, l7m0 l7m0Var3, m1m m1mVar, l7m0 l7m0Var4, tsl tslVar, l7m0 l7m0Var5, usl uslVar, byte b) {
        this.f14410a = b;
        this.b = l7m0Var;
        this.d = d1mVar;
        this.c = l7m0Var2;
        this.e = s1mVar;
        this.g = l7m0Var3;
        this.f = m1mVar;
        this.h = l7m0Var4;
        this.j = tslVar;
        this.i = l7m0Var5;
        this.k = uslVar;
    }

    public /* synthetic */ i9x(ujv0 ujv0Var, pz40 pz40Var, rv2 rv2Var, l7m0 l7m0Var, xdr xdrVar, xdr xdrVar2, ugd ugdVar, ugd ugdVar2, xdr xdrVar3, ugd ugdVar3) {
        this.f14410a = (byte) 1;
        this.d = ujv0Var;
        this.b = pz40Var;
        this.e = rv2Var;
        this.c = l7m0Var;
        this.f = xdrVar;
        this.g = xdrVar2;
        this.h = ugdVar;
        this.i = ugdVar2;
        this.j = xdrVar3;
        this.k = ugdVar3;
    }
}
