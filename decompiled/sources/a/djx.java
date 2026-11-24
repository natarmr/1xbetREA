package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.game.core.InterceptTouchRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class djx implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6208a;

    public /* synthetic */ djx(byte b) {
        this.f6208a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        z = false;
        boolean z2 = false;
        byte b = 1;
        switch (this.f6208a) {
            case 0:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 1:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 2:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 3:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 4:
                ((Integer) obj).getClass();
                int i = InterceptTouchRecyclerView.w2;
                return Boolean.TRUE;
            case 5:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new b1w(cpVar, (byte) 11));
                return Unit.f46060a;
            case 6:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 7:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 8:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 9:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 10:
                vay vayVar = (vay) obj;
                if (vayVar != null) {
                    return Integer.valueOf(vayVar.f37113a);
                }
                return null;
            case 11:
                vay vayVar2 = (vay) obj;
                if (vayVar2 != null) {
                    return Integer.valueOf(vayVar2.f37113a);
                }
                return null;
            case 12:
                cmc cmcVar = (cmc) obj;
                cmcVar.getClass();
                rcy rcyVar = new rcy(new qgx((byte) 27));
                iun iunVar = iun.f15405a;
                cmcVar.a("JsonPrimitive", rcyVar, iunVar);
                cmcVar.a("JsonNull", new rcy(new qgx((byte) 28)), iunVar);
                cmcVar.a("JsonLiteral", new rcy(new qgx((byte) 29)), iunVar);
                cmcVar.a("JsonObject", new rcy(new pcy(z ? (byte) 1 : (byte) 0)), iunVar);
                cmcVar.a("JsonArray", new rcy(new pcy(b)), iunVar);
                return Unit.f46060a;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                mcy mcyVar = (mcy) entry.getValue();
                StringBuilder sb = new StringBuilder();
                wsm0.a(str, sb);
                sb.append(':');
                sb.append(mcyVar);
                return sb.toString();
            case 14:
                ((w6k) obj).getClass();
                return Float.valueOf(0.0f);
            case 15:
                obj.getClass();
                return (Set) obj;
            case 16:
                jvy jvyVar = (jvy) obj;
                jvyVar.getClass();
                return Long.valueOf(jvyVar.f17225a);
            case 17:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0Var3.getClass();
                return p6t0Var3.getKey();
            case 18:
                p6t0 p6t0Var4 = (p6t0) obj;
                p6t0Var4.getClass();
                return sre0.f32672a.b(p6t0Var4.getClass());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 14, null, null, rsr0.c, 6);
                return Unit.f46060a;
            case 20:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, 14, null, null, bsr0.c, 6);
                return Unit.f46060a;
            case 21:
                ((ezy) obj).getClass();
                return sre0.f32672a.b(ezy.class);
            case 22:
                ((fzy) obj).getClass();
                return sre0.f32672a.b(fzy.class);
            case 23:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, phu0.e, 3);
                hcz.g(hczVar3, 10, null, null, phu0.f, 6);
                return Unit.f46060a;
            case 24:
                l9s l9sVar = (l9s) obj;
                l9sVar.getClass();
                return new a3z(l9sVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                k9s k9sVar = (k9s) obj;
                k9sVar.getClass();
                return new w3z(k9sVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fns0 fns0Var = (fns0) obj;
                fns0Var.getClass();
                return new e4z(fns0Var.f9852a, fns0Var.c, fns0Var.b);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((e7z) obj).g1 = true;
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj).getClass();
                return null;
            default:
                return Unit.f46060a;
        }
    }

    public /* synthetic */ djx(Object obj, byte b) {
        this.f6208a = b;
    }
}
