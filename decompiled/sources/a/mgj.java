package a;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.dayexpress.impl.presentation.view.ShowcaseExpressView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class mgj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ngj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mgj(ngj ngjVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ngjVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ngj ngjVar = this.k;
        switch (b) {
            case 0:
                mgj mgjVar = new mgj(ngjVar, yjeVar, (byte) 0);
                mgjVar.j = obj;
                return mgjVar;
            case 1:
                mgj mgjVar2 = new mgj(ngjVar, yjeVar, (byte) 1);
                mgjVar2.j = obj;
                return mgjVar2;
            default:
                mgj mgjVar3 = new mgj(ngjVar, yjeVar, (byte) 2);
                mgjVar3.j = obj;
                return mgjVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mgj) create((bhj) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mgj) create((ugj) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mgj) create((tgj) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ngj ngjVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                bhj bhjVar = (bhj) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (bhjVar != null) {
                    usd usdVar = ngj.n2;
                    xgj xgjVarW0 = ngjVar.W0();
                    sac.V(jiu0.a(xgjVarW0), wgj.f39120a, null, xgjVarW0.e.f22085a, new e9g(xgjVarW0, bhjVar, yjeVar, (byte) 17), 10);
                } else {
                    ngjVar.x0();
                }
                return Unit.f46060a;
            case 1:
                ugj ugjVar = (ugj) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jk3 jk3Var = ngjVar.Q0().d;
                ((TextView) jk3Var.f).setText(ugjVar.f35626a);
                ((TextView) jk3Var.d).setText(ugjVar.b);
                ((TextView) jk3Var.e).setText(ugjVar.c);
                ((ShowcaseExpressView) jk3Var.c).setExpress(ugjVar.d);
                ((igj) ngjVar.m2.getValue()).A(ugjVar.e);
                return Unit.f46060a;
            default:
                tgj tgjVar = (tgj) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (tgjVar != null) {
                    boolean z = tgjVar instanceof sgj;
                    ngj ngjVar2 = this.k;
                    if (z) {
                        usd usdVar2 = ngj.n2;
                        wdk0 wdk0Var = ngjVar2.h2;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        qek0 qek0Var = qek0.f28589a;
                        String strH = ngjVar2.H(R.string.express_added_coupon);
                        strH.getClass();
                        String strH2 = ngjVar2.H(R.string.coupon);
                        strH2.getClass();
                        wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, new hdk0(strH2, new jgj(ngjVar2, (byte) 0)), jtv.x, null, 100), ngjVar2, null, ngjVar2.Q0().f31375a, true, null, 996);
                    } else if (tgjVar instanceof rgj) {
                        usd usdVar3 = ngj.n2;
                        if (ngjVar2.S()) {
                            ii iiVar = ngjVar2.i2;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String strH3 = ngjVar2.H(R.string.coupon_has_items);
                            String strH4 = ngjVar2.H(R.string.coupon_has_items_message);
                            String strH5 = ngjVar2.H(R.string.ok_new);
                            strH5.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, ngjVar2.H(R.string.cancel), (String) null, "REQUEST_EXPRESS_DIALOG_EXPRESS", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            androidx.fragment.app.e eVarC = ngjVar2.C();
                            eVarC.getClass();
                            iiVar.d(dialogFields, eVarC);
                        }
                    } else if (tgjVar instanceof qgj) {
                        ngjVar2.x0();
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
