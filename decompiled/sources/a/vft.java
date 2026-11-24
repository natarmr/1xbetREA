package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_history.additional_info.presentation.AdditionalInfoScreen;
import org.xplatform.bethistory.alternative_info.presentation.AlternativeInfoScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vft extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37350a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vft(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f37350a = b;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x042a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0434  */
    /* JADX WARN: Code duplicated, block: B:224:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        int i;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object value4;
        Object value5;
        s77 s77Var;
        byte b = 26;
        Object obj2 = null;
        Object[] objArr = 0;
        switch (this.f37350a) {
            case 0:
                sft sftVar = (sft) obj;
                sftVar.getClass();
                ((k3t0) this.receiver).x(sftVar);
                return Unit.f46060a;
            case 1:
                yht yhtVar = (yht) obj;
                yhtVar.getClass();
                kit kitVar = (kit) this.receiver;
                bek bekVar = kit.Q1;
                kitVar.getClass();
                if (yhtVar instanceof vht) {
                    ii iiVar = kitVar.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = kitVar.H(R.string.error);
                    String str = ((vht) yhtVar).f37447a;
                    String strH2 = kitVar.H(R.string.ok);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = kitVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (!(yhtVar instanceof wht)) {
                    if (!(yhtVar instanceof xht)) {
                        t9f.b();
                        return null;
                    }
                    if (kitVar.C().J("GenerateCouponTypeSelectorBottomDialog") == null) {
                        ddk ddkVar = fit.m2;
                        ArrayList arrayList4 = ((xht) yhtVar).f40912a;
                        ddkVar.getClass();
                        fit fitVar = new fit();
                        iiy[] iiyVarArr = fit.n2;
                        fitVar.k2.x(fitVar, iiyVarArr[0], "EXTRA_REQUEST_KEY_TYPE");
                        fitVar.l2.I(fitVar, iiyVarArr[1], arrayList4);
                        fitVar.H0(kitVar.C(), "GenerateCouponTypeSelectorBottomDialog");
                    }
                } else if (kitVar.C().J("GenerateCouponTimeSelectorBottomDialog") == null) {
                    xak xakVar = dit.m2;
                    ArrayList arrayList5 = ((wht) yhtVar).f39182a;
                    xakVar.getClass();
                    dit ditVar = new dit();
                    iiy[] iiyVarArr2 = dit.n2;
                    ditVar.k2.x(ditVar, iiyVarArr2[0], "EXTRA_REQUEST_KEY_TIME");
                    ditVar.l2.I(ditVar, iiyVarArr2[1], arrayList5);
                    ditVar.H0(kitVar.C(), "GenerateCouponTimeSelectorBottomDialog");
                }
                kitVar.G0().x(mgt.f21759a);
                return Unit.f46060a;
            case 2:
                vgt vgtVar = (vgt) obj;
                vgtVar.getClass();
                ((k3t0) this.receiver).x(vgtVar);
                return Unit.f46060a;
            case 3:
                e8v e8vVar = (e8v) obj;
                e8vVar.getClass();
                ((k3t0) this.receiver).x(e8vVar);
                return Unit.f46060a;
            case 4:
                edv edvVar = (edv) obj;
                edvVar.getClass();
                ddv ddvVar = (ddv) this.receiver;
                art artVar = ddv.Q1;
                ddvVar.getClass();
                lme0 lme0Var = ljh0.m2;
                ArrayList arrayList6 = edvVar.f7638a;
                lme0Var.getClass();
                ljh0 ljh0Var = new ljh0();
                iiy[] iiyVarArr3 = ljh0.n2;
                ljh0Var.k2.D(ljh0Var, iiyVarArr3[0], arrayList6);
                ljh0Var.l2.x(ljh0Var, iiyVarArr3[1], "REQUEST_SELECT_SEASON_FILTER_DIALOG_KEY");
                androidx.fragment.app.e eVarC2 = ddvVar.C();
                eVarC2.getClass();
                sj3.D0(ljh0Var, eVarC2);
                ((k3t0) ddvVar.O1.getValue()).x(ycv.f42402a);
                return Unit.f46060a;
            case 5:
                zcv zcvVar = (zcv) obj;
                zcvVar.getClass();
                ((k3t0) this.receiver).x(zcvVar);
                return Unit.f46060a;
            case 6:
                Throwable th = (Throwable) obj;
                th.getClass();
                ndv ndvVar = (ndv) this.receiver;
                bby bbyVar = ndvVar.z;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                ndvVar.x.b(th, new jar(ndvVar, b));
                return Unit.f46060a;
            case 7:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ndv ndvVar2 = (ndv) this.receiver;
                bby bbyVar2 = ndvVar2.z;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                ndvVar2.x.b(th2, new jar(ndvVar2, b));
                return Unit.f46060a;
            case 8:
                List<wdv> list = (List) obj;
                list.getClass();
                bev bevVar = (bev) this.receiver;
                bevVar.getClass();
                for (wdv wdvVar : list) {
                    if (wdvVar instanceof qdv) {
                        bevVar.a(((qdv) wdvVar).f28553a);
                    } else if (wdvVar instanceof udv) {
                        qjj.W(bevVar.e, null, yne.d, new e3p((udv) wdvVar, objArr == true ? 1 : 0, (byte) 5), 1);
                    }
                }
                return Unit.f46060a;
            case 9:
                int iIntValue = ((Number) obj).intValue();
                p7m0 p7m0Var = ((ghv) this.receiver).d;
                List list2 = ((fhv) p7m0Var.getValue()).f9561a;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((phv) obj3).c) {
                        arrayList7.add(obj3);
                    }
                }
                int size = arrayList7.size();
                for (Object obj4 : ((fhv) p7m0Var.getValue()).f9561a) {
                    if (((phv) obj4).f27016a == iIntValue) {
                        obj2 = obj4;
                        phv phvVar = (phv) obj2;
                        if ((size != 1 && phvVar != null && !phvVar.c) || size > 1) {
                            do {
                                value = p7m0Var.getValue();
                                List<phv> list3 = ((fhv) value).f9561a;
                                arrayList = new ArrayList(r3d.q(list3, 10));
                                for (phv phvVar2 : list3) {
                                    i = phvVar2.f27016a;
                                    if (i == iIntValue) {
                                        boolean z = !phvVar2.c;
                                        String str2 = phvVar2.b;
                                        str2.getClass();
                                        phvVar2 = new phv(str2, i, z);
                                    }
                                    arrayList.add(phvVar2);
                                }
                            } while (!p7m0Var.m(value, new fhv(arrayList)));
                        }
                        return Unit.f46060a;
                    }
                }
                phv phvVar3 = (phv) obj2;
                if (size != 1) {
                    do {
                        value = p7m0Var.getValue();
                        List<phv> list4 = ((fhv) value).f9561a;
                        arrayList = new ArrayList(r3d.q(list4, 10));
                        while (r5.hasNext()) {
                            i = phvVar2.f27016a;
                            if (i == iIntValue) {
                                boolean z2 = !phvVar2.c;
                                String str3 = phvVar2.b;
                                str3.getClass();
                                phvVar2 = new phv(str3, i, z2);
                            }
                            arrayList.add(phvVar2);
                        }
                    } while (!p7m0Var.m(value, new fhv(arrayList)));
                } else {
                    do {
                        value = p7m0Var.getValue();
                        List<phv> list5 = ((fhv) value).f9561a;
                        arrayList = new ArrayList(r3d.q(list5, 10));
                        while (r5.hasNext()) {
                            i = phvVar2.f27016a;
                            if (i == iIntValue) {
                                boolean z3 = !phvVar2.c;
                                String str4 = phvVar2.b;
                                str4.getClass();
                                phvVar2 = new phv(str4, i, z3);
                            }
                            arrayList.add(phvVar2);
                        }
                    } while (!p7m0Var.m(value, new fhv(arrayList)));
                }
                return Unit.f46060a;
            case 10:
                nkv nkvVar = (nkv) obj;
                nkvVar.getClass();
                xkv xkvVar = (xkv) this.receiver;
                xkvVar.getClass();
                boolean z4 = !nkvVar.f23699a;
                ((cih) ((reu) xkvVar.f.f27236a).b).f4414a.d("HAND_SHAKE_ENABLED", z4);
                p7m0 p7m0Var2 = xkvVar.l;
                do {
                    value2 = p7m0Var2.getValue();
                    List<Object> list6 = (List) value2;
                    arrayList2 = new ArrayList(r3d.q(list6, 10));
                    for (Object objC : list6) {
                        if (objC != null) {
                            if (objC instanceof nkv) {
                                objC = new nkv(z4);
                            } else if (objC instanceof vkv) {
                                objC = vkv.c((vkv) objC, z4, false, 27);
                            }
                        }
                        arrayList2.add(objC);
                    }
                } while (!p7m0Var2.m(value2, arrayList2));
                return Unit.f46060a;
            case 11:
                vkv vkvVar = (vkv) obj;
                vkvVar.getClass();
                xkv xkvVar2 = (xkv) this.receiver;
                xkvVar2.getClass();
                oeu oeuVar = xkvVar2.e;
                rkv rkvVar = vkvVar.d;
                oeuVar.getClass();
                ((cih) oeuVar.f25140a.b).f4414a.e(rkvVar.ordinal(), "SELECTED_HAND_SHAKE_SCREEN");
                p7m0 p7m0Var3 = xkvVar2.l;
                do {
                    value3 = p7m0Var3.getValue();
                    List<Object> list7 = (List) value3;
                    arrayList3 = new ArrayList(r3d.q(list7, 10));
                    for (Object objC2 : list7) {
                        if (objC2 instanceof vkv) {
                            objC2 = vkv.c((vkv) objC2, false, objC2.equals(vkvVar), 15);
                        }
                        arrayList3.add(objC2);
                    }
                } while (!p7m0Var3.m(value3, arrayList3));
                return Unit.f46060a;
            case 12:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((duj) this.receiver).a(th3);
                return Unit.f46060a;
            case 13:
                ttv ttvVar = (ttv) obj;
                ttvVar.getClass();
                ((k3t0) this.receiver).x(ttvVar);
                return Unit.f46060a;
            case 14:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                vuv vuvVar = (vuv) this.receiver;
                vuvVar.getClass();
                th4.printStackTrace();
                p7m0 p7m0Var4 = vuvVar.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    vuvVar.f.getClass();
                } while (!p7m0Var4.m(value4, guv.a((guv) value4, false, true, null, null, null, 57)));
                return Unit.f46060a;
            case 15:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                vuv vuvVar2 = (vuv) this.receiver;
                vuvVar2.getClass();
                th5.printStackTrace();
                p7m0 p7m0Var5 = vuvVar2.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    vuvVar2.f.getClass();
                } while (!p7m0Var5.m(value5, guv.a((guv) value5, false, true, null, null, null, 57)));
                return Unit.f46060a;
            case 16:
                t21 t21Var = (t21) obj;
                t21Var.getClass();
                ((vyv) this.receiver).y(t21Var);
                return Unit.f46060a;
            case 17:
                t21 t21Var2 = (t21) obj;
                t21Var2.getClass();
                ((vyv) this.receiver).y(t21Var2);
                return Unit.f46060a;
            case 18:
                long jLongValue = ((Number) obj).longValue();
                q5w q5wVar = ((jzv) this.receiver).e;
                r9u r9uVar = q5wVar.o;
                ygp ygpVar = ygp.p;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                m7h0 additionalInfoScreen = j1q0Var.f15748a.d(ygpVar) ? new AdditionalInfoScreen(jLongValue) : new AlternativeInfoScreen(jLongValue);
                i1w0 i1w0Var = q5wVar.v;
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                if (additionalInfoScreen instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) additionalInfoScreen)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(additionalInfoScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                d0w d0wVar = (d0w) obj;
                d0wVar.getClass();
                vzv vzvVar = (vzv) this.receiver;
                sqt sqtVar = vzv.p2;
                vzvVar.getClass();
                if (!Intrinsics.d(d0wVar, b0w.f1779a) && Intrinsics.d(d0wVar, c0w.f3543a)) {
                    vcc.f0(i120.V(new Pair("HISTORY_STATUS_UPDATE_FILTER_REQUEST", Boolean.TRUE)), vzvVar, vzvVar.o2.n(vzvVar, vzv.q2[2]));
                }
                vzvVar.y0();
                return Unit.f46060a;
            case 20:
                a0w a0wVar = (a0w) obj;
                a0wVar.getClass();
                ((k3t0) this.receiver).x(a0wVar);
                return Unit.f46060a;
            case 21:
                pdj pdjVar = (pdj) obj;
                pdjVar.getClass();
                t0w t0wVar = (t0w) this.receiver;
                art artVar2 = t0w.l2;
                boolean zR = t0wVar.R();
                phf0 phf0Var = t0wVar.g2;
                if (!zR) {
                    iiy[] iiyVarArr4 = t0w.m2;
                    vcc.f0(i120.V(new Pair(phf0Var.n(t0wVar, iiyVarArr4[0]), pdjVar)), t0wVar, phf0Var.n(t0wVar, iiyVarArr4[0]));
                    t0wVar.y0();
                }
                return Unit.f46060a;
            case 22:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((duj) this.receiver).a(th6);
                return Unit.f46060a;
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                naw nawVar = (naw) this.receiver;
                nawVar.getClass();
                q37 q37Var = nawVar.l0;
                b4j b4jVar = q37Var.b;
                a1w a1wVar = a1w.k;
                r6w r6wVar = r6w.k;
                b4j.h(b4jVar, a1wVar, r6wVar);
                q37Var.c.d(r6wVar.a(), null, null);
                n3w n3wVarC = nawVar.J.c(str5);
                if (n3wVarC != null && (((s77Var = nawVar.D0) != s77.TOTO || s77Var != s77.JACKPOT) && n3wVarC.l == e4f.c)) {
                    nawVar.Z0.f(new m9w(n3wVarC));
                }
                return Unit.f46060a;
            case 24:
                String str6 = (String) obj;
                str6.getClass();
                naw nawVar2 = (naw) this.receiver;
                nawVar2.getClass();
                n3w n3wVarC2 = nawVar2.J.c(str6);
                if (n3wVarC2 != null) {
                    z4w z4wVar = nawVar2.R;
                    ql5 ql5Var = nawVar2.C0;
                    z4wVar.A(n3wVarC2, ql5Var != null ? ql5Var.f28916a : 0L, nawVar2.d);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str7 = (String) obj;
                str7.getClass();
                naw nawVar3 = (naw) this.receiver;
                nawVar3.getClass();
                q37 q37Var2 = nawVar3.l0;
                q37Var2.getClass();
                b1j.v(str7, q37Var2.c.f1455a, 3194L);
                i8i.D("option", str7, q37Var2.b.f1961a, "bet_history_winback_banner_click");
                String str8 = nawVar3.Q0.f32117a.k;
                kpc kpcVar = nawVar3.d0;
                lt2 lt2Var = new lt2(str7, str8);
                kpcVar.getClass();
                m0w m0wVar = (m0w) kpcVar.f18667a.g;
                m0wVar.getClass();
                m0wVar.f = lt2Var;
                nawVar3.Z0.f(new u8w(str8, str7));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((r2w) this.receiver).z(th7);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((r2w) this.receiver).z(th8);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((r2w) this.receiver).z(th9);
                return Unit.f46060a;
            default:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((q5w) this.receiver).w(th10);
                return Unit.f46060a;
        }
    }
}
