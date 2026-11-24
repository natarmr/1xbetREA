package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentUiModel;
import org.xplatform.personal.impl.presentation.edit.ProfileEditViewModel$UiState;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e9b0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9b0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f7412a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        ProfileEditUiModel profileEditUiModel;
        byte b = this.f7412a;
        byte b2 = 0;
        i2c0 i2c0Var = i2c0.f14040a;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((g9b0) this.receiver).B(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((sbb0) this.receiver).z(th2);
                return Unit.f46060a;
            case 2:
                iya0 iya0Var = (iya0) obj;
                iya0Var.getClass();
                ((k3t0) this.receiver).x(iya0Var);
                return Unit.f46060a;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((kgb0) this.receiver).Q(th3);
                return Unit.f46060a;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((kgb0) this.receiver).Q(th4);
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((kgb0) this.receiver).Q(th5);
                return Unit.f46060a;
            case 6:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((kgb0) this.receiver).Q(th6);
                return Unit.f46060a;
            case 7:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((kgb0) this.receiver).Q(th7);
                return Unit.f46060a;
            case 8:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((kgb0) this.receiver).Q(th8);
                return Unit.f46060a;
            case 9:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((kgb0) this.receiver).Q(th9);
                return Unit.f46060a;
            case 10:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                kgb0 kgb0Var = (kgb0) this.receiver;
                p7m0 p7m0Var = kgb0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    kgb0Var.f.getClass();
                } while (!p7m0Var.m(value, ufb0.a((ufb0) value, null, false, false, null, false, null, null, null, null, null, new xee(th10), 2047)));
                return Unit.f46060a;
            case 11:
                aza0 aza0Var = (aza0) obj;
                aza0Var.getClass();
                ((k3t0) this.receiver).x(aza0Var);
                return Unit.f46060a;
            case 12:
                aza0 aza0Var2 = (aza0) obj;
                aza0Var2.getClass();
                ((k3t0) this.receiver).x(aza0Var2);
                return Unit.f46060a;
            case 13:
                aeb0 aeb0Var = (aeb0) obj;
                aeb0Var.getClass();
                ((k3t0) this.receiver).x(aeb0Var);
                return Unit.f46060a;
            case 14:
                yob0 yob0Var = (yob0) obj;
                yob0Var.getClass();
                kob0 kob0Var = (kob0) this.receiver;
                rl70 rl70Var = kob0.R1;
                kob0Var.getClass();
                if (yob0Var instanceof vob0) {
                    kob0Var.G0().x(eob0.f8131a);
                    wdk0 wdk0Var = kob0Var.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((vob0) yob0Var).f37758a, null, null, null, null, 124), kob0Var, null, null, false, null, 1020);
                } else if (yob0Var instanceof xob0) {
                    wdk0 wdk0Var2 = kob0Var.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH = kob0Var.H(R.string.bet_processed_changed_successfully);
                    strH.getClass();
                    wdk0.k(wdk0Var2, new xdk0(qek0Var, strH, ((xob0) yob0Var).f41209a, null, null, null, 120), kob0Var, null, null, false, null, 1020);
                } else {
                    if (!(yob0Var instanceof wob0)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar = kob0Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH2 = kob0Var.H(R.string.error);
                    String str = ((wob0) yob0Var).f39487a;
                    String strH3 = kob0Var.H(R.string.ok);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str, (CharSequence) strH3, (String) null, (String) null, "ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = kob0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                }
                return Unit.f46060a;
            case 15:
                fob0 fob0Var = (fob0) obj;
                fob0Var.getClass();
                ((k3t0) this.receiver).x(fob0Var);
                return Unit.f46060a;
            case 16:
                w2c0 w2c0Var = (w2c0) obj;
                w2c0Var.getClass();
                org.xplatform.personal.impl.presentation.edit.n nVar = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                nVar.getClass();
                ProfileEditViewModel$UiState profileEditViewModel$UiStateB = nVar.B();
                if (profileEditViewModel$UiStateB instanceof ProfileEditViewModel$UiState.Loaded) {
                    sac.V(jiu0.a(nVar), new e9b0(1, nVar, org.xplatform.personal.impl.presentation.edit.n.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, nVar.k.f22085a, new org.xplatform.personal.impl.presentation.edit.k(w2c0Var, nVar, (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB, null), 10);
                }
                return Unit.f46060a;
            case 17:
                iqt0 iqt0Var = (iqt0) obj;
                iqt0Var.getClass();
                nqs nqsVar = ((org.xplatform.personal.impl.presentation.edit.n) this.receiver).d;
                nqsVar.getClass();
                ((z4w0) nqsVar.d).a(iqt0Var);
                return Unit.f46060a;
            case 18:
                qkt qktVar = (qkt) obj;
                qktVar.getClass();
                org.xplatform.personal.impl.presentation.edit.n nVar2 = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                nVar2.getClass();
                ProfileEditViewModel$UiState profileEditViewModel$UiStateB2 = nVar2.B();
                if (profileEditViewModel$UiStateB2 instanceof ProfileEditViewModel$UiState.Loaded) {
                    w2c0 w2c0Var2 = w2c0.j;
                    ProfileEditViewModel$UiState.Loaded loaded = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB2;
                    Map map = loaded.f46786a;
                    ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = org.xplatform.personal.impl.presentation.edit.n.z(loaded, w2c0Var2);
                    if ((profileEditUiModelItemClickableZ != null ? profileEditUiModelItemClickableZ.b : -1) != qktVar.f28902a) {
                        w2c0 w2c0Var3 = w2c0.l;
                        Object obj2 = map.get(w2c0Var3);
                        ProfileEditUiModel profileEditUiModel2 = obj2 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj2 : null;
                        if (profileEditUiModel2 != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ2 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel2, -1, "", false, false, "", 73);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                            linkedHashMap.put(w2c0Var3, profileEditUiModelItemClickableZ2);
                            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap);
                        }
                        Map map2 = loaded.f46786a;
                        w2c0 w2c0Var4 = w2c0.k;
                        Object obj3 = map2.get(w2c0Var4);
                        ProfileEditUiModel profileEditUiModel3 = obj3 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj3 : null;
                        if (profileEditUiModel3 != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ3 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel3, -1, "", false, true, "", 73);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                            linkedHashMap2.put(w2c0Var4, profileEditUiModelItemClickableZ3);
                            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap2);
                        }
                        Map map3 = loaded.f46786a;
                        w2c0 w2c0Var5 = w2c0.n;
                        Object obj4 = map3.get(w2c0Var5);
                        ProfileEditUiModel profileEditUiModel4 = obj4 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj4 : null;
                        if (profileEditUiModel4 != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ4 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel4, -1, "", false, true, "", 73);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map3);
                            linkedHashMap3.put(w2c0Var5, profileEditUiModelItemClickableZ4);
                            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap3);
                        }
                        Map map4 = loaded.f46786a;
                        Object obj5 = map4.get(w2c0Var2);
                        profileEditUiModel = obj5 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj5 : null;
                        if (profileEditUiModel != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ5 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, qktVar.f28902a, qktVar.b, false, false, "", 89);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(map4);
                            linkedHashMap4.put(w2c0Var2, profileEditUiModelItemClickableZ5);
                            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap4);
                        }
                        nVar2.E(loaded);
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rue0 rue0Var = (rue0) obj;
                rue0Var.getClass();
                org.xplatform.personal.impl.presentation.edit.n nVar3 = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                nVar3.getClass();
                ProfileEditViewModel$UiState profileEditViewModel$UiStateB3 = nVar3.B();
                if (profileEditViewModel$UiStateB3 instanceof ProfileEditViewModel$UiState.Loaded) {
                    uue0 uue0Var = rue0Var.d;
                    long j = rue0Var.f31124a;
                    int iOrdinal = uue0Var.ordinal();
                    if (iOrdinal == 2) {
                        ProfileEditViewModel$UiState.Loaded loaded2 = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB3;
                        Map map5 = loaded2.f46786a;
                        w2c0 w2c0Var6 = w2c0.l;
                        Object obj6 = map5.get(w2c0Var6);
                        ProfileEditUiModel profileEditUiModel5 = obj6 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj6 : null;
                        if (profileEditUiModel5 != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ6 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel5, -1, "", false, true, "", 73);
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(map5);
                            linkedHashMap5.put(w2c0Var6, profileEditUiModelItemClickableZ6);
                            loaded2 = new ProfileEditViewModel$UiState.Loaded(linkedHashMap5);
                        }
                        Map map6 = loaded2.f46786a;
                        w2c0 w2c0Var7 = w2c0.k;
                        Object obj7 = map6.get(w2c0Var7);
                        profileEditUiModel = obj7 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj7 : null;
                        if (profileEditUiModel != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ7 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, (int) j, rue0Var.b, false, false, "", 89);
                            LinkedHashMap linkedHashMap6 = new LinkedHashMap(map6);
                            linkedHashMap6.put(w2c0Var7, profileEditUiModelItemClickableZ7);
                            loaded2 = new ProfileEditViewModel$UiState.Loaded(linkedHashMap6);
                        }
                        nVar3.E(loaded2);
                    } else if (iOrdinal == 3) {
                        ProfileEditViewModel$UiState.Loaded loaded3 = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB3;
                        Map map7 = loaded3.f46786a;
                        w2c0 w2c0Var8 = w2c0.l;
                        Object obj8 = map7.get(w2c0Var8);
                        profileEditUiModel = obj8 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj8 : null;
                        if (profileEditUiModel != null) {
                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ8 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, (int) j, rue0Var.b, false, false, "", 89);
                            LinkedHashMap linkedHashMap7 = new LinkedHashMap(map7);
                            linkedHashMap7.put(w2c0Var8, profileEditUiModelItemClickableZ8);
                            loaded3 = new ProfileEditViewModel$UiState.Loaded(linkedHashMap7);
                        }
                        nVar3.E(loaded3);
                    }
                } else {
                    nVar3.D(i2c0Var);
                }
                return Unit.f46060a;
            case 20:
                PersonalDocumentUiModel personalDocumentUiModel = (PersonalDocumentUiModel) obj;
                personalDocumentUiModel.getClass();
                org.xplatform.personal.impl.presentation.edit.n nVar4 = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                nVar4.getClass();
                ProfileEditViewModel$UiState profileEditViewModel$UiStateB4 = nVar4.B();
                if (profileEditViewModel$UiStateB4 instanceof ProfileEditViewModel$UiState.Loaded) {
                    int i = personalDocumentUiModel.f46784a;
                    ProfileEditViewModel$UiState.Loaded loaded4 = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB4;
                    Map map8 = loaded4.f46786a;
                    w2c0 w2c0Var9 = w2c0.n;
                    Object obj9 = map8.get(w2c0Var9);
                    ProfileEditUiModel profileEditUiModel6 = obj9 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj9 : null;
                    if (profileEditUiModel6 != null) {
                        ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ9 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel6, i, personalDocumentUiModel.b, false, false, "", 89);
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap(map8);
                        linkedHashMap8.put(w2c0Var9, profileEditUiModelItemClickableZ9);
                        loaded4 = new ProfileEditViewModel$UiState.Loaded(linkedHashMap8);
                    }
                    w2c0 w2c0Var10 = w2c0.t;
                    Map map9 = loaded4.f46786a;
                    Object obj10 = map9.get(w2c0Var10);
                    profileEditUiModel = obj10 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj10 : null;
                    if (profileEditUiModel != null) {
                        ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ10 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, 0, null, (i == 103 || i == 29) ? (byte) 1 : (byte) 0, false, "", 87);
                        LinkedHashMap linkedHashMap9 = new LinkedHashMap(map9);
                        linkedHashMap9.put(w2c0Var10, profileEditUiModelItemClickableZ10);
                        loaded4 = new ProfileEditViewModel$UiState.Loaded(linkedHashMap9);
                    }
                    nVar4.E(loaded4);
                } else {
                    nVar4.D(i2c0Var);
                }
                return Unit.f46060a;
            case 21:
                o1c0 o1c0Var = (o1c0) obj;
                o1c0Var.getClass();
                a1c0 a1c0Var = (a1c0) this.receiver;
                rl70 rl70Var2 = a1c0.O1;
                a1c0Var.getClass();
                if (o1c0Var instanceof f1c0) {
                    qud qudVar = bej.i2;
                    androidx.fragment.app.e eVarC2 = a1c0Var.C();
                    eVarC2.getClass();
                    p0z p0zVar = new p0z((Object) a1c0Var, (byte) 25);
                    Calendar calendar = ((f1c0) o1c0Var).b;
                    qud.h(qudVar, eVarC2, p0zVar, calendar, R.style.ThemeOverlay_AppTheme_MaterialCalendar_New, calendar.getTimeInMillis(), null, 80);
                } else if (o1c0Var instanceof h1c0) {
                    h1c0 h1c0Var = (h1c0) o1c0Var;
                    jh70 jh70Var = a1c0Var.N1;
                    if (jh70Var == null) {
                        Intrinsics.h("personalScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC3 = a1c0Var.C();
                    eVarC3.getClass();
                    jh70Var.m(eVarC3, new ft00(h1c0Var.f12277a, "LOCATION_CHOICE_ITEM_KEY"));
                } else if (o1c0Var instanceof g1c0) {
                    g1c0 g1c0Var = (g1c0) o1c0Var;
                    if (a1c0Var.N1 == null) {
                        Intrinsics.h("personalScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC4 = a1c0Var.C();
                    eVarC4.getClass();
                    yft yftVar = new yft(g1c0Var.f10507a);
                    wft.n2.getClass();
                    String str2 = wft.p2;
                    if (eVarC4.J(str2) == null) {
                        wft wftVar = new wft();
                        wftVar.m2.u(wftVar, wft.o2[0], yftVar);
                        wftVar.H0(eVarC4, str2);
                    }
                } else if (o1c0Var instanceof i1c0) {
                    rl70 rl70Var3 = a1c0Var.G0().t;
                    androidx.fragment.app.e eVarC5 = a1c0Var.C();
                    eVarC5.getClass();
                    rl70Var3.e(eVarC5, new PickerParams.ResidentStatus(Integer.valueOf(((i1c0) o1c0Var).f13991a)), AnalyticsEntryPoint.b);
                } else if (o1c0Var instanceof j1c0) {
                    d7a d7aVar = ((j1c0) o1c0Var).f15727a;
                    gl5 gl5Var = a1c0Var.G0().u;
                    String strH4 = a1c0Var.H(R.string.personal_data_entry_title);
                    strH4.getClass();
                    gl5.q(a1c0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH4);
                } else if (o1c0Var instanceof k1c0) {
                    String str3 = ((k1c0) o1c0Var).f17516a;
                    ii iiVar2 = a1c0Var.G0().v;
                    String strH5 = a1c0Var.H(R.string.ok_new);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) null, (CharSequence) str3, (CharSequence) strH5, (String) null, (String) null, "ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1497);
                    androidx.fragment.app.e eVarC6 = a1c0Var.C();
                    eVarC6.getClass();
                    iiVar2.d(dialogFields2, eVarC6);
                } else if (o1c0Var.equals(m1c0.f21001a)) {
                    ii iiVar3 = a1c0Var.G0().v;
                    String strH6 = a1c0Var.H(R.string.required_fields_is_not_filled);
                    String strH7 = a1c0Var.H(R.string.ok_new);
                    strH7.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) null, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1529);
                    androidx.fragment.app.e eVarC7 = a1c0Var.C();
                    eVarC7.getClass();
                    iiVar3.d(dialogFields3, eVarC7);
                } else if (o1c0Var.equals(n1c0.f22744a)) {
                    ii iiVar4 = a1c0Var.G0().v;
                    String strH8 = a1c0Var.H(R.string.success_send_data);
                    String strH9 = a1c0Var.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) null, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, "ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1497);
                    androidx.fragment.app.e eVarC8 = a1c0Var.C();
                    eVarC8.getClass();
                    iiVar4.d(dialogFields4, eVarC8);
                } else {
                    if (!o1c0Var.equals(l1c0.f19245a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar5 = a1c0Var.G0().v;
                    String strH10 = a1c0Var.H(R.string.attention);
                    String strH11 = a1c0Var.H(R.string.data_lost_warning);
                    String strH12 = a1c0Var.H(R.string.ok_new);
                    strH12.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, a1c0Var.H(R.string.cancel), (String) null, "EXIT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC9 = a1c0Var.C();
                    eVarC9.getClass();
                    iiVar5.d(dialogFields5, eVarC9);
                }
                a1c0Var.H0().x(h0c0.f12229a);
                return Unit.f46060a;
            case 22:
                u0c0 u0c0Var = (u0c0) obj;
                u0c0Var.getClass();
                ((k3t0) this.receiver).x(u0c0Var);
                return Unit.f46060a;
            case 23:
                ((Throwable) obj).getClass();
                ((org.xplatform.personal.impl.presentation.edit.n) this.receiver).E(ProfileEditViewModel$UiState.Error.f46785a);
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).getClass();
                ((org.xplatform.personal.impl.presentation.edit.n) this.receiver).D(i2c0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                org.xplatform.personal.impl.presentation.edit.n nVar5 = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                nVar5.i.b(th11, new lma0(nVar5, (byte) 15));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                ((org.xplatform.personal.impl.presentation.edit.n) this.receiver).D(i2c0Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                g7c0 g7c0Var = (g7c0) this.receiver;
                g7c0Var.k.b(th12, new c7c0(g7c0Var, b2));
                g7c0Var.A.f(uq00.f36094a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ptc0 ptc0Var = (ptc0) obj;
                ptc0Var.getClass();
                tac0 tac0Var = ((hyc0) this.receiver).c;
                tac0Var.getClass();
                tac0Var.v(ptc0Var.b);
                return Unit.f46060a;
            default:
                euc0 euc0Var = (euc0) obj;
                euc0Var.getClass();
                ((hyc0) this.receiver).C(euc0Var);
                return Unit.f46060a;
        }
    }
}
