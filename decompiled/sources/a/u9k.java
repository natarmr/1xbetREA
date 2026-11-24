package a;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class u9k extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w9k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9k(w9k w9kVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = w9kVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w9k w9kVar = this.k;
        switch (b) {
            case 0:
                u9k u9kVar = new u9k(w9kVar, yjeVar, (byte) 0);
                u9kVar.j = obj;
                return u9kVar;
            case 1:
                u9k u9kVar2 = new u9k(w9kVar, yjeVar, (byte) 1);
                u9kVar2.j = obj;
                return u9kVar2;
            default:
                u9k u9kVar3 = new u9k(w9kVar, yjeVar, (byte) 2);
                u9kVar3.j = obj;
                return u9kVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u9k) create((hak) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((u9k) create((z9k) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u9k) create((dak) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        w9k w9kVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                hak hakVar = (hak) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (hakVar != null) {
                    if (hakVar instanceof gak) {
                        iiy[] iiyVarArr = w9k.P1;
                        w9kVar.G0().f.setVisibility(8);
                        w9kVar.G0().c.setVisibility(8);
                        w9kVar.G0().d.setVisibility(8);
                        ((FrameLayout) w9kVar.G0().e.c).setVisibility(0);
                    } else if (hakVar instanceof fak) {
                        ra10 ra10Var = ((fak) hakVar).f9211a;
                        iiy[] iiyVarArr2 = w9k.P1;
                        w9kVar.G0().d.v(ra10Var);
                        w9kVar.G0().f.setVisibility(8);
                        w9kVar.G0().c.setVisibility(8);
                        w9kVar.G0().d.setVisibility(0);
                        ((FrameLayout) w9kVar.G0().e.c).setVisibility(8);
                    } else if (hakVar instanceof eak) {
                        iiy[] iiyVarArr3 = w9k.P1;
                        w9kVar.G0().f.setVisibility(0);
                        w9kVar.G0().c.setVisibility(0);
                        w9kVar.G0().d.setVisibility(8);
                        ((FrameLayout) w9kVar.G0().e.c).setVisibility(8);
                    }
                }
                return Unit.f46060a;
            case 1:
                z9k z9kVar = (z9k) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr4 = w9k.P1;
                ((q9k) w9kVar.N1.getValue()).A(z9kVar.f44023a);
                w9kVar.G0().b.setEnabled(z9kVar.b);
                return Unit.f46060a;
            default:
                dak dakVar = (dak) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (dakVar != null) {
                    if (dakVar instanceof cak) {
                        iiy[] iiyVarArr5 = w9k.P1;
                        ii iiVar = w9kVar.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = w9kVar.H(R.string.caution);
                        String strH2 = w9kVar.H(R.string.limit_set_dialog_confirm_message);
                        String strH3 = w9kVar.H(R.string.yes);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, w9kVar.H(R.string.cancel), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = w9kVar.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (dakVar instanceof aak) {
                        iiy[] iiyVarArr6 = w9k.P1;
                        ii iiVar2 = w9kVar.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = w9kVar.H(R.string.caution);
                        String strH5 = w9kVar.H(R.string.something_went_wrong);
                        String strH6 = w9kVar.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC2 = w9kVar.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (dakVar instanceof bak) {
                        String str = ((bak) dakVar).f2261a;
                        iiy[] iiyVarArr7 = w9k.P1;
                        ii iiVar3 = w9kVar.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH7 = w9kVar.H(R.string.caution);
                        String strH8 = w9kVar.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) str, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = w9kVar.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    }
                }
                return Unit.f46060a;
        }
    }
}
