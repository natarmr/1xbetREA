package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x000 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40045a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ x000(l7m0 l7m0Var, byte b) {
        this.f40045a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40045a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((h100) l7m0Var.getValue()).d);
            case 1:
                return Integer.valueOf(((h100) l7m0Var.getValue()).g.size());
            case 2:
                return Integer.valueOf(((r400) l7m0Var.getValue()).g.size());
            case 3:
                return Integer.valueOf(((r400) l7m0Var.getValue()).c);
            case 4:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 5:
                return ((oj00) l7m0Var.getValue()).c;
            case 6:
                return Boolean.valueOf(((oj00) l7m0Var.getValue()).b);
            case 7:
                return Integer.valueOf(((mh10) l7m0Var.getValue()).d.size());
            case 8:
                return Integer.valueOf(((mh10) l7m0Var.getValue()).d.size());
            case 9:
                return Boolean.valueOf(!(((Number) l7m0Var.getValue()).floatValue() == 1.0f));
            case 10:
                return Float.valueOf(l1e0.c((((Number) l7m0Var.getValue()).floatValue() - 0.5f) * 2.0f, 0.0f, 1.0f));
            case 11:
                Boolean bool2 = (Boolean) l7m0Var.getValue();
                bool2.getClass();
                return bool2;
            case 12:
                xuz xuzVar = v330.Q1;
                return ((z330) l7m0Var.getValue()).e;
            case 13:
                xuz xuzVar2 = v330.Q1;
                return Boolean.valueOf(((z330) l7m0Var.getValue()).g);
            case 14:
                xuz xuzVar3 = v330.Q1;
                return ((z330) l7m0Var.getValue()).c;
            case 15:
                xuz xuzVar4 = v330.Q1;
                return Boolean.valueOf(((z330) l7m0Var.getValue()).d);
            case 16:
                xuz xuzVar5 = v330.Q1;
                return ((z330) l7m0Var.getValue()).f43700a;
            case 17:
                xuz xuzVar6 = v330.Q1;
                return ((z330) l7m0Var.getValue()).f;
            case 18:
                xuz xuzVar7 = v330.Q1;
                return ((z330) l7m0Var.getValue()).b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ad40) l7m0Var.getValue()).b.f25011a;
            case 20:
                return ((ad40) l7m0Var.getValue()).b.b;
            case 21:
                return Integer.valueOf(((Number) l7m0Var.getValue()).intValue());
            case 22:
                return Boolean.valueOf(((g260) l7m0Var.getValue()).f10548a);
            case 23:
                return Boolean.valueOf(((tly) l7m0Var.getValue()).f34169a);
            case 24:
                Boolean bool3 = (Boolean) l7m0Var.getValue();
                bool3.booleanValue();
                return bool3;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool4 = (Boolean) l7m0Var.getValue();
                bool4.getClass();
                return bool4;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((cz80) l7m0Var.getValue()).f5213a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((cz80) l7m0Var.getValue()).b;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((cz80) l7m0Var.getValue()).c;
            default:
                Boolean bool5 = (Boolean) l7m0Var.getValue();
                bool5.getClass();
                return bool5;
        }
    }
}
