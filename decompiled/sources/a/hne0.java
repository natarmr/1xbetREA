package a;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class hne0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jne0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hne0(jne0 jne0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jne0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jne0 jne0Var = this.k;
        switch (b) {
            case 0:
                hne0 hne0Var = new hne0(jne0Var, yjeVar, (byte) 0);
                hne0Var.j = obj;
                return hne0Var;
            default:
                hne0 hne0Var2 = new hne0(jne0Var, yjeVar, (byte) 1);
                hne0Var2.j = obj;
                return hne0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hne0) create((qne0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hne0) create((yme0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jne0 jne0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                qne0 qne0Var = (qne0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (qne0Var instanceof one0) {
                    one0 one0Var = (one0) qne0Var;
                    String str = one0Var.f25543a;
                    une0 une0Var = one0Var.b;
                    gne0 gne0Var = jne0.S1;
                    w3r w3rVarG0 = jne0Var.G0();
                    zkk zkkVar = w3rVarG0.c;
                    ((TextView) zkkVar.h).setText(une0Var.f35957a);
                    ((TextView) zkkVar.e).setText(une0Var.d);
                    zkkVar.d.setText(une0Var.c);
                    zkk zkkVar2 = w3rVarG0.b;
                    TextView textView = zkkVar2.d;
                    TextView textView2 = (TextView) zkkVar2.e;
                    LinearLayout linearLayout = (LinearLayout) zkkVar2.c;
                    textView.setText(jne0Var.I(R.string.referral_link, str, une0Var.e));
                    ArrayList arrayList = une0Var.f;
                    if (arrayList.isEmpty()) {
                        linearLayout.setVisibility(0);
                        textView2.setVisibility(8);
                    } else {
                        ljf0 ljf0Var = jne0Var.M1;
                        if (ljf0Var == null) {
                            Intrinsics.h("shortReferralRecyclerFragmentDelegate");
                            throw null;
                        }
                        gkz gkzVar = (gkz) ljf0Var.f20148a;
                        int size = arrayList.size();
                        List listD0 = arrayList;
                        if (size > 5) {
                            listD0 = CollectionsKt.D0(arrayList, 5);
                        }
                        gkzVar.A(listD0);
                        linearLayout.setVisibility(8);
                        textView2.setVisibility(0);
                    }
                    jne0Var.G0().d.setVisibility(8);
                } else {
                    if (!Intrinsics.d(qne0Var, pne0.f27282a)) {
                        t9f.b();
                        return null;
                    }
                    gne0 gne0Var2 = jne0.S1;
                    jne0Var.G0().d.setVisibility(0);
                }
                return Unit.f46060a;
            default:
                yme0 yme0Var = (yme0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                yme0Var.getClass();
                ii iiVar = jne0Var.N1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                DialogFields dialogFields = new DialogFields((CharSequence) yme0Var.f42884a.a(jne0Var.o0()).toString(), (CharSequence) yme0Var.b.a(jne0Var.o0()).toString(), (CharSequence) yme0Var.c.a(jne0Var.o0()).toString(), yme0Var.d.a(jne0Var.o0()).toString(), (String) null, yme0Var.e, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                androidx.fragment.app.e eVarC = jne0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                jne0Var.G0().d.setVisibility(8);
                return Unit.f46060a;
        }
    }
}
