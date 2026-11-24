package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l6b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19499a;
    public final /* synthetic */ u6b0 b;

    public /* synthetic */ l6b0(u6b0 u6b0Var, byte b) {
        this.f19499a = b;
        this.b = u6b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19499a;
        byte b2 = 5;
        yje yjeVar = null;
        u6b0 u6b0Var = this.b;
        switch (b) {
            case 0:
                xi70 xi70Var = u6b0.e2;
                ((View) obj).getClass();
                sbb0 sbb0VarJ0 = u6b0Var.J0();
                sac.V(jiu0.a(sbb0VarJ0), pbb0.f26697a, null, null, new mab0(sbb0VarJ0, yjeVar, b2), 14);
                break;
            case 1:
                xi70 xi70Var2 = u6b0.e2;
                ((View) obj).getClass();
                u6b0Var.J0().E();
                break;
            case 2:
                xi70 xi70Var3 = u6b0.e2;
                ((View) obj).getClass();
                sbb0 sbb0VarJ1 = u6b0Var.J0();
                sac.V(jiu0.a(sbb0VarJ1), pbb0.f26697a, null, null, new mab0(sbb0VarJ1, yjeVar, b2), 14);
                break;
            case 3:
                xi70 xi70Var4 = u6b0.e2;
                ((View) obj).getClass();
                u6b0Var.J0().E();
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                xi70 xi70Var5 = u6b0.e2;
                u6b0Var.J0().G(iIntValue, u6b0.class.getSimpleName());
                break;
        }
        return Unit.f46060a;
    }
}
