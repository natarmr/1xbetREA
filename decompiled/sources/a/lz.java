package a;

import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class lz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mz k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz(mz mzVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mzVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mz mzVar = this.k;
        switch (b) {
            case 0:
                lz lzVar = new lz(mzVar, yjeVar, (byte) 0);
                lzVar.j = obj;
                return lzVar;
            case 1:
                lz lzVar2 = new lz(mzVar, yjeVar, (byte) 1);
                lzVar2.j = obj;
                return lzVar2;
            default:
                lz lzVar3 = new lz(mzVar, yjeVar, (byte) 2);
                lzVar3.j = obj;
                return lzVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lz) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lz) create((yz) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lz) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mz mzVar = this.k;
        switch (b) {
            case 0:
                String str = (String) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mz mzVar2 = this.k;
                wdk0 wdk0Var = mzVar2.N1;
                if (wdk0Var != null) {
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), mzVar2, null, null, false, null, 1020);
                    return Unit.f46060a;
                }
                Intrinsics.h("snackbarManager");
                throw null;
            case 1:
                yz yzVar = (yz) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jdk0 jdk0Var = mz.V1;
                if (Intrinsics.d(yzVar, qz.f29557a)) {
                    ii iiVar = mzVar.M1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = mzVar.H(R.string.attention);
                    String strH2 = mzVar.H(R.string.close_the_activation_process_new);
                    String strH3 = mzVar.H(R.string.interrupt);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, mzVar.H(R.string.cancel), (String) null, "REQUEST_BACK_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = mzVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (yzVar instanceof rz) {
                    int i = ((rz) yzVar).f31335a;
                    jh70 jh70Var = mzVar.K1;
                    if (jh70Var == null) {
                        Intrinsics.h("personalScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = mzVar.C();
                    eVarC2.getClass();
                    jh70Var.l(eVarC2, new dqe("COUNTRY_CHOOSE_ITEM_KEY", i));
                } else if (yzVar instanceof tz) {
                    Calendar calendar = ((tz) yzVar).f34780a;
                    qud qudVar = bej.i2;
                    androidx.fragment.app.e eVarC3 = mzVar.C();
                    eVarC3.getClass();
                    qud.h(qudVar, eVarC3, new un6(mzVar, (byte) 5), calendar, R.style.ThemeOverlay_AppTheme_MaterialCalendar_DatePicker, calendar.getTimeInMillis(), null, 80);
                } else if (yzVar instanceof uz) {
                    String str2 = ((uz) yzVar).f36513a;
                    ii iiVar2 = mzVar.M1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = mzVar.H(R.string.error);
                    String strH5 = mzVar.H(R.string.ok_new);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str2, (CharSequence) strH5, (String) null, (String) null, "REQUEST_ROTTEN_TOKEN_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC4 = mzVar.C();
                    eVarC4.getClass();
                    iiVar2.d(dialogFields2, eVarC4);
                } else if (yzVar instanceof pz) {
                    pz pzVar = (pz) yzVar;
                    int i2 = pzVar.b;
                    int i3 = pzVar.f27822a;
                    jh70 jh70Var2 = mzVar.K1;
                    if (jh70Var2 == null) {
                        Intrinsics.h("personalScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC5 = mzVar.C();
                    eVarC5.getClass();
                    jh70Var2.m(eVarC5, new ft00(new st00(i2, i3), "CITY_CHOOSE_ITEM_KEY"));
                } else if (yzVar instanceof vz) {
                    vz vzVar = (vz) yzVar;
                    int i4 = vzVar.b;
                    int i5 = vzVar.f38274a;
                    jh70 jh70Var3 = mzVar.K1;
                    if (jh70Var3 == null) {
                        Intrinsics.h("personalScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC6 = mzVar.C();
                    eVarC6.getClass();
                    jh70Var3.m(eVarC6, new ft00(new tt00(i4, i5), "REGION_CHOOSE_ITEM_KEY"));
                } else if (yzVar instanceof xz) {
                    ii iiVar3 = mzVar.M1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH6 = mzVar.H(R.string.error);
                    String strH7 = mzVar.H(R.string.request_error);
                    String strH8 = mzVar.H(R.string.ok_new);
                    strH8.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC7 = mzVar.C();
                    eVarC7.getClass();
                    iiVar3.d(dialogFields3, eVarC7);
                } else if (yzVar instanceof wz) {
                    int i6 = ((wz) yzVar).f39998a;
                    rl70 rl70Var = mzVar.L1;
                    if (rl70Var == null) {
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC8 = mzVar.C();
                    eVarC8.getClass();
                    rl70Var.e(eVarC8, new PickerParams.Phone(Integer.valueOf(i6), false, true), AnalyticsEntryPoint.b);
                } else {
                    if (!(yzVar instanceof sz)) {
                        t9f.b();
                        return null;
                    }
                    int i7 = ((sz) yzVar).f33046a;
                    rl70 rl70Var2 = mzVar.L1;
                    if (rl70Var2 == null) {
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC9 = mzVar.C();
                    eVarC9.getClass();
                    rl70Var2.e(eVarC9, new PickerParams.Phone(Integer.valueOf(i7), true, true), AnalyticsEntryPoint.b);
                }
                return Unit.f46060a;
            default:
                List list = (List) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                mzVar.R1.A(list);
                return Unit.f46060a;
        }
    }
}
