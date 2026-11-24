package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final class soe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ woe0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ soe0(woe0 woe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = woe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        woe0 woe0Var = this.k;
        switch (b) {
            case 0:
                soe0 soe0Var = new soe0(woe0Var, yjeVar, (byte) 0);
                soe0Var.j = obj;
                return soe0Var;
            default:
                soe0 soe0Var2 = new soe0(woe0Var, yjeVar, (byte) 1);
                soe0Var2.j = obj;
                return soe0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((soe0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((soe0) create((yme0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        woe0 woe0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xsu xsuVar = woe0Var.N1;
                if (xsuVar == null) {
                    Intrinsics.h("levelsRecyclerFragmentDelegate");
                    throw null;
                }
                list.getClass();
                ((gkz) xsuVar.f41434a).A(list);
                return Unit.f46060a;
            default:
                yme0 yme0Var = (yme0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ii iiVar = woe0Var.O1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                DialogFields dialogFields = new DialogFields((CharSequence) yme0Var.f42884a.a(woe0Var.o0()).toString(), (CharSequence) yme0Var.b.a(woe0Var.o0()).toString(), (CharSequence) yme0Var.c.a(woe0Var.o0()).toString(), yme0Var.d.a(woe0Var.o0()).toString(), (String) null, yme0Var.e, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = woe0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return Unit.f46060a;
        }
    }
}
