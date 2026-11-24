package a;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fk30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9672a;
    public final /* synthetic */ ik30 b;

    public /* synthetic */ fk30(ik30 ik30Var, byte b) {
        this.f9672a = b;
        this.b = ik30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        byte b = this.f9672a;
        ik30 ik30Var = this.b;
        switch (b) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                atz atzVar = ik30.W1;
                ((String) obj).getClass();
                bundle.getClass();
                String string = bundle.getString("KEY_PICKER_SELECTED_DISCIPLINE_REQUEST");
                if (string != null) {
                    zk30 zk30VarH0 = ik30Var.H0();
                    p7m0 p7m0Var = zk30VarH0.n;
                    if (!((nk30) p7m0Var.getValue()).f23664a.equals(string)) {
                        zk30VarH0.b.e("KEY_SELECTED_DISCIPLINE", string);
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, nk30.a((nk30) value, string, null, null, iun.f15405a, null, false, false, false, 246)));
                        zk30VarH0.w(true);
                    }
                }
                break;
            default:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                LinearLayoutManager linearLayoutManager = ik30Var.R1;
                if (linearLayoutManager != null) {
                    linearLayoutManager.H0(0);
                }
                break;
        }
        return Unit.f46060a;
    }
}
