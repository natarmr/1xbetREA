package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class uif0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vif0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uif0(vif0 vif0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vif0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vif0 vif0Var = this.k;
        switch (b) {
            case 0:
                uif0 uif0Var = new uif0(vif0Var, yjeVar, (byte) 0);
                uif0Var.j = obj;
                return uif0Var;
            default:
                uif0 uif0Var2 = new uif0(vif0Var, yjeVar, (byte) 1);
                uif0Var2.j = obj;
                return uif0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uif0) create((ejf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((uif0) create((djf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                ejf0 ejf0Var = (ejf0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                cge0 cge0Var = vif0.Q1;
                vif0 vif0Var = this.k;
                vif0Var.G0().f.setVisibility(ejf0Var.f7907a ? 0 : 8);
                vif0Var.G0().b.setFirstButtonEnabled(ejf0Var.c);
                return Unit.f46060a;
            default:
                vif0 vif0Var2 = this.k;
                a8z a8zVar = vif0Var2.O1;
                djf0 djf0Var = (djf0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(djf0Var, yif0.f42687a)) {
                    j120.X(vif0Var2.q0());
                } else if (djf0Var instanceof bjf0) {
                    cge0 cge0Var2 = vif0.Q1;
                    wdk0 wdk0Var = (wdk0) ((vri) a8zVar.getValue()).f37899a.e;
                    x1x.y(wdk0Var);
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((bjf0) djf0Var).f2704a, null, null, null, null, 124), vif0Var2, null, null, false, null, 1020);
                } else if (djf0Var instanceof cjf0) {
                    cge0 cge0Var3 = vif0.Q1;
                    ii iiVar = (ii) ((vri) a8zVar.getValue()).f37899a.f;
                    x1x.y(iiVar);
                    String strH = vif0Var2.H(R.string.error);
                    String strH2 = vif0Var2.H(R.string.request_error);
                    String strH3 = vif0Var2.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC = vif0Var2.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (djf0Var instanceof ajf0) {
                    cge0 cge0Var4 = vif0.Q1;
                    DsTextField dsTextField = vif0Var2.G0().d;
                    String str = ((ajf0) djf0Var).f973a;
                    dsTextField.setErrorText(str);
                    vif0Var2.G0().d.f(str.length() > 0);
                } else if (djf0Var instanceof xif0) {
                    cge0 cge0Var5 = vif0.Q1;
                    vif0Var2.G0().d.setErrorText(null);
                    vif0Var2.G0().d.f(false);
                } else {
                    if (!(djf0Var instanceof zif0)) {
                        t9f.b();
                        return null;
                    }
                    cge0 cge0Var6 = vif0.Q1;
                    ii iiVar2 = (ii) ((vri) a8zVar.getValue()).f37899a.f;
                    x1x.y(iiVar2);
                    String strH4 = vif0Var2.H(R.string.consultant);
                    String strH5 = vif0Var2.H(R.string.consultant_chat_with_operator_dialog_message);
                    String strH6 = vif0Var2.H(R.string.consultant_chat_with_operator_dialog_positive_text);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, vif0Var2.H(R.string.cancel), (String) null, "REQUEST_CONSULTANT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = vif0Var2.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                }
                return Unit.f46060a;
        }
    }
}
