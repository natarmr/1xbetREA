package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ynk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42945a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ynk(Function1 function1, byte b) {
        this.f42945a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        byte b = this.f42945a;
        String str2 = "TRANSFER_CHIP";
        String str3 = "";
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ona onaVar = (ona) obj;
                onaVar.getClass();
                function1.invoke(Long.valueOf(onaVar.f25538a));
                return Unit.f46060a;
            case 1:
                e8m e8mVar = (e8m) obj;
                e8mVar.getClass();
                function1.invoke(Long.valueOf(e8mVar.f7380a));
                return Unit.f46060a;
            case 2:
                Long l = (Long) obj;
                l.longValue();
                function1.invoke(l);
                return Unit.f46060a;
            case 3:
                ona onaVar2 = (ona) obj;
                onaVar2.getClass();
                long j = onaVar2.f25538a;
                if (j == 0) {
                    str2 = "MATCH_RESULT_CHIP";
                } else if (j == 1) {
                    str2 = "LEADERBOARD_CHIP";
                } else if (j != 2) {
                    str2 = j == 3 ? "CALENDAR_CHIP" : "";
                }
                function1.invoke(new yok(str2));
                return Unit.f46060a;
            case 4:
                smh smhVar = (smh) obj;
                smhVar.getClass();
                function1.invoke(Long.valueOf(smhVar.f32446a));
                return Unit.f46060a;
            case 5:
                m8m m8mVar = (m8m) obj;
                m8mVar.getClass();
                function1.invoke(m8mVar);
                return Unit.f46060a;
            case 6:
                long jLongValue = ((Long) obj).longValue();
                if (jLongValue == 1) {
                    str2 = "LEADERBOARD_CHIP";
                } else if (jLongValue != 2) {
                    if (jLongValue == 0) {
                        str2 = "MATCH_RESULT_CHIP";
                    } else if (jLongValue == 3) {
                        str2 = "CALENDAR_CHIP";
                    } else {
                        str2 = jLongValue == 4 ? "META_HEROES_CHIP" : "";
                    }
                }
                function1.invoke(new yok(str2));
                return Unit.f46060a;
            case 7:
                fdv0 fdv0Var = (fdv0) obj;
                fdv0Var.getClass();
                if (fdv0Var.equals(adv0.f699a)) {
                    str3 = "CALENDAR_CHIP";
                } else if (fdv0Var.equals(ddv0.f5916a)) {
                    str3 = "MATCH_RESULT_CHIP";
                } else if (fdv0Var.equals(bdv0.f2420a)) {
                    str3 = "EXPAND_MARKET_CHIP";
                } else if (fdv0Var.equals(edv0.f7639a)) {
                    str3 = "HEADER_CHAMPIONSHIPS";
                }
                function1.invoke(new yok(str3));
                return Unit.f46060a;
            case 8:
                rdv0 rdv0Var = (rdv0) obj;
                rdv0Var.getClass();
                function1.invoke(new gpk(rdv0Var.f30307a, rdv0Var.b, rdv0Var.c));
                return Unit.f46060a;
            case 9:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new i1l(hdbVar));
                return Unit.f46060a;
            case 10:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new j1l(ussVar));
                return Unit.f46060a;
            case 11:
                function1.invoke(new o1l(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 12:
                function1.invoke(new v1l(((Long) obj).longValue()));
                return Unit.f46060a;
            case 13:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new l1l(str4));
                return Unit.f46060a;
            case 14:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new w1l(nusVar));
                return Unit.f46060a;
            case 15:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new m1l(imsVar));
                return Unit.f46060a;
            case 16:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (function1 != null) {
                    function1.invoke(bool);
                }
                return Unit.f46060a;
            case 17:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                if (function1 != null) {
                    function1.invoke(bool2);
                }
                return Unit.f46060a;
            case 18:
                o0x o0xVar = (o0x) obj;
                o0xVar.getClass();
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                if (n0xVar != null && (str = n0xVar.f22722a) != null) {
                    function1.invoke(str);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new qhm(str5));
                return Unit.f46060a;
            case 20:
                function1.invoke(new phm(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 21:
                function1.invoke(new phm(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 22:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new qhm(str6));
                return Unit.f46060a;
            case 23:
                String str7 = (String) obj;
                str7.getClass();
                function1.invoke(new shm(str7));
                return Unit.f46060a;
            case 24:
                String str8 = (String) obj;
                str8.getClass();
                function1.invoke(new qhm(str8));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new khm(((Long) obj).longValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new phm(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str9 = (String) obj;
                int i = DsNavigationBar.l;
                str9.getClass();
                function1.invoke(str9);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Context context = (Context) obj;
                context.getClass();
                DsNavigationBarBasic dsNavigationBarBasic = new DsNavigationBarBasic(context, null);
                dsNavigationBarBasic.b(new p3l(function1, (byte) 22));
                dsNavigationBarBasic.setOnTitlesClickListener(new p3l(function1, (byte) 23));
                dsNavigationBarBasic.setOnSearchViewExpandedStateChangedListener(new ynk(function1, (byte) 29));
                jt6 jt6Var = new jt6(function1, (byte) 7);
                s96 s96Var = dsNavigationBarBasic.b;
                if (s96Var != null) {
                    s96Var.f(jt6Var);
                }
                return dsNavigationBarBasic;
            default:
                function1.invoke(new kd50(((Boolean) obj).booleanValue()));
                return Unit.f46060a;
        }
    }
}
