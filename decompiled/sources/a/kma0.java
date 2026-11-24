package a;

import android.content.Context;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kma0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18530a;

    public /* synthetic */ kma0(byte b) {
        this.f18530a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18530a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                qma0 qma0Var = new qma0(tableViewImpl, true, R.dimen.text_12);
                qma0Var.l = tableViewImpl;
                tableViewImpl.setAdapter(qma0Var);
                return tableViewImpl;
            case 1:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new isa0(sjdVar);
            case 2:
                c0b0 c0b0Var = (c0b0) obj;
                c0b0Var.getClass();
                return Boolean.valueOf(c0b0Var.f3516a);
            case 3:
                c0b0 c0b0Var2 = (c0b0) obj;
                c0b0Var2.getClass();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                int i = c0b0Var2.h;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.error_get_data, 0, c0b0Var2.f3516a ? R.string.refresh_data : R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 4:
                c0b0 c0b0Var3 = (c0b0) obj;
                c0b0Var3.getClass();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                int i2 = c0b0Var3.h;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, i2), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
            case 5:
                c0b0 c0b0Var4 = (c0b0) obj;
                c0b0Var4.getClass();
                xuz xuzVar3 = pb10.c;
                pb10 pb10Var3 = pb10.g;
                int i3 = c0b0Var4.h;
                xuzVar3.getClass();
                return new mdm(xuz.a(pb10Var3, i3), null, null, 0, 0, R.string.country_blocking, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 6:
                wq5 wq5Var = (wq5) obj;
                wq5Var.getClass();
                return new rza0(wq5Var);
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar4 = pb10.c;
                pb10 pb10Var4 = pb10.g;
                xuzVar4.getClass();
                return new mdm(xuz.a(pb10Var4, iIntValue), null, null, 0, 0, R.string.country_blocking, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 8:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar5 = pb10.c;
                pb10 pb10Var5 = pb10.g;
                xuzVar5.getClass();
                return new mdm(xuz.a(pb10Var5, iIntValue2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 9:
                int iIntValue3 = ((Integer) obj).intValue();
                xuz xuzVar6 = pb10.c;
                pb10 pb10Var6 = pb10.g;
                xuzVar6.getClass();
                return new mdm(xuz.a(pb10Var6, iIntValue3), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
            case 10:
                ot0 ot0Var = (ot0) obj;
                ot0Var.getClass();
                return x4d0.g0(ot0Var);
            case 11:
                jh70 jh70Var = d4b0.S1;
                obj.getClass();
                return Boolean.valueOf(obj instanceof fcb);
            case 12:
                jh70 jh70Var2 = d4b0.S1;
                obj.getClass();
                return Boolean.valueOf(obj instanceof zgb);
            case 13:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 14:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 16:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 17:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 18:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                return a2nVar.getKey();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a2n a2nVar2 = (a2n) obj;
                a2nVar2.getClass();
                return sre0.f32672a.b(a2nVar2.getClass());
            case 20:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 21:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 22:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
            case 23:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                th9.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                th10.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                th11.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                th12.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                n1g n1gVar = (n1g) obj;
                mr2 mr2Var = new mr2();
                n1gVar.getClass();
                n1gVar.e = mr2Var;
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fhl fhlVar = (fhl) obj;
                mi70 mi70Var = ccb0.X1;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            default:
                oeb0 oeb0Var = (oeb0) obj;
                oeb0Var.getClass();
                return oeb0Var.getKey();
        }
    }
}
