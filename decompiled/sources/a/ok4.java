package a;

import android.app.Dialog;
import android.view.Window;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ok4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qk4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok4(qk4 qk4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qk4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qk4 qk4Var = this.k;
        switch (b) {
            case 0:
                ok4 ok4Var = new ok4(qk4Var, yjeVar, (byte) 0);
                ok4Var.j = obj;
                return ok4Var;
            default:
                ok4 ok4Var2 = new ok4(qk4Var, yjeVar, (byte) 1);
                ok4Var2.j = obj;
                return ok4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ok4) create((cl4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ok4) create((bl4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Window window;
        switch (this.i) {
            case 0:
                cl4 cl4Var = (cl4) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = u0d.f34849a;
                ShapeableImageView shapeableImageView = this.k.T0().c;
                String str = cl4Var.f4538a;
                if (str == null) {
                    str = "";
                }
                u0d.j(shapeableImageView, str, R.drawable.onboarding_registration_placeholder, 0, null, null, null, 508);
                return Unit.f46060a;
            default:
                bl4 bl4Var = (bl4) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(bl4Var, vk4.f37557a)) {
                    boolean z = bl4Var instanceof zk4;
                    qk4 qk4Var = this.k;
                    if (z) {
                        Dialog dialog = qk4Var.S1;
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            wdk0 wdk0Var = qk4Var.f2;
                            if (wdk0Var == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            wdk0.k(wdk0Var, new xdk0(rek0.b, ((zk4) bl4Var).f44510a, null, null, null, null, 124), qk4Var, window, null, false, null, 1016);
                        }
                    } else {
                        if (!Intrinsics.d(bl4Var, xk4.f41013a)) {
                            t9f.b();
                            return null;
                        }
                        if (!qk4Var.R()) {
                            qk4Var.y0();
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
