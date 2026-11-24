package a;

import java.util.Calendar;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nf2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23414a;
    public final /* synthetic */ pru b;
    public final /* synthetic */ vzg0 c;

    public /* synthetic */ nf2(pru pruVar, vzg0 vzg0Var, byte b) {
        this.f23414a = b;
        this.b = pruVar;
        this.c = vzg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23414a;
        vzg0 vzg0Var = this.c;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                sff0 sff0VarA = pruVar.a();
                b9g0 b9g0Var = (b9g0) vzg0Var.a("SELECTED_TAB_KEY");
                if (b9g0Var == null) {
                    b9g0Var = b9g0.b;
                }
                b9g0 b9g0Var2 = b9g0Var;
                Map map = (Map) vzg0Var.a("SEARCH_QUERY_MAP_KEY");
                if (map == null) {
                    map = lun.f20680a;
                    map.getClass();
                }
                Map map2 = map;
                Boolean bool = (Boolean) vzg0Var.a("SHOW_MULTISELECT_KEY");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                mum0 mum0Var = sff0VarA.g;
                return new jf2(b9g0Var2, mum0Var.v, mum0Var.p, mum0Var.x, map2, false, zBooleanValue, (Calendar) vzg0Var.a("CHOOSEN_DATE_KEY"));
            default:
                boolean z = pruVar.a().N.c;
                Boolean bool2 = (Boolean) vzg0Var.a("KEY_ENTER_PHONE_CODE_BY_MANUALLY");
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                iun iunVar = iun.f15405a;
                String str = (String) vzg0Var.a("KEY_PHONE_CODE_BY_MANUALLY");
                if (str == null) {
                    str = "+";
                }
                zqp zqpVar = new zqp(str, false);
                String str2 = (String) vzg0Var.a("KEY_SEARCH_VALUE");
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                Boolean bool3 = (Boolean) vzg0Var.a("KEY_CONTENT_VISIBILITY_STATUS");
                return new br90(z, zqpVar, zBooleanValue2, str3, iunVar, bool3 != null ? bool3.booleanValue() : false);
        }
    }
}
