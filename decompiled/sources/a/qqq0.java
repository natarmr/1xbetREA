package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qqq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29177a;
    public final /* synthetic */ sqq0 b;

    public /* synthetic */ qqq0(sqq0 sqq0Var, byte b) {
        this.f29177a = b;
        this.b = sqq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29177a;
        sqq0 sqq0Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = sqq0Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                g9m0 g9m0Var = sqq0.S1;
                TableViewImpl tableViewImpl = sqq0Var.G0().e;
                pqq0 pqq0Var = new pqq0(tableViewImpl, false, R.dimen.text_12);
                pqq0Var.l = tableViewImpl;
                return pqq0Var;
            default:
                g9m0 g9m0Var2 = sqq0.S1;
                i1w0 i1w0Var = ((yqq0) sqq0Var.O1.getValue()).b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
