package a;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wv50 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39825a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wv50(w2d w2dVar, Fragment fragment, boolean z, Function1 function1, l7m0 l7m0Var) {
        this.f39825a = (byte) 0;
        this.d = w2dVar;
        this.e = fragment;
        this.b = z;
        this.c = function1;
        this.f = l7m0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        boolean z;
        int i;
        boolean z2;
        float fD;
        byte b = this.f39825a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        byte b2 = 2;
        boolean z3 = this.b;
        Object obj4 = this.f;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.c;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                w2d w2dVar = (w2d) obj7;
                Fragment fragment = (Fragment) obj6;
                Function1 function1 = (Function1) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(hh80Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarV = cjx.V(s5x0.I(jm40Var, hh80Var).e(o7k0.c), w2dVar, null);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarV);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    dw50 dw50Var = (dw50) l7m0Var.getValue();
                    if (dw50Var != null) {
                        if (dw50Var instanceof aw50) {
                            fetVar2.e0(595237449);
                            aw50 aw50Var = (aw50) dw50Var;
                            boolean zG = fetVar2.g(function1);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new rp30(function1, (byte) 27);
                                fetVar2.o0(objP);
                            }
                            Function1 function2 = (Function1) objP;
                            boolean zG2 = fetVar2.g(function1);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new w250(function1, (byte) 27);
                                fetVar2.o0(objP2);
                            }
                            Function0 function0 = (Function0) objP2;
                            boolean zG3 = fetVar2.g(function1) | fetVar2.g(dw50Var);
                            Object objP3 = fetVar2.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new a540((byte) 11, (Object) dw50Var, function1);
                                fetVar2.o0(objP3);
                            }
                            Function0 function3 = (Function0) objP3;
                            boolean zG4 = fetVar2.g(function1);
                            Object objP4 = fetVar2.P();
                            if (zG4 || objP4 == cl5Var) {
                                objP4 = new rp30(function1, (byte) 28);
                                fetVar2.o0(objP4);
                            }
                            gq80.I(aw50Var, fragment, this.b, function2, function0, function3, (Function1) objP4, fetVar2, 0);
                            fetVar = fetVar2;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar2;
                            if (dw50Var instanceof bw50) {
                                fetVar.e0(1127614974);
                                mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                                mdm mdmVar = ((bw50) dw50Var).d;
                                boolean zG5 = fetVar.g(function1);
                                Object objP5 = fetVar.P();
                                if (zG5 || objP5 == cl5Var) {
                                    objP5 = new w250(function1, (byte) 28);
                                    fetVar.o0(objP5);
                                }
                                gq80.u(mm40VarB, mdmVar, (Function0) objP5, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                z = false;
                                if (dw50Var instanceof cw50) {
                                    fetVar.e0(1127625327);
                                    gq80.C(0, fetVar, null);
                                    fetVar.r(false);
                                }
                            }
                        }
                        fetVar.r(true);
                    } else {
                        fetVar = fetVar2;
                        z = false;
                    }
                    throw b1j.f(1127577667, fetVar, z);
                }
                fetVar2.X();
                return Unit.f46060a;
            case 1:
                mm40 mm40Var = (mm40) obj7;
                xcz xczVar = (xcz) obj6;
                pz40 pz40Var = (pz40) obj4;
                Function1 function4 = (Function1) obj5;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z4 = !z3;
                    zcl zclVar = qmk.f28987a;
                    ch80 ch80VarF = h97.f(xfn.a(fetVar3).d, 12.0f, xfn.a(fetVar3).d, 24.0f, fetVar3);
                    boolean zG6 = fetVar3.g(pz40Var) | fetVar3.g(function4);
                    Object objP6 = fetVar3.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new jg2(pz40Var, function4, b2);
                        fetVar3.o0(objP6);
                    }
                    b8k0.e(mm40Var, xczVar, ch80VarF, null, null, null, z4, null, (Function1) objP6, fetVar3, 0, 376);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                xdr xdrVar = (xdr) obj7;
                xdr xdrVar2 = (xdr) obj6;
                ugd ugdVar = (ugd) obj5;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    int i2 = z3 ? -16 : 0;
                    View view = (View) fetVar4.k(dy2.f);
                    boolean z5 = !pkd.c(fetVar4);
                    ViewParent parent = view.getParent();
                    yje yjeVar = null;
                    vjk vjkVar = parent instanceof vjk ? (vjk) parent : null;
                    Window window = vjkVar != null ? vjkVar.getWindow() : null;
                    if (window == null) {
                        fetVar4.e0(-1431081509);
                        i = 0;
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1431081508);
                        Unit unit = Unit.f46060a;
                        boolean zI = fetVar4.i(window) | fetVar4.h(z5);
                        Object objP7 = fetVar4.P();
                        if (zI || objP7 == cl5Var) {
                            objP7 = new hij(window, z5, yjeVar, (byte) 7);
                            fetVar4.o0(objP7);
                        }
                        m0x0.t(fetVar4, unit, (Function2) objP7);
                        i = 0;
                        fetVar4.r(false);
                    }
                    mm40 mm40VarS = o050.S(jm40Var);
                    x5d x5dVarA = w5d.a(new qw3(i2, true, new jf4((byte) 14)), gqw0.m, fetVar4, i);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarS);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar4, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar4, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar4, numValueOf, shdVar3);
                    jpm0.n(fetVar4);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar4, mm40VarC1, shdVar4);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.b, false);
                    int iHashCode3 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM3 = fetVar4.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarD);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC2, shdVar);
                    jpm0.o(fetVar4, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
                    brm0.x(fetVar4, mm40VarC2, shdVar4, 1116017820, false);
                    if (z3) {
                        fetVar4.e0(-1903658142);
                        ulb.k(0, fetVar4, false);
                    } else {
                        fetVar4.e0(1116186833);
                    }
                    fetVar4.r(false);
                    fetVar4.r(true);
                    ulb.a(0, ugdVar, xdrVar, xdrVar2, fetVar4);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                Function0 function5 = (Function0) obj7;
                xdr xdrVar3 = (xdr) obj6;
                l7m0 l7m0Var2 = (l7m0) obj4;
                ugd ugdVar2 = (ugd) obj5;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(mm40VarD2, 8.0f);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode4 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM4 = fetVar5.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar5, x5dVarA2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar5, bh90VarM4, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar5, numValueOf2, shdVar7);
                    jpm0.n(fetVar5);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar5, mm40VarC3, shdVar8);
                    Object objP8 = fetVar5.P();
                    if (objP8 == cl5Var) {
                        objP8 = dw9.j(fetVar5);
                    }
                    mm40 mm40VarW = y860.W(jm40Var2, (gy40) objP8, null, false, null, function5, 28);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar5, 48);
                    int iHashCode5 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM5 = fetVar5.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar5, mm40VarW);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA, shdVar5);
                    jpm0.o(fetVar5, bh90VarM5, shdVar6);
                    vqd.u(iHashCode5, fetVar5, shdVar7, fetVar5);
                    jpm0.o(fetVar5, mm40VarC4, shdVar8);
                    mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f);
                    zfn zfnVar = zaq0.b;
                    long primary20 = ((ThemeColors) fetVar5.k(zfnVar)).getPrimary20();
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarQ = i120.Q(mm40VarN, primary20, ugg0Var);
                    zx7 zx7Var = gqw0.f11754a;
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode6 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM6 = fetVar5.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar5, mm40VarQ);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, tj30VarC3, shdVar5);
                    jpm0.o(fetVar5, bh90VarM6, shdVar6);
                    vqd.u(iHashCode6, fetVar5, shdVar7, fetVar5);
                    jpm0.o(fetVar5, mm40VarC5, shdVar8);
                    mm40 mm40VarN2 = o7k0.n(jm40Var2, 24.0f);
                    zx7 zx7Var2 = gqw0.e;
                    jr8 jr8Var = jr8.f16991a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_tournaments, 0, fetVar5), null, jr8Var.b(mm40VarN2, zx7Var2), ((ThemeColors) fetVar5.k(zfnVar)).getPrimary(), fetVar5, 56, 0);
                    fetVar5.r(true);
                    mm40 mm40VarN3 = s5x0.N(jm40Var2, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                    zhg0 zhg0Var = zhg0.f44392a;
                    v8q0.a(rsm0.w(R.string.bet_on_favorite_title, 0, fetVar5), zhg0Var.a(1.0f, mm40VarN3, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar5), fetVar5, 0, 24960, 110588);
                    if (xdrVar3 == null) {
                        fetVar5.e0(-933120894);
                        z2 = false;
                    } else {
                        z2 = false;
                        fetVar5.e0(1078277983);
                        xdrVar3.F(zhg0Var, fetVar5, 6);
                    }
                    fetVar5.r(z2);
                    mm40 mm40VarQ2 = i120.Q(o7k0.n(s5x0.N(jm40Var2, 0.0f, 0.0f, 12.0f, 0.0f, 11), 24.0f), ((ThemeColors) fetVar5.k(zfnVar)).getBackground(), ugg0Var);
                    tj30 tj30VarC4 = zq8.c(zx7Var, false);
                    int iHashCode7 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM7 = fetVar5.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar5, mm40VarQ2);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, tj30VarC4, shdVar5);
                    jpm0.o(fetVar5, bh90VarM7, shdVar6);
                    vqd.u(iHashCode7, fetVar5, shdVar7, fetVar5);
                    jpm0.o(fetVar5, mm40VarC6, shdVar8);
                    dww.c(a8k0.F(R.drawable.accordion_drawable_down, 0, fetVar5), null, a8k0.I(jr8Var.b(o7k0.n(jm40Var2, 16.0f), zx7Var2), ((Number) l7m0Var2.getValue()).floatValue()), ((ThemeColors) fetVar5.k(zfnVar)).getPrimary(), fetVar5, 56, 0);
                    fetVar5.r(true);
                    fetVar5.r(true);
                    b34.e(y5d.f42040a, this.b, i120.Q(jm40Var2, ((ThemeColors) fetVar5.k(zfnVar)).getBackgroundContent(), jd8.n), null, null, null, u1c.M(1104577727, new uis(ugdVar2, (byte) 3), fetVar5), fetVar5, 1572870, 28);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                aw50 aw50Var2 = (aw50) obj7;
                w6k w6kVar = (w6k) obj6;
                Function1 function6 = (Function1) obj5;
                pz40 pz40Var2 = (pz40) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    mtl mtlVar = aw50Var2.j;
                    zcl zclVar3 = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                    mm40 mm40VarN4 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, knm0.t(0, fetVar6, z3), 7);
                    boolean zG7 = fetVar6.g(w6kVar);
                    Object objP9 = fetVar6.P();
                    if (zG7 || objP9 == cl5Var) {
                        objP9 = new a1i(w6kVar, pz40Var2, (byte) 2);
                        fetVar6.o0(objP9);
                    }
                    bkb.f(ro4.d0(mm40VarN4, (Function1) objP9), mtlVar, null, false, lh80VarU, function6, fetVar6, 3072, 4);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            default:
                xcz xczVar2 = (xcz) obj7;
                pfk0 pfk0Var = (pfk0) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                Function2 function7 = (Function2) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar7.g(lr8Var) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    if (z3) {
                        fetVar7.e0(-1484109506);
                        fD = xfn.a(fetVar7).c;
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-1484040438);
                        fetVar7.r(false);
                        fD = (float) (((double) lr8Var.d()) * 0.05d);
                    }
                    Object objP10 = fetVar7.P();
                    if (objP10 == cl5Var) {
                        objP10 = twn.j(z3 ? lr8Var.d() - (2.0f * fD) : lr8Var.d() * 0.9f, fetVar7);
                    }
                    float f = ((ycl) objP10).f42389a;
                    zcl zclVar4 = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    lh80 lh80VarT = s5x0.t(fD, 0.0f, 2);
                    boolean z6 = !z3;
                    boolean zI2 = fetVar7.i(arrayList) | fetVar7.g(function7);
                    Object objP11 = fetVar7.P();
                    if (zI2 || objP11 == cl5Var) {
                        objP11 = new ny2((Object) arrayList, f, (Object) function7, (byte) 11);
                        fetVar7.o0(objP11);
                    }
                    b8k0.f(null, xczVar2, lh80VarT, false, qw3Var, null, pfk0Var, z6, null, (Function1) objP11, fetVar7, 0, 297);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ wv50(aw50 aw50Var, boolean z, w6k w6kVar, Function1 function1, pz40 pz40Var) {
        this.f39825a = (byte) 4;
        this.d = aw50Var;
        this.b = z;
        this.e = w6kVar;
        this.c = function1;
        this.f = pz40Var;
    }

    public /* synthetic */ wv50(Function0 function0, boolean z, xdr xdrVar, l7m0 l7m0Var, ugd ugdVar) {
        this.f39825a = (byte) 3;
        this.d = function0;
        this.b = z;
        this.e = xdrVar;
        this.f = l7m0Var;
        this.c = ugdVar;
    }

    public /* synthetic */ wv50(boolean z, mm40 mm40Var, xcz xczVar, pz40 pz40Var, Function1 function1) {
        this.f39825a = (byte) 1;
        this.b = z;
        this.d = mm40Var;
        this.e = xczVar;
        this.f = pz40Var;
        this.c = function1;
    }

    public /* synthetic */ wv50(boolean z, Object obj, Object obj2, Object obj3, Function2 function2, byte b) {
        this.f39825a = b;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = function2;
    }
}
