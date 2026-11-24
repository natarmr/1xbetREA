package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferFilterTimeCustomDateValue;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.toto_bet.tirage.presentation.screen.TotoBetDsTirageScreen;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lcr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19814a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lcr0(Object obj, byte b) {
        this.f19814a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x035e  */
    /* JADX WARN: Code duplicated, block: B:125:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:127:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:129:0x040b  */
    /* JADX WARN: Code duplicated, block: B:130:0x040d  */
    /* JADX WARN: Code duplicated, block: B:304:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0316  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        int i;
        Object next;
        int i2;
        qks0 qks0Var;
        boolean z;
        String str;
        Locale locale;
        String str2;
        String str3;
        Date date;
        Date date2;
        fn9 fn9Var;
        Object value2;
        byte b = this.f19814a;
        byte b2 = 22;
        byte b3 = 21;
        byte b4 = 7;
        byte b5 = 4;
        byte b6 = 5;
        byte b7 = 20;
        byte b8 = 6;
        int i3 = 1;
        fn9 fn9Var2 = null;
        Throwable th = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                scr0 scr0Var = (scr0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = scr0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    scr0Var.f.getClass();
                } while (!p7m0Var.m(value, gcr0.a((gcr0) value, null, null, null, false, true, false, false, null, 199)));
                return Unit.f46060a;
            case 1:
                qar0 qar0Var = ((dbr0) obj2).f;
                par0 par0Var = (par0) obj;
                par0Var.getClass();
                int iOrdinal = par0Var.ordinal();
                if (iOrdinal == 0) {
                    xuz xuzVar = pb10.c;
                    return new mdm(R.string.empty_str, pdm.d, null, 0, 0, 0, 0, 0, 0L, 0L, 1020);
                }
                if (iOrdinal == 1) {
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var = pb10.g;
                    int i4 = qar0Var.b;
                    xuzVar2.getClass();
                    return new mdm(xuz.a(pb10Var, i4), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                xuz xuzVar3 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                int i5 = qar0Var.b;
                xuzVar3.getClass();
                return new mdm(xuz.a(pb10Var2, i5), null, null, 0, 0, R.string.currently_no_events, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 2:
                ((dgr0) obj2).j = null;
                return Unit.f46060a;
            case 3:
                phr0 phr0Var = (phr0) obj2;
                air0 air0Var = (air0) obj;
                y2m0 y2m0Var = phr0.W1;
                air0Var.getClass();
                if (air0Var.f) {
                    gnm0.s(phr0Var.C());
                } else {
                    gnm0.i(phr0Var.C());
                }
                return Unit.f46060a;
            case 4:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ctu ctuVar = ((fir0) obj2).t;
                k0w0Var.h(new TotoBetDsTirageScreen(ctuVar.f4960a.r().c.name(), ctuVar.f4960a.r().f20312a));
                return Unit.f46060a;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                m6m0 m6m0Var = ikr0.l2;
                ((ikr0) obj2).Q0().f.setCurrentItem(iIntValue);
                return Unit.f46060a;
            case 6:
                xwr0 xwr0Var = (xwr0) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                x03 x03VarK = qjj.K(0.0f, new float[]{10.0f, 10.0f});
                wwr0 wwr0Var = xwr0Var.f41624a;
                int i6 = xwr0Var.b;
                if (wwr0Var instanceof vwr0) {
                    long jD = fhlVar.d();
                    boolean z2 = ((vwr0) wwr0Var).f38167a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    long jM123getWhite0d7_KjU = z2 ? staticColors.m123getWhite0d7_KjU() : staticColors.m129getWhite400d7_KjU();
                    int i7 = (int) (jD & 4294967295L);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i7) / 2.0f)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jD >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i7) / 2.0f)) & 4294967295L);
                    zcl zclVar = qmk.f28987a;
                    fhl.Q(fhlVar, jM123getWhite0d7_KjU, jFloatToRawIntBits, jFloatToRawIntBits2, fhlVar.w0(1.0f), 1, z2 ? null : x03VarK, 448);
                } else {
                    if (!(wwr0Var instanceof uwr0)) {
                        t9f.b();
                        return null;
                    }
                    long jD2 = fhlVar.d();
                    uwr0 uwr0Var = (uwr0) wwr0Var;
                    zcl zclVar2 = qmk.f28987a;
                    float fW0 = fhlVar.w0(1.0f);
                    int i8 = (int) (jD2 & 4294967295L);
                    float fIntBitsToFloat = Float.intBitsToFloat(i8) - fW0;
                    float fIntValue = (fW0 + fIntBitsToFloat) / 2.0f;
                    int i9 = (int) (jD2 >> 32);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i9) - fW0;
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i9) * 0.35f;
                    float fW1 = fhlVar.w0(2.0f);
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i8) / 2.0f;
                    if (fIntBitsToFloat4 < 0.0f) {
                        fIntBitsToFloat4 = 0.0f;
                    }
                    float f = fW1 > fIntBitsToFloat4 ? fIntBitsToFloat4 : fW1;
                    float fIntBitsToFloat5 = i6 > 0 ? Float.intBitsToFloat(i8) / i6 : 0.0f;
                    Integer num = uwr0Var.b;
                    if (num != null) {
                        fIntValue = (fIntBitsToFloat5 * num.intValue()) + fW0;
                    }
                    float f2 = fW0 + f;
                    float f3 = fIntBitsToFloat - f;
                    float fC = l1e0.c(fIntValue, f2, f3);
                    qt8 qt8Var = uwr0Var.f36406a;
                    boolean z3 = qt8Var == qt8.b;
                    boolean z4 = qt8Var == qt8.c;
                    StaticColors staticColors2 = StaticColors.INSTANCE;
                    long jM123getWhite0d7_KjU2 = z3 ? staticColors2.m123getWhite0d7_KjU() : staticColors2.m129getWhite400d7_KjU();
                    long jM123getWhite0d7_KjU3 = z4 ? staticColors2.m123getWhite0d7_KjU() : staticColors2.m129getWhite400d7_KjU();
                    boolean z5 = !z3;
                    wpm0.j(fhlVar, x03VarK, jM123getWhite0d7_KjU2, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L), z5);
                    boolean z6 = !z4;
                    wpm0.j(fhlVar, x03VarK, jM123getWhite0d7_KjU3, (((long) Float.floatToRawIntBits(fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32), (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32), z6);
                    float f4 = fIntBitsToFloat3 - f;
                    wpm0.j(fhlVar, x03VarK, jM123getWhite0d7_KjU2, (((long) Float.floatToRawIntBits(fW0)) & 4294967295L) | (((long) Float.floatToRawIntBits(fW0)) << 32), (((long) Float.floatToRawIntBits(fW0)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), z5);
                    wpm0.j(fhlVar, x03VarK, jM123getWhite0d7_KjU3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fW0)) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), z6);
                    float f5 = 2.0f * f;
                    float f6 = fIntBitsToFloat3 - f5;
                    fhl.V(fhlVar, jM123getWhite0d7_KjU2, 270.0f, 90.0f, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), 0.0f, new vtm0(fhlVar.w0(2.0f), 0.0f, 0, 1, null, 18), 832);
                    fhl.V(fhlVar, jM123getWhite0d7_KjU3, 0.0f, 90.0f, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - f5)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), 0.0f, new vtm0(fhlVar.w0(2.0f), 0.0f, 0, 1, null, 18), 832);
                    wpm0.j(fhlVar, x03VarK, (z3 || z4) ? staticColors2.m123getWhite0d7_KjU() : staticColors2.m129getWhite400d7_KjU(), (((long) Float.floatToRawIntBits(fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3 - fhlVar.w0(1.0f))) << 32), (((long) Float.floatToRawIntBits(fhlVar.w0(2.0f) + fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L), (z3 || z4) ? false : true);
                }
                return Unit.f46060a;
            case 7:
                final ash ashVar = (ash) obj2;
                final cp cpVar = (cp) obj;
                cpVar.getClass();
                gs10 gs10Var = (gs10) cpVar.u;
                final byte b9 = 0;
                dyb.O(gs10Var.b, new Function1() { // from class: a.w1s0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b10 = b9;
                        ash ashVar2 = ashVar;
                        cp cpVar2 = cpVar;
                        ((View) obj3).getClass();
                        switch (b10) {
                            case 0:
                                ((gs10) cpVar2.u).i.j(((v1s0) cpVar2.u()).f ? ((v1s0) cpVar2.u()).d : ((v1s0) cpVar2.u()).c, ((v1s0) cpVar2.u()).f);
                                ashVar2.a(((v1s0) cpVar2.u()).f36647a);
                                break;
                            default:
                                ((gs10) cpVar2.u).i.j(((v1s0) cpVar2.u()).f ? ((v1s0) cpVar2.u()).d : ((v1s0) cpVar2.u()).c, ((v1s0) cpVar2.u()).f);
                                ashVar2.a(((v1s0) cpVar2.u()).f36647a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                final byte b10 = 1;
                dyb.O(gs10Var.d, new Function1() { // from class: a.w1s0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b11 = b10;
                        ash ashVar2 = ashVar;
                        cp cpVar2 = cpVar;
                        ((View) obj3).getClass();
                        switch (b11) {
                            case 0:
                                ((gs10) cpVar2.u).i.j(((v1s0) cpVar2.u()).f ? ((v1s0) cpVar2.u()).d : ((v1s0) cpVar2.u()).c, ((v1s0) cpVar2.u()).f);
                                ashVar2.a(((v1s0) cpVar2.u()).f36647a);
                                break;
                            default:
                                ((gs10) cpVar2.u).i.j(((v1s0) cpVar2.u()).f ? ((v1s0) cpVar2.u()).d : ((v1s0) cpVar2.u()).c, ((v1s0) cpVar2.u()).f);
                                ashVar2.a(((v1s0) cpVar2.u()).f36647a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                cpVar.t(new kzi0(cpVar, b2));
                return Unit.f46060a;
            case 8:
                u2s0 u2s0Var = (u2s0) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                s2m0 s2m0Var = u2s0.X1;
                if (iIntValue2 == 0) {
                    String strH = u2s0Var.H(R.string.tournament_title);
                    strH.getClass();
                    return strH;
                }
                if (iIntValue2 != 1) {
                    String strH2 = u2s0Var.H(R.string.stocks_prizes);
                    strH2.getClass();
                    return strH2;
                }
                String strH3 = u2s0Var.H(R.string.results);
                strH3.getClass();
                return strH3;
            case 9:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                View view = cpVar2.f40887a;
                view.setLayoutDirection(0);
                dyb.O(view, new kzi0((t9f) obj2, cpVar2));
                cpVar2.t(new pgj0(cpVar2, cpVar2, b7));
                return Unit.f46060a;
            case 10:
                g9m0 g9m0Var = mas0.Q1;
                ((eg60) obj).getClass();
                ((mas0) obj2).G0().x(new y9s0(null));
                return Unit.f46060a;
            case 11:
                b09 b09Var = (b09) obj2;
                ctf0 ctf0Var = b09Var.b;
                fas0 fas0Var = (fas0) obj;
                fas0Var.getClass();
                if (!(fas0Var instanceof cas0)) {
                    if (fas0Var.equals(das0.f5767a)) {
                        return new has0((mdm) ((fee) b09Var.e.getValue()).b());
                    }
                    if (fas0Var.equals(eas0.f7484a)) {
                        return new ias0(new col(new b0i(sh1.f32187a, rh1.b)));
                    }
                    t9f.b();
                    return null;
                }
                cas0 cas0Var = (cas0) fas0Var;
                gu1 gu1Var = cas0Var.f4028a;
                if (gu1Var.g.isEmpty()) {
                    return new has0((mdm) ((fee) b09Var.d.getValue()).b());
                }
                List<izb0> list = gu1Var.g;
                ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
                for (izb0 izb0Var : list) {
                    arrayList5.add(new eol(String.valueOf(izb0Var.c), new n0x(izb0Var.f15628a), false, izb0Var.b, "-", ctf0Var.b.a(R.string.casino_providers_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_aggregator_placeholder, null, 6)));
                }
                bol bolVar = new bol(dyb.o0(arrayList5), new b0i(sh1.f32187a, rh1.b));
                gqt0 gqt0Var = gu1Var.n;
                return new gas0(bolVar, gqt0Var == gqt0.h ? null : new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(unh0.o0(gu1Var.o, gqt0Var, ctf0Var)), true, cas0Var.b, true), otr0.d))));
            case 12:
                ((Integer) obj).getClass();
                s2m0 s2m0Var2 = zcs0.O1;
                ((zcs0) obj2).G0().x(qk2.f28866a);
                return Unit.f46060a;
            case 13:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                s9m0 s9m0Var = ngs0.c;
                int i10 = ((ogs0) obj2).i;
                s9m0Var.getClass();
                ngs0 ngs0VarH = s9m0.h(i10);
                zai0 zai0Var = vds0.b;
                iiy iiyVar = vds0.f37247a[0];
                zai0Var.getClass();
                abi0Var.b(zai0Var, ngs0VarH);
                return Unit.f46060a;
            case 14:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                i4 i4Var = ((rgs0) obj2).f30453a;
                hczVar.f(i4Var.size(), new xlr0(new g4s0(b3), i4Var, b8), new xlr0(new g4s0(b2), i4Var, b4), new ugd(802480018, true, new qn7(i4Var, b5)));
                return Unit.f46060a;
            case 15:
                zis0 zis0Var = (zis0) obj2;
                Long l = (Long) obj;
                l.getClass();
                y2m0 y2m0Var2 = zis0.m2;
                vcc.f0(i120.V(new Pair("REQUEST_DISCIPLINE_RESULT_KEY", l)), zis0Var, "REQUEST_DISCIPLINE_RESULT_KEY");
                zis0Var.x0();
                return Unit.f46060a;
            case 16:
                bjs0 bjs0Var = (bjs0) obj2;
                String str4 = (String) obj;
                y2m0 y2m0Var3 = zis0.m2;
                str4.getClass();
                bjs0Var.getClass();
                bjs0Var.b.setValue(str4);
                return Unit.f46060a;
            case 17:
                ujs0 ujs0Var = (ujs0) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar = ujs0Var.f35799a;
                hczVar2.f(a4xVar.size(), null, new e0m0(a4xVar, (byte) 6), new ugd(2039820996, true, new xe4(a4xVar, ujs0Var, (byte) 23)));
                return Unit.f46060a;
            case 18:
                zjs0 zjs0Var = (zjs0) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                zjs0Var.o.b(th2, new p6r0(zjs0Var, b3));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uks0 uks0Var = (uks0) obj2;
                TransferTimeFilterUiModel transferTimeFilterUiModel = (TransferTimeFilterUiModel) obj;
                s9m0 s9m0Var2 = uks0.l2;
                transferTimeFilterUiModel.getClass();
                vcc.f0(i120.V(new Pair("REQUEST_TIME_RESULT_KEY", transferTimeFilterUiModel)), uks0Var, "REQUEST_TIME_RESULT_KEY");
                uks0Var.x0();
                return Unit.f46060a;
            case 20:
                mya myaVar = (mya) obj2;
                List list2 = (List) obj;
                list2.getClass();
                TransferTimeFilterUiModel transferTimeFilterUiModel2 = (TransferTimeFilterUiModel) ((fee) myaVar.g.getValue()).c();
                String str5 = (String) ((fee) myaVar.f.getValue()).c();
                ctf0 ctf0Var2 = myaVar.b;
                transferTimeFilterUiModel2.getClass();
                str5.getClass();
                ctf0Var2.getClass();
                if (!(transferTimeFilterUiModel2 instanceof TransferTimeFilterUiModel.CustomTime)) {
                    th = null;
                    if (!(transferTimeFilterUiModel2 instanceof TransferTimeFilterUiModel.SimpleTime)) {
                        t9f.b();
                        return null;
                    }
                    xhs0 xhs0Var = ((TransferTimeFilterUiModel.SimpleTime) transferTimeFilterUiModel2).f46619a;
                    if (xhs0Var != xhs0.f40911a) {
                        Date date3 = new Date();
                        Calendar calendar = Calendar.getInstance();
                        int iOrdinal2 = xhs0Var.ordinal();
                        if (iOrdinal2 == 1) {
                            b4 = 1;
                        } else if (iOrdinal2 == 2) {
                            b4 = 3;
                        } else if (iOrdinal2 != 3) {
                            b4 = iOrdinal2 != 4 ? (byte) 360 : (byte) 30;
                        }
                        calendar.add(6, -b4);
                        arrayList = new ArrayList();
                        for (Object obj3 : list2) {
                            Date time = calendar.getTime();
                            Date date4 = ((ijs0) obj3).f14891a;
                            if (date4.compareTo(time) >= 0 && date4.compareTo(date3) <= 0) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                    arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        ijs0 ijs0Var = (ijs0) obj4;
                        qks0 qks0Var2 = ijs0Var.c;
                        str2 = qks0Var2.b;
                        fks0 fks0Var = qks0Var2.e;
                        if (str2.length() <= 0 || fks0Var.a() || fks0Var == fks0.Retirement) {
                            qks0 qks0Var3 = ijs0Var.d;
                            str3 = qks0Var3.b;
                            fks0 fks0Var2 = qks0Var3.e;
                            if (str3.length() <= 0 || fks0Var2.a() || fks0Var2 == fks0.Retirement) {
                                arrayList2.add(obj4);
                            }
                        }
                    }
                    arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList2) {
                        ijs0 ijs0Var2 = (ijs0) obj5;
                        str = ijs0Var2.b.f27106a;
                        locale = Locale.ROOT;
                        if (!vqd.A(str, locale, str5, false) || vqd.A(ijs0Var2.c.b, locale, str5, false) || vqd.A(ijs0Var2.d.b, locale, str5, false)) {
                            arrayList3.add(obj5);
                        }
                    }
                    List listA0 = CollectionsKt.A0(arrayList3, new tgo0((byte) 23));
                    arrayList4 = new ArrayList(r3d.q(listA0, 10));
                    it = listA0.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i2 = i + 1;
                        if (i >= 0) {
                            q3d.p();
                            throw th;
                        }
                        ijs0 ijs0Var3 = (ijs0) next;
                        pjs0 pjs0Var = ijs0Var3.b;
                        String str6 = pjs0Var.f27106a;
                        qks0Var = ijs0Var3.c;
                        String strI = f140.i(i, str6);
                        n0x n0xVar = new n0x(pjs0Var.b);
                        Date date5 = ijs0Var3.f14891a;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date5);
                        Iterator it2 = it;
                        kcm kcmVar = new kcm(n0xVar, str6, new SimpleDate(calendar2.get(i3), calendar2.get(2) + 1, calendar2.get(5)));
                        ucm ucmVarB = ihs0.b(qks0Var, ctf0Var2, ihs0.a(qks0Var, i3));
                        qks0 qks0Var4 = ijs0Var3.d;
                        if (qks0Var.b.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList4.add(new hhs0(strI, new bdm(new mcm(kcmVar, new xcm(ucmVarB, ihs0.b(qks0Var4, ctf0Var2, ihs0.a(qks0Var4, z)))))));
                        it = it2;
                        i = i2;
                        i3 = 1;
                    }
                    return arrayList4;
                }
                TransferTimeFilterUiModel.CustomTime customTime = (TransferTimeFilterUiModel.CustomTime) transferTimeFilterUiModel2;
                rv00 rv00Var = rv00.k;
                TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue = customTime.f46618a;
                TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue2 = customTime.b;
                if (transferFilterTimeCustomDateValue instanceof TransferFilterTimeCustomDateValue.Selected) {
                    SimpleDate simpleDate = ((TransferFilterTimeCustomDateValue.Selected) transferFilterTimeCustomDateValue).f46616a;
                    String str7 = simpleDate.c + Separators.DOT + simpleDate.b + Separators.DOT + simpleDate.f47286a;
                    sdj sdjVar = sdj.UNIVERSAL;
                    date = new Date(rv00.n(rv00Var, gqw0.I0(str7, "dd.MM.yyyy").getTime(), 14));
                } else {
                    date = new Date();
                }
                if (transferFilterTimeCustomDateValue2 instanceof TransferFilterTimeCustomDateValue.Selected) {
                    SimpleDate simpleDate2 = ((TransferFilterTimeCustomDateValue.Selected) transferFilterTimeCustomDateValue2).f46616a;
                    date2 = new Date(rv00.n(rv00Var, new GregorianCalendar(simpleDate2.f47286a, simpleDate2.b - 1, simpleDate2.c).getTime().getTime(), 12));
                } else {
                    date2 = new Date();
                }
                arrayList = new ArrayList();
                for (Object obj6 : list2) {
                    Date date6 = ((ijs0) obj6).f14891a;
                    if (date6.compareTo(date) >= 0 && date6.compareTo(date2) <= 0) {
                        arrayList.add(obj6);
                    }
                }
                list2 = arrayList;
                arrayList2 = new ArrayList();
                while (r1.hasNext()) {
                    ijs0 ijs0Var4 = (ijs0) obj4;
                    qks0 qks0Var5 = ijs0Var4.c;
                    str2 = qks0Var5.b;
                    fks0 fks0Var3 = qks0Var5.e;
                    if (str2.length() <= 0) {
                    }
                    qks0 qks0Var6 = ijs0Var4.d;
                    str3 = qks0Var6.b;
                    fks0 fks0Var4 = qks0Var6.e;
                    if (str3.length() <= 0) {
                    }
                    arrayList2.add(obj4);
                }
                arrayList3 = new ArrayList();
                while (r2.hasNext()) {
                    ijs0 ijs0Var5 = (ijs0) obj5;
                    str = ijs0Var5.b.f27106a;
                    locale = Locale.ROOT;
                    if (!vqd.A(str, locale, str5, false)) {
                    }
                    arrayList3.add(obj5);
                }
                List listA1 = CollectionsKt.A0(arrayList3, new tgo0((byte) 23));
                arrayList4 = new ArrayList(r3d.q(listA1, 10));
                it = listA1.iterator();
                i = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i2 = i + 1;
                    if (i >= 0) {
                        q3d.p();
                        throw th;
                    }
                    ijs0 ijs0Var6 = (ijs0) next;
                    pjs0 pjs0Var2 = ijs0Var6.b;
                    String str8 = pjs0Var2.f27106a;
                    qks0Var = ijs0Var6.c;
                    String strI2 = f140.i(i, str8);
                    n0x n0xVar2 = new n0x(pjs0Var2.b);
                    Date date7 = ijs0Var6.f14891a;
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(date7);
                    Iterator it3 = it;
                    kcm kcmVar2 = new kcm(n0xVar2, str8, new SimpleDate(calendar3.get(i3), calendar3.get(2) + 1, calendar3.get(5)));
                    ucm ucmVarB2 = ihs0.b(qks0Var, ctf0Var2, ihs0.a(qks0Var, i3));
                    qks0 qks0Var7 = ijs0Var6.d;
                    if (qks0Var.b.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList4.add(new hhs0(strI2, new bdm(new mcm(kcmVar2, new xcm(ucmVarB2, ihs0.b(qks0Var7, ctf0Var2, ihs0.a(qks0Var7, z)))))));
                    it = it3;
                    i = i2;
                    i3 = 1;
                }
                return arrayList4;
            case 21:
                qrs0 qrs0Var = (qrs0) obj2;
                cmc cmcVar = (cmc) obj;
                cmcVar.getClass();
                ugi0 descriptor = qrs0Var.f29226a.getDescriptor();
                iun iunVar = iun.f15405a;
                cmcVar.a("first", descriptor, iunVar);
                cmcVar.a("second", qrs0Var.b.getDescriptor(), iunVar);
                cmcVar.a("third", qrs0Var.c.getDescriptor(), iunVar);
                return Unit.f46060a;
            case 22:
                jts0 jts0Var = (jts0) obj2;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.h(hczVar3, new ugd(-265517210, true, new csw(jts0Var, b7)), 2);
                a4x a4xVar2 = jts0Var.d;
                hczVar3.f(a4xVar2.size(), new vdr0(xdx.E(a4xVar2, new g4s0((byte) 26)), (byte) 12), new xlr0(new g4s0((byte) 27), a4xVar2, (byte) 8), new ugd(-1311333631, true, new bzp0(a4xVar2, b6)));
                return Unit.f46060a;
            case 23:
                m5t0 m5t0Var = (m5t0) obj2;
                r5t0 r5t0Var = (r5t0) obj;
                wxs0 wxs0Var = m5t0.R1;
                r5t0Var.getClass();
                wdk0 wdk0Var = m5t0Var.L1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                xdk0 xdk0Var = new xdk0(rek0.b, r5t0Var.f29905a, null, null, null, null, 124);
                Object objN = m5t0Var.O1.n(m5t0.S1[1], m5t0Var);
                objN.getClass();
                wdk0.j(wdk0Var, xdk0Var, m5t0Var.n0(), ((aid) objN).f919a, null, false, false, null, 120);
                ((k3t0) m5t0Var.P1.getValue()).x(r4t0.f29855a);
                return Unit.f46060a;
            case 24:
                t9t0 t9t0Var = (t9t0) obj;
                sxs0 sxs0Var = y9t0.Q1;
                t9t0Var.getClass();
                ((k3t0) ((y9t0) obj2).N1.getValue()).x(t9t0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                aat0 aat0Var = (aat0) obj;
                aat0Var.getClass();
                ctf0 ctf0Var3 = ((s7p0) obj2).b;
                ctf0Var3.getClass();
                j0g0 j0g0Var = aat0Var.b;
                if (j0g0Var != null) {
                    Object obj7 = j0g0Var.f15681a;
                    if (obj7 instanceof g0g0) {
                        obj7 = null;
                    }
                    fn9Var = (fn9) obj7;
                } else {
                    fn9Var = null;
                }
                bat0 bat0VarP = cem0.p(fn9Var, true, ctf0Var3);
                if (j0g0Var != null) {
                    Object obj8 = j0g0Var.f15681a;
                    fn9Var2 = (fn9) (obj8 instanceof g0g0 ? null : obj8);
                }
                zct0 zct0VarP = ghm0.p(fn9Var2, ctf0Var3);
                if (bat0VarP == null && zct0VarP == null) {
                    return iun.f15405a;
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                if (zct0VarP != null) {
                    lc00VarB.add(zct0VarP);
                }
                if (bat0VarP != null) {
                    lc00VarB.add(bat0VarP);
                }
                return kotlin.collections.a.a(lc00VarB);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dat0 dat0Var = (dat0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = dat0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    dat0Var.f.getClass();
                } while (!p7m0Var2.m(value2, aat0.a((aat0) value2, false, null, 1)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                oat0 oat0Var = (oat0) obj;
                uxs0 uxs0Var = uat0.Q1;
                oat0Var.getClass();
                ((k3t0) ((uat0) obj2).N1.getValue()).x(oat0Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                jbt0 jbt0Var = (jbt0) obj;
                wxs0 wxs0Var2 = obt0.R1;
                jbt0Var.getClass();
                ((obt0) obj2).G0().x(jbt0Var);
                return Unit.f46060a;
            default:
                ubt0 ubt0Var = (ubt0) obj;
                ubt0Var.getClass();
                Date date8 = ubt0Var.b;
                qbt0 qbt0Var = ubt0Var.e;
                ctf0 ctf0Var4 = (ctf0) ((ov0) obj2).e;
                v5l0 v5l0Var = ubt0Var.f.g.y;
                q0s q0sVar = q0s.f27918a;
                boolean z7 = ubt0Var.g;
                ctf0Var4.getClass();
                return q3d.k(qem0.m(qbt0Var, date8, ctf0Var4, v5l0Var, q0sVar, false, 7, z7));
        }
    }
}
