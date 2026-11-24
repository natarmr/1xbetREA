package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dgc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6036a;
    public final /* synthetic */ igc0 b;
    public final /* synthetic */ a8z c;

    public /* synthetic */ dgc0(igc0 igc0Var, a8z a8zVar, byte b) {
        this.f6036a = b;
        this.b = igc0Var;
        this.c = a8zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6036a;
        a8z a8zVar = this.c;
        switch (b) {
            case 0:
                jec0 jec0Var = (jec0) obj;
                fl70 fl70Var = igc0.V1;
                jec0Var.getClass();
                boolean zEquals = jec0Var.equals(hec0.f12917a);
                igc0 igc0Var = this.b;
                if (zEquals) {
                    igc0Var.I0();
                } else if (jec0Var instanceof gec0) {
                    ii iiVar = igc0Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    gec0 gec0Var = (gec0) jec0Var;
                    String str = gec0Var.f11148a;
                    String str2 = gec0Var.b;
                    String strH = igc0Var.H(R.string.ok);
                    strH.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = igc0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (jec0Var instanceof fec0) {
                    wdk0 wdk0Var = igc0Var.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    fec0 fec0Var = (fec0) jec0Var;
                    j120.M(igc0Var, wdk0Var, "promoCode", fec0Var.f9400a, fec0Var.b, null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                } else {
                    if (!(jec0Var instanceof iec0)) {
                        t9f.b();
                        return null;
                    }
                    String str3 = ((iec0) jec0Var).f14626a;
                    wdk0 wdk0Var2 = igc0Var.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(qek0.f28589a, str3, null, null, null, null, 124), igc0Var, null, null, false, null, 1020);
                }
                ((k3t0) a8zVar.getValue()).x(mdc0.f21590a);
                return Unit.f46060a;
            default:
                qsc0 qsc0Var = (qsc0) obj;
                fl70 fl70Var2 = igc0.V1;
                qsc0Var.getClass();
                boolean zEquals2 = qsc0Var.equals(nsc0.f24045a);
                igc0 igc0Var2 = this.b;
                if (zEquals2) {
                    igc0Var2.I0();
                } else if (qsc0Var instanceof osc0) {
                    wdk0 wdk0Var3 = igc0Var2.O1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, new xdk0(qek0.f28589a, ((osc0) qsc0Var).f25777a, null, null, null, null, 124), igc0Var2, null, null, false, null, 1020);
                } else if (qsc0Var instanceof msc0) {
                    ii iiVar2 = igc0Var2.N1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    msc0 msc0Var = (msc0) qsc0Var;
                    String str4 = msc0Var.f22312a;
                    String str5 = msc0Var.b;
                    String strH2 = igc0Var2.H(R.string.ok);
                    strH2.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) str4, (CharSequence) str5, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = igc0Var2.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else {
                    if (!(qsc0Var instanceof psc0)) {
                        t9f.b();
                        return null;
                    }
                    ((k3t0) igc0Var2.S1.getValue()).x(new sgc0(((psc0) qsc0Var).f27510a));
                }
                ((k3t0) a8zVar.getValue()).x(uoc0.f36007a);
                return Unit.f46060a;
        }
    }
}
