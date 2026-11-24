package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e000 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e000(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f6967a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        kq10 jq10Var;
        kuw kuwVar;
        switch (this.f6967a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 1:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 2:
                u4s u4sVar = (u4s) obj;
                u4sVar.getClass();
                ef00 ef00Var = (ef00) this.receiver;
                ef00Var.getClass();
                sac.V(jiu0.a(ef00Var), new svz(1, ef00Var, ef00.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, ef00Var.N.f22085a, new ze1((Object) u4sVar, (Object) ef00Var, obj2, (yje) null, (byte) 6), 10);
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
                Object objW = ((uj10) this.receiver).w((zy5) obj, (yje) obj2);
                return objW == wne.f39444a ? objW : Unit.f46060a;
            case 10:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 11:
                cr10 cr10Var = (cr10) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                cr10Var.getClass();
                vq10 vq10Var = (vq10) this.receiver;
                vq10Var.getClass();
                p7m0 p7m0Var = vq10Var.v;
                kq10 kq10Var = (kq10) p7m0Var.getValue();
                do {
                    value = p7m0Var.getValue();
                    if (kq10Var instanceof jq10) {
                        List<Object> list = ((jq10) kq10Var).f16928a;
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (Object objC : list) {
                            if (objC instanceof cr10) {
                                cr10 cr10Var2 = (cr10) objC;
                                if (cr10Var2.f4821a == cr10Var.f4821a) {
                                    objC = cr10.c(cr10Var2, zBooleanValue, 55);
                                }
                            }
                            arrayList.add(objC);
                        }
                        jq10Var = new jq10(arrayList, !Intrinsics.d(vq10Var.x, arrayList), false);
                    } else {
                        jq10Var = kq10Var;
                    }
                } while (!p7m0Var.m(value, jq10Var));
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
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                qg20 qg20Var = (qg20) this.receiver;
                p7m0 p7m0Var2 = qg20Var.Z0;
                a40 a40Var = new a40("", -1.0d);
                p7m0Var2.getClass();
                p7m0Var2.o(null, a40Var);
                if ((th instanceof zhi0) && ((kuwVar = ((zhi0) th).c) == i2o.WrongToken || kuwVar == i2o.A || kuwVar == i2o.GameIsNotInLine)) {
                    qg20Var.W0.f(new uuj0(new xdk0(pek0.f26859a, str, null, null, null, null, 124)));
                }
                return Unit.f46060a;
            case 18:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 20:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                e730 e730Var = (e730) this.receiver;
                Object obj3 = e730Var.p.get(iIntValue);
                gw20 gw20Var = obj3 instanceof gw20 ? (gw20) obj3 : null;
                Object obj4 = e730Var.p.get(iIntValue2);
                gw20 gw20Var2 = obj4 instanceof gw20 ? (gw20) obj4 : null;
                if (gw20Var != null && gw20Var2 != null) {
                    int i = gw20Var.e;
                    gw20Var.e = gw20Var2.e;
                    gw20Var2.e = i;
                    Collections.swap(e730Var.p, iIntValue, iIntValue2);
                }
                return Unit.f46060a;
            case 21:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                f730 f730Var = (f730) this.receiver;
                Object obj5 = f730Var.n.get(iIntValue3);
                hw20 hw20Var = obj5 instanceof hw20 ? (hw20) obj5 : null;
                Object obj6 = f730Var.n.get(iIntValue4);
                hw20 hw20Var2 = obj6 instanceof hw20 ? (hw20) obj6 : null;
                if (hw20Var != null && hw20Var2 != null) {
                    int i2 = hw20Var.e;
                    hw20Var.e = hw20Var2.e;
                    hw20Var2.e = i2;
                    Collections.swap(f730Var.n, iIntValue3, iIntValue4);
                }
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
