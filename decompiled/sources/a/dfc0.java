package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dfc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5993a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dfc0(ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4) {
        this.f5993a = (byte) 27;
        this.b = ugdVar;
        this.d = ugdVar2;
        this.c = ugdVar3;
        this.e = ugdVar4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        byte b = this.f5993a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        mm40 mm40VarD0 = jm40.b;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.d;
        Object obj9 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gfx.l((mm40) obj9, (frc0) obj8, (Function1) obj7, (Function1) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ufx.m((mm40) obj9, (pfc0) obj8, (cqq) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                uvw.i((mm40) obj9, (qfc0) obj8, (cqq) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                vvw.h((mm40) obj9, (rfc0) obj8, (cqq) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                epv0.B((l7m0) obj9, (Function1) obj7, (ugd) obj8, (ugd) obj6, (fet) obj, x8x.L(3457));
                return Unit.f46060a;
            case 5:
                ugd ugdVar = (ugd) obj8;
                x2d x2dVar = ((w2d) obj7).f38442a;
                l7m0 l7m0Var = (l7m0) obj6;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                List listK = c5n0Var.k("stickyContentId", (ugd) obj9);
                ArrayList arrayList = new ArrayList(listK.size());
                int size = listK.size();
                int iE = 0;
                while (true) {
                    int i = 1;
                    if (iE >= size) {
                        List listK2 = c5n0Var.k("collapsingContentId", ugdVar);
                        ArrayList arrayList2 = new ArrayList(listK2.size());
                        int size2 = listK2.size();
                        int iE2 = 0;
                        while (iE2 < size2) {
                            int i2 = i;
                            iE2 = w6x.e((pj30) listK2.get(iE2), p4eVar.f26347a, arrayList2, iE2, i2);
                            i = i2;
                        }
                        int i3 = i;
                        if (arrayList.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList.get(0);
                            int i4 = ((pu90) obj3).b;
                            int size3 = arrayList.size() - i3;
                            if (i3 <= size3) {
                                int i5 = i3;
                                while (true) {
                                    Object obj10 = arrayList.get(i5);
                                    int i6 = ((pu90) obj10).b;
                                    if (i4 < i6) {
                                        obj3 = obj10;
                                        i4 = i6;
                                    }
                                    if (i5 != size3) {
                                        i5++;
                                    }
                                }
                            }
                        }
                        pu90 pu90Var = (pu90) obj3;
                        float fO = pu90Var != null ? pu90Var.b : 0.0f;
                        kie0 kie0Var = new kie0();
                        if (arrayList2.isEmpty() || arrayList.isEmpty()) {
                            x2dVar.c(-1.0f);
                        } else {
                            if (arrayList2.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList2.get(0);
                                int i7 = ((pu90) obj4).b;
                                int size4 = arrayList2.size() - i3;
                                if (i3 <= size4) {
                                    int i8 = i3;
                                    while (true) {
                                        Object obj11 = arrayList2.get(i8);
                                        int i9 = ((pu90) obj11).b;
                                        if (i7 < i9) {
                                            i7 = i9;
                                            obj4 = obj11;
                                        }
                                        if (i8 != size4) {
                                            i8++;
                                        }
                                    }
                                }
                            }
                            pu90 pu90Var2 = (pu90) obj4;
                            float f = pu90Var2 != null ? pu90Var2.b : 0.0f;
                            if (arrayList.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList.get(0);
                                int i10 = ((pu90) obj5).b;
                                int size5 = arrayList.size() - i3;
                                if (i3 <= size5) {
                                    while (true) {
                                        Object obj12 = arrayList.get(i3);
                                        int i11 = ((pu90) obj12).b;
                                        if (i10 < i11) {
                                            obj5 = obj12;
                                            i10 = i11;
                                        }
                                        if (i3 != size5) {
                                            i3++;
                                        }
                                    }
                                }
                            }
                            pu90 pu90Var3 = (pu90) obj5;
                            float f2 = pu90Var3 != null ? pu90Var3.b : 0.0f;
                            x2dVar.c(-f);
                            fO = l7x.O(f, fO, ((Number) l7m0Var.getValue()).floatValue());
                            kie0Var.f18333a = si30.b(l7x.O(0.0f, f2 - f, ((Number) l7m0Var.getValue()).floatValue()));
                        }
                        return vj30.x(c5n0Var, p4e.i(p4eVar.f26347a), si30.b(fO), new gi0(arrayList2, arrayList, kie0Var, (byte) 7));
                    }
                    iE = w6x.e((pj30) listK.get(iE), p4eVar.f26347a, arrayList, iE, 1);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                k7x.m((mm40) obj9, (bzc0) obj8, (xyc0) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                k9x.o((mm40) obj9, (t5d0) obj8, (hh80) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ktd0 ktd0Var = (ktd0) obj8;
                String str = (String) obj7;
                String str2 = (String) obj6;
                yqd0 yqd0Var = (yqd0) obj2;
                ((oyg0) obj).getClass();
                yqd0Var.getClass();
                a4x a4xVarO0 = dyb.o0((ArrayList) obj9);
                String str3 = ktd0Var.b;
                String strValueOf = String.valueOf(ktd0Var.d);
                if (str.length() == 0) {
                    str = yqd0Var.g;
                }
                return yqd0.a(yqd0Var, false, false, false, strValueOf, str2, str3, str, a4xVarO0, null, null, false, 1792);
            case 9:
                ((Integer) obj2).getClass();
                cy2.q((g2v) obj9, (qdz) obj8, (hxd0) obj7, (Function0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                m2x.f((mm40) obj9, (qwe0) obj8, (cqq) obj6, (Function1) obj7, (fet) obj, x8x.L(385));
                return Unit.f46060a;
            case 11:
                x6q0 x6q0Var = (x6q0) obj9;
                kly klyVar = (kly) obj8;
                bmh0 bmh0Var = (bmh0) obj6;
                Function1 function1 = (Function1) obj7;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = fetVar.g(bmh0Var) | fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new fmh0(bmh0Var, function1);
                        fetVar.o0(objP);
                    }
                    wwb.n(null, x6q0Var, klyVar, (Function1) objP, fetVar, 0, 1);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                lme0 lme0Var = xph0.Q1;
                ((xph0) obj8).H0(x8x.L(1), (fet) obj, (mm40) obj9, (l7m0) obj6, (Function1) obj7);
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                ccq0.x((Function0) obj9, (xcz) obj8, (Function1) obj7, (List) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                bdx.G((mm40) obj9, (xk80) obj8, (dxh0) obj7, (Function0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                gle0 gle0Var = (gle0) obj9;
                y4h y4hVar = (y4h) obj8;
                c5h c5hVar = (c5h) obj7;
                x6f x6fVar = (x6f) obj6;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarQ = i120.Q(o7k0.d(mm40VarD0, 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    int i12 = y4h.Y1 | 64;
                    gle0Var.b(y4hVar, c5hVar, x6fVar, fetVar2, i12);
                    gle0Var.c(y4hVar, c5hVar, fetVar2, i12);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                gle0 gle0Var2 = d3i0.n2;
                ((d3i0) obj8).Q0((mm40) obj9, (phq0) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                gle0 gle0Var3 = d3i0.n2;
                ((d3i0) obj8).P0((mm40) obj9, (sgq0) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                gle0 gle0Var4 = d3i0.n2;
                ((d3i0) obj8).R0(x8x.L(1), (fet) obj, (a4x) obj6, (mm40) obj9, (Function1) obj7);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                tfx.n((mm40) obj9, (hzj0) obj8, (cqq) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                ufx.n((mm40) obj9, (izj0) obj8, (cqq) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                uvw.k((mm40) obj9, (jzj0) obj8, (cqq) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                z1x.l((mm40) obj9, (a4x) obj8, (sw3) obj7, (Function2) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                jd8.S((mm40) obj9, (k72) obj8, (qdz) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                bww.v((mm40) obj9, (List) obj8, (AggregatorSortingOptionModel) obj6, (Function1) obj7, (fet) obj, x8x.L(Response.MESSAGE_TOO_LARGE));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                q8x.t((mm40) obj9, (ker0) obj8, (d9z) obj6, (Function1) obj7, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xdr xdrVar = (xdr) obj9;
                Function0 function0 = (Function0) obj8;
                pz40 pz40Var = (pz40) obj7;
                ngk0 ngk0Var = (ngk0) obj6;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (xdrVar != null) {
                        fetVar3.e0(1259588601);
                        Object objP2 = fetVar3.P();
                        if (objP2 == cl5Var) {
                            objP2 = new huh0(pz40Var, ngk0Var, (byte) 29);
                            fetVar3.o0(objP2);
                        }
                        mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP2);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(1259836539);
                        fetVar3.r(false);
                    }
                    mm40 mm40Var = mm40VarD0;
                    wul wulVar = new wul(mul.e, oe9.d, new te9(R.drawable.ic_glyph_filter_line_inactive), true, false, false);
                    boolean zG2 = fetVar3.g(function0);
                    Object objP3 = fetVar3.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new l3c0(function0, (byte) 18);
                        fetVar3.o0(objP3);
                    }
                    qzb.n(mm40Var, wulVar, (Function0) objP3, fetVar3, 0, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ugd ugdVar2 = (ugd) obj9;
                ugd ugdVar3 = (ugd) obj8;
                ugd ugdVar4 = (ugd) obj7;
                ugd ugdVar5 = (ugd) obj6;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarD0);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar4, x5dVarA2, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar4, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar4, numValueOf, shdVar3);
                    jpm0.n(fetVar4);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar4, mm40VarC1, shdVar4);
                    y5d y5dVar = y5d.f42040a;
                    ugdVar2.F(y5dVar, fetVar4, 6);
                    mm40 mm40VarA = y5dVar.a(mm40VarD0, gqw0.n);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar4, 0);
                    int iHashCode3 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM3 = fetVar4.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarA);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA, shdVar);
                    jpm0.o(fetVar4, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
                    jpm0.o(fetVar4, mm40VarC2, shdVar4);
                    zhg0 zhg0Var = zhg0.f44392a;
                    ugdVar3.F(zhg0Var, fetVar4, 6);
                    ugdVar4.F(zhg0Var, fetVar4, 6);
                    h97.p(6, ugdVar5, zhg0Var, fetVar4, true);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                l7m0 l7m0Var2 = (l7m0) obj9;
                hil0 hil0Var = (hil0) obj8;
                l7m0 l7m0Var3 = (l7m0) obj7;
                l7m0 l7m0Var4 = (l7m0) obj6;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    v8q0.a((String) l7m0Var2.getValue(), o2e.e0(mm40VarD0, "MARKET_LABEL_TEST_TAG"), hil0Var.c().b(), null, 0L, null, null, null, 0L, null, 0L, 2, false, hil0Var.b(), 0, null, hil0Var.e(), fetVar5, 48, 384, 110584);
                    v8q0.a((String) l7m0Var4.getValue(), o2e.e0(mm40VarD0, "MARKET_COEFF_TEXT"), c9x.v((k0d) l7m0Var3.getValue(), hil0Var.c().a(), fetVar5), new n05(qmk.o, hil0Var.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(hil0Var.a(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar5, 48, 24960, 110576);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                r8x.a((mm40) obj9, (bhl0) obj8, (ahl0) obj7, (Function0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dfc0(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f5993a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    public /* synthetic */ dfc0(mm40 mm40Var, Object obj, Object obj2, Function1 function1, int i, byte b) {
        this.f5993a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.c = function1;
    }

    public /* synthetic */ dfc0(l7m0 l7m0Var, Function1 function1, ugd ugdVar, ugd ugdVar2, int i) {
        this.f5993a = (byte) 4;
        this.b = l7m0Var;
        this.c = function1;
        this.d = ugdVar;
        this.e = ugdVar2;
    }

    public /* synthetic */ dfc0(x6q0 x6q0Var, kly klyVar, bmh0 bmh0Var, Function1 function1) {
        this.f5993a = (byte) 11;
        this.b = x6q0Var;
        this.d = klyVar;
        this.e = bmh0Var;
        this.c = function1;
    }

    public /* synthetic */ dfc0(Fragment fragment, mm40 mm40Var, Object obj, Function1 function1, int i, byte b) {
        this.f5993a = b;
        this.d = fragment;
        this.b = mm40Var;
        this.e = obj;
        this.c = function1;
    }

    public /* synthetic */ dfc0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f5993a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
    }
}
