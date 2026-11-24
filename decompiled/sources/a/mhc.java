package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mhc extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mhc(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f21784a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BigDecimal bigDecimal;
        Object value;
        CoefStepInputUiModel coefStepInputUiModel;
        byte b = 0;
        byte b2 = 1;
        switch (this.f21784a) {
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
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                kyd kydVar = (kyd) this.receiver;
                kydVar.getClass();
                th.printStackTrace();
                kydVar.I(str);
                return Unit.f46060a;
            case 6:
                Object objF = ((kyd) this.receiver).F((jkk0) obj, (yje) obj2);
                return objF == wne.f39444a ? objF : Unit.f46060a;
            case 7:
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                th2.getClass();
                str2.getClass();
                kzd kzdVar = (kzd) this.receiver;
                kzdVar.getClass();
                th2.printStackTrace();
                kzdVar.r.f(new zyd(str2));
                return Unit.f46060a;
            case 8:
                Throwable th3 = (Throwable) obj;
                String str3 = (String) obj2;
                th3.getClass();
                str3.getClass();
                kzd kzdVar2 = (kzd) this.receiver;
                kzdVar2.getClass();
                th3.printStackTrace();
                kzdVar2.r.f(new zyd(str3));
                return Unit.f46060a;
            case 9:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                fae faeVar = (fae) this.receiver;
                if (faeVar.B(iIntValue2)) {
                    faeVar.O = Integer.valueOf(iIntValue);
                } else {
                    yxb yxbVar = faeVar.v;
                    x8e x8eVar = new x8e(b, iIntValue2, iIntValue, faeVar);
                    yxbVar.C = false;
                    bh1 bh1Var = new bh1(yxbVar, iIntValue2, x8eVar, b2);
                    bh1Var.invoke();
                    yxbVar.s = bh1Var;
                }
                return Unit.f46060a;
            case 10:
                int iIntValue3 = ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue();
                axe axeVar = (axe) this.receiver;
                kud kudVar = axe.e2;
                axeVar.getClass();
                yk5 yk5Var = job.o2;
                androidx.fragment.app.e eVarC = axeVar.C();
                eVarC.getClass();
                yk5Var.getClass();
                if (eVarC.J("CouponChangeBlockDialog") == null) {
                    job jobVar = new job();
                    iiy[] iiyVarArr = job.p2;
                    jobVar.h2.I(jobVar, iiyVarArr[1], R.string.move_to);
                    jobVar.i2.I(jobVar, iiyVarArr[2], iIntValue3);
                    jobVar.j2.j(jobVar, iiyVarArr[3], jLongValue);
                    jobVar.g2.x(jobVar, iiyVarArr[0], "COUPON_CHANGE_BLOCK_REQUEST_KEY");
                    jobVar.H0(eVarC, "CouponChangeBlockDialog");
                }
                return Unit.f46060a;
            case 11:
                int iIntValue4 = ((Number) obj).intValue();
                long jLongValue2 = ((Number) obj2).longValue();
                r7f r7fVar = (r7f) this.receiver;
                r7fVar.getClass();
                sac.V(jiu0.a(r7fVar), m6f.f21267a, null, r7fVar.Y0.b, new n6f(r7fVar, iIntValue4, jLongValue2, null, (byte) 0), 10);
                return Unit.f46060a;
            case 12:
                int iIntValue5 = ((Number) obj).intValue();
                long jLongValue3 = ((Number) obj2).longValue();
                r7f r7fVar2 = (r7f) this.receiver;
                r7fVar2.getClass();
                sac.V(jiu0.a(r7fVar2), j6f.f15982a, null, r7fVar2.Y0.b, new qo6(r7fVar2, jLongValue3, iIntValue5, (yje) null), 10);
                return Unit.f46060a;
            case 13:
                int iIntValue6 = ((Number) obj).intValue();
                long jLongValue4 = ((Number) obj2).longValue();
                r7f r7fVar3 = (r7f) this.receiver;
                r7fVar3.getClass();
                sac.V(jiu0.a(r7fVar3), j6f.f15982a, null, r7fVar3.Y0.b, new qo6(r7fVar3, jLongValue4, iIntValue6, (yje) null), 10);
                return Unit.f46060a;
            case 14:
                String str4 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str4.getClass();
                h620 h620Var = (h620) this.receiver;
                h620Var.getClass();
                try {
                    bigDecimal = new BigDecimal(str4);
                    break;
                } catch (NumberFormatException unused) {
                    bigDecimal = new BigDecimal(String.valueOf(-1.0d));
                }
                BigDecimal bigDecimal2 = bigDecimal;
                c4m0 c4m0Var = h620Var.d0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                p7m0 p7m0Var = h620Var.h0;
                do {
                    value = p7m0Var.getValue();
                    coefStepInputUiModel = (CoefStepInputUiModel) value;
                } while (!p7m0Var.m(value, CoefStepInputUiModel.a(coefStepInputUiModel, bigDecimal2, null, true, bigDecimal2.compareTo(coefStepInputUiModel.e) > 0 || zBooleanValue, bigDecimal2.compareTo(coefStepInputUiModel.d) < 0, false, 286)));
                return Unit.f46060a;
            case 15:
                ((acf) this.receiver).getClass();
                return acf.a((String) obj, (String) obj2);
            case 16:
                ((acf) this.receiver).getClass();
                return acf.a((String) obj, (String) obj2);
            case 17:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 18:
                long jLongValue5 = ((Number) obj).longValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                j7g j7gVar = (j7g) this.receiver;
                j7gVar.getClass();
                sac.V(jiu0.a(j7gVar), new g7g(j7gVar, (byte) 1), null, j7gVar.g.f22085a, new j33(jLongValue5, j7gVar, zBooleanValue2, (yje) null), 10);
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
                long jLongValue6 = ((Number) obj).longValue();
                String str5 = (String) obj2;
                str5.getClass();
                ((vqg) this.receiver).x(jLongValue6, str5);
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
