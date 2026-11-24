package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wja0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39252a = 0;
    public final /* synthetic */ wyu b;
    public final /* synthetic */ vzg0 c;

    public /* synthetic */ wja0(wyu wyuVar, vzg0 vzg0Var) {
        this.b = wyuVar;
        this.c = vzg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39252a;
        vzg0 vzg0Var = this.c;
        wyu wyuVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) vzg0Var.a("KEY_IS_PAIR");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Integer num = (Integer) vzg0Var.a("KEY_CURRENT_TAB");
                int iIntValue = num != null ? num.intValue() : 0;
                Boolean bool2 = (Boolean) vzg0Var.a("KEY_IS_SINGLE_PLAYER");
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                String str = (String) vzg0Var.a("KEY_SINGLE_PLAYER_ID");
                if (str == null) {
                    str = "";
                }
                return new rja0(null, zBooleanValue, iIntValue, zBooleanValue2, true, false, false, str, !h97.A(wyuVar, uaq0.f35345a));
            default:
                boolean z = !h97.A(wyuVar, uaq0.f35345a);
                Integer num2 = (Integer) vzg0Var.a("CURRENT_TAB");
                return new vlj0(num2 != null ? num2.intValue() : 0, zvh0.CONTROL_WITH_DIVIDERS, iun.f15405a, true, true, z);
        }
    }

    public /* synthetic */ wja0(vzg0 vzg0Var, wyu wyuVar) {
        this.c = vzg0Var;
        this.b = wyuVar;
    }
}
