package a;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/dej;", "La/iw5;", "<init>", "()V", "a/kwd", "", "isApplyEnabled", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dej extends iw5 {
    public final khf0 k2 = new khf0("KEY_DATE_CALENDAR_RANGE_PARAMS");
    public static final /* synthetic */ iiy[] m2 = {new ez40(dej.class, "params", "getParams()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;", 0)};
    public static final kwd l2 = new kwd();
    public static final String n2 = dej.class.getName();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1346157977);
        SimpleDate simpleDate = P0().d;
        SimpleDate simpleDate2 = P0().e;
        Integer num = P0().f;
        Integer numValueOf = Integer.valueOf(P0().g);
        Object obj = P0().h;
        simpleDate.getClass();
        simpleDate2.getClass();
        Locale localeS = a8k0.s();
        boolean zG = fetVar.g(localeS);
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        Object obj3 = objP;
        if (zG || objP == obj2) {
            Object calendar = Calendar.getInstance(localeS);
            fetVar.o0(calendar);
            obj3 = calendar;
        }
        Calendar calendar2 = (Calendar) obj3;
        boolean zG2 = fetVar.g(localeS);
        Object objP2 = fetVar.P();
        char c = 2;
        byte b = 1;
        if (zG2 || objP2 == obj2) {
            calendar2.getClass();
            Object v0h0Var = new v0h0(new zcj(calendar2, b), new n72(calendar2, c));
            fetVar.o0(v0h0Var);
            objP2 = v0h0Var;
        }
        u0h0 u0h0Var = (u0h0) objP2;
        Object[] objArr = new Object[0];
        boolean zI = fetVar.i(obj);
        Object objP3 = fetVar.P();
        Object obj4 = objP3;
        if (zI || objP3 == obj2) {
            Object ucjVar = new ucj(obj, (byte) 2);
            fetVar.o0(ucjVar);
            obj4 = ucjVar;
        }
        pz40 pz40VarO = e9x.O(objArr, u0h0Var, (Function0) obj4, fetVar, 0);
        boolean zG3 = fetVar.g(simpleDate) | fetVar.g(simpleDate2) | fetVar.g(num) | fetVar.g(numValueOf) | fetVar.g(localeS);
        Object objP4 = fetVar.P();
        if (zG3 || objP4 == obj2) {
            Object jejVar = new jej(localeS, simpleDate, simpleDate2, num != null ? num.intValue() : 2, numValueOf, pz40VarO);
            fetVar.o0(jejVar);
            objP4 = jejVar;
        }
        jej jejVar2 = (jej) objP4;
        Object objP5 = fetVar.P();
        Object obj5 = objP5;
        if (objP5 == obj2) {
            Object string = G().getString(R.string.calendar_date_module_cancel);
            fetVar.o0(string);
            obj5 = string;
        }
        String str = (String) obj5;
        str.getClass();
        Object objP6 = fetVar.P();
        Object obj6 = objP6;
        if (objP6 == obj2) {
            Object string2 = G().getString(R.string.calendar_date_module_apply);
            fetVar.o0(string2);
            obj6 = string2;
        }
        String str2 = (String) obj6;
        str2.getClass();
        boolean zG4 = fetVar.g(P0());
        Object objP7 = fetVar.P();
        Object obj7 = objP7;
        if (zG4 || objP7 == obj2) {
            String string3 = G().getString(R.string.calendar_date_range_max_day_period_v2);
            string3.getClass();
            Object obj8 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(P0().g)}, 1));
            fetVar.o0(obj8);
            obj7 = obj8;
        }
        String str3 = (String) obj7;
        boolean zG5 = fetVar.g(jejVar2);
        Object objP8 = fetVar.P();
        Object obj9 = objP8;
        if (zG5 || objP8 == obj2) {
            Object utlVar = new utl(jejVar2);
            fetVar.o0(utlVar);
            obj9 = utlVar;
        }
        utl utlVar2 = (utl) obj9;
        Object objP9 = fetVar.P();
        Object obj10 = objP9;
        if (objP9 == obj2) {
            Object objB = jgk0.b(new ucj(jejVar2, (byte) 1));
            fetVar.o0(objB);
            obj10 = objB;
        }
        l7m0 l7m0Var = (l7m0) obj10;
        boolean zG6 = fetVar.g(str);
        Object objP10 = fetVar.P();
        if (zG6 || objP10 == obj2) {
            objP10 = new wul(nul.e, oe9.f25112a, new ue9(str), true, false, false);
            fetVar.o0(objP10);
        }
        wul wulVar = (wul) objP10;
        boolean zH = fetVar.h(((Boolean) l7m0Var.getValue()).booleanValue()) | fetVar.g(str2);
        Object objP11 = fetVar.P();
        if (zH || objP11 == obj2) {
            objP11 = new wul(lul.e, oe9.f25112a, new ue9(str2), ((Boolean) l7m0Var.getValue()).booleanValue(), false, false);
            fetVar.o0(objP11);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(689041864, new rgh(this, str3, (byte) 4), fetVar), u1c.M(634171792, new x2g((Object) wulVar, objP11, (Object) this, (Object) jejVar2, (byte) 15), fetVar), u1c.M(1591962442, new rgh(this, utlVar2, (byte) 5), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final DateRangeCalendarBottomSheetParams P0() {
        return (DateRangeCalendarBottomSheetParams) this.k2.n(this, m2[0]);
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().K = true;
        L0().N(3);
    }
}
