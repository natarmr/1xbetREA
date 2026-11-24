package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.resources.UiText;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class epe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8184a = 0;
    public final /* synthetic */ mpe0 b;
    public final /* synthetic */ cp c;

    public /* synthetic */ epe0(cp cpVar, mpe0 mpe0Var) {
        this.c = cpVar;
        this.b = mpe0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8184a;
        cp cpVar = this.c;
        mpe0 mpe0Var = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar.u;
                TextView textView = ((t7z) yfu0Var).f;
                UiText.ByRes byRes = new UiText.ByRes(R.string.referral_user_id, ((dpe0) cpVar.u()).b);
                t7z t7zVar = (t7z) yfu0Var;
                Context context = t7zVar.f33491a.getContext();
                context.getClass();
                textView.setText(byRes.a(context));
                t7zVar.g.setText(((dpe0) cpVar.u()).c);
                t7zVar.d.setText(((dpe0) cpVar.u()).f6463a);
                t7zVar.c.setText(((dpe0) cpVar.u()).f);
                TextView textView2 = t7zVar.e;
                textView2.setText(((dpe0) cpVar.u()).d);
                TypedValue typedValue = j5d.f15927a;
                FrameLayout frameLayout = t7zVar.f33491a;
                Context context2 = frameLayout.getContext();
                context2.getClass();
                textView2.setTextColor(context2.getColor(((dpe0) cpVar.u()).e));
                ImageView imageView = t7zVar.b;
                dyb.O(imageView, new epe0(mpe0Var, cpVar));
                imageView.setVisibility(((dpe0) cpVar.u()).g ? 8 : 0);
                frameLayout.setAlpha(((dpe0) cpVar.u()).g ? 0.5f : 1.0f);
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                int i = Integer.parseInt(((dpe0) cpVar.u()).b);
                ppe0 ppe0Var = mpe0Var.f22176a;
                zie0 zie0Var = ppe0.S1;
                ppe0Var.H0().l = i;
                ii iiVar = ppe0Var.L1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = ppe0Var.H(R.string.attention);
                String strH2 = ppe0Var.H(R.string.delete_referral_warning);
                String strH3 = ppe0Var.H(R.string.ok_new);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, ppe0Var.H(R.string.cancel), (String) null, "deleteReferral", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = ppe0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ epe0(mpe0 mpe0Var, cp cpVar) {
        this.b = mpe0Var;
        this.c = cpVar;
    }
}
