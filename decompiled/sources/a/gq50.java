package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gq50 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11715a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq50(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f11715a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        csr csrVar;
        switch (this.f11715a) {
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
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 9:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 10:
                csr csrVar2 = (csr) obj;
                long jLongValue = ((Number) obj2).longValue();
                csrVar2.getClass();
                sp70 sp70Var = (sp70) this.receiver;
                sp70Var.getClass();
                a570.Companion.getClass();
                if (jLongValue <= 0 || jLongValue == sp70Var.I.f42064a.a()) {
                    sp70Var.G(csrVar2, hg8.b);
                    sp70Var.w(new iy5(csrVar2));
                    p7m0 p7m0Var = sp70Var.U;
                    do {
                        value = p7m0Var.getValue();
                        csrVar = csrVar2;
                        csrVar2 = csrVar;
                    } while (!p7m0Var.m(value, ip70.a((ip70) value, false, false, false, csrVar, 7)));
                } else {
                    sac.V(jiu0.a(sp70Var), new gk70(1, sp70Var, sp70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, sp70Var.C.b, new ir((Object) sp70Var, (Object) csrVar2, jLongValue, (yje) null, (byte) 23), 10);
                }
                return Unit.f46060a;
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
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 18:
                Object objD = ((sp70) this.receiver).D((zy5) obj, (yje) obj2);
                return objD == wne.f39444a ? objD : Unit.f46060a;
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
                ((Function1) this.receiver).invoke(obj);
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
