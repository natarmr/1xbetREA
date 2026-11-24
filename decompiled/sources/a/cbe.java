package a;

import android.app.Dialog;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.consultantchat.presentation.dialogs.rate.model.RatingModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class cbe extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ dbe j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbe(dbe dbeVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = dbeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        cbe cbeVar = new cbe(this.j, yjeVar);
        cbeVar.i = obj;
        return cbeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cbe) create((gbe) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        gbe gbeVar = (gbe) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        boolean z = gbeVar instanceof fbe;
        dbe dbeVar = this.j;
        if (z) {
            fbe fbeVar = (fbe) gbeVar;
            dbeVar.F().t0(i120.V(new Pair("SEND_RATING_REQUEST_RESULT", new RatingModel.Value(fbeVar.f9253a, fbeVar.b))), "SEND_RATING_REQUEST_KEY");
            dbeVar.x0();
        } else if (Intrinsics.d(gbeVar, ebe.c)) {
            kud kudVar = dbe.k2;
            Dialog dialog = dbeVar.S1;
            if (dialog != null) {
                dialog.setCancelable(false);
                dbeVar.h2.postDelayed(new w1(dialog, (byte) 29), 1000L);
            }
            ii iiVar = dbeVar.j2;
            if (iiVar == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH = dbeVar.H(R.string.attention);
            String strH2 = dbeVar.H(R.string.rate_consultant_rating_not_saved);
            String strH3 = dbeVar.H(R.string.rate_consultant_continue);
            strH3.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, dbeVar.H(R.string.rate_consultant_cancel), (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1520);
            androidx.fragment.app.e eVarC = dbeVar.C();
            eVarC.getClass();
            iiVar.d(dialogFields, eVarC);
        } else if (Intrinsics.d(gbeVar, ebe.b)) {
            kud kudVar2 = dbe.k2;
            ii iiVar2 = dbeVar.j2;
            if (iiVar2 == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH4 = dbeVar.H(R.string.chat_rate_saved);
            String strH5 = dbeVar.H(R.string.chat_rate_thanks);
            String strH6 = dbeVar.H(R.string.ok);
            strH6.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, "DIALOG_EXIT_REQUEST", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1496);
            androidx.fragment.app.e eVarC2 = dbeVar.C();
            eVarC2.getClass();
            iiVar2.d(dialogFields2, eVarC2);
        } else {
            if (!Intrinsics.d(gbeVar, ebe.f7515a)) {
                t9f.b();
                return null;
            }
            dbeVar.x0();
        }
        return Unit.f46060a;
    }
}
