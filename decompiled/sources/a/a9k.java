package a;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class a9k extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c9k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9k(c9k c9kVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = c9kVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        c9k c9kVar = this.k;
        switch (b) {
            case 0:
                a9k a9kVar = new a9k(c9kVar, yjeVar, (byte) 0);
                a9kVar.j = obj;
                return a9kVar;
            case 1:
                a9k a9kVar2 = new a9k(c9kVar, yjeVar, (byte) 1);
                a9kVar2.j = obj;
                return a9kVar2;
            default:
                a9k a9kVar3 = new a9k(c9kVar, yjeVar, (byte) 2);
                a9kVar3.j = obj;
                return a9kVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a9k) create((o9k) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a9k) create((g9k) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a9k) create((k9k) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        c9k c9kVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                o9k o9kVar = (o9k) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (o9kVar != null) {
                    if (o9kVar instanceof n9k) {
                        nwd nwdVar = c9k.Q1;
                        c9kVar.G0().f.setVisibility(8);
                        c9kVar.G0().c.setVisibility(8);
                        c9kVar.G0().d.setVisibility(8);
                        ((FrameLayout) c9kVar.G0().e.c).setVisibility(0);
                    } else if (o9kVar instanceof m9k) {
                        ra10 ra10Var = ((m9k) o9kVar).f21413a;
                        nwd nwdVar2 = c9k.Q1;
                        c9kVar.G0().d.v(ra10Var);
                        c9kVar.G0().f.setVisibility(8);
                        c9kVar.G0().c.setVisibility(8);
                        c9kVar.G0().d.setVisibility(0);
                        ((FrameLayout) c9kVar.G0().e.c).setVisibility(8);
                    } else if (o9kVar instanceof l9k) {
                        nwd nwdVar3 = c9k.Q1;
                        c9kVar.G0().f.setVisibility(0);
                        c9kVar.G0().c.setVisibility(0);
                        c9kVar.G0().d.setVisibility(8);
                        ((FrameLayout) c9kVar.G0().e.c).setVisibility(8);
                    }
                }
                return Unit.f46060a;
            case 1:
                g9k g9kVar = (g9k) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nwd nwdVar4 = c9k.Q1;
                ((w8k) c9kVar.N1.getValue()).A(g9kVar.f10917a);
                c9kVar.G0().b.setEnabled(g9kVar.b);
                return Unit.f46060a;
            default:
                k9k k9kVar = (k9k) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (k9kVar != null) {
                    if (k9kVar instanceof j9k) {
                        nwd nwdVar5 = c9k.Q1;
                        ii iiVar = c9kVar.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = c9kVar.H(R.string.caution);
                        String strH2 = c9kVar.H(R.string.limit_set_dialog_confirm_message);
                        String strH3 = c9kVar.H(R.string.yes);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, c9kVar.H(R.string.cancel), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = c9kVar.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (k9kVar instanceof h9k) {
                        nwd nwdVar6 = c9k.Q1;
                        ii iiVar2 = c9kVar.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = c9kVar.H(R.string.caution);
                        String strH5 = c9kVar.H(R.string.something_went_wrong);
                        String strH6 = c9kVar.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC2 = c9kVar.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (k9kVar instanceof i9k) {
                        String str = ((i9k) k9kVar).f14391a;
                        nwd nwdVar7 = c9k.Q1;
                        ii iiVar3 = c9kVar.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH7 = c9kVar.H(R.string.caution);
                        String strH8 = c9kVar.H(R.string.ok_new);
                        strH8.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) str, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = c9kVar.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    }
                }
                return Unit.f46060a;
        }
    }
}
