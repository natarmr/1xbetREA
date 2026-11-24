package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f804a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ag0(Function1 function1, int i) {
        this.f804a = (byte) 16;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f804a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ue0(((Integer) obj).intValue()));
                break;
            case 1:
                function1.invoke(new ue0(((Integer) obj).intValue()));
                break;
            case 2:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarY = o7k0.y(jm40Var, gqw0.e, 2);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new nr0(function1, (byte) 4);
                        fetVar.o0(objP);
                    }
                    bsr0.M(6, fetVar, mm40VarY, (Function0) objP);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarY2 = o7k0.y(jm40Var, gqw0.e, 2);
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new nr0(function1, (byte) 3);
                        fetVar2.o0(objP2);
                    }
                    bsr0.N(6, fetVar2, mm40VarY2, (Function0) objP2);
                } else {
                    fetVar2.X();
                }
                break;
            case 4:
                function1.invoke(new kxq0(new bk0(((Boolean) obj2).booleanValue(), ((Long) obj).longValue())));
                break;
            case 5:
                long jLongValue = ((Long) obj).longValue();
                String str = (String) obj2;
                str.getClass();
                fxb.D(ivb0.b, new pe1((Object) this.b, jLongValue, (Object) str, (byte) 0)).a();
                break;
            case 6:
                fxb.D(ivb0.b, new re1(function1, ((Integer) obj).intValue(), (byte) 0)).a();
                break;
            case 7:
                eol eolVar = (eol) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                eolVar.getClass();
                function1.invoke(new zh1(eolVar.f8144a, zBooleanValue));
                break;
            case 8:
                eol eolVar2 = (eol) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                eolVar2.getClass();
                function1.invoke(new zh1(eolVar2.f8144a, zBooleanValue2));
                break;
            case 9:
                long jLongValue2 = ((Long) obj).longValue();
                String str2 = (String) obj2;
                str2.getClass();
                function1.invoke(new kxq0(new ek0(jLongValue2, str2)));
                break;
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                function1.invoke(num);
                break;
            case 11:
                Bundle bundle = (Bundle) obj2;
                function1.invoke(new y94(f140.h(bundle, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                break;
            case 12:
                Bundle bundle2 = (Bundle) obj2;
                ((String) obj).getClass();
                bundle2.getClass();
                bundle2.getBoolean("PICKER_DIALOG_TAG");
                function1.invoke(z94.f43999a);
                break;
            case 13:
                function1.invoke(new t94(f140.h((Bundle) obj2, (String) obj, "KEY_AUTH_ENTRY_POINT_REQUEST")));
                break;
            case 14:
                function1.invoke(new x94(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                break;
            case 15:
                function1.invoke(new oxq0(new tyq0(((Integer) obj).intValue(), (String) obj2)));
                break;
            case 16:
                ((Integer) obj2).getClass();
                o050.d(function1, (fet) obj, x8x.L(1));
                break;
            case 17:
                function1.invoke(new k09(((Integer) obj).intValue()));
                break;
            case 18:
                function1.invoke(new c6b(((Boolean) obj).booleanValue(), ((Long) obj2).longValue()));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new c6b(((Boolean) obj).booleanValue(), ((Long) obj2).longValue()));
                break;
            case 20:
                function1.invoke(new c6b(((Boolean) obj).booleanValue(), ((Long) obj2).longValue()));
                break;
            case 21:
                function1.invoke(new c6b(((Boolean) obj).booleanValue(), ((Long) obj2).longValue()));
                break;
            case 22:
                Integer num2 = (Integer) obj2;
                num2.getClass();
                ((mxl) obj).getClass();
                function1.invoke(num2);
                break;
            case 23:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarW = o050.W(jm40Var);
                    zfn zfnVar = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar3.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.limits_bottom_sheet_title, fetVar3), ha50.TWO_LINES, ((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent(), true, null);
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new dib(function1, (byte) 11);
                        fetVar3.o0(objP3);
                    }
                    hlm.c(mm40VarW, immVar, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar3, 805306368, 54, 500);
                } else {
                    fetVar3.X();
                }
                break;
            case 24:
                long jLongValue3 = ((Long) obj).longValue();
                h2l0 h2l0Var = (h2l0) obj2;
                h2l0Var.getClass();
                function1.invoke(new iig(jLongValue3, h2l0Var));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                function1.invoke(new mih(str3, str4));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue4 = ((Integer) obj).intValue();
                String str5 = (String) obj2;
                str5.getClass();
                function1.invoke(new rhw(iIntValue4, str5));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new qgw(((Integer) obj).intValue(), (String) obj2));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                function1.invoke(new d2t(m9nVar.getId(), (String) obj2));
                break;
            default:
                m9n m9nVar2 = (m9n) obj;
                m9nVar2.getClass();
                function1.invoke(new d2t(m9nVar2.getId(), (String) obj2));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ag0(Function1 function1, byte b) {
        this.f804a = b;
        this.b = function1;
    }
}
