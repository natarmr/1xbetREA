package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x6q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40376a;
    public final p6q0 b;
    public final t7q0 c;
    public final boolean d;
    public final boolean e;
    public final b6q0 f;
    public final q7q0 g;
    public final String h;
    public final String i;
    public final a7n j;
    public final int k;

    public x6q0(String str, p6q0 p6q0Var, t7q0 t7q0Var, boolean z, boolean z2, y5q0 y5q0Var, String str2, String str3, int i, int i2) {
        y5q0Var = (i2 & 128) != 0 ? null : y5q0Var;
        str3 = (i2 & 1024) != 0 ? "" : str3;
        a7n a7nVar = a7n.f379a;
        i = (i2 & 16384) != 0 ? -1 : i;
        brm0.B(str, str2, str3);
        this.f40376a = str;
        this.b = p6q0Var;
        this.c = t7q0Var;
        this.d = z;
        this.e = z2;
        this.f = y5q0Var;
        this.g = q7q0.f28265a;
        this.h = str2;
        this.i = str3;
        this.j = a7nVar;
        this.k = i;
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
        if (!(obj instanceof x6q0)) {
            return false;
        }
        x6q0 x6q0Var = (x6q0) obj;
        if (!Intrinsics.d(this.f40376a, x6q0Var.f40376a)) {
            return false;
        }
        e6q0 e6q0Var = e6q0.f7299a;
        return e6q0Var.equals(e6q0Var) && this.b.equals(x6q0Var.b) && this.c.equals(x6q0Var.c) && this.d == x6q0Var.d && this.e == x6q0Var.e && Intrinsics.d(this.f, x6q0Var.f) && this.g.equals(x6q0Var.g) && this.h.equals(x6q0Var.h) && this.i.equals(x6q0Var.i) && this.j == x6q0Var.j && this.k == x6q0Var.k;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (((this.f40376a.hashCode() * 31) - 369135317) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, false);
        b6q0 b6q0Var = this.f;
        return Integer.hashCode(this.k) + ((this.j.hashCode() + twn.a(-1, brm0.e(ua80.b(ua80.b((((iE + (b6q0Var == null ? 0 : b6q0Var.hashCode())) * 31) + 392915327) * 31, 31, this.h), 31, this.i), 31, false), 31)) * 31);
    }

    public final String toString() {
        String strA = j3x.a(this.k);
        StringBuilder sb = new StringBuilder("TextFieldMultilineBasicUiModel(value=");
        sb.append(this.f40376a);
        sb.append(", textFieldCellLeftStyle=");
        sb.append(e6q0.f7299a);
        sb.append(", textFieldCellRightStyle=");
        sb.append(this.b);
        sb.append(", supportingTextStyle=");
        sb.append(this.c);
        sb.append(", enabled=");
        ua80.u(", error=", ", loading=false, textAppearance=", sb, this.d, this.e);
        sb.append(this.f);
        sb.append(", textFieldStyle=");
        sb.append(this.g);
        sb.append(", labelText=");
        f140.v(sb, this.h, ", placeholderText=", this.i, ", disableTopLabel=false, capitalization=Unspecified, textDirection=");
        sb.append(this.j);
        sb.append(", imeAction=");
        sb.append(strA);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
