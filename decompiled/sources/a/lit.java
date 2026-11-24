package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lit implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20122a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ vzg0 c;

    public /* synthetic */ lit(vzg0 vzg0Var, ctf0 ctf0Var) {
        this.f20122a = (byte) 0;
        this.c = vzg0Var;
        this.b = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20122a;
        vzg0 vzg0Var = this.c;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) vzg0Var.a("MIN_BET_SUM_SAVED");
                String str2 = str == null ? "" : str;
                String str3 = (String) vzg0Var.a("BET_SUM_SAVED");
                String str4 = str3 == null ? "" : str3;
                String str5 = (String) vzg0Var.a("WONTED_SUM_SAVED");
                zo80 zo80Var = new zo80(str2, str4, str5 == null ? "" : str5, new GenerateCouponTypeUiModel("", 0, false), new GenerateCouponTypeUiModel("", 0, false), "");
                iun iunVar = iun.f15405a;
                bdq bdqVar = new bdq(iunVar, iunVar, iunVar, iunVar);
                yo80 yo80Var = new yo80(null, false);
                yo80 yo80Var2 = new yo80(null, false);
                lak0 lak0Var = lak0.c;
                return new zht(zo80Var, bdqVar, false, yo80Var, yo80Var2, true, false, lak0Var, lak0Var, ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)));
            case 1:
                String strA = ctf0Var.b.a(R.string.sms_code_title, Arrays.copyOf(new Object[0], 0));
                String strA2 = ctf0Var.b.a(R.string.sms_code_hint, Arrays.copyOf(new Object[0], 0));
                String str6 = (String) vzg0Var.a("REQUEST_CODE");
                String str7 = str6 == null ? "" : str6;
                String str8 = (String) vzg0Var.a("REQUEST_GUID_KEY");
                String str9 = str8 == null ? "" : str8;
                Boolean bool = (Boolean) vzg0Var.a("PAY_IN_OUT_KEY");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Long l = (Long) vzg0Var.a("BALANCE_ID");
                long jLongValue = l != null ? l.longValue() : 0L;
                Long l2 = (Long) vzg0Var.a("PRODUCT_ID");
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                String str10 = (String) vzg0Var.a("AMOUNT_KEY");
                return new cdk0(strA, strA2, "", "", str7, str9, "", zBooleanValue, jLongValue, jLongValue2, str10 == null ? "" : str10, false, false, new wck0(300L), false);
            default:
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                String strA3 = lsm0Var.a(R.string.subscriptions, Arrays.copyOf(new Object[0], 0));
                Integer num = (Integer) vzg0Var.a("SELECTED_TAB_KEY");
                return new ncn0(num != null ? num.intValue() : 0, strA3, q3d.j(lsm0Var2.a(R.string.events, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.teams, Arrays.copyOf(new Object[0], 0))), false);
        }
    }

    public /* synthetic */ lit(ctf0 ctf0Var, vzg0 vzg0Var, byte b) {
        this.f20122a = b;
        this.b = ctf0Var;
        this.c = vzg0Var;
    }
}
