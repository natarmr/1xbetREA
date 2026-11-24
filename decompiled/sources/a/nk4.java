package a;

import android.app.Dialog;
import android.view.Window;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class nk4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pk4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk4(pk4 pk4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pk4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pk4 pk4Var = this.k;
        switch (b) {
            case 0:
                nk4 nk4Var = new nk4(pk4Var, yjeVar, (byte) 0);
                nk4Var.j = obj;
                return nk4Var;
            default:
                nk4 nk4Var2 = new nk4(pk4Var, yjeVar, (byte) 1);
                nk4Var2.j = obj;
                return nk4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nk4) create((dl4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nk4) create((al4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Window window;
        switch (this.i) {
            case 0:
                dl4 dl4Var = (dl4) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = u0d.f34849a;
                u0d.j(this.k.Q0().c, dl4Var.f6260a, R.drawable.onboarding_registration_placeholder, 0, null, null, null, 508);
                return Unit.f46060a;
            default:
                al4 al4Var = (al4) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(al4Var, uk4.f35808a)) {
                    boolean z = al4Var instanceof yk4;
                    pk4 pk4Var = this.k;
                    if (z) {
                        Dialog dialog = pk4Var.S1;
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            wdk0 wdk0Var = pk4Var.d2;
                            if (wdk0Var == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            wdk0.k(wdk0Var, new xdk0(rek0.b, ((yk4) al4Var).f42770a, null, null, null, null, 124), pk4Var, window, null, false, null, 1016);
                        }
                    } else {
                        if (!Intrinsics.d(al4Var, wk4.f39291a)) {
                            t9f.b();
                            return null;
                        }
                        if (!pk4Var.R()) {
                            pk4Var.x0();
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
