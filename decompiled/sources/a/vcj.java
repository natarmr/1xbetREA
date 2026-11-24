package a;

import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/vcj;", "La/iw5;", "<init>", "()V", "a/kud", "", "isApplyEnabled", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vcj extends iw5 {
    public final khf0 k2 = new khf0("KEY_DATE_CALENDAR_PARAMS");
    public final phf0 l2 = new phf0("KEY_DATE_CALENDAR_REQUEST_KEY", "RESULT_KEY_CALENDAR_REQUEST");
    public static final /* synthetic */ iiy[] n2 = {new ez40(vcj.class, "params", "getParams()Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;", 0), new ez40(vcj.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final kud m2 = new kud();
    public static final String o2 = vcj.class.getName();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1042955469);
        hdj hdjVarB0 = tlb.b0(P0().b, P0().c, P0().d, fetVar);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = G().getString(R.string.calendar_date_module_cancel);
            fetVar.o0(objP);
        }
        String str = (String) objP;
        str.getClass();
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = G().getString(R.string.calendar_date_module_apply);
            fetVar.o0(objP2);
        }
        String str2 = (String) objP2;
        str2.getClass();
        Object objP3 = fetVar.P();
        byte b = 0;
        if (objP3 == obj) {
            objP3 = jgk0.b(new ucj(hdjVarB0, b));
            fetVar.o0(objP3);
        }
        l7m0 l7m0Var = (l7m0) objP3;
        boolean zG = fetVar.g(str);
        Object objP4 = fetVar.P();
        if (zG || objP4 == obj) {
            Object wulVar = new wul(nul.e, oe9.f25112a, new ue9(str), true, false, false);
            fetVar.o0(wulVar);
            objP4 = wulVar;
        }
        wul wulVar2 = (wul) objP4;
        boolean zH = fetVar.h(((Boolean) l7m0Var.getValue()).booleanValue()) | fetVar.g(str2);
        Object objP5 = fetVar.P();
        if (zH || objP5 == obj) {
            Object wulVar3 = new wul(lul.e, oe9.f25112a, new ue9(str2), ((Boolean) l7m0Var.getValue()).booleanValue(), false, false);
            fetVar.o0(wulVar3);
            objP5 = wulVar3;
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(445027874, new sd8(this, (byte) 23), fetVar), u1c.M(1055977450, new x2g((Object) wulVar2, objP5, (Object) this, (Object) hdjVarB0, (byte) 14), fetVar), u1c.M(2044176932, new sd8(hdjVarB0, (byte) 24), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final DateCalendarBottomSheetParams P0() {
        return (DateCalendarBottomSheetParams) this.k2.n(this, n2[0]);
    }
}
