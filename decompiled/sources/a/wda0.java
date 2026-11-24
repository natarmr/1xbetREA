package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wda0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38964a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ wda0(l7m0 l7m0Var, byte b) {
        this.f38964a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38964a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return ((jea0) l7m0Var.getValue()).b.f40684a;
            case 1:
                return ((jea0) l7m0Var.getValue()).b.b;
            case 2:
                return Boolean.valueOf(((jea0) l7m0Var.getValue()).b.c);
            case 3:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 4:
                Boolean bool2 = (Boolean) l7m0Var.getValue();
                bool2.getClass();
                return bool2;
            case 5:
                Boolean bool3 = (Boolean) l7m0Var.getValue();
                bool3.getClass();
                return bool3;
            case 6:
                mi70 mi70Var = ccb0.X1;
                return Boolean.valueOf(((emb0) l7m0Var.getValue()).g.size() > 1);
            case 7:
                mi70 mi70Var2 = ccb0.X1;
                return ((emb0) l7m0Var.getValue()).f8039a;
            case 8:
                mi70 mi70Var3 = ccb0.X1;
                return Integer.valueOf(((emb0) l7m0Var.getValue()).b);
            case 9:
                mi70 mi70Var4 = ccb0.X1;
                return Integer.valueOf(((a4x) l7m0Var.getValue()).size());
            case 10:
                mi70 mi70Var5 = ccb0.X1;
                return ((emb0) l7m0Var.getValue()).j;
            case 11:
                return (hdb0) l7m0Var.getValue();
            case 12:
                return ((emb0) l7m0Var.getValue()).i;
            case 13:
                return ((emb0) l7m0Var.getValue()).e;
            case 14:
                return ((apb0) l7m0Var.getValue()).f1244a;
            case 15:
                return ((apb0) l7m0Var.getValue()).b;
            case 16:
                return ((apb0) l7m0Var.getValue()).c;
            case 17:
                return ((j9e0) l7m0Var.getValue()).c;
            case 18:
                return ((j9e0) l7m0Var.getValue()).c.b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(((i7e0) l7m0Var.getValue()).f14288a.f12570a ? 1 : 0);
            case 20:
                Boolean bool4 = (Boolean) l7m0Var.getValue();
                bool4.getClass();
                return bool4;
            case 21:
                zie0 zie0Var = z3f0.Y1;
                return ((v4f0) l7m0Var.getValue()).f36776a;
            case 22:
                zie0 zie0Var2 = z3f0.Y1;
                return ((v4f0) l7m0Var.getValue()).f;
            case 23:
                zie0 zie0Var3 = z3f0.Y1;
                return ((v4f0) l7m0Var.getValue()).e;
            case 24:
                zie0 zie0Var4 = z3f0.Y1;
                return Boolean.valueOf(((v4f0) l7m0Var.getValue()).j);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                zie0 zie0Var5 = z3f0.Y1;
                return Integer.valueOf(((v4f0) l7m0Var.getValue()).d);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                zie0 zie0Var6 = z3f0.Y1;
                return ((v4f0) l7m0Var.getValue()).b;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                zie0 zie0Var7 = z3f0.Y1;
                return Boolean.valueOf(((v4f0) l7m0Var.getValue()).h);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                zie0 zie0Var8 = z3f0.Y1;
                return Integer.valueOf(((v4f0) l7m0Var.getValue()).i);
            default:
                Boolean bool5 = (Boolean) l7m0Var.getValue();
                bool5.getClass();
                return bool5;
        }
    }
}
