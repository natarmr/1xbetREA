package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u7o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35193a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ owr0 c;

    public /* synthetic */ u7o(owr0 owr0Var, Function1 function1) {
        this.f35193a = (byte) 0;
        this.c = owr0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35193a;
        owr0 owr0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                es10 es10Var = (es10) obj;
                es10Var.getClass();
                ConstraintLayout constraintLayout = es10Var.f8308a;
                constraintLayout.getClass();
                dyb.O(constraintLayout, new u7o(function1, owr0Var, (byte) 1));
                List list = u0d.f34849a;
                u0d.j(es10Var.b, owr0Var.d, 0, 0, null, null, null, 510);
                es10Var.d.setText(owr0Var.b);
                es10Var.c.setText(owr0Var.c);
                break;
            case 1:
                ((View) obj).getClass();
                function1.invoke(owr0Var);
                break;
            default:
                ((owr0) obj).getClass();
                function1.invoke(owr0Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ u7o(Function1 function1, owr0 owr0Var, byte b) {
        this.f35193a = b;
        this.b = function1;
        this.c = owr0Var;
    }
}
