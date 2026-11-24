package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dvd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6738a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dvd0(Function1 function1, byte b) {
        this.f6738a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6738a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new xtd0(hdbVar));
                return Unit.f46060a;
            case 1:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new ztd0(ussVar));
                return Unit.f46060a;
            case 2:
                function1.invoke(new kud0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 3:
                function1.invoke(new ytd0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 4:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new bud0(str));
                return Unit.f46060a;
            case 5:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new lud0(nusVar));
                return Unit.f46060a;
            case 6:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new cud0(imsVar));
                return Unit.f46060a;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new ark0(str2));
                return Unit.f46060a;
            case 8:
                function1.invoke(new k2e0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 9:
                ((Integer) obj).intValue();
                function1.invoke(a4e0.f219a);
                return Unit.f46060a;
            case 10:
                i6i0 i6i0Var = (i6i0) obj;
                i6i0Var.getClass();
                function1.invoke(new y3e0(i6i0Var));
                return Unit.f46060a;
            case 11:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(m5e0.f21216a);
                }
                return Unit.f46060a;
            case 12:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(y1m0.f41863a);
                } else if (iIntValue == 1) {
                    function1.invoke(w1m0.f38409a);
                }
                return Unit.f46060a;
            case 13:
                f7v0 f7v0Var = (f7v0) obj;
                f7v0Var.getClass();
                function1.invoke(new e3e0(f7v0Var));
                return Unit.f46060a;
            case 14:
                ((Integer) obj).intValue();
                function1.invoke(y7e0.f42148a);
                return Unit.f46060a;
            case 15:
                function1.invoke(new g3e0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 16:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, rk.j)) {
                    function1.invoke(pce0.f26756a);
                } else if (Intrinsics.d(jtlVar, sh00.c)) {
                    function1.invoke(tce0.f33717a);
                }
                return Unit.f46060a;
            case 17:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(rce0.f30236a);
                }
                return Unit.f46060a;
            case 18:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                function1.invoke(new hee0(st0Var.f32750a));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new iee0(st0Var2.f32750a));
                return Unit.f46060a;
            case 20:
                ((Integer) obj).intValue();
                function1.invoke(nee0.f23381a);
                return Unit.f46060a;
            case 21:
                ((jtl) obj).getClass();
                function1.invoke(zve0.f45052a);
                return Unit.f46060a;
            case 22:
                Context context = (Context) obj;
                context.getClass();
                DsTabs dsTabs = new DsTabs(context, null);
                dsTabs.v = new dvd0(function1, (byte) 23);
                return dsTabs;
            case 23:
                Integer num = (Integer) obj;
                num.intValue();
                function1.invoke(num);
                return Unit.f46060a;
            case 24:
                function1.invoke(new lqc0(((Long) obj).longValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new fgf0(str3));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new g6g0(str4));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (((Integer) obj).intValue() == 1) {
                    function1.invoke(d6g0.f5548a);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Context context2 = (Context) obj;
                context2.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context2, null, 0);
                tableViewImpl.setAdapter(new x7g0(tableViewImpl, new dvd0(function1, (byte) 26)));
                return tableViewImpl;
            default:
                function1.invoke(new k5g0(((Long) obj).longValue()));
                return Unit.f46060a;
        }
    }
}
