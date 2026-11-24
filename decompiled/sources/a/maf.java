package a;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class maf extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oaf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ maf(oaf oafVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = oafVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oaf oafVar = this.k;
        switch (b) {
            case 0:
                maf mafVar = new maf(oafVar, yjeVar, (byte) 0);
                mafVar.j = obj;
                return mafVar;
            default:
                maf mafVar2 = new maf(oafVar, yjeVar, (byte) 1);
                mafVar2.j = obj;
                return mafVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((maf) create((bbf) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((maf) create((ebf) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
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
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.i) {
            case 0:
                oaf oafVar = this.k;
                a8z a8zVar = oafVar.M1;
                bbf bbfVar = (bbf) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (bbfVar instanceof raf) {
                    nwd nwdVar = oaf.Q1;
                    DsTextField dsTextField = oafVar.G0().f;
                    String strH = oafVar.H(((raf) bbfVar).f30131a);
                    strH.getClass();
                    dsTextField.f(strH.length() > 0);
                    dsTextField.setErrorText(strH);
                } else if (bbfVar instanceof uaf) {
                    nwd nwdVar2 = oaf.Q1;
                    wdk0.k(((odi) a8zVar.getValue()).n, new xdk0(pek0.f26859a, ((uaf) bbfVar).f35324a, null, null, null, null, 124), oafVar, null, null, false, null, 1020);
                } else if (Intrinsics.d(bbfVar, waf.f38822a)) {
                    nwd nwdVar3 = oaf.Q1;
                    DsTextField dsTextField2 = oafVar.G0().f;
                    dsTextField2.f(false);
                    dsTextField2.setErrorText(null);
                    DsTextField dsTextField3 = oafVar.G0().g;
                    dsTextField3.f(false);
                    dsTextField3.setErrorText(null);
                } else if (Intrinsics.d(bbfVar, xaf.f40550a)) {
                    nwd nwdVar4 = oaf.Q1;
                    DsTextField dsTextField4 = oafVar.G0().f;
                    dsTextField4.f(false);
                    dsTextField4.setErrorText(null);
                } else if (Intrinsics.d(bbfVar, yaf.f42293a)) {
                    nwd nwdVar5 = oaf.Q1;
                    DsTextField dsTextField5 = oafVar.G0().g;
                    dsTextField5.f(false);
                    dsTextField5.setErrorText(null);
                } else if (bbfVar instanceof saf) {
                    nwd nwdVar6 = oaf.Q1;
                    DsTextField dsTextField6 = oafVar.G0().g;
                    String strH2 = oafVar.H(R.string.password_not_match_error);
                    strH2.getClass();
                    dsTextField6.f(strH2.length() > 0);
                    dsTextField6.setErrorText(strH2);
                } else if (bbfVar instanceof taf) {
                    j120.Y(oafVar);
                } else if (bbfVar instanceof abf) {
                    nwd nwdVar7 = oaf.Q1;
                    ii iiVar = ((odi) a8zVar.getValue()).o;
                    String strH3 = oafVar.H(R.string.error);
                    String strH4 = oafVar.H(R.string.request_error);
                    String strH5 = oafVar.H(R.string.ok_new);
                    strH5.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, (String) null, (String) null, "ERROR_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC = oafVar.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (bbfVar instanceof vaf) {
                    nwd nwdVar8 = oaf.Q1;
                    oafVar.G0().b.setFirstButtonEnabled(((vaf) bbfVar).f37083a);
                } else {
                    if (!(bbfVar instanceof zaf)) {
                        t9f.b();
                        return null;
                    }
                    nwd nwdVar9 = oaf.Q1;
                    oafVar.G0().e.setVisibility(((zaf) bbfVar).f44064a ? 0 : 8);
                }
                return Unit.f46060a;
            default:
                ebf ebfVar = (ebf) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = ebfVar instanceof cbf;
                oaf oafVar2 = this.k;
                if (z) {
                    nwd nwdVar10 = oaf.Q1;
                    oafVar2.G0().e.setVisibility(8);
                    cbf cbfVar = (cbf) ebfVar;
                    oafVar2.G0().d.setVisibility(cbfVar.f4059a ? 0 : 8);
                    oafVar2.G0().d.setRequirements(cbfVar.b);
                } else {
                    if (!Intrinsics.d(ebfVar, dbf.f5801a)) {
                        t9f.b();
                        return null;
                    }
                    nwd nwdVar11 = oaf.Q1;
                    oafVar2.G0().b.setFirstButtonEnabled(false);
                    oafVar2.G0().e.setVisibility(0);
                }
                return Unit.f46060a;
        }
    }
}
