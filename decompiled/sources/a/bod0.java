package a;

import android.content.Context;
import android.javax.sip.message.Response;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bod0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2929a;

    public /* synthetic */ bod0(pzu pzuVar) {
        this.f2929a = (byte) 29;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2929a) {
            case 0:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 1:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 4:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                jsd0 jsd0Var = new jsd0(tableViewImpl, true, R.dimen.text_12);
                jsd0Var.l = tableViewImpl;
                tableViewImpl.setAdapter(jsd0Var);
                return tableViewImpl;
            case 5:
                pud0 pud0Var = (pud0) obj;
                pud0Var.getClass();
                return pud0Var.f27611a;
            case 6:
                ((pud0) obj).getClass();
                return sre0.f32672a.b(pud0.class);
            case 7:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                return xnm0.h(mbp0Var.c, mbp0Var.d, mbp0Var.b, mbp0Var.e, mbp0Var.g, mbp0Var.f21520a);
            case 8:
                mbp0 mbp0Var2 = (mbp0) obj;
                mbp0Var2.getClass();
                return qim0.k(mbp0Var2.h, ucx.X(mbp0Var2.f), mbp0Var2.f21520a, mbp0Var2.k, mbp0Var2.l);
            case 9:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return kpb.o0((bqr) feeVar.c(), false);
            case 10:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 11:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new kxd0(wusVar);
            case 12:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new jxd0(xa30Var);
            case 13:
                e2e0 e2e0Var = (e2e0) obj;
                e2e0Var.getClass();
                return e2e0Var.f7080a;
            case 14:
                return Integer.valueOf(-si30.a(((double) ((Integer) obj).intValue()) * 0.2d));
            case 15:
                return Integer.valueOf(-si30.a(((double) ((Integer) obj).intValue()) * 0.2d));
            case 16:
                o7e0 o7e0Var = (o7e0) obj;
                o7e0Var.getClass();
                return new i7e0(o7e0Var.b, dyb.g0(f7e0.c, g7e0.c), ucx.X(o7e0Var.f24783a));
            case 17:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 18:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                return oja0.b0(kgVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ot0 ot0Var = (ot0) obj;
                ot0Var.getClass();
                return x4d0.g0(ot0Var);
            case 20:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
            case 21:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 22:
                ob0 ob0Var = (ob0) obj;
                ob0Var.getClass();
                return new jfe0(ob0Var);
            case 23:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 24:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.getClass();
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(recyclerView);
                if (xiv0VarA != null && xiv0VarA.f40966a.u(8)) {
                    j120.X(recyclerView);
                    recyclerView.requestFocus();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (int i = 0; i < 6; i++) {
                    hcz.e(hczVar, null, null, f1t0.d, 3);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Context context2 = (Context) obj;
                context2.getClass();
                TableViewImpl tableViewImpl2 = new TableViewImpl(context2, null, 0);
                jke0 jke0Var = new jke0(tableViewImpl2, true, R.dimen.text_12);
                jke0Var.l = tableViewImpl2;
                tableViewImpl2.setAdapter(jke0Var);
                return tableViewImpl2;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Context context3 = (Context) obj;
                context3.getClass();
                TableViewImpl tableViewImpl3 = new TableViewImpl(context3, null, 0);
                zle0 zle0Var = new zle0(tableViewImpl3, true, R.dimen.text_12);
                zle0Var.l = tableViewImpl3;
                tableViewImpl3.setAdapter(zle0Var);
                return tableViewImpl3;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentOldScreen$1(new RuleData("referral_rules_01", 14, (Map) null, (String) null), R.string.rules, false));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ bod0(byte b) {
        this.f2929a = b;
    }
}
