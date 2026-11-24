package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42111a;
    public final s7q0 b;
    public final boolean c;
    public final String d;
    public final String e;
    public final a7n f;

    public y6q0(String str, s7q0 s7q0Var, boolean z, String str2) {
        a7n a7nVar = a7n.f379a;
        str2.getClass();
        this.f42111a = str;
        this.b = s7q0Var;
        this.c = z;
        this.d = "";
        this.e = str2;
        this.f = a7nVar;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6q0)) {
            return false;
        }
        y6q0 y6q0Var = (y6q0) obj;
        if (!this.f42111a.equals(y6q0Var.f42111a)) {
            return false;
        }
        e6q0 e6q0Var = e6q0.f7299a;
        if (!e6q0Var.equals(e6q0Var)) {
            return false;
        }
        o6q0 o6q0Var = o6q0.f24750a;
        return o6q0Var.equals(o6q0Var) && this.b.equals(y6q0Var.b) && this.c == y6q0Var.c && this.d.equals(y6q0Var.d) && this.e.equals(y6q0Var.e) && this.f == y6q0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(-1, brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(ua80.b(((((this.f42111a.hashCode() * 31) - 369135317) * 31) + 1848274498) * 31, 31, this.b.f31763a), 31, true), 31, this.c), 961, false), 31, this.d), 31, this.e), 31, false), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldMultilineFilledUiModel(value=");
        sb.append(this.f42111a);
        sb.append(", textFieldCellLeftStyle=");
        sb.append(e6q0.f7299a);
        sb.append(", textFieldCellRightStyle=");
        sb.append(o6q0.f24750a);
        sb.append(", supportingTextStyle=");
        sb.append(this.b);
        sb.append(", enabled=true, error=");
        f140.s(", loading=false, textAppearance=null, labelText=", this.d, ", placeholderText=", sb, this.c);
        sb.append(this.e);
        sb.append(", disableTopLabel=false, capitalization=Unspecified, textDirection=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
