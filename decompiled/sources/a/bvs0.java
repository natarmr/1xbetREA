package a;

import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class bvs0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dvs0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bvs0(dvs0 dvs0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dvs0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dvs0 dvs0Var = this.k;
        switch (b) {
            case 0:
                bvs0 bvs0Var = new bvs0(dvs0Var, yjeVar, (byte) 0);
                bvs0Var.j = obj;
                return bvs0Var;
            default:
                bvs0 bvs0Var2 = new bvs0(dvs0Var, yjeVar, (byte) 1);
                bvs0Var2.j = obj;
                return bvs0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bvs0) create((bws0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bvs0) create((aws0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                bws0 bws0Var = (bws0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                g9m0 g9m0Var = dvs0.Q1;
                dvs0 dvs0Var = this.k;
                FrameLayout frameLayout = dvs0Var.G0().f;
                boolean z = bws0Var.f3342a;
                String str = bws0Var.d;
                frameLayout.setVisibility(z ? 0 : 8);
                dvs0Var.G0().b.setFirstButtonText(bws0Var.b);
                dvs0Var.G0().d.f(str.length() > 0);
                dvs0Var.G0().d.setErrorText(str);
                dvs0Var.G0().b.setSecondButtonEnabled(bws0Var.e);
                return Unit.f46060a;
            default:
                dvs0 dvs0Var2 = this.k;
                phf0 phf0Var = dvs0Var2.P1;
                a8z a8zVar = dvs0Var2.N1;
                aws0 aws0Var = (aws0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(aws0Var, vvs0.f38118a)) {
                    g9m0 g9m0Var2 = dvs0.Q1;
                    try {
                        v3c.T(dvs0Var2.D(), "com.google.android.apps.authenticator2");
                    } catch (Throwable th) {
                        dws0 dws0VarH0 = dvs0Var2.H0();
                        dws0VarH0.e.b(th, new tvs0(dws0VarH0, (byte) 0));
                    }
                    break;
                } else if (Intrinsics.d(aws0Var, wvs0.f39855a)) {
                    g9m0 g9m0Var3 = dvs0.Q1;
                    try {
                        v3c.U(dvs0Var2.D(), "com.google.android.apps.authenticator2");
                    } catch (Throwable th2) {
                        dws0 dws0VarH1 = dvs0Var2.H0();
                        dws0VarH1.e.b(th2, new tvs0(dws0VarH1, (byte) 0));
                    }
                    break;
                } else if (aws0Var instanceof yvs0) {
                    g9m0 g9m0Var4 = dvs0.Q1;
                    wdk0 wdk0Var = (wdk0) ((kyi) a8zVar.getValue()).f19105a.h;
                    x1x.y(wdk0Var);
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((yvs0) aws0Var).f43336a, null, null, null, null, 124), dvs0Var2, null, null, false, null, 1020);
                } else if (aws0Var instanceof xvs0) {
                    rvs0 rvs0Var = ((xvs0) aws0Var).f41577a;
                    g9m0 g9m0Var5 = dvs0.Q1;
                    v1r v1rVarR = dvs0Var2.n0().r();
                    iiy[] iiyVarArr = dvs0.R1;
                    String strN = phf0Var.n(dvs0Var2, iiyVarArr[1]);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable(phf0Var.n(dvs0Var2, iiyVarArr[1]), rvs0Var);
                    v1rVarR.t0(bundle, strN);
                    i1w0 i1w0Var = dvs0Var2.H0().f;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (aws0Var instanceof zvs0) {
                    g9m0 g9m0Var6 = dvs0.Q1;
                    ii iiVar = (ii) ((kyi) a8zVar.getValue()).f19105a.g;
                    x1x.y(iiVar);
                    String strH = dvs0Var2.H(R.string.error);
                    String strH2 = dvs0Var2.H(R.string.request_error);
                    String strH3 = dvs0Var2.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = dvs0Var2.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else {
                    if (!(aws0Var instanceof uvs0)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(dvs0Var2);
                }
                return Unit.f46060a;
        }
    }
}
