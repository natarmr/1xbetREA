package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class we4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39001a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ we4(l7m0 l7m0Var, byte b) {
        this.f39001a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39001a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = ze4.g2;
                return ((ng4) l7m0Var.getValue()).i;
            case 1:
                qek0 qek0Var2 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).k;
            case 2:
                qek0 qek0Var3 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).f;
            case 3:
                qek0 qek0Var4 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).g;
            case 4:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 5:
                return Boolean.valueOf(((ne4) l7m0Var.getValue()).f23365a);
            case 6:
                return Boolean.valueOf(((ne4) l7m0Var.getValue()).b);
            case 7:
                return Boolean.valueOf(((ne4) l7m0Var.getValue()).d);
            case 8:
                return Boolean.valueOf(((ne4) l7m0Var.getValue()).c);
            case 9:
                gfk0 gfk0Var = cj4.U1;
                return ((vj4) l7m0Var.getValue()).j;
            case 10:
                gfk0 gfk0Var2 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).l;
            case 11:
                gfk0 gfk0Var3 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).n;
            case 12:
                gfk0 gfk0Var4 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).g;
            case 13:
                gfk0 gfk0Var5 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).d;
            case 14:
                gfk0 gfk0Var6 = cj4.U1;
                return Boolean.valueOf(!((Collection) l7m0Var.getValue()).isEmpty());
            case 15:
                gfk0 gfk0Var7 = cj4.U1;
                return Boolean.valueOf(((vj4) l7m0Var.getValue()).f37509a);
            case 16:
                gfk0 gfk0Var8 = cj4.U1;
                return Boolean.valueOf(((vj4) l7m0Var.getValue()).c);
            case 17:
                gfk0 gfk0Var9 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).k;
            case 18:
                gfk0 gfk0Var10 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).h;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gfk0 gfk0Var11 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).e;
            case 20:
                gfk0 gfk0Var12 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).f;
            case 21:
                gfk0 gfk0Var13 = cj4.U1;
                return ((vj4) l7m0Var.getValue()).i;
            case 22:
                Boolean bool2 = (Boolean) l7m0Var.getValue();
                bool2.getClass();
                return bool2;
            case 23:
                return ((y6t0) l7m0Var.getValue()).f42117a;
            case 24:
                return ((y6t0) l7m0Var.getValue()).b;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((yvg0) l7m0Var.getValue()).f43318a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((yvg0) l7m0Var.getValue()).b;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((yvg0) l7m0Var.getValue()).c;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((yvg0) l7m0Var.getValue()).e;
            default:
                return ((yvg0) l7m0Var.getValue()).d;
        }
    }
}
