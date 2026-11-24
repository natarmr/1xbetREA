package a;

import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferFilterTimeCustomDateValue;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.timefilter.model.TransfersTimeFilterBottomParams;
import org.xplatform.ui_core.calendar.model.BorderDateTimeModel;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uks0;", "La/iw5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uks0 extends iw5 {
    public final khf0 k2 = new khf0("params_key");
    public static final /* synthetic */ iiy[] m2 = {new ez40(uks0.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;", 0)};
    public static final s9m0 l2 = new s9m0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        TransferTimeFilterUiModel.CustomTime customTime;
        bw5 bw5Var;
        String str;
        int i;
        String str2;
        String str3;
        Object objValueOf;
        Object objValueOf2;
        SimpleDate simpleDate;
        SimpleDate simpleDate2;
        fetVar.e0(1457648853);
        Locale locale = ((Configuration) fetVar.k(dy2.f6873a)).getLocales().get(0);
        locale.getClass();
        iiy[] iiyVarArr = m2;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.k2;
        Object obj = ((TransfersTimeFilterBottomParams) khf0Var.n(this, iiyVar)).f46622a;
        a4x a4xVarO0 = dyb.o0(((TransfersTimeFilterBottomParams) khf0Var.n(this, iiyVarArr[0])).b);
        obj.getClass();
        a4xVarO0.getClass();
        String strW = rsm0.w(R.string.select, 0, fetVar);
        boolean zG = fetVar.g(locale);
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        if (zG || objP == obj2) {
            objP = androidx.compose.runtime.e.e(obj);
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        boolean zG2 = fetVar.g(locale);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == obj2) {
            lc00 lc00VarB = kotlin.collections.a.b();
            Iterator it = a4xVarO0.iterator();
            while (it.hasNext()) {
                TransferTimeFilterUiModel transferTimeFilterUiModel = (TransferTimeFilterUiModel) it.next();
                if (transferTimeFilterUiModel != null) {
                    if (transferTimeFilterUiModel instanceof TransferTimeFilterUiModel.CustomTime) {
                        lc00VarB.add(new wks0(transferTimeFilterUiModel, pz40Var.getValue() instanceof TransferTimeFilterUiModel.CustomTime, R.string.select_period));
                        Object value = pz40Var.getValue();
                        TransferTimeFilterUiModel.CustomTime customTime2 = value instanceof TransferTimeFilterUiModel.CustomTime ? (TransferTimeFilterUiModel.CustomTime) value : null;
                        if (customTime2 != null) {
                            TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue = customTime2.f46618a;
                            boolean z = transferFilterTimeCustomDateValue instanceof TransferFilterTimeCustomDateValue.Selected;
                            TransferFilterTimeCustomDateValue.Unselected unselected = TransferFilterTimeCustomDateValue.Unselected.f46617a;
                            if (z) {
                                SimpleDate simpleDate3 = ((TransferFilterTimeCustomDateValue.Selected) transferFilterTimeCustomDateValue).f46616a;
                                str = strW;
                                str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate3.c)}, 1)) + Separators.DOT + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate3.b)}, 1)) + Separators.DOT + simpleDate3.f47286a;
                            } else {
                                str = strW;
                                if (!Intrinsics.d(transferFilterTimeCustomDateValue, unselected)) {
                                    t9f.b();
                                    return null;
                                }
                                str2 = str;
                            }
                            lc00VarB.add(new yks0(customTime2, R.string.start_date_period, str2, wui0.b));
                            TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue2 = customTime2.b;
                            if (transferFilterTimeCustomDateValue2 instanceof TransferFilterTimeCustomDateValue.Selected) {
                                SimpleDate simpleDate4 = ((TransferFilterTimeCustomDateValue.Selected) transferFilterTimeCustomDateValue2).f46616a;
                                str3 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate4.c)}, 1)) + Separators.DOT + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(simpleDate4.b)}, 1)) + Separators.DOT + simpleDate4.f47286a;
                            } else {
                                if (!Intrinsics.d(transferFilterTimeCustomDateValue2, unselected)) {
                                    t9f.b();
                                    return null;
                                }
                                str3 = str;
                            }
                            lc00VarB.add(new yks0(customTime2, R.string.end_date_period, str3, wui0.d));
                        } else {
                            it = it;
                            str = strW;
                        }
                    } else {
                        it = it;
                        str = strW;
                        bw5Var = null;
                        if (transferTimeFilterUiModel instanceof TransferTimeFilterUiModel.SimpleTime) {
                            boolean zEquals = transferTimeFilterUiModel.equals(obj);
                            int iOrdinal = ((TransferTimeFilterUiModel.SimpleTime) transferTimeFilterUiModel).f46619a.ordinal();
                            if (iOrdinal == 0) {
                                i = R.string.all_time_calendar;
                            } else if (iOrdinal == 1) {
                                i = R.string.filter_24h;
                            } else if (iOrdinal == 2) {
                                i = R.string.filter_3d;
                            } else if (iOrdinal == 3) {
                                i = R.string.week;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.string.one_month;
                            }
                            lc00VarB.add(new wks0(transferTimeFilterUiModel, zEquals, i));
                        }
                    }
                    it = it;
                    strW = str;
                } else {
                    bw5Var = null;
                }
                t9f.b();
                return bw5Var;
            }
            customTime = null;
            objP2 = kotlin.collections.a.a(lc00VarB);
            fetVar.o0(objP2);
        } else {
            customTime = null;
        }
        List list = (List) objP2;
        String strW2 = rsm0.w(R.string.calendar_date_module_set_period, 0, fetVar);
        boolean zG3 = fetVar.g(obj);
        Object objP3 = fetVar.P();
        if (zG3 || objP3 == obj2) {
            TransferTimeFilterUiModel.CustomTime customTime3 = obj instanceof TransferTimeFilterUiModel.CustomTime ? (TransferTimeFilterUiModel.CustomTime) obj : customTime;
            Calendar calendar = Calendar.getInstance(locale);
            Parcelable parcelable = customTime3 != null ? customTime3.f46618a : customTime;
            TransferFilterTimeCustomDateValue.Selected selected = parcelable instanceof TransferFilterTimeCustomDateValue.Selected ? (TransferFilterTimeCustomDateValue.Selected) parcelable : customTime;
            if (selected == 0 || (simpleDate2 = selected.f46616a) == null) {
                objValueOf = customTime;
            } else {
                calendar.getClass();
                wdx.J(simpleDate2, calendar);
                objValueOf = Long.valueOf(calendar.getTimeInMillis());
            }
            Parcelable parcelable2 = customTime3 != null ? customTime3.b : customTime;
            TransferFilterTimeCustomDateValue.Selected selected2 = parcelable2 instanceof TransferFilterTimeCustomDateValue.Selected ? (TransferFilterTimeCustomDateValue.Selected) parcelable2 : customTime;
            if (selected2 == 0 || (simpleDate = selected2.f46616a) == null) {
                objValueOf2 = customTime;
            } else {
                calendar.getClass();
                wdx.J(simpleDate, calendar);
                objValueOf2 = Long.valueOf(calendar.getTimeInMillis());
            }
            objP3 = new Pair(objValueOf, objValueOf2);
            fetVar.o0(objP3);
        }
        Pair pair = (Pair) objP3;
        boolean zG4 = fetVar.g(locale);
        Object objP4 = fetVar.P();
        byte b = 12;
        if (zG4 || objP4 == obj2) {
            Calendar calendar2 = Calendar.getInstance(locale);
            calendar2.getClass();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            objP4 = androidx.compose.runtime.e.e(calendar2);
            fetVar.o0(objP4);
        }
        pz40 pz40Var2 = (pz40) objP4;
        SimpleDate simpleDate5 = new SimpleDate(((Calendar) pz40Var2.getValue()).get(1), ((Calendar) pz40Var2.getValue()).get(2) + 1, ((Calendar) pz40Var2.getValue()).get(5));
        Object objP5 = fetVar.P();
        if (objP5 == obj2) {
            objP5 = new SimpleDate(2000, 1, 1);
            fetVar.o0(objP5);
        }
        SimpleDate simpleDate6 = (SimpleDate) objP5;
        Object objP6 = fetVar.P();
        if (objP6 == obj2) {
            ulq0 ulq0Var = ulq0.f35886a;
            TimeOfDay23 timeOfDay23 = customTime;
            objP6 = new DateRangeWithTimeCalendarBottomSheetParams(strW2, new BorderDateTimeModel(simpleDate6, timeOfDay23), new BorderDateTimeModel(simpleDate5, timeOfDay23), (Long) pair.f46059a, (Long) pair.b, 16);
            fetVar.o0(objP6);
        }
        DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams = (DateRangeWithTimeCalendarBottomSheetParams) objP6;
        boolean zG5 = fetVar.g(locale) | fetVar.g(obj);
        Object objP7 = fetVar.P();
        if (zG5 || objP7 == obj2) {
            objP7 = new yhs0(locale, dyb.o0(list), dateRangeWithTimeCalendarBottomSheetParams, pz40Var);
            fetVar.o0(objP7);
        }
        Object obj3 = (yhs0) objP7;
        Unit unit = Unit.f46060a;
        boolean zI = fetVar.i(this) | fetVar.g(obj3);
        Object objP8 = fetVar.P();
        if (zI || objP8 == obj2) {
            objP8 = new rtq0(this, obj3, null, b);
            fetVar.o0(objP8);
        }
        m0x0.t(fetVar, unit, (Function2) objP8);
        Object objP9 = fetVar.P();
        if (objP9 == obj2) {
            objP9 = new yip0(obj3, (Object) this, (byte) 24);
            fetVar.o0(objP9);
        }
        Function0 function0 = (Function0) objP9;
        Object objP10 = fetVar.P();
        if (objP10 == obj2) {
            objP10 = new lcr0(this, (byte) 19);
            fetVar.o0(objP10);
        }
        bw5 bw5Var2 = new bw5(iw5.O0(1, fetVar), vbw0.e, (ugd) null, u1c.M(-323085178, new sqc0((byte) 21, obj3, (Object) function0, (Function1) objP10), fetVar), 10);
        fetVar.r(false);
        return bw5Var2;
    }
}
