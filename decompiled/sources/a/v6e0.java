package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v6e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36874a;
    public final /* synthetic */ j2m0 b;

    public /* synthetic */ v6e0(j2m0 j2m0Var, byte b) {
        this.f36874a = b;
        this.b = j2m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36874a;
        j2m0 j2m0Var = this.b;
        switch (b) {
            case 0:
                j2m0Var.e();
                j2m0Var.n = false;
                return Unit.f46060a;
            case 1:
                if (j2m0Var.f15787a != null) {
                    j2m0Var.d();
                    j2m0Var.f();
                }
                return Unit.f46060a;
            case 2:
                j2m0Var.e();
                j2m0Var.n = false;
                return Unit.f46060a;
            case 3:
                if (j2m0Var.f15787a != null) {
                    j2m0Var.d();
                    j2m0Var.f();
                }
                return Unit.f46060a;
            default:
                iab iabVar = j2m0Var.f15787a;
                if (iabVar == null) {
                    Intrinsics.h("binding");
                    throw null;
                }
                TableViewImpl tableViewImpl = (TableViewImpl) iabVar.g;
                tjj0 tjj0Var = new tjj0();
                dp dpVar = (dp) tjj0Var.e;
                byte b2 = 3;
                byte b3 = 2;
                dpVar.b(new gbn(new jbp((byte) 28), new atq(b2, b3), new rnp((byte) 21), gzn.z));
                byte b4 = 4;
                dpVar.b(new gbn(new ogj0(b2), new gsh0(b2, (byte) 26), new thj0(b4), wjj0.c));
                dpVar.b(new gbn(new ogj0(b3), new gsh0(b2, (byte) 27), new thj0(b2), wjj0.d));
                goi0 goi0Var = new goi0(tjj0Var, b2);
                dpVar.b(new gbn(new ogj0(b4), new gsh0(b2, (byte) 25), new huh0(goi0Var, tableViewImpl, (byte) 16), wjj0.b));
                return tjj0Var;
        }
    }
}
