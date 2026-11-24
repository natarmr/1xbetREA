package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eka implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7943a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ eka(l7m0 l7m0Var, byte b) {
        this.f7943a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a4x a4xVar;
        byte b = this.f7943a;
        boolean z = false;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                kg30 kg30Var = (kg30) l7m0Var.getValue();
                if (kg30Var != null) {
                    return kg30Var.b;
                }
                return null;
            case 1:
                kg30 kg30Var2 = (kg30) l7m0Var.getValue();
                if (kg30Var2 != null) {
                    return kg30Var2.c;
                }
                return null;
            case 2:
                kg30 kg30Var3 = (kg30) l7m0Var.getValue();
                if (kg30Var3 != null) {
                    return kg30Var3.d;
                }
                return null;
            case 3:
                return Boolean.valueOf(!((unr) l7m0Var.getValue()).g);
            case 4:
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                return bool;
            case 5:
                Boolean bool2 = (Boolean) l7m0Var.getValue();
                bool2.getClass();
                return bool2;
            case 6:
                return ((klb) l7m0Var.getValue()).b.f34086a;
            case 7:
                return ((klb) l7m0Var.getValue()).b.b;
            case 8:
                return Boolean.valueOf(((Number) l7m0Var.getValue()).floatValue() == 1.0f);
            case 9:
                return new ycl((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * 16.0f);
            case 10:
                return Float.valueOf(((Number) l7m0Var.getValue()).floatValue());
            case 11:
                return (Float) l7m0Var.getValue();
            case 12:
                return Float.valueOf(((Number) l7m0Var.getValue()).floatValue());
            case 13:
                return Boolean.valueOf(((Number) l7m0Var.getValue()).floatValue() > 0.0f);
            case 14:
                return ((efg) l7m0Var.getValue()).f7719a;
            case 15:
                return ((efg) l7m0Var.getValue()).b;
            case 16:
                return Boolean.valueOf(((efg) l7m0Var.getValue()).c);
            case 17:
                return ((fgg) l7m0Var.getValue()).f9491a;
            case 18:
                return ((fgg) l7m0Var.getValue()).b;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fgg) l7m0Var.getValue()).c;
            case 20:
                return Boolean.valueOf(((fgg) l7m0Var.getValue()).d);
            case 21:
                return ((hjw) l7m0Var.getValue()).b;
            case 22:
                return Boolean.valueOf(((hjw) l7m0Var.getValue()).c);
            case 23:
                return ((hjw) l7m0Var.getValue()).f13180a;
            case 24:
                return Boolean.valueOf(l7m0Var.getValue() instanceof gts);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (!(l7m0Var.getValue() instanceof nss) && !(l7m0Var.getValue() instanceof lss)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object value = l7m0Var.getValue();
                l7m0 l7m0Var2 = value instanceof pss ? ((pss) value).f27528a : null;
                a4x a4xVar2 = l7m0Var2 != null ? (a4x) l7m0Var2.getValue() : null;
                if (a4xVar2 != null && !a4xVar2.isEmpty()) {
                    Iterator<E> it = a4xVar2.iterator();
                    while (it.hasNext()) {
                        if (!(((p6t0) it.next()) instanceof kxs)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object value2 = l7m0Var.getValue();
                l7m0 l7m0Var3 = value2 instanceof pss ? ((pss) value2).f27528a : null;
                if (l7m0Var3 != null && (a4xVar = (a4x) l7m0Var3.getValue()) != null && !a4xVar.isEmpty()) {
                    Iterator<E> it2 = a4xVar.iterator();
                    while (it2.hasNext()) {
                        if (((p6t0) it2.next()) instanceof s0h) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (k7h) l7m0Var.getValue();
            default:
                return ((kmh) l7m0Var.getValue()).f18538a;
        }
    }
}
