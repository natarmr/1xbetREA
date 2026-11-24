package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.subgames.impl.presentation.models.SelectedTabState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nfj0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23440a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfj0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f23440a = b;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kuw kuwVar;
        Object value;
        owm0 mwm0Var;
        xvm0 xvm0Var;
        Object obj3 = null;
        switch (this.f23440a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 1:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 2:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 3:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                xxj0 xxj0Var = (xxj0) this.receiver;
                p7m0 p7m0Var = xxj0Var.v0;
                a40 a40Var = new a40("", -1.0d);
                p7m0Var.getClass();
                p7m0Var.o(null, a40Var);
                if ((th instanceof zhi0) && ((kuwVar = ((zhi0) th).c) == i2o.WrongToken || kuwVar == i2o.A || kuwVar == i2o.GameIsNotInLine)) {
                    xxj0Var.q0.f(new tuj0(new xdk0(pek0.f26859a, str, null, null, null, null, 124)));
                }
                break;
            case 4:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 5:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 6:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                tam0 tam0Var = (tam0) this.receiver;
                tam0Var.n.add(iIntValue - 1, (iam0) tam0Var.n.remove(iIntValue2 - 1));
                tam0Var.A();
                break;
            case 8:
                int iIntValue3 = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                tam0 tam0Var2 = (tam0) this.receiver;
                tam0Var2.getClass();
                sac.V(jiu0.a(tam0Var2), new q9m0(tam0Var2, (byte) 1), null, tam0Var2.d.f22085a, new u52(tam0Var2, iIntValue3, zBooleanValue, (yje) null), 10);
                break;
            case 9:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 10:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 11:
                long jLongValue = ((Number) obj).longValue();
                int iIntValue4 = ((Number) obj2).intValue();
                dzm0 dzm0Var = (dzm0) this.receiver;
                dzm0Var.b.e("selected_sub_game_id_key", Long.valueOf(jLongValue));
                p7m0 p7m0Var2 = dzm0Var.n;
                do {
                    value = p7m0Var2.getValue();
                    mwm0Var = (owm0) value;
                    if (mwm0Var instanceof mwm0) {
                        mwm0 mwm0Var2 = (mwm0) mwm0Var;
                        mwm0Var = new mwm0(mwm0Var2.f22512a, mwm0Var2.b, mwm0Var2.c, new SelectedTabState.Position(iIntValue4), mwm0Var2.e);
                    }
                } while (!p7m0Var2.m(value, mwm0Var));
                for (Object obj4 : dzm0Var.p) {
                    if (((xvm0) obj4).getId() == jLongValue) {
                        obj3 = obj4;
                        xvm0Var = (xvm0) obj3;
                        if (xvm0Var != null) {
                            s1u s1uVar = dzm0Var.h;
                            s1uVar.getClass();
                            kym0 kym0Var = s1uVar.f31473a;
                            kym0Var.getClass();
                            kym0Var.b.b(xvm0Var);
                        }
                        break;
                    }
                }
                xvm0Var = (xvm0) obj3;
                if (xvm0Var != null) {
                    s1u s1uVar2 = dzm0Var.h;
                    s1uVar2.getClass();
                    kym0 kym0Var2 = s1uVar2.f31473a;
                    kym0Var2.getClass();
                    kym0Var2.b.b(xvm0Var);
                }
                break;
            case 12:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 13:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 14:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 15:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 16:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 17:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 18:
                ((Function1) this.receiver).invoke(obj);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 20:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 21:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 22:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 23:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 24:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            default:
                int iIntValue5 = ((Number) obj).intValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                urp0 urp0Var = (urp0) this.receiver;
                erp0 erp0Var = (erp0) urp0Var.s.f40549a.getValue();
                if (erp0Var instanceof crp0) {
                    HashSet hashSetJ0 = CollectionsKt.J0(((crp0) erp0Var).f4856a);
                    if (!zBooleanValue2 || hashSetJ0.size() < 10) {
                        if (zBooleanValue2) {
                            hashSetJ0.add(Integer.valueOf(iIntValue5));
                        } else {
                            hashSetJ0.remove(Integer.valueOf(iIntValue5));
                        }
                        urp0Var.b.e("SELECTED_IDS", new crp0(hashSetJ0));
                    } else {
                        urp0Var.D(krp0.f18778a);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
