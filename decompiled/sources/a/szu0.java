package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class szu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33086a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ szu0(Function1 function1, byte b) {
        this.f33086a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33086a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, rk.b)) {
                    function1.invoke(izu0.f15650a);
                }
                return Unit.f46060a;
            case 1:
                function1.invoke(new l7v0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 2:
                function1.invoke(new l7v0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 3:
                nd50 nd50Var = (nd50) obj;
                nd50Var.getClass();
                if (nd50Var instanceof jd50) {
                    function1.invoke(m8v0.f21388a);
                }
                return Unit.f46060a;
            case 4:
                function1.invoke(new krk0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 5:
                ((Integer) obj).intValue();
                function1.invoke(wfv0.f39086a);
                return Unit.f46060a;
            case 6:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new xfv0(str));
                return Unit.f46060a;
            case 7:
                dfm0 dfm0Var = (dfm0) obj;
                dfm0Var.getClass();
                if (dfm0Var instanceof wkv0) {
                    function1.invoke(new plv0((wkv0) dfm0Var));
                }
                return Unit.f46060a;
            case 8:
                dfm0 dfm0Var2 = (dfm0) obj;
                dfm0Var2.getClass();
                if (dfm0Var2 instanceof wkv0) {
                    function1.invoke(new plv0((wkv0) dfm0Var2));
                }
                return Unit.f46060a;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                tableViewImpl.setAdapter(new dnv0(tableViewImpl, new szu0(function1, (byte) 10)));
                return tableViewImpl;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new anv0(str2));
                return Unit.f46060a;
            case 11:
                rb50 rb50Var = (rb50) obj;
                rb50Var.getClass();
                return rb50Var instanceof kwv0 ? new ob50(rb50Var, cy2.v) : (ob50) function1.invoke(rb50Var);
            case 12:
                ((pyv0) obj).getClass();
                function1.invoke(myv0.f22622a);
                return Unit.f46060a;
            default:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                if (!(m9nVar instanceof k9n)) {
                    if (!(m9nVar instanceof l9n)) {
                        t9f.b();
                        return null;
                    }
                    l9n l9nVar = (l9n) m9nVar;
                    j9n j9nVar = l9nVar.c;
                    if (j9nVar instanceof g9n) {
                        function1.invoke(new zm60(-1, l9nVar.f19662a, !((g9n) j9nVar).b));
                    }
                }
                return Unit.f46060a;
        }
    }
}
