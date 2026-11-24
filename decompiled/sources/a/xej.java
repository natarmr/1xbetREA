package a;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/xej;", "La/iw5;", "<init>", "()V", "a/nwd", "", "isApplyEnabled", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xej extends iw5 {
    public final khf0 k2 = new khf0("KEY_DATE_CALENDAR_PARAMS");
    public static final /* synthetic */ iiy[] m2 = {new ez40(xej.class, "params", "getParams()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;", 0)};
    public static final nwd l2 = new nwd();
    public static final String n2 = xej.class.getName();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        SimpleDateTime simpleDateTimeH0;
        Object objD0;
        fet fetVar2;
        SimpleDate simpleDateG0;
        Pair pair;
        fetVar.e0(923049657);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = Calendar.getInstance();
            fetVar.o0(objP);
        }
        Calendar calendar = (Calendar) objP;
        int iOrdinal = P0().d.ordinal();
        byte b = 3;
        Object objH0 = null;
        if (iOrdinal == 0) {
            fetVar.e0(-2103035323);
            SimpleDate simpleDate = P0().b.f47181a;
            SimpleDate simpleDate2 = P0().c.f47181a;
            TimeOfDay23 timeOfDay23 = P0().c.b;
            TimeOfDay23 timeOfDay24 = P0().b.b;
            Long l = P0().f;
            if (l != null) {
                long jLongValue = l.longValue();
                calendar.getClass();
                simpleDateTimeH0 = bsr0.h0(jLongValue, calendar);
            } else {
                simpleDateTimeH0 = null;
            }
            yg40 yg40Var = P0().e;
            Long l3 = P0().g;
            if (l3 != null) {
                long jLongValue2 = l3.longValue();
                calendar.getClass();
                objH0 = bsr0.h0(jLongValue2, calendar);
            }
            objD0 = rsr0.d0(simpleDate, simpleDate2, simpleDateTimeH0, objH0, timeOfDay24, timeOfDay23, yg40Var, fetVar, 18879048, 48);
            fetVar2 = fetVar;
            fetVar2.r(false);
        } else {
            if (iOrdinal != 1) {
                throw b1j.f(-2007504257, fetVar, false);
            }
            fetVar.e0(-2102329019);
            SimpleDate simpleDate3 = P0().b.f47181a;
            SimpleDate simpleDate4 = P0().c.f47181a;
            Long l4 = P0().f;
            if (l4 != null) {
                long jLongValue3 = l4.longValue();
                calendar.getClass();
                simpleDateG0 = bsr0.g0(jLongValue3, calendar);
            } else {
                simpleDateG0 = null;
            }
            Long l5 = P0().g;
            if (l5 != null) {
                long jLongValue4 = l5.longValue();
                calendar.getClass();
                objH0 = bsr0.g0(jLongValue4, calendar);
            }
            simpleDate3.getClass();
            simpleDate4.getClass();
            Locale localeS = a8k0.s();
            boolean zG = fetVar.g(localeS);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = Calendar.getInstance(localeS);
                fetVar.o0(objP2);
            }
            Calendar calendar2 = (Calendar) objP2;
            calendar2.getClass();
            boolean zG2 = fetVar.g(localeS);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                v0h0 v0h0Var = new v0h0(new zcj(calendar2, (byte) 2), new n72(calendar2, b));
                fetVar.o0(v0h0Var);
                objP3 = v0h0Var;
            }
            u0h0 u0h0Var = (u0h0) objP3;
            boolean zG3 = fetVar.g(localeS) | fetVar.g(simpleDate3) | fetVar.g(simpleDate4);
            Object objP4 = fetVar.P();
            if (zG3 || objP4 == cl5Var) {
                if (simpleDateG0 == null || objH0 == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jF0 = wdx.f0(simpleDate3, calendar2);
                    long jF1 = wdx.f0(simpleDate4, calendar2);
                    if (jF0 > jF1) {
                        SimpleDate simpleDateG1 = bsr0.g0(jF0, calendar2);
                        pair = new Pair(simpleDateG1, simpleDateG1);
                    } else {
                        long jF = l1e0.f(jCurrentTimeMillis, jF0, jF1);
                        if (jF <= jF1) {
                            jF1 = jF;
                        }
                        pair = new Pair(bsr0.g0(jF, calendar2), bsr0.g0(jF1 < jF ? jF : jF1, calendar2));
                    }
                    objP4 = pair;
                } else {
                    objP4 = new Pair(simpleDateG0, objH0);
                }
                fetVar.o0(objP4);
            }
            Pair pair2 = (Pair) objP4;
            SimpleDate simpleDate5 = (SimpleDate) pair2.f46059a;
            SimpleDate simpleDate6 = (SimpleDate) pair2.b;
            Object[] objArr = new Object[0];
            boolean zI = fetVar.i(simpleDate5) | fetVar.i(simpleDate6);
            Object objP5 = fetVar.P();
            if (zI || objP5 == cl5Var) {
                objP5 = new vef(simpleDate5, simpleDate6, (byte) 23);
                fetVar.o0(objP5);
            }
            pz40 pz40VarO = e9x.O(objArr, u0h0Var, (Function0) objP5, fetVar, 0);
            boolean zG4 = fetVar.g(localeS) | fetVar.g(simpleDate3) | fetVar.g(simpleDate4);
            Object objP6 = fetVar.P();
            if (zG4 || objP6 == cl5Var) {
                objP6 = new ffj(localeS, simpleDate3, simpleDate4, pz40VarO);
                fetVar.o0(objP6);
            }
            objD0 = (ffj) objP6;
            fetVar.r(false);
            fetVar2 = fetVar;
        }
        Object objP7 = fetVar2.P();
        if (objP7 == cl5Var) {
            objP7 = G().getString(R.string.calendar_start_period_selection_label);
            fetVar2.o0(objP7);
        }
        String str = (String) objP7;
        str.getClass();
        Object objP8 = fetVar2.P();
        if (objP8 == cl5Var) {
            objP8 = G().getString(R.string.calendar_end_period_selection_label);
            fetVar2.o0(objP8);
        }
        String str2 = (String) objP8;
        str2.getClass();
        Object objP9 = fetVar2.P();
        if (objP9 == cl5Var) {
            objP9 = G().getString(R.string.calendar_date_module_cancel);
            fetVar2.o0(objP9);
        }
        String str3 = (String) objP9;
        str3.getClass();
        Object objP10 = fetVar2.P();
        if (objP10 == cl5Var) {
            objP10 = G().getString(R.string.calendar_date_module_apply);
            fetVar2.o0(objP10);
        }
        String str4 = (String) objP10;
        str4.getClass();
        Object objP11 = fetVar2.P();
        if (objP11 == cl5Var) {
            objP11 = jgk0.b(new ucj(objD0, (byte) 3));
            fetVar2.o0(objP11);
        }
        l7m0 l7m0Var = (l7m0) objP11;
        boolean zG5 = fetVar2.g(str3);
        Object objP12 = fetVar2.P();
        if (zG5 || objP12 == cl5Var) {
            objP12 = new wul(nul.e, oe9.f25112a, new ue9(str3), true, false, false);
            fetVar2.o0(objP12);
        }
        wul wulVar = (wul) objP12;
        boolean zH = fetVar2.h(((Boolean) l7m0Var.getValue()).booleanValue()) | fetVar2.g(str4);
        Object objP13 = fetVar2.P();
        if (zH || objP13 == cl5Var) {
            objP13 = new wul(lul.e, oe9.f25112a, new ue9(str4), ((Boolean) l7m0Var.getValue()).booleanValue(), false, false);
            fetVar2.o0(objP13);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar2), u1c.M(371299560, new sd8(this, (byte) 25), fetVar2), u1c.M(540263600, new hgs0(wulVar, (wul) objP13, this, objD0, calendar, (byte) 5), fetVar2), u1c.M(-903624086, new qb(objD0, (Object) str, (Object) str2, (byte) 28), fetVar2), 2);
        fetVar2.r(false);
        return bw5Var;
    }

    public final DateRangeWithTimeCalendarBottomSheetParams P0() {
        return (DateRangeWithTimeCalendarBottomSheetParams) this.k2.n(this, m2[0]);
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().K = true;
        L0().N(3);
    }
}
