package a;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final class dj5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ej5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj5(ej5 ej5Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ej5Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ej5 ej5Var = this.k;
        switch (b) {
            case 0:
                dj5 dj5Var = new dj5(ej5Var, yjeVar, (byte) 0);
                dj5Var.j = obj;
                return dj5Var;
            case 1:
                dj5 dj5Var2 = new dj5(ej5Var, yjeVar, (byte) 1);
                dj5Var2.j = obj;
                return dj5Var2;
            default:
                dj5 dj5Var3 = new dj5(ej5Var, yjeVar, (byte) 2);
                dj5Var3.j = obj;
                return dj5Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dj5) create((pi5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dj5) create((tk5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dj5) create((jj5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Context contextD;
        byte b = this.i;
        ej5 ej5Var = this.k;
        switch (b) {
            case 0:
                pi5 pi5Var = (pi5) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (pi5Var instanceof oi5) {
                    ej5 ej5Var2 = this.k;
                    wdk0 wdk0Var = ej5Var2.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((oi5) pi5Var).f25295a, null, null, null, null, 124), ej5Var2, null, null, false, null, 1020);
                    ej5Var2.H0().G();
                }
                return Unit.f46060a;
            case 1:
                tk5 tk5Var = (tk5) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                bj5 bj5Var = ej5.V1;
                DsNavigationBar dsNavigationBar = ej5Var.G0().g;
                View view = dsNavigationBar.e;
                dsNavigationBar.setTitle(tk5Var.f34078a);
                String str = tk5Var.b;
                if (str.length() > 0) {
                    dsNavigationBar.setSubTitle(str);
                    view.setVisibility(0);
                    dsNavigationBar.setSubtitleVisible(true);
                } else {
                    dsNavigationBar.setSubtitleVisible(false);
                    view.setVisibility(8);
                }
                return Unit.f46060a;
            default:
                jj5 jj5Var = (jj5) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if ((jj5Var instanceof hj5) && (contextD = ej5Var.D()) != null) {
                    j120.c0(contextD, "open/paymentconsultant");
                }
                return Unit.f46060a;
        }
    }
}
