package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16213a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ jb(l7m0 l7m0Var, byte b) {
        this.f16213a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16213a;
        boolean z = false;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) l7m0Var.getValue();
                bool2.getClass();
                return bool2;
            case 2:
                return ((nn) l7m0Var.getValue()).b;
            case 3:
                return ((nn) l7m0Var.getValue()).c;
            case 4:
                return Float.valueOf(l1e0.c((((Number) l7m0Var.getValue()).floatValue() - 0.5f) * 2.0f, 0.0f, 1.0f));
            case 5:
                return Float.valueOf(l1e0.c((((Number) l7m0Var.getValue()).floatValue() - 0.5f) * 2.0f, 0.0f, 1.0f));
            case 6:
                return Float.valueOf(l1e0.c((((Number) l7m0Var.getValue()).floatValue() - 0.5f) * 2.0f, 0.0f, 1.0f));
            case 7:
                return Float.valueOf(l1e0.c((((Number) l7m0Var.getValue()).floatValue() - 0.5f) * 2.0f, 0.0f, 1.0f));
            case 8:
                qek0 qek0Var = y82.V1;
                return ((f92) l7m0Var.getValue()).c;
            case 9:
                qek0 qek0Var2 = y82.V1;
                y72 y72Var = (y72) l7m0Var.getValue();
                if ((y72Var instanceof x72) && (((x72) y72Var).f40391a instanceof j3n)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                qek0 qek0Var3 = y82.V1;
                return Boolean.valueOf(l7m0Var.getValue() instanceof v72);
            case 11:
                qek0 qek0Var4 = y82.V1;
                return ((f92) l7m0Var.getValue()).e;
            case 12:
                qek0 qek0Var5 = y82.V1;
                return ((f92) l7m0Var.getValue()).b;
            case 13:
                qek0 qek0Var6 = y82.V1;
                return ((f92) l7m0Var.getValue()).f9134a;
            case 14:
                qek0 qek0Var7 = y82.V1;
                return ((f92) l7m0Var.getValue()).d;
            case 15:
                qek0 qek0Var8 = y82.V1;
                return Boolean.valueOf(((f92) l7m0Var.getValue()).d == null);
            case 16:
                qek0 qek0Var9 = y82.V1;
                return Boolean.valueOf(((f92) l7m0Var.getValue()).f);
            case 17:
                return Integer.valueOf(((f92) l7m0Var.getValue()).e.f28098a);
            case 18:
                Boolean bool3 = (Boolean) l7m0Var.getValue();
                bool3.getClass();
                return bool3;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Boolean bool4 = (Boolean) l7m0Var.getValue();
                bool4.booleanValue();
                return bool4;
            case 20:
                return new ycl((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * 16.0f);
            case 21:
                return Boolean.valueOf(!(((Number) l7m0Var.getValue()).floatValue() == 1.0f));
            case 22:
                return ((t9f0) l7m0Var.getValue()).c;
            case 23:
                qek0 qek0Var10 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).l;
            case 24:
                qek0 qek0Var11 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).c;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                qek0 qek0Var12 = ze4.g2;
                return Boolean.valueOf(!((Collection) l7m0Var.getValue()).isEmpty());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                qek0 qek0Var13 = ze4.g2;
                return Boolean.valueOf(((ng4) l7m0Var.getValue()).b);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qek0 qek0Var14 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).h;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qek0 qek0Var15 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).d;
            default:
                qek0 qek0Var16 = ze4.g2;
                return ((ng4) l7m0Var.getValue()).e;
        }
    }
}
