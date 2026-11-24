package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f4e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8910a;
    public final /* synthetic */ i4e0 b;

    public /* synthetic */ f4e0(i4e0 i4e0Var, byte b) {
        this.f8910a = b;
        this.b = i4e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object serializable;
        byte b = this.f8910a;
        i4e0 i4e0Var = this.b;
        switch (b) {
            case 0:
                a8z a8zVar = i4e0Var.O1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                xi70 xi70Var = i4e0.P1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar.i(k3t0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        prc0 prc0Var = new prc0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar.o0(prc0Var);
                        objP = prc0Var;
                    }
                    dwi0.v(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                Bundle bundle = (Bundle) obj2;
                xi70 xi70Var2 = i4e0.P1;
                ((String) obj).getClass();
                bundle.getClass();
                if (bundle.containsKey("SELECTOR_RESULT_SELECTOR_TYPE") && bundle.containsKey("SELECTOR_RESULT")) {
                    int i = Build.VERSION.SDK_INT;
                    SelectorOptionModel selectorOptionModel = (SelectorOptionModel) (i <= 33 ? bundle.getParcelable("SELECTOR_RESULT") : (Parcelable) bundle.getParcelable("SELECTOR_RESULT", SelectorOptionModel.class));
                    if (selectorOptionModel != null) {
                        if (i >= 33) {
                            serializable = bundle.getSerializable("SELECTOR_RESULT_SELECTOR_TYPE", i6i0.class);
                        } else {
                            Object serializable2 = bundle.getSerializable("SELECTOR_RESULT_SELECTOR_TYPE");
                            if (!(serializable2 instanceof i6i0)) {
                                serializable2 = null;
                            }
                            serializable = (i6i0) serializable2;
                        }
                        i6i0 i6i0Var = serializable instanceof i6i0 ? (i6i0) serializable : null;
                        if (i6i0Var != null) {
                            ((k3t0) i4e0Var.O1.getValue()).x(new z3e0(i6i0Var, selectorOptionModel));
                        }
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
