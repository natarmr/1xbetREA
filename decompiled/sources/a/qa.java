package a;

import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$PartTypeTwoGamesScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.proxy.navigation.ProxySettingsScreen;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class qa extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                qa qaVar = new qa((ab) obj2, yjeVar, (byte) 0);
                qaVar.j = obj;
                return qaVar;
            case 1:
                qa qaVar2 = new qa((nd) obj2, yjeVar, (byte) 1);
                qaVar2.j = obj;
                return qaVar2;
            case 2:
                qa qaVar3 = new qa((df) obj2, yjeVar, (byte) 2);
                qaVar3.j = obj;
                return qaVar3;
            case 3:
                qa qaVar4 = new qa((pi) obj2, yjeVar, (byte) 3);
                qaVar4.j = obj;
                return qaVar4;
            case 4:
                return new qa((pv) this.j, (e7a) obj2, yjeVar, (byte) 4);
            case 5:
                qa qaVar5 = new qa((ew) obj2, yjeVar, (byte) 5);
                qaVar5.j = obj;
                return qaVar5;
            case 6:
                return new qa((g00) this.j, (qkt) obj2, yjeVar, (byte) 6);
            case 7:
                qa qaVar6 = new qa((f20) obj2, yjeVar, (byte) 7);
                qaVar6.j = obj;
                return qaVar6;
            case 8:
                return new qa((gr00) this.j, (rl40) obj2, yjeVar, (byte) 8);
            case 9:
                qa qaVar7 = new qa((kb0) obj2, yjeVar, (byte) 9);
                qaVar7.j = obj;
                return qaVar7;
            case 10:
                qa qaVar8 = new qa((yb0) obj2, yjeVar, (byte) 10);
                qaVar8.j = obj;
                return qaVar8;
            case 11:
                return new qa((j8b) this.j, (qo0) obj2, yjeVar, (byte) 11);
            case 12:
                qa qaVar9 = new qa((gs0) obj2, yjeVar, (byte) 12);
                qaVar9.j = obj;
                return qaVar9;
            case 13:
                return new qa((a9q0) this.j, (cgk0) obj2, yjeVar, (byte) 13);
            case 14:
                qa qaVar10 = new qa((zu0) obj2, yjeVar, (byte) 14);
                qaVar10.j = obj;
                return qaVar10;
            case 15:
                return new qa((a01) this.j, (j8b) obj2, yjeVar, (byte) 15);
            case 16:
                return new qa((n21) this.j, (Throwable) obj2, yjeVar, (byte) 16);
            case 17:
                qa qaVar11 = new qa((n21) obj2, yjeVar, (byte) 17);
                qaVar11.j = obj;
                return qaVar11;
            case 18:
                qa qaVar12 = new qa((ja1) obj2, yjeVar, (byte) 18);
                qaVar12.j = obj;
                return qaVar12;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new qa((mh1) this.j, (String) obj2, yjeVar, (byte) 19);
            case 20:
                return new qa((mh1) this.j, (bpl) obj2, yjeVar, (byte) 20);
            case 21:
                return new qa((dp1) this.j, (j8b) obj2, yjeVar, (byte) 21);
            case 22:
                qa qaVar13 = new qa((dp1) obj2, yjeVar, (byte) 22);
                qaVar13.j = obj;
                return qaVar13;
            case 23:
                qa qaVar14 = new qa((wz1) obj2, yjeVar, (byte) 23);
                qaVar14.j = obj;
                return qaVar14;
            case 24:
                return new qa((esg0) this.j, (y52) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                qa qaVar15 = new qa((yn2) obj2, yjeVar, (byte) 25);
                qaVar15.j = obj;
                return qaVar15;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                qa qaVar16 = new qa((qo2) obj2, yjeVar, (byte) 26);
                qaVar16.j = obj;
                return qaVar16;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new qa((Function1) this.j, (rv2) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qa qaVar17 = new qa((p53) obj2, yjeVar, (byte) 28);
                qaVar17.j = obj;
                return qaVar17;
            default:
                qa qaVar18 = new qa((ij3) obj2, yjeVar, (byte) 29);
                qaVar18.j = obj;
                return qaVar18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qa) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qa) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qa) create((tf) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((qa) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((qa) create((kw) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((qa) create((cau0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((qa) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((qa) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((qa) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((qa) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((qa) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((qa) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((qa) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((qa) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((qa) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((qa) create((ep2) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((qa) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qa) create((sf50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:280:0x0888  */
    /* JADX WARN: Code duplicated, block: B:307:0x0914  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [a.itc] */
    /* JADX WARN: Type inference failed for: r6v11, types: [a.itc] */
    /* JADX WARN: Type inference failed for: r6v12, types: [a.itc] */
    /* JADX WARN: Type inference failed for: r6v7, types: [a.p6t0] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [a.itc] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        ew ewVar;
        String str;
        Object value;
        ArrayList arrayList;
        byte b;
        bby bbyVar;
        bby bbyVar2;
        String id;
        Object value2;
        Object value3;
        Object value4;
        boolean z;
        String str2;
        List list;
        m7h0 aggregatorScreens$PartTypeTwoGamesScreen;
        Object value5;
        long j;
        String strA;
        long j2;
        Object value6;
        Object value7;
        Object value8;
        iun iunVar;
        Object value9;
        byte b2 = this.i;
        byte b3 = 7;
        byte b4 = 3;
        yje yjeVar = null;
        Object obj2 = this.k;
        switch (b2) {
            case 0:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.b != sw00Var.f32897a) {
                    ((ab) obj2).q0.y();
                }
                return Unit.f46060a;
            case 1:
                List list2 = (List) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jdk0 jdk0Var = nd.S1;
                ((kd) ((nd) obj2).R1.getValue()).A(list2);
                return Unit.f46060a;
            case 2:
                df dfVar = (df) obj2;
                tf tfVar = (tf) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (tfVar != null) {
                    if (tfVar instanceof rf) {
                        ra10 ra10Var = ((rf) tfVar).f30361a;
                        iiy[] iiyVarArr = df.N1;
                        dfVar.G0().d.setVisibility(8);
                        dfVar.G0().e.setVisibility(8);
                        dfVar.G0().b.setVisibility(0);
                        dfVar.G0().b.v(ra10Var);
                    } else if (tfVar instanceof qf) {
                        iiy[] iiyVarArr2 = df.N1;
                        dfVar.G0().d.setVisibility(8);
                        dfVar.G0().e.setVisibility(0);
                        dfVar.G0().b.setVisibility(8);
                        dfVar.G0().e.c(((qf) tfVar).f28606a);
                    } else if (tfVar instanceof sf) {
                        iiy[] iiyVarArr3 = df.N1;
                        dfVar.G0().d.setVisibility(0);
                        dfVar.G0().e.setVisibility(8);
                        dfVar.G0().b.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                List list3 = (List) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                rek0 rek0Var = pi.l2;
                ((uh) ((pi) obj2).k2.getValue()).A(list3);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((pv) this.j).p.f(new av((d7a) ((e7a) obj2)));
                return Unit.f46060a;
            case 5:
                rek0 rek0Var2 = rek0.b;
                ew ewVar2 = (ew) obj2;
                kw kwVar = (kw) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (kwVar != null) {
                    if (kwVar instanceof jw) {
                        int i = ((jw) kwVar).f17227a;
                        iiy[] iiyVarArr4 = ew.Q1;
                        androidx.fragment.app.e eVarC = ewVar2.C();
                        if (ewVar2.L1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        if (eVarC.J("PICKER_DIALOG_TAG") == null) {
                            rl70 rl70Var = ewVar2.L1;
                            if (rl70Var == null) {
                                Intrinsics.h("pickerDialogFactory");
                                throw null;
                            }
                            androidx.fragment.app.e eVarC2 = ewVar2.C();
                            eVarC2.getClass();
                            rl70Var.e(eVarC2, new PickerParams.Currency(Integer.valueOf(i)), AnalyticsEntryPoint.b);
                        }
                    } else if (kwVar instanceof iw) {
                        iw iwVar = (iw) kwVar;
                        String str3 = iwVar.f15465a;
                        boolean z2 = iwVar.b;
                        iiy[] iiyVarArr5 = ew.Q1;
                        if (z2) {
                            ewVar = ewVar2;
                            wdk0 wdk0Var = ewVar.N1;
                            if (wdk0Var == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            if (str3.length() == 0) {
                                String strH = ewVar.H(R.string.error_something_went_wrong);
                                strH.getClass();
                                str = strH;
                            } else {
                                str = str3;
                            }
                            wdk0.k(wdk0Var, new xdk0(rek0Var2, str, null, null, null, null, 124), ewVar, null, null, false, null, 1020);
                        } else {
                            ewVar2.n0().r().t0(i120.U(), "ADD_BALANCE_KEY");
                            wdk0 wdk0Var2 = ewVar2.N1;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            wdk0.k(wdk0Var2, new xdk0(qek0.f28589a, str3, null, null, null, null, 124), ewVar2, null, null, false, null, 1020);
                            ewVar = ewVar2;
                        }
                        ewVar2 = ewVar;
                    } else if (kwVar instanceof hw) {
                        String str4 = ((hw) kwVar).f13747a;
                        iiy[] iiyVarArr6 = ew.Q1;
                        wdk0 wdk0Var3 = ewVar2.N1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        ewVar2 = ewVar2;
                        wdk0.k(wdk0Var3, new xdk0(rek0Var2, str4, null, null, null, null, 124), ewVar2, null, null, false, null, 1020);
                    }
                    ((k3t0) ewVar2.O1.getValue()).x(rv.f31148a);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = ((g00) this.j).A;
                qkt qktVar = (qkt) obj2;
                do {
                    value = p7m0Var.getValue();
                    List<??> list4 = (List) value;
                    arrayList = new ArrayList(r3d.q(list4, 10));
                    for (?? C : list4) {
                        if (C instanceof itc) {
                            C = (itc) C;
                            int iOrdinal = C.c.ordinal();
                            if (iOrdinal == 3) {
                                C = itc.c(C, qktVar.f28902a, qktVar.b, 54);
                            } else if (iOrdinal == 4) {
                                C = itc.c(C, 0, "", 52);
                            } else if (iOrdinal == 5) {
                                C = itc.c(C, 0, "", 52);
                            }
                        }
                        arrayList.add(C);
                    }
                } while (!p7m0Var.m(value, arrayList));
                return Unit.f46060a;
            case 7:
                cau0 cau0Var = (cau0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                f20 f20Var = (f20) obj2;
                v8d v8dVar = f20Var.s;
                sff0 sff0Var = f20Var.t;
                ctf0 ctf0Var = f20Var.e;
                p7m0 p7m0Var2 = f20Var.A;
                if (!f20Var.v) {
                    int iOrdinal2 = cau0Var.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 5 || iOrdinal2 == 7 || iOrdinal2 == 8) {
                        b = 1;
                        f20Var.c.d(new u10(f20Var, b));
                    } else {
                        a20 a20Var = new a20(vsm0.C(cau0Var, ctf0Var, sff0Var.u0, v8dVar.p));
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, a20Var);
                    }
                    if (f20.F.contains(cau0Var)) {
                        bbyVar = f20Var.x;
                        if (bbyVar != null && bbyVar.isActive() == b && (bbyVar2 = f20Var.x) != null) {
                            bbyVar2.cancel(null);
                        }
                        f20Var.x = sac.b0(jiu0.a(f20Var), 8L, TimeUnit.SECONDS, f20Var.f.f22085a, new u10(f20Var, (byte) 2), new l1(f20Var, yjeVar, b3));
                    }
                    return Unit.f46060a;
                }
                a20 a20Var2 = new a20(vsm0.C(cau0Var, ctf0Var, sff0Var.u0, v8dVar.p));
                p7m0Var2.getClass();
                p7m0Var2.o(null, a20Var2);
                b = 1;
                if (f20.F.contains(cau0Var)) {
                    bbyVar = f20Var.x;
                    if (bbyVar != null) {
                        bbyVar2.cancel(null);
                    }
                    f20Var.x = sac.b0(jiu0.a(f20Var), 8L, TimeUnit.SECONDS, f20Var.f.f22085a, new u10(f20Var, (byte) 2), new l1(f20Var, yjeVar, b3));
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                gr00 gr00Var = (gr00) this.j;
                m73 m73Var = (m73) gr00Var.c;
                String strA2 = ((knf0) gr00Var.d).a();
                try {
                    int iOrdinal3 = ((rl40) obj2).ordinal();
                    if (iOrdinal3 == 0) {
                        reu reuVar = (reu) gr00Var.f11760a;
                        strA2.getClass();
                        t40 t40VarA = u40.a((us00) reuVar.b);
                        if (t40VarA.b) {
                            id = strA2;
                        } else {
                            id = t40VarA.c;
                            if (id == null) {
                                id = "-1";
                            }
                        }
                    } else if (iOrdinal3 != 1) {
                        id = m73Var.a(strA2);
                    } else {
                        ytw ytwVar = (ytw) gr00Var.b;
                        strA2.getClass();
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(ytwVar.f43241a);
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            id = strA2;
                        } else {
                            id = advertisingIdInfo.getId();
                            if (id == null) {
                                id = "-1";
                            }
                        }
                    }
                    return id.equals("-1") ? m73Var.a(strA2) : id;
                } catch (Exception unused) {
                    return m73Var.a(strA2);
                }
            case 9:
                ql5 ql5Var = (ql5) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                int i2 = kb0.y;
                ocj ocjVar = ((kb0) obj2).b;
                ocjVar.getClass();
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    ((pb0) value2).getClass();
                } while (!p7m0Var3.m(value2, new pb0(ql5Var)));
                return Unit.f46060a;
            case 10:
                sw00 sw00Var2 = (sw00) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var2.f32897a) {
                    ((yb0) obj2).w();
                }
                return Unit.f46060a;
            case 11:
                qo0 qo0Var = (qo0) obj2;
                s91 s91Var = qo0Var.F;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                j8b j8bVar = (j8b) this.j;
                String str5 = j8bVar.b;
                long j3 = j8bVar.d;
                long j4 = j8bVar.f16074a;
                s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
                long j5 = j4 == -1 ? j4 : j8bVar.e;
                if (j5 == -1) {
                    s91Var.c(new AggregatorScreenModel(null, null, 0L, new lm1(), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                } else if (j5 == 2 || j5 == 0 || j5 == 3) {
                    s91Var.c(new AggregatorScreenModel(qo0Var.R(j3, str5), null, j8bVar.d, new im1(false, true), null, 0L, 0L, null, false, 498));
                } else {
                    int i3 = qo0.V;
                    s91Var.c(new AggregatorScreenModel(qo0Var.R(j3, str5), qo0Var.x.b.a(R.string.casino_category_folder_and_section_description, Arrays.copyOf(new Object[0], 0)), j8bVar.d, new hm1(2, kotlin.collections.a.c(Long.valueOf(j4 == 37 ? 17L : j4 == -2 ? Long.MAX_VALUE : j4)), null), null, j8bVar.f16074a, j5, null, false, Response.BAD_REQUEST));
                }
                return Unit.f46060a;
            case 12:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                gs0 gs0Var = (gs0) obj2;
                int i4 = gs0.G;
                p7m0 p7m0Var4 = gs0Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                } while (!p7m0Var4.m(value3, ur0.a((ur0) value3, null, null, null, uaq0Var, 127)));
                gs0Var.N(false);
                gs0Var.O(false);
                gs0Var.P(false);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                int i5 = ((a9q0) this.j).b.f;
                iiy[] iiyVarArr7 = lt0.f20606a;
                ((cgk0) obj2).m(i5);
                return Unit.f46060a;
            case 14:
                sw00 sw00Var3 = (sw00) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                int i6 = zu0.o;
                p7m0 p7m0Var5 = ((zu0) obj2).i.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                    wu0 wu0Var = (wu0) value4;
                    z = sw00Var3.f32897a;
                    str2 = wu0Var.f39768a;
                    list = wu0Var.c;
                    list.getClass();
                } while (!p7m0Var5.m(value4, new wu0(str2, list, z)));
                return Unit.f46060a;
            case 15:
                j8b j8bVar2 = (j8b) obj2;
                long j6 = j8bVar2.f16074a;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                a01 a01Var = (a01) this.j;
                boolean z3 = ((hz0) a01Var.D()).b instanceof b9h0;
                long j7 = z3 ? 2L : j6 == -1 ? j6 : j8bVar2.e;
                String strA3 = z3 ? a01Var.z.b.a(R.string.available_games_title, Arrays.copyOf(new Object[0], 0)) : j8bVar2.b;
                String str6 = z3 ? ((hz0) a01Var.D()).f13884a : "";
                long j8 = j8bVar2.d;
                List listC = kotlin.collections.a.c(Long.valueOf(j6 == 37 ? 17L : j6 == -2 ? Long.MAX_VALUE : j6));
                peg0 peg0Var = a01Var.o;
                i1w0 i1w0Var = a01Var.q;
                s0s s0sVar2 = s0s.ONE_X_LIVE_AGGREGATOR;
                if (j7 == -1) {
                    i1w0Var.d(new t1(a01Var, (byte) 28));
                } else if (j7 == 2 || j7 == 0 || j7 == 3) {
                    if (!((hz0) a01Var.D()).d || z3) {
                        im1 im1Var = new im1(z3, false);
                        peg0Var.getClass();
                        strA3.getClass();
                        aggregatorScreens$PartTypeTwoGamesScreen = new AggregatorScreens$PartTypeTwoGamesScreen(new AggregatorScreenModel(strA3, null, j8, im1Var, null, 0L, 0L, str6, false, WarningHeader.INSUFFICIENT_BANDWIDTH), z3, false);
                    } else {
                        aggregatorScreens$PartTypeTwoGamesScreen = peg0Var.q(new fr1(new fs80(strA3, j8, iun.f15405a, null, 0L, true, 88), null, 2));
                    }
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    if (aggregatorScreens$PartTypeTwoGamesScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) aggregatorScreens$PartTypeTwoGamesScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(aggregatorScreens$PartTypeTwoGamesScreen)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    i1w0Var.d(new mz0((Object) a01Var, j8, (Object) listC, (byte) 0));
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                n21 n21Var = (n21) this.j;
                Throwable th = (Throwable) obj2;
                n21Var.r.getClass();
                th.printStackTrace();
                String message = th.getMessage();
                if (message != null && !StringsKt.W(message)) {
                    n21Var.G(new n11(jwb.G(th, n21Var.x)));
                }
                return Unit.f46060a;
            case 17:
                List list5 = (List) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0(list5, b4);
                String str7 = n21.a0;
                ((n21) obj2).H(bo0Var);
                return Unit.f46060a;
            case 18:
                sw00 sw00Var4 = (sw00) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                int i7 = ja1.o;
                p7m0 p7m0Var6 = ((ja1) obj2).i.f25029a;
                do {
                    value5 = p7m0Var6.getValue();
                    value5.getClass();
                } while (!p7m0Var6.m(value5, new ga1(sw00Var4.f32897a)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                mh1 mh1Var = (mh1) this.j;
                i3t0.A(mh1Var, mh1Var.r, new r2j(mh1.E0, (String) obj2), null, null, 6);
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                mh1 mh1Var2 = (mh1) this.j;
                String str8 = ((bpl) obj2).f2990a;
                String str9 = mh1.E0;
                String lowerCase = str8.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (StringsKt.O(lowerCase, "telegram", false) || StringsKt.O(lowerCase, "t.me", false)) {
                    mh1Var2.G(new gf1(str8));
                } else {
                    mh1Var2.G(new kf1(str8));
                }
                return Unit.f46060a;
            case 21:
                j8b j8bVar3 = (j8b) obj2;
                long j9 = j8bVar3.f16074a;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                dp1 dp1Var = (dp1) this.j;
                ctf0 ctf0Var2 = dp1Var.t;
                if (((bo1) dp1Var.D()).b instanceof c9h0) {
                    strA = ctf0Var2.b.a(R.string.available_games_title, Arrays.copyOf(new Object[0], 0));
                    j = 37;
                } else {
                    s0s s0sVar3 = s0s.ONE_X_LIVE_AGGREGATOR;
                    j = 37;
                    long j10 = axq.y(j9, q3d.j(new Long(37L), new Long(1L))) ? j9 : j8bVar3.d;
                    strA = j10 == 37 ? ctf0Var2.b.a(R.string.live_casino_title, Arrays.copyOf(new Object[0], 0)) : j10 == 1 ? ctf0Var2.b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)) : j8bVar3.b;
                }
                if (((bo1) dp1Var.D()).b instanceof c9h0) {
                    j2 = 2;
                } else {
                    s0s s0sVar4 = s0s.ONE_X_LIVE_AGGREGATOR;
                    j2 = j9 == -1 ? -1L : j8bVar3.e;
                }
                long j11 = j8bVar3.d;
                long j12 = j8bVar3.f16074a;
                boolean z4 = ((bo1) dp1Var.D()).b instanceof c9h0;
                if (j9 == j) {
                    j9 = 17;
                } else if (j9 == -2) {
                    j9 = Long.MAX_VALUE;
                }
                List listU = cs0.u(j9);
                String str10 = ((bo1) dp1Var.D()).b instanceof c9h0 ? ((bo1) dp1Var.D()).c : "";
                s91 s91Var2 = dp1Var.A;
                s0s s0sVar5 = s0s.ONE_X_LIVE_AGGREGATOR;
                if (j2 == -1) {
                    s91Var2.c(new AggregatorScreenModel(null, null, 0L, new lm1(), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                } else if (j2 == 2 || j2 == 0 || j2 == 3) {
                    s91Var2.c(new AggregatorScreenModel(strA, null, j11, new im1(z4, true), null, 0L, 0L, str10, false, WarningHeader.INSUFFICIENT_BANDWIDTH));
                } else {
                    s91Var2.c(new AggregatorScreenModel(strA, ctf0Var2.b.a(R.string.casino_category_folder_and_section_description, Arrays.copyOf(new Object[0], 0)), j11, new hm1(2, listU, null), null, j12, j2, null, false, Response.BAD_REQUEST));
                }
                return Unit.f46060a;
            case 22:
                List list6 = (List) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                int i8 = dp1.G;
                p7m0 p7m0Var7 = ((dp1) obj2).i.f25029a;
                while (true) {
                    Object value10 = p7m0Var7.getValue();
                    value10.getClass();
                    List list7 = list6;
                    if (p7m0Var7.m(value10, bo1.a((bo1) value10, null, null, null, list6, false, null, false, false, null, null, false, 0L, 1048559))) {
                        return Unit.f46060a;
                    }
                    list6 = list7;
                }
                break;
            case 23:
                wz1 wz1Var = (wz1) obj2;
                ocj ocjVar2 = wz1Var.i;
                sw00 sw00Var5 = (sw00) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                boolean z5 = sw00Var5.b;
                boolean z6 = sw00Var5.f32897a;
                if (!z5 && z6) {
                    String str11 = wz1.T;
                    p7m0 p7m0Var8 = ocjVar2.f25029a;
                    do {
                        value7 = p7m0Var8.getValue();
                        value7.getClass();
                    } while (!p7m0Var8.m(value7, dz1.a((dz1) value7, false, true, true, null, false, null, null, false, null, 4071)));
                    wz1Var.N();
                    wz1Var.R(10L);
                } else if (z5 && !z6) {
                    String str12 = wz1.T;
                    p7m0 p7m0Var9 = ocjVar2.f25029a;
                    do {
                        value6 = p7m0Var9.getValue();
                        value6.getClass();
                    } while (!p7m0Var9.m(value6, dz1.a((dz1) value6, false, false, false, null, false, null, null, false, null, 4071)));
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                esg0 esg0Var = (esg0) this.j;
                q7d0 q7d0Var = (q7d0) esg0Var.e;
                vby vbyVar = (vby) esg0Var.f;
                List list8 = ((x52) ((y52) obj2)).f40292a;
                vbyVar.getClass();
                q7d0Var.g("saved_allowed_sport_ids", vbyVar.d(new zw3(s710.f31729a, (byte) 0), list8));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                List list9 = (List) this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                yn2 yn2Var = (yn2) obj2;
                ocj ocjVar3 = yn2Var.i;
                if (!((xm2) yn2Var.D()).q && list9.isEmpty()) {
                    yn2Var.O(true);
                } else if (((xm2) yn2Var.D()).c && list9.isEmpty()) {
                    p7m0 p7m0Var10 = ocjVar3.f25029a;
                    do {
                        value8 = p7m0Var10.getValue();
                        value8.getClass();
                        iunVar = iun.f15405a;
                    } while (!p7m0Var10.m(value8, xm2.a((xm2) value8, false, true, false, iunVar, iunVar, null, false, false, false, false, false, false, 262100)));
                } else {
                    yn2Var.H(new bo0(list9, b3));
                }
                p7m0 p7m0Var11 = ocjVar3.f25029a;
                do {
                    value9 = p7m0Var11.getValue();
                    value9.getClass();
                } while (!p7m0Var11.m(value9, xm2.a((xm2) value9, false, false, false, null, null, null, false, false, false, false, false, false, 196607)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                qo2 qo2Var = (qo2) obj2;
                n0o0 n0o0Var = qo2Var.Q1;
                ep2 ep2Var = (ep2) this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                if (ep2Var != null) {
                    if (ep2Var instanceof dp2) {
                        jdk0 jdk0Var2 = qo2.R1;
                        qo2Var.G0().c.setVisibility(0);
                        qo2Var.G0().b.setVisibility(8);
                    } else if (ep2Var instanceof bp2) {
                        jdk0 jdk0Var3 = qo2.R1;
                        qo2Var.G0().c.setVisibility(8);
                        qo2Var.G0().b.setVisibility(8);
                        ((mo2) n0o0Var.getValue()).f = ((bp2) ep2Var).f2958a;
                        ((mo2) n0o0Var.getValue()).g();
                    } else if (ep2Var instanceof cp2) {
                        jdk0 jdk0Var4 = qo2.R1;
                        qo2Var.G0().c.setVisibility(8);
                        qo2Var.G0().b.v(((cp2) ep2Var).f4724a);
                        qo2Var.G0().b.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                ((Function1) this.j).invoke((rv2) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                vne vneVar = (vne) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                p53 p53Var = (p53) obj2;
                qjj.W(vneVar, null, null, new ah0((t33) p53Var.c.f38283a, new zsf(0.42f, 0.0f, 1.0f, 1.0f), p53Var.b, null, (byte) 3), 3);
                return Unit.f46060a;
            default:
                ij3 ij3Var = (ij3) obj2;
                p7m0 p7m0Var12 = ij3Var.k0;
                gr00 gr00Var2 = ij3Var.c;
                sf50 sf50Var = (sf50) this.j;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                nf50 nf50Var = nf50.f23419a;
                if (Intrinsics.d(sf50Var, nf50Var) || Intrinsics.d(sf50Var, of50.f25149a)) {
                    return Unit.f46060a;
                }
                if (Intrinsics.d(sf50Var, rf50.f30370a)) {
                    i1w0 i1w0Var2 = (i1w0) gr00Var2.f11760a;
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                    FragmentScreen proxySettingsScreen = new ProxySettingsScreen();
                    if (proxySettingsScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) proxySettingsScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(proxySettingsScreen)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                } else if (!(sf50Var instanceof pf50)) {
                    if (!(sf50Var instanceof qf50)) {
                        t9f.b();
                        return null;
                    }
                    qf50 qf50Var = (qf50) sf50Var;
                    if (qf50Var.f28614a) {
                        gr00Var2.C();
                    } else if (qf50Var.b) {
                        i1w0 i1w0Var3 = (i1w0) gr00Var2.f11760a;
                        CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                        SecurityNavigationScreen bindPhoneNumberScreen = new BindPhoneNumberScreen(new i38(17));
                        if (bindPhoneNumberScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) bindPhoneNumberScreen)));
                        } else {
                            copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(bindPhoneNumberScreen)));
                        }
                        ListIterator listIteratorO3 = b1j.o(i1w0Var3, copyOnWriteArrayListQ3, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorO3;
                            if (pawVar3.hasNext()) {
                                i1w0Var3.a((oe50) pawVar3.next());
                            }
                        }
                    } else {
                        ij3Var.B.g();
                        p7m0Var12.getClass();
                        p7m0Var12.o(null, nf50Var);
                    }
                } else if (((jh3) ij3Var.j0.getValue()).l) {
                    p7m0Var12.getClass();
                    p7m0Var12.o(null, nf50Var);
                } else {
                    ((i1w0) gr00Var2.f11760a).d(new b33(((pf50) sf50Var).f26885a, gr00Var2));
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
