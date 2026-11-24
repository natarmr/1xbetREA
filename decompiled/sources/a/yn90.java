package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yn90 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42929a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn90(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f42929a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42929a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 1:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 2:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 3:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 4:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 5:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 6:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 7:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 8:
                Object objA = ((xcc) this.receiver).a((Throwable) obj, (yje) obj2);
                return objA == wne.f39444a ? objA : Unit.f46060a;
            case 9:
                Object objA2 = ((xcc) this.receiver).a((Throwable) obj, (yje) obj2);
                return objA2 == wne.f39444a ? objA2 : Unit.f46060a;
            case 10:
                Object objA3 = ((xcc) this.receiver).a((Throwable) obj, (yje) obj2);
                return objA3 == wne.f39444a ? objA3 : Unit.f46060a;
            case 11:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 12:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 13:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 14:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 15:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 16:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 17:
                w2c0 w2c0Var = (w2c0) obj;
                String str = (String) obj2;
                w2c0Var.getClass();
                str.getClass();
                org.xplatform.personal.impl.presentation.edit.n nVar = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                nVar.getClass();
                String string = StringsKt.u0(str).toString();
                LinkedHashMap linkedHashMap = nVar.u;
                v3c.N((bby) linkedHashMap.get(w2c0Var));
                linkedHashMap.put(w2c0Var, sac.V(jiu0.a(nVar), new e9b0(1, nVar, org.xplatform.personal.impl.presentation.edit.n.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, nVar.k.f22085a, new org.xplatform.personal.impl.presentation.edit.m(nVar, w2c0Var, string, null), 10));
                return Unit.f46060a;
            case 18:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 20:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 21:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 22:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 23:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 24:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ArrayList arrayList = ((sld0) this.receiver).m;
                p6t0 p6t0Var = (p6t0) CollectionsKt.W(iIntValue, arrayList);
                p6t0 p6t0Var2 = (p6t0) CollectionsKt.W(iIntValue2, arrayList);
                if (p6t0Var != null && !(p6t0Var instanceof dev0) && p6t0Var2 != null && !(p6t0Var2 instanceof dev0)) {
                    Collections.swap(arrayList, iIntValue2, iIntValue);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            default:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
        }
    }
}
