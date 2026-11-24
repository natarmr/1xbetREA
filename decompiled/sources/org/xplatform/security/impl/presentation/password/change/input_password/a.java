package org.xplatform.security.impl.presentation.password.change.input_password;

import a.bnn0;
import a.t9f;
import a.wne;
import a.xi70;
import a.xz80;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ xz80 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xz80 xz80Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = xz80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        a aVar = new a(this.j, yjeVar);
        aVar.i = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((PasswordChangeViewModel$ScreenUiState) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        PasswordChangeViewModel$ScreenUiState passwordChangeViewModel$ScreenUiState = (PasswordChangeViewModel$ScreenUiState) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (passwordChangeViewModel$ScreenUiState != null) {
            boolean z = passwordChangeViewModel$ScreenUiState instanceof PasswordChangeViewModel$ScreenUiState.Default;
            xz80 xz80Var = this.j;
            if (z) {
                xi70 xi70Var = xz80.U1;
                DsTextField dsTextField = xz80Var.G0().f;
                dsTextField.f(false);
                dsTextField.setErrorText("");
            } else if (passwordChangeViewModel$ScreenUiState instanceof PasswordChangeViewModel$ScreenUiState.PasswordInputted) {
                xi70 xi70Var2 = xz80.U1;
                DsTextField dsTextField2 = xz80Var.G0().f;
                dsTextField2.f(false);
                dsTextField2.setErrorText("");
            } else if (passwordChangeViewModel$ScreenUiState instanceof PasswordChangeViewModel$ScreenUiState.IncorrectPassword) {
                xi70 xi70Var3 = xz80.U1;
                DsTextField dsTextField3 = xz80Var.G0().f;
                String str = ((PasswordChangeViewModel$ScreenUiState.IncorrectPassword) passwordChangeViewModel$ScreenUiState).c;
                dsTextField3.f(str.length() > 0);
                dsTextField3.setErrorText(str);
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }
}
