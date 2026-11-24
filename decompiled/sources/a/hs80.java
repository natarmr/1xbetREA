package a;

import android.content.Context;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hs80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13568a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ hs80(Function1 function1, byte b) {
        this.f13568a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f13568a;
        boolean z = false;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                function1.invoke(new er80(st0Var.f32750a));
                return Unit.f46060a;
            case 1:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                long j = st0Var2.f32750a;
                mtr mtrVar = st0Var2.d;
                function1.invoke(new ut80(mtrVar != null ? mtrVar.b : false, j));
                return Unit.f46060a;
            case 2:
                st0 st0Var3 = (st0) obj;
                st0Var3.getClass();
                function1.invoke(new vt80(st0Var3.f32750a));
                return Unit.f46060a;
            case 3:
                ((Integer) obj).intValue();
                function1.invoke(au80.f1466a);
                return Unit.f46060a;
            case 4:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(z490.f43759a);
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj).intValue();
                function1.invoke(y390.f41940a);
                return Unit.f46060a;
            case 6:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new w390(str));
                return Unit.f46060a;
            case 7:
                mbu0 mbu0Var = (mbu0) obj;
                mbu0Var.getClass();
                function1.invoke(new l490(mbu0Var));
                return Unit.f46060a;
            case 8:
                ((Integer) obj).intValue();
                function1.invoke(o490.f24623a);
                return Unit.f46060a;
            case 9:
                String str2 = (String) obj;
                str2.getClass();
                if (StringsKt.O(str2, "/onpay/", false)) {
                    function1.invoke(new i490(str2));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new eo90(str3));
                return Unit.f46060a;
            case 11:
                function1.invoke(new c0a0((int) ((Long) obj).longValue()));
                return Unit.f46060a;
            case 12:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(t1a0.f33160a);
                }
                return Unit.f46060a;
            case 13:
                wdn wdnVar = (wdn) obj;
                wdnVar.getClass();
                function1.invoke(new v1a0(wdnVar));
                return Unit.f46060a;
            case 14:
                function1.invoke(new s1a0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 15:
                function1.invoke(new d3a0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 16:
                function1.invoke(new f3a0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 17:
                function1.invoke(Integer.valueOf((int) ((Long) obj).longValue()));
                return Unit.f46060a;
            case 18:
                function1.invoke(new d3a0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new d3a0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 20:
                function1.invoke(new f3a0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 21:
                Context context = (Context) obj;
                context.getClass();
                return (View) function1.invoke(context);
            case 22:
                function1.invoke(new mha0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 23:
                function1.invoke(new kka0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 24:
                function1.invoke(new hka0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new lka0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((jtl) obj).getClass();
                function1.invoke(jka0.b);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new yja0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new cka0(((Integer) obj).intValue()));
                return Unit.f46060a;
            default:
                long jLongValue = ((Long) obj).longValue();
                vpa0.b.getClass();
                vpa0 vpa0Var = (vpa0) vpa0.c.get(Integer.valueOf((int) jLongValue));
                if (vpa0Var == null) {
                    vpa0Var = vpa0.NONE;
                }
                function1.invoke(new j9f0(vpa0Var));
                return Unit.f46060a;
        }
    }
}
